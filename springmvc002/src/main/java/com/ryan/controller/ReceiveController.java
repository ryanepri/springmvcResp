package com.ryan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pojo")
public class ReceiveController {

    @RequestMapping
    public String innerMethod() {
        System.out.println("inner pojo innerMethod()");
        return "success";
    }


    @RequestMapping("receive")
    public String paramReceiveMethod(@RequestParam("uid") String userid, @RequestParam("uname") String username) {
        System.out.println("userid::" + userid);
        System.out.println("username::" + username);
        System.out.println("inner pojo innerMethod()");
        return "success";
    }
}
