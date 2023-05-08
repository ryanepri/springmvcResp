package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ReceiveAnno {

    @RequestMapping("anno")
    public String myMethod(@RequestParam("namee") String name, @RequestParam("pagee")int page) {
        System.out.println("name::" + name);
        System.out.println("page::" + page);
        return "success";
    }
}
