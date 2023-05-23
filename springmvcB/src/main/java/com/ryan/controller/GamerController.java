package com.ryan.controller;

import com.ryan.pojo.Gamer;
import com.ryan.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
