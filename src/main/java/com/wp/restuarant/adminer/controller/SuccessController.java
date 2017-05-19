package com.wp.restuarant.adminer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhang on 2017/3/26.
 */
@RequestMapping("/")
@Controller
public class SuccessController {

    @RequestMapping("/success")
    @ResponseBody
    public String success(String operation){
        return "{\"msg\":"+operation+",\"success\":\"success\"}";
    }

    @RequestMapping("/success2")
    public String success(){
        return "/service/success";
    }
}
