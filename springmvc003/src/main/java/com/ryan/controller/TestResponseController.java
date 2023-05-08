package com.ryan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 跳转到非jsp页面。
 */
@RestController
@RequestMapping("test1")
public class TestResponseController {
    @RequestMapping("/hi")
    public String myMethod() {
        System.out.println("so lock the bitch");
        return "success";
    }

    @RequestMapping("testVoid")
    public void testVoidMethod() {
        System.out.println("inner testVoidMethod()");
    }
}
