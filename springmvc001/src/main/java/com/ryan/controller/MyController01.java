package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping
public class MyController01 {
    @RequestMapping()
    public String myController() {
        System.out.println("inner myController method");
//        return "WEB-INF\\view\\first.jsp";
        return "success";
    }

    /**
     * @return 返回值定义为string，用来表明页面要跳转的页面
     * @RequestMapping() 用xx路径请求到这个方法
     */
    @RequestMapping("/first.do")
    public String firstController() {
        System.out.println("inner firstController method");
//        return "WEB-INF\\view\\first.jsp";
        return "first";
    }


    @RequestMapping("/img.do")
    public String imgController() {
        System.out.println("inner imgController method");
        return "img";
    }


    /**
     * 测试RequestMapping中不写/
     *
     * @return
     */
    @RequestMapping(path = {"/test1.do", "/test1.action","/test001"})
    public String test1Controller() {
        System.out.println("inner testController111 method");
        return "test";
    }

    @RequestMapping(value = {"/test2.do", "/test2.action","/test002"})
    public String test2Controller() {
        System.out.println("inner testController222 method");
        return "test";
    }


}
