package com.wp.client.controller;

import com.wp.client.service.ClientService;
import com.wp.restuarant.data.finance.dao.TransDao;
import com.wp.restuarant.data.finance.entity.Trans;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
import com.wp.restuarant.adminer.service.ServiceService;
import com.wp.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    private TransDao transDao;

    @Autowired
    private ServiceService serviceService;

    @RequestMapping(value = "/addorder",method = RequestMethod.POST)
    @ResponseBody
    public List<Order> addOder(Order order, HttpServletRequest req){
//        String seat="一号";
//        Integer id=null;
//        if(null==id){
//            id=clientService.addOrderID(seat);
//        }
        Integer id=null;
        HttpSession session=req.getSession();
        if (session.getAttribute("orderid")!=null) {
             id = (int) session.getAttribute("orderid");
        }else{
            id=order.getOrderId();
            session.setAttribute("orderid",id);
        }
        order.setOrderId(id);
        order.setTime(new Date());
        order.setLa(Constants.FOOD_ND);
        clientService.addOrder(order);
        List<Order> list=serviceService.findOrder(id);
        return list;
    }
    @RequestMapping(value = "/suborder",method = RequestMethod.POST)
    @ResponseBody
    public List<Order> subOrder(Order order){
        clientService.subOrder(order);
        List<Order> list=serviceService.findOrderDetail(order.getOrderId());
        return list;
    }

    @RequestMapping(value = "/reset",method = RequestMethod.GET)
    @ResponseBody
    public void reset(HttpServletRequest request){
        HttpSession session=request.getSession();
        Integer id=(Integer)session.getAttribute("orderid");
        //取得订单号
        clientService.delOrder(id)                                                                                                                                                                                                           ;
    }

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submitOrder(OrderID orderID,HttpServletRequest req){
        //获取订单号
        HttpSession session=req.getSession();
        int id= (int) session.getAttribute("orderid");
        clientService.markOrder(id);
        orderID.setId(id);
        orderID.setStat(Constants.ORDER_ND);
        orderID.setTime(new Date());
        orderID.setMoney(clientService.getMoney(id));
       // clientService.addOrderId(orderID);
        Trans trans=new Trans();
        trans.setTransId(id);
        trans.setTime(new Date());
        trans.setDetail("餐点");
        trans.setType("IN");
        trans.setTurnover(Double.valueOf(orderID.getMoney()));
        serviceService.inCome(trans);
        return "redirect:/client/success";
    }
}
