package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping
public class TestForwardController {

    //forward

    /**
     * 返回字符串告诉DispatcherServlet跳转的路径
     * 在路径之前放上一个forward: 关键字,就是请求转发
     * 如果路径前的关键字是forward,那么可以省略不写
     */
    @RequestMapping("testForward")
    public String testForwardMethod() {
//        return "forward:/forwardPage.jsp";
        return "forwardPage.jsp";
    }


}
