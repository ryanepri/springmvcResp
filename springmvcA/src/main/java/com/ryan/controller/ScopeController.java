package com.ryan.controller;

import com.ryan.pojo.User;
import com.ryan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ScopeController {
    @Autowired
    private UserService userService;


    /**
     * HttpServletRequest、HttpSession这两个域直接放在控制层单元的参数列表上即可，springmvc可以注入。
     * ServletContext就不能直接放在参数列表上用springmvc注入了。500.
     *
     * @param req
     * @param session
     * @return
     */
    @RequestMapping("/show")
    public String myMethod(HttpServletRequest req, HttpSession session) {
        List<User> allUser = userService.findAllUser();

        //向三个域中放入数据
        req.setAttribute("message", "reqMessage");
        req.setAttribute("users", allUser);


        session.setAttribute("message", "reqMessage");
        session.setAttribute("users", allUser);

        ServletContext application = req.getServletContext();
        application.setAttribute("message", "reqMessage");
        application.setAttribute("users", allUser);

        //跳转到showDataPage.jsp
        return "showDataPage.jsp";
    }

    @RequestMapping("/model")
    public String myMethod1(Model model) {

        List<User> allUser = userService.findAllUser();
        model.addAttribute("message", "reqMessage");
        model.addAttribute("users", allUser);

        //跳转到showDataPage.jsp
        return "showDataPage.jsp";
    }

    @RequestMapping("/modell")
    public String myMethod2(Model model) {

        List<User> allUser = userService.findAllUser();
        model.addAttribute("message", "reqMessage");
        model.addAttribute("users", allUser);

        //跳转到showDataPage.jsp
        return "redirect:/showDataPage.jsp";
    }

    @RequestMapping("/mv")
    public ModelAndView myMethod3() {
        //创建mv对象
        ModelAndView mv = new ModelAndView();

        //设置view
        mv.setViewName("forward:/showDataPage.jsp");

        //向req域中放入数据
        List<User> allUser = userService.findAllUser();
        mv.getModel().put("message", "reqMessage");
        mv.getModel().put("users", allUser);

        //返回ModelAndView
        return mv;
    }


    @RequestMapping("/mvv")
    public ModelAndView myMethod4() {
        //创建mv对象
        ModelAndView mv = new ModelAndView();

        //设置view
        mv.setViewName("redirect:/showDataPage.jsp");

        //向req域中放入数据
        List<User> allUser = userService.findAllUser();
        mv.getModel().put("message", "reqMessage");
        mv.getModel().put("users", allUser);

        //返回ModelAndView
        return mv;
    }

}
