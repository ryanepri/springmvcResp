package com.ryan.controller;

import com.ryan.pojo.Person;
import com.ryan.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class TestRequestPet {

    @RequestMapping("reqPet")
    @ResponseBody
    public Pet myMethod() {
        return new Pet("tom", "cat");
    }


    @RequestMapping("testAjaxUrl")
    @ResponseBody
    public Person testAjax1(@RequestParam("name") String pname, @RequestParam("age") String page) {
        System.out.println("pname::" + pname);
        System.out.println("page::" + page);
        Person person = new Person();
        person.setPname(pname);
        person.setPage(page);
        return person;
    }

    @RequestMapping("testAjaxUrl2")
    @ResponseBody
    public Pet testAjax2(@RequestParam("pname") String petName, @RequestParam("ptype") String petType) {
        System.out.println("petName::" + petName);
        System.out.println("petType::" + petType);
        return new Pet(petName, petType);
    }


}
