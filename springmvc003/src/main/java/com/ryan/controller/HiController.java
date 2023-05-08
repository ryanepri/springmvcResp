package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("hi")
public class HiController {
    @RequestMapping("/inner")
    public String myMethod() {
        System.out.println("inner myMethod");
        return "success";
    }

    @RequestMapping("testVoid")
    public void testVoidMethod() {
        System.out.println("inner testVoidMethod()");
    }
}
