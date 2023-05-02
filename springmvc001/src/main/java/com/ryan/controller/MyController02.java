package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/req")
public class MyController02 {

    @RequestMapping
    public String innerController() {
        System.out.println("inner reqController method");
        return "req";
    }

    @RequestMapping(value = "/getRequest", method = RequestMethod.GET)
    public String getController() {
        System.out.println("inner getController method");
        return "success";
    }

    @RequestMapping(value = "/postRequest", method = RequestMethod.POST)
    public String postController() {
        System.out.println("inner postController method");
        return "success";
    }

}
