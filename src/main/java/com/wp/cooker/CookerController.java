package com.wp.cooker;

import com.wp.cooker.service.CookerService;
import com.wp.order.entity.Order;
import com.wp.order.entity.OrderID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2016/10/13.
 */
@Controller
@RequestMapping("/cooker")
public class CookerController {

    @Autowired
    private CookerService cookerService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getOrderIdList(Model model){
        List<OrderID> orderIDS=cookerService.getAllOrderID();
        model.addAttribute("IDlist",orderIDS);
        return "cooker/list";
    }
    @RequestMapping("/orderdetail")
    @ResponseBody
    public List<Order> orderDetial(Integer id,Model model){
        List<Order> list=cookerService.getOrder(id);
        model.addAttribute("list",list);
        return list;
    }
}
