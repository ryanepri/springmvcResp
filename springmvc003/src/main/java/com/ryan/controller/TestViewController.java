package com.ryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class TestViewController {

    /**
     * forward转发
     *
     * @return
     */
    @RequestMapping("testViewFroward")
    public View testForwardMethod() {
        View view = null;
        //请求转发
        view = new InternalResourceView("/forwardPage.jsp");

        return view;
    }


    /**
     * redirect重定向
     *
     * @param request
     * @return
     */
    @RequestMapping("testViewRedirect")
    public View testRedirectMethod(HttpServletRequest request) {
        View view = null;
        //请求转发
//        view = new InternalResourceView(request.getPathInfo() + "forwardPage.jsp");
        view = new RedirectView("forwardPage.jsp");

        return view;
    }


}
