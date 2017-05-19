package com.wp.restuarant.adminer.controller;

import com.wp.restuarant.data.emp.dao.EmpDao;
import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.utils.OptionUtil;
import org.json.JSONObject;
import org.pptx4j.pml.STTLTriggerRuntimeNode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zwp on 17-5-12.
 */
@Controller
@RequestMapping("admin/security")
public class SecurityController {

    @Autowired
    private EmpDao empDao;

    @RequestMapping("/index")
    public String index(HttpServletRequest request,Model model){
        //TODO:获取管理员账号
        HttpSession session=request.getSession();
        Emp emp=(Emp) session.getAttribute("USER");
        model.addAttribute("Id",emp.getId());
        return "service/security/admin";
    }

    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(HttpServletRequest request,OptionUtil options){

        HttpSession session=request.getSession();
        Emp e=(Emp) session.getAttribute("USER");
        if(!options.getStr1().equals(e.getPassword())){
            return "error";
        }
        if(null==options.getStr2()|| null==options.getStr1()||null==options.getStr3()||
                "".equals(options.getStr2()) || "".equals(options.getStr2()) || "".equals(options.getStr3())){
            return "null";
        }
        if(!options.getStr2().equals(options.getStr3())){
            return "notEqual";
        }
        Emp emp=new Emp();
        emp.setId(e.getId());
        emp.setPassword(options.getStr3());
        empDao.update(emp);
        return "success";
    }

    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String emp(){
        return "service/security/emp";
    }

    @RequestMapping(value = "/updateEmp",method = RequestMethod.GET)
    public String emp(Integer id,Model model){
      Emp emp=empDao.selectById(id);
       model.addAttribute("ls",emp);
        return "service/security/empDetail";
    }

    @ResponseBody
    @RequestMapping(value = "/reset",method = RequestMethod.POST)
    public String reset(Integer id){
        empDao.resetPsd(id);
        return "success";
    }
}
