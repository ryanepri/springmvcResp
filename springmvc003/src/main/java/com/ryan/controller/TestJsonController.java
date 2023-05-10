package com.ryan.controller;


import com.ryan.pojo.Person;
import com.ryan.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TestJsonController {

    /**
     * @ResponseBody 作用：
     * 1、方法的返回值不再作为界面跳转的依据，而是直接作为返回的数据
     * 2、将方法的返回的数据自动转换为json字符串（转换原理：ObjectMapper转换的。
     */
    @ResponseBody
    @RequestMapping(value = "testAjax1", produces = "application/json;charset=utf-8")
    public Pet testAjax1() {
        System.out.println("inner testAjax1()");
        Pet pet = new Pet("tom", "cat");
        return pet;
    }

    @ResponseBody
    @RequestMapping("testAjax2")
    public String testAjax2() {
        System.out.println("inner testAjax2()");
        Pet pet = new Pet("tom", "cat");
        return pet.toString();
    }
}
