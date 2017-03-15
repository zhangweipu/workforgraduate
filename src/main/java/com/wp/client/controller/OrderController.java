package com.wp.client.controller;

import com.wp.client.service.ClientService;
import com.wp.order.entity.Order;
import com.wp.order.entity.OrderID;
import com.wp.service.service.ServiceService;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhang on 2017/3/5.
 */
@RequestMapping("/order")
@Controller
public class OrderController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ServiceService serviceService;

    @RequestMapping(value = "/addorder",method = RequestMethod.POST)
    @ResponseBody
    public List<Order> addOder(Order order){
//        String seat="一号";
//        Integer id=null;
//        if(null==id){
//            id=clientService.addOrderID(seat);
//        }
        order.setOrderId(10);
        clientService.addOrder(order);
        List<Order> list=serviceService.findOrderDetail(10);
        return list;
    }
    @RequestMapping(value = "/suborder",method = RequestMethod.POST)
    @ResponseBody
    public List<Order> subOrder(Order order){
        order.setOrderId(10);
        clientService.subOrder(order);
        List<Order> list=serviceService.findOrderDetail(10);
        return list;
    }

    @RequestMapping(value = "/reset",method = RequestMethod.GET)
    @ResponseBody
    public void reset(){
        //取得订单号
        clientService.delOrder(10)                                                                                                                                                                                                           ;
    }

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submitOrder(OrderID orderID){
        //获取订单号
        orderID.setId(10);
        orderID.setStat("未结账");
        orderID.setTime(new Date());
        clientService.addOrderId(orderID);
        return "client/index";
    }
}
