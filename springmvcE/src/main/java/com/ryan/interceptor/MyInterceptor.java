package com.ryan.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    //该方法在4执行。
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        在请求到达我们定义的handler之前工作的
        System.out.println("inner preHandle method");
//        返回的是true 代表放行 可以继续到达handler
        return true;
    }


    //该方法是在7执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        handler 处理单元返回ModelAndView 时进行拦截
        System.out.println("inner postHandle method");
    }


    //该方法是在10执行（视图到前端控制器的方向。
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        页面渲染完毕，但是还没有给浏览器响应数据的时候。
        System.out.println("inner afterCompletion method");
    }
}
