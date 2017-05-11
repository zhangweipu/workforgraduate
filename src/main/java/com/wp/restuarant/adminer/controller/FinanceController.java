package com.wp.restuarant.adminer.controller;

import com.wp.restuarant.data.finance.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhang on 2017/2/24.
 */
@Controller
@RequestMapping("/admin/finance")
public class FinanceController {

    @RequestMapping(value = "initAccount",method = RequestMethod.GET)
    public String initAccount(){
        return "service/finance/init";
    }

    @RequestMapping(value = "/saveAccount",method = RequestMethod.POST)
    public String initAccount(Account account){
        return "success";
    }
    @RequestMapping(value = "total",method = RequestMethod.GET)
    public String accountTotal(){

        return "service/finance/total";
    }

    @RequestMapping(value = "/outlist",method = RequestMethod.GET)
    public String outList(){
        return "service/finance/outlist";
    }

    @RequestMapping(value = "/inlist", method = RequestMethod.GET)
    public String inList(){
        return "service/finance/inlist";
    }

    @RequestMapping(value = "analyse",method = RequestMethod.GET)
    public String listAnaly(){
        return "service/finance/Analy";
    }


}
