package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/innerRest3")
public class RestfulController03inner {

    @RequestMapping
    public String innerController() {
        System.out.println("inner rest3.jsp controller method");
        return "restful3";
    }


}
