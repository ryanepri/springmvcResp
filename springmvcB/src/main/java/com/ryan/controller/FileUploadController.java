package com.ryan.controller;

import com.ryan.pojo.Gamer;
import com.ryan.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileUploadController {

    /**
     * 形参接收文件、
     * 指定文件目录、
     * 获取文件名字、
     * 文件存储位置（文件目录，文件名）、
     * 文件写入（文件存储位置）、
     * 返回响应
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


        //文件大小控制
        //5MB
        if (avater.getSize() > 1024 * 1024 * 2) {
            map.put("message", "文件大小不能超过2MB");
            return map;
        }

        String realPath = req.getServletContext().getRealPath("upload");
        //指定文件存储目录
        File dir = new File(realPath);
        //如果文件存储目录不存在，那么就创建一个。
        if (!dir.exists()) {
            dir.mkdir();
        }
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
        //文件存储位置/t文件名(保存的路径,保存的文件名) like 文件存储位置 == c:/imgs/avater.jpg
        File file = new File(dir, newFileName);
        //文件写入\保存\另存为
        avater.transferTo(file);


        //回显
        //上传成功之后，把文件的名字和文件的类型返回给浏览器。
        map.put("message", "上传成功");
        map.put("newFileName", newFileName);
        map.put("fileType", avater.getContentType());
        return map;
    }


}
