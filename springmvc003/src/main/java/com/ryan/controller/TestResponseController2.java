package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 跳转到jsp页面
 */
@Controller
@RequestMapping("test2")
public class TestResponseController2 {

    @RequestMapping("/testVoid")
    public void testVoidMethod() {
        System.out.println("inner testVoidMethod()");
    }
}
