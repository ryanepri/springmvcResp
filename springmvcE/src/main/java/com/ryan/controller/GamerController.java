package com.ryan.controller;

import com.ryan.pojo.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ryan.service.GamerService;

import java.util.List;

@Controller
public class GamerController {

    @Autowired
    private GamerService gamerService;

    @ResponseBody
    @RequestMapping("all")
    public List<Gamer> myMethod1() {
        return gamerService.getAll();
    }


    @RequestMapping("addGamer")
    public String addGamer(Gamer gamer) {
        //id, username, password, nickname, photo, filetype
        Integer gamerid = gamerService.insertGamer(gamer);


        System.out.println("gamer::" + gamer);
        return "/html/showGamer.html";

    }

}
