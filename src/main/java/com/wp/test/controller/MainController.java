package com.wp.test.controller;

import com.wp.restuarant.data.emp.dao.EmpDao;
import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.utils.OptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zwp on 17-5-17.
 */

@Controller
public class MainController {

    @Autowired
    EmpDao empDao;

    @RequestMapping("/main")
    public String main(HttpServletRequest request,Model model,@ModelAttribute("msg") String msg){
        HttpSession session=request.getSession();
        session.removeAttribute("USER");
        model.addAttribute("msg",msg);
        return "main";
    }

    @RequestMapping(value = "/main/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, OptionUtil optionUtil, RedirectAttributesModelMap modelMap){
        HttpSession session=request.getSession();
        Emp emp=empDao.selectById(Integer.valueOf(optionUtil.getStr1()));
        if(null == emp){
            //RedirectAttributesModelMap还是会在地址栏上显示的啊
            modelMap.put("msg","null");
            return "redirect:/main";
        }
        if(null !=emp.getPassword() && emp.getPassword().equals(optionUtil.getStr2())){
            session.setAttribute("USER",emp);
        }
        return "redirect:/admin/index";
    }

    @RequestMapping("/loadOut")
    public String layout(){
        return "redirect:/main";
    }
}
