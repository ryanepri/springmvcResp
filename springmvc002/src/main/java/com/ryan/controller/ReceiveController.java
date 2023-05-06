package com.ryan.controller;

import com.ryan.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/pojo")
public class ReceiveController {
    @RequestMapping
    public String innerMethod() {
        System.out.println("inner pojo innerMethod()");
        return "success";
    }

    /**
     * 项目搭建测试
     */
    @RequestMapping("receive")
    public String paramReceiveMethod(@RequestParam("uid") String userid, @RequestParam("uname") String username) {
        System.out.println("userid::" + userid);
        System.out.println("username::" + username);
        System.out.println("inner pojo innerMethod()");
        return "success";
    }


    /**
     * @param pname
     * @param page
     * @param gender
     * @param hobby
     * @param bithdate
     * @return RestController
     * <p>
     * 这种一个一个写参数的的缺点很明显，如果前端的jsp提交的参数发生了变化，那么这个控制单元就显得耦合度太高了。
     */
    @RequestMapping("getDataByPojo")
    public String paramReceiveMethod2(String pname, String page, String gender, String[] hobby, String birthdate) {
        System.out.println("pname::" + pname);
        System.out.println("page::" + page);
        System.out.println("gender::" + gender);
        System.out.println("hobby::" + Arrays.toString(hobby));
        System.out.println("bithdate::" + birthdate);
        System.out.println("inner Arg innerMethod2()");
        return "success";
    }


    /**
     * @param person
     * @return 优化参数列表的传递。使用一个对象接收多个参数。mvc的功能：解析提交的数据的name属性注入到对应的pojo属性名。
     * 这样写的好处是，如果参数列表变了，控制层单元不需要做改动，只需要修改pojo就可了。简洁。
     * <p>
     * springmvc底层通过反射给参数列表赋值。通过set方法进行赋值（反射。
     * pojo属性一定要有set方法，不然会接收失败。
     */
    @RequestMapping("getDataByPojo2")
    public String paramReceiveMethod3(Person person) {
        System.out.println("inner pojoooo innerMethod()");
        System.out.println(person);
        return "success";
    }


}
