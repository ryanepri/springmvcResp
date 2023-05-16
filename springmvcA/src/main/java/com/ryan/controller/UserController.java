package com.ryan.controller;

import com.ryan.pojo.User;
import com.ryan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    public String login1(String username, String password) {
        User user = userService.getUserByUsernameAndPwd(username, password);
        String view = null;
        if (user != null) {
            System.out.println("user::" + user);
            view = "success.jsp";
        } else {
            view = "fail.jsp";
        }
        return view;
    }

    @ResponseBody
    @RequestMapping("findAllUser.do")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

}
