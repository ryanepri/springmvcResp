package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TestRedirectController {

    //redirect

    /**
     * 返回字符串告诉DispatcherServlet跳转的路径
     * 在路径之前放上一个redirect: 关键字,就是重定向
     * 如果路径前的关键字是redirect,那么不可以省略
     * /表示当前项目下.这里不需要项目的上下文路径
     */
    @RequestMapping("testRedirect")
    public String testForwardMethod() {
        return "redirect:/redirectPage.jsp";
    }


}
