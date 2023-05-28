package com.ryan.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileController {

    //文件存储位置
    private final static String filesServer = "http://192.168.31.88:8888/upload/";

    /**
     * 跨服务器上传、访问资源。
     *
     * @param avater
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("fileUpload.do")
    public Map<String, String> fileUpload(MultipartFile avater, HttpServletRequest req) throws IOException {

        //json格式返回的容器
        Map map = new HashMap<String, String>();

        //获取文件名字 like avater.jpg
        String originalFilename = avater.getOriginalFilename();
        //为了避免文件冲突，使用uuid替换文件名
        String uuid = UUID.randomUUID().toString();
        // 灯塔 .png  转成  uuid .png（不能直接拼接uuid

        //获取拓展名
        String extendsName = originalFilename.substring(originalFilename.lastIndexOf("."));
        //控制文件类型
        if (!extendsName.equals(".png")) {
            map.put("message", "文件类型必须是.png");
            return map;
        }
        map.put("filetype", extendsName);


        //新的文件名
        String newFileName = uuid.concat(extendsName);

        //文件存储位置
//        String filesServer = "http://192.168.31.88:8888/upload/";

        //创建sun公司提供的jersey包中的client对象
        Client client = Client.create();
        WebResource resource = client.resource(filesServer + newFileName);
        //文件保存到另一个服务器上去
        resource.put(String.class, avater.getBytes());

        //回显
        //上传成功之后，把文件的名字和文件的类型返回给浏览器。
        map.put("message", "上传成功");
        map.put("newFileName", newFileName);
        map.put("fileType", avater.getContentType());
        return map;
    }


    @RequestMapping("fileDownload.do")
    public void fileDownload(String photo, String filetype, HttpServletResponse response) throws IOException {
        //获取下载的文件名 文件类型
        //设置响应头
        //告诉浏览器要将数据保存到磁盘上，不再浏览器上直接解析
        response.setHeader("Content-Disposition", "attachment;filename=" + photo);

        //告诉浏览下载的文件类型
        response.setContentType(filetype);

        //获取一个文件的输入流
        InputStream inputStream = new URL(filesServer + photo).openStream();
        //获取一个指向浏览器的输出流
        ServletOutputStream outputStream = response.getOutputStream();
        //向浏览器响应文件即可
        IOUtils.copy(inputStream, outputStream);
    }


}
