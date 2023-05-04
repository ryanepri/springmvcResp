package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/reqq")
public class ParamHeadersController {

    @RequestMapping
    public String innerController() {
        System.out.println("inner reqController method");
        return "reqq";
    }


    //    @RequestMapping(value = "/getRequest", method = RequestMethod.GET, params = "username")
//    @RequestMapping(value = "/getRequest", method = RequestMethod.GET, params = "username!=root")
//    @RequestMapping(value = "/getRequest", method = RequestMethod.GET, params = "username=root")
    @RequestMapping(
            value = "/getRequest",
            method = RequestMethod.GET,
            params = {"username=root", "password"}
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
