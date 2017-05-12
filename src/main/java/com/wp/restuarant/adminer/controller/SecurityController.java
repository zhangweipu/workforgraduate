package com.wp.restuarant.adminer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zwp on 17-5-12.
 */
@Controller
@RequestMapping("admin/security")
public class SecurityController {

    @RequestMapping("/index")
    public String index(){

        return "service/security/index";
    }

    @RequestMapping(value = "/emp")
    public String emp(){

        return "service/security/emp";
    }
}
