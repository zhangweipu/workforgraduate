package com.wp.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhang on 2017/2/24.
 */
@Controller
@RequestMapping("/service/finance")
public class FinanceController {

    @RequestMapping(value = "/outlist",method = RequestMethod.GET)
    public String list(){
        return "service/finance/outlist";
    }
}
