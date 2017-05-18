package com.wp.restuarant.adminer.controller;

import com.wp.restuarant.data.emp.dao.EmpDao;
import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.utils.OptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zwp on 17-5-12.
 */
@Controller
@RequestMapping("admin/security")
public class SecurityController {

    @Autowired
    private EmpDao empDao;

    @RequestMapping("/index")
    public String index(Model model){
        //TODO:获取管理员账号
        return "service/security/admin";
    }

    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(OptionUtil options){
        System.out.println(options);

        if(null==options.getStr2()|| null==options.getStr1()||null==options.getStr3()||
                "".equals(options.getStr2()) || "".equals(options.getStr2()) || "".equals(options.getStr3())){
            return "null";
        }
        if(!options.getStr2().equals(options.getStr2())){
            return "notEqual";
        }

        Emp emp=new Emp();
        emp.setPassword(options.getStr3());
        return "success";
    }

    @RequestMapping(value = "/emp")
    public String emp(){

        return "service/security/emp";
    }
}
