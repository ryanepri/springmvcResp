package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * put delete 两种http请求方式
 * restful风格
 * <p>
 * 1、配置web.xml http请求过滤器
 * 2、配合jsp 写入_method以让过滤器识别put、delete请求
 * 3、得到数据，但是因为控制层用的@Controller注解所以会报405异常。用@RestController可解决。
 */
@RestController()
@RequestMapping("rest3")
public class RestfulController03 {

    @RequestMapping(
            value = "/getRest/{id}",
            method = RequestMethod.GET
    )
    public String getController(@PathVariable("id") Integer id) {
        System.out.println("inner get提交3 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

    @RequestMapping(
            value = "/postRest/{id}",
            method = RequestMethod.POST
    )
    public String postController(@PathVariable("id") Integer id) {
        System.out.println("inner post提交3 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

    @RequestMapping(
            value = "/putRest/{id}",
            method = RequestMethod.PUT
    )
    public String putController01(@PathVariable("id") Integer id) {
        System.out.println("inner put提交3 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

    @RequestMapping(
            value = "/deleteRest/{id}",
            method = RequestMethod.DELETE
    )
    public String deleteController01(@PathVariable("id") Integer id) {
        System.out.println("inner delete提交3 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

}
