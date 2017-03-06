package com.wp.client.controller;

import com.wp.order.entity.Order;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhang on 2017/3/5.
 */
@Controller
public class OrderController {

    @RequestMapping("/addorder")
    @ResponseBody
    public String addOder(Order order){
        JSONObject jsonObject=JSONObject.fromObject(order);
        return "";
    }
}
