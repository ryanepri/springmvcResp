package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController01 {
    /**
     * @return 返回值定义为string，用来表明页面要跳转的页面
     * @RequestMapping() 用xx路径请求到这个方法
     */
    @RequestMapping("/first.do")
    public String firstController() {
        System.out.println("inner firstController method");
        return "/first.jsp";
    }

}
