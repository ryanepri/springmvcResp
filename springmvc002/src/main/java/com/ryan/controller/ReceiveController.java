package com.ryan.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ryan.pojo.Alien;
import com.ryan.pojo.Person;
import com.ryan.pojo.Pet;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.util.PojoUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
    public String paramReceiveMethod2(
            String pname,
            String page,
            String gender,
            String[] hobby,
            String birthdate) {
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
     * <p>
     * 情景一
     */
    @RequestMapping("getDataByPojo2")
    public String paramReceiveMethod3(Person person) {
        System.out.println("inner pojoooo innerMethod()");
        System.out.println(person);
        return "success";
    }

    /**
     * HH:mm:ss
     *
     * @param birthdate
     * @return date
     * <p>
     * 情景二
     */
    @RequestMapping("getDate")
    public String receiveDate(Date birthdate) {
        System.out.println("inner receive-date innerMethod()");
        System.out.println(birthdate);
        return "success";
    }


    /**
     * 单独接收str转pet对象
     */
    @RequestMapping("getPet")
    public String receivePet(Pet pet) {
        System.out.println("inner receive-pet innerMethod()");
        System.out.println(pet);
        return "success";
    }


    /**
     * List错误案例
     * 接收str转多个pet对象(错误案例
     * 形式参数类型为List会报500异常。
     * 形式参数类型为ArrayList会接收空值。
     */
    @RequestMapping("getPets")
    public String receivePetList(ArrayList<Pet> pets) {
        System.out.println("inner receive-petsss List innerMethod()");
        System.out.println(pets);
        return "success";
    }

    //    getMapByPerson
    @RequestMapping("getMapByPerson")
    public String receiveMapByPerson(Person person) {
        System.out.println("inner receiveMapByPerson Map innerMethod()");
        System.out.println(person.getPetMap());
        return "get map by person success";
    }

    //getMapByAlien
    @RequestMapping("getMapByAlien")
    public String receiveMapByAlien(Alien alien) {
        System.out.println("inner receiveMapByAlien Map innerMethod()");
        System.out.println(alien.getPetMap());
        return "get map by person success";
    }
    /**
     * 接收list集合的方法是通过一个类的属性来接收。该属性为List数据类型。
     */
    @RequestMapping("getPetsByPojoArg")
    public String receivePetFromPojo(Person person) {
        System.out.println("inner receive-petsss List from pojo innerMethod()");
        System.out.println("person.getPets()::" + person.getPets());
        return "success";
    }

    /**
     * 接收Map集合的方法是通过一个类的属性来接收。该属性为Map数据类型。
     */
    @RequestMapping("getPetsByPojoArg2")
    public String receivePetFromPojo2(Person person) {
        System.out.println("inner receive-petsss Map from pojo innerMethod()");
        System.out.println("person.getPetMap()::" + person.getPetMap());
        return "success";
    }

}
