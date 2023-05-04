package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * get post 两种http请求方式
 * restful风格
 */
@Controller()
@RequestMapping("/restful1")
public class RestfulController01 {

    @RequestMapping
    public String innerController() {
        System.out.println("inner restful111Controller method");
        return "restful1";
    }

    @RequestMapping(
            value = "/getRest/{id}",
            method = RequestMethod.GET
    )
    public String getController(@PathVariable("id") Integer id) {
        System.out.println("inner get提交 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

    @RequestMapping(
            value = "/postRest/{id}",
            method = RequestMethod.POST
    )
    public String postController(@PathVariable("id") Integer id) {
        System.out.println("inner post提交 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

    @RequestMapping(
            value = "/putRest/{id}",
            method = RequestMethod.PUT
    )
    public String putController01(@PathVariable("id") Integer id) {
        System.out.println("inner put提交 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

    @RequestMapping(
            value = "/deleteRest/{id}",
            method = RequestMethod.DELETE
    )
    public String deleteController01(@PathVariable("id") Integer id) {
        System.out.println("inner delete提交 restfulController method");
        System.out.println("id::" + id);
        return "success";
    }

}
