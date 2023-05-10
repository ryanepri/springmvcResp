package com.ryan.controller;


import com.ryan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping
public class MyController {

    @RequestMapping("hi")
    @ResponseBody
    public String myMethod() {
        System.out.println("hi");
        return "hi";
    }

    public SqlSession creatSqlSession() throws IOException {
        //创建SQLSession
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = ssfb.build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }


    @RequestMapping("getUserList")
    @ResponseBody
    public List<User> getAllUserController() throws IOException {
        System.out.println("inner getAllUserController()");
        List<User> users = creatSqlSession().selectList("getAll");
        for (User u : users) {
            System.out.println(u);
        }

        return users;
    }

}
