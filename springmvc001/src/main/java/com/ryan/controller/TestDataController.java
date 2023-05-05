package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 参数注入
 * --即获取request参数
 */
@Controller
@RequestMapping("innerReqParamTest")
public class TestDataController {
    /**
     * 进入jsp测试页面
     */
    @RequestMapping()
    public String innerMethod() {
        System.out.println("innerReqParamTest innerMethod");
        return "requestParamTest";
    }

    /**
     * 紧耦合
     */
    @RequestMapping("getParamByRequest")
    public String getDataParam1(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        System.out.println("id::" + id);
        System.out.println("username::" + username);
        return "getParamSuccess";
    }


    /**
     * 解耦合
     * HttpServletRequest对象获取参数 springmvc框架功能 自动转换
     * 【注意事项】处理单元参数列表中的参数名必须和请求中的参数名一致。
     */
    @RequestMapping("getParamByArgName")
    public String getDataParam2(String id, String username) {
        System.out.println("id::" + id);
        System.out.println("username::" + username);
        return "getParamSuccess";
    }

    /**
     * 解耦合
     * HttpServletRequest对象获取参数 springmvc框架功能 自动转换
     * 【注意事项】处理单元参数列表中的参数名必须和请求中的参数名一致。
     * 使用@RequestParam使其一致。
     */
    @RequestMapping("getParamByArgName2")
    public String getDataParam3(@RequestParam("uid") Integer id, @RequestParam("uname") String username) {
        System.out.println("id::" + id);
        System.out.println("username::" + username);
        return "getParamSuccess";
    }
}
