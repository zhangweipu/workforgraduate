package com.wp.restuarant.cooker;

import com.wp.restuarant.cooker.service.CookerService;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
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
@RequestMapping("/admin/cooker")
public class CookerController {

    @Autowired
    private CookerService cookerService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getOrderIdList(Model model){
        List<Order> orderIDS=cookerService.getOrder();
        model.addAttribute("IDlist",orderIDS);
        return "cooker/list";
    }

    @RequestMapping(value = "/orderStatus",method = RequestMethod.GET)
    public String orderStatus(Integer id){
        cookerService.updateOrder(id);

        return "redirect:/admin/cooker/list";
    }
}
