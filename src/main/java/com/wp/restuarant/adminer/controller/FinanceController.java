package com.wp.restuarant.adminer.controller;

import com.wp.restuarant.data.finance.dao.AccountDao;
import com.wp.restuarant.data.finance.dao.TransDao;
import com.wp.restuarant.data.finance.entity.Account;
import com.wp.restuarant.data.finance.entity.Trans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by zhang on 2017/2/24.
 */
@Controller
@RequestMapping("/admin/finance")
public class FinanceController {

    @Autowired
    AccountDao accountDao;

    @Autowired
    TransDao transDao;

    @RequestMapping("/index")
    public String index(Model model){

        List<Account> account=accountDao.select();
        model.addAttribute("account",account);
        return "service/finance/index";
    }

    @RequestMapping(value = "/outlist",method = RequestMethod.GET)
    public String outList(Model model){
        List<Trans> list=transDao.selectOutcome();
        model.addAttribute("list",list);
        return "service/finance/outlist";
    }

    @RequestMapping(value = "/inlist", method = RequestMethod.GET)
    public String inList(Model model){
        List<Trans> list=transDao.selectIncome();
        model.addAttribute("list",list);
        return "service/finance/inlist";
    }

    @RequestMapping(value = "analyse",method = RequestMethod.GET)
    public String listAnaly(){
        return "service/finance/analyse ";
    }


}
