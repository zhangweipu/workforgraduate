package com.wp.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhang on 2017/3/5.
 */
@RequestMapping("/")
@Controller
public class CommonController {

    @RequestMapping("header")
    public String header(Model model){
        model.addAttribute("tab",1);
        return "client/header";
    }

    @RequestMapping("footer")
    public String footer(){
        return "client/footer";
    }

    @RequestMapping("left")
    public String left(){
        return "client/left";
    }
}
