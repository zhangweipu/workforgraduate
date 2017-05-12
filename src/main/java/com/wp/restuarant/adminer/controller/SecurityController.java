package com.wp.restuarant.adminer.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zwp on 17-5-12.
 */
@RequestMapping("admin/security")
public class SecurityController {

    @RequestMapping("index")
    public String index(){

        return "service/security/index";
    }
}
