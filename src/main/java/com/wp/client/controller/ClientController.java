package com.wp.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2016/10/5.
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "client/index";
    }
}
