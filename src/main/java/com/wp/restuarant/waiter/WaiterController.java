package com.wp.restuarant.waiter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhang on 2017/4/4.
 */
@Controller
@RequestMapping("/admin/waiter")
public class WaiterController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){

        return "waiter/index";
    }
}
