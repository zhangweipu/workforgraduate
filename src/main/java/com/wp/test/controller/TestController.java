package com.wp.test.controller;

import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.restuarant.data.food.entity.Foods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhang on 2017/2/24.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(String id){
        System.out.println(id);
        return "\"id\":\"a\"";
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public String ProductsPage(){
        return "pages/products";
    }

    @RequestMapping(value = "/contactus",method = RequestMethod.GET)
    public String ContactUsPage(){
        return "pages/contactus";
    }
}
