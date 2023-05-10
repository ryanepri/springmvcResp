package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class TestViewAndModelController {

    /**
     * forward转发
     *
     * @return
     */
    @RequestMapping("testMVFroward")
    public ModelAndView testMVFrowardMethod() {
        ModelAndView mv = new ModelAndView();
        //请求转发
        //写法1
        mv.setViewName("forward:/forwardPage.jsp");
        //写法2
//        mv.setView(new InternalResourceView("/forwardPage.jsp"));
        return mv;
    }


    /**
     * redirect重定向
     *
     * @param request
     * @return
     */
    @RequestMapping("testMVRedirect")
    public ModelAndView testMVRedirectMethod(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        //请求重定向
        //写法1
        mv.setViewName("redirect:/redirectPage.jsp");
        //写法2
//        mv.setView(new RedirectView(request.getPathInfo() + "/redirectPage.jsp"));
        return mv;
    }


}
