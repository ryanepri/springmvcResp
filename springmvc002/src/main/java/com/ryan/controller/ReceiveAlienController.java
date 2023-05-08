package com.ryan.controller;

import com.ryan.pojo.Alien;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alien")
public class ReceiveAlienController {
    @RequestMapping("getArgs")
    public String myMethod(Alien alien) {
        System.out.println(alien);
        return "receive alien success";
    }

//    getDC

    @RequestMapping("getDC")
    public String myMethod2(Alien alien) {
        System.out.println(alien.getDc());
        return "receive alien success";
    }
}
