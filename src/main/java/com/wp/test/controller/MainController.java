package com.wp.test.controller;

import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.utils.OptionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zwp on 17-5-17.
 */

@Controller
public class MainController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping(value = "/main/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, OptionUtil optionUtil){
        HttpSession session=request.getSession();
        Emp emp=new Emp();
        emp.setId(Integer.valueOf(optionUtil.getStr1()));
        emp.setPassword("aaa");
        session.setAttribute("USER",emp);
        return "redirect:/admin/index";
    }

}
