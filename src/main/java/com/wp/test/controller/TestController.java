package com.wp.test.controller;

import com.wp.restuarant.data.emp.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhang on 2017/2/24.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    
    public String index(){
        Emp emp=new Emp();
        emp.setId(1);
        emp.setAge(2);
        emp.setPower(1);
        return "test/index";
    }
}
