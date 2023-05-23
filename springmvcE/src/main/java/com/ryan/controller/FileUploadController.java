package com.ryan.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileUploadController {

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


        //新的文件名
        String newFileName = uuid.concat(extendsName);

        //文件存储位置
        String filesServer = "http://192.168.31.88:8888/upload/";

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


}
