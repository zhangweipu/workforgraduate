package com.wp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zwp on 17-5-17.
 */

@Controller
public class MainController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

}
