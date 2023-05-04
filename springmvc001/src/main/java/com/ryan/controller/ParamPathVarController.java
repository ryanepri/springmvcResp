package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/pathvar")
public class ParamPathVarController {

    @RequestMapping
    public String innerController() {
        System.out.println("inner reqController method");
        return "pathvar";
    }

    @RequestMapping(
            value = "/getRequest1/{id}/{username}",
            method = RequestMethod.GET
    )
    public String getController01(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("inner getController01 method");
        System.out.println("id::" + id);
        System.out.println("username::" + username);
        return "success";
    }

    @RequestMapping(
            value = "/getRequest2",
            method = RequestMethod.GET,
            params = {"username", "password"}
    )
    public String getController() {
        System.out.println("inner getController method");
        return "success";
    }


    @RequestMapping(
            value = "/headerRequest",
            headers = {"Accept-Encoding=gzip, deflate, br"}
    )
    public String headersController() {
        System.out.println("inner headerController method");
        return "success";
    }

    @RequestMapping(value = "/postRequest", method = RequestMethod.POST)
    public String postController() {
        System.out.println("inner postController method");
        return "success";
    }

}
