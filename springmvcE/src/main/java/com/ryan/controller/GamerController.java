package com.ryan.controller;

import com.ryan.pojo.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ryan.service.GamerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GamerController {

    @Autowired
    private GamerService gamerService;

    @ResponseBody
    @RequestMapping("getAllGamer")
    public List<Gamer> myMethod1() {
        return gamerService.getAll();
    }


    @RequestMapping("addGamer")
    public String addGamer(Gamer gamer) {
        //id, username, password, nickname, photo, filetype
        Integer gamerid = gamerService.insertGamer(gamer);


        System.out.println("gamer::" + gamer);
//        return "/html/showGamer.html";
        return "redirect:/showGamer2.jsp";
    }


    @RequestMapping("login.action")
    @ResponseBody
    public Map<String, String> gamerLogin(String username, String password) {
        //处理从前端得到的数据
        Gamer gamer = new Gamer();
        gamer.setUsername(username);
        gamer.setPassword(password);
        System.out.println("前端拿来的数据gamer::" + gamer);

        //准备json
        HashMap<String, String> map = new HashMap<String, String>();

        //查询gamer
        List<Gamer> gamers = gamerService.selectGamer(gamer);


        if (gamers != null && gamers.size() == 1) {
            map.put("gamer", gamers.get(0).toString());
            return map;
        }

        map.put("error", "没有该用户");
        return map;
    }

}
