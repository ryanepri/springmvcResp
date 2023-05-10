package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class TestVoidController {
    @RequestMapping("testVoid")
    public void testVoidMethod() {
        System.out.println("inner testVoidMethod()");
    }
}
