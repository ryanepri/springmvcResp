package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping
public class TestResponseController {

    //请求转发
    @RequestMapping("resp1")
    public void testResponseMethod1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("inner testResponseMethod1()");
        request.getRequestDispatcher("/forwardPage.jsp").forward(request, response);
    }

    //响应重定向
    @RequestMapping("resp2")
    public void testResponseMethod2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("inner testResponseMethod2()");
        response.sendRedirect(request.getContextPath() + "/redirectPage.jsp");
    }





}
