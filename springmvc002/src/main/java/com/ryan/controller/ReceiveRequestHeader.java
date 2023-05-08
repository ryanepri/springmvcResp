package com.ryan.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class ReceiveRequestHeader {

    @RequestMapping("receiveRequestHeader")
    public String myMethod(@RequestHeader(value = "Accept", required = false) String accept) {
        System.out.println(accept);
        return "receive Request Header success";
    }


    @RequestMapping("/getCookie")
    public String getCookie(@CookieValue(value = "JSESSIONID", required = false) String cookieValue) {
        System.out.println(cookieValue);
        return "get cookie success";
    }
}

