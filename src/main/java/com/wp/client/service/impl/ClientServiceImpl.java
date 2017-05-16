package com.wp.client.service.impl;

import com.wp.client.service.ClientService;
import com.wp.restuarant.data.food.dao.FoodsMapper;
import com.wp.restuarant.data.order.dao.OrderIdMapper;
import com.wp.restuarant.data.order.dao.OrderMapper;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * Created by zhang on 2017/3/5.
 */
@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    OrderIdMapper orderIdMapper;
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    FoodsMapper foodsMapper;

    @Override
    public int addOrderID(String seat) {
        OrderID orderID=new OrderID();
        orderID.setStat("未结账");
        orderID.setTime(new Date());
        orderID.setSeat(seat);
        orderIdMapper.insertSelective(orderID);
        return orderID.getId();
    }

    @Override
    public int addOrder(Order order) {
        orderMapper.insertSelective(order);
        return order.getId();
    }

    @Override
    public void subOrder(Order order) {
        orderMapper.deleteOrder(order);
    }

    @Override
    public void delOrder(Integer id) {
        orderMapper.deleteBySeat(id);
    }

    @Override
    public void addOrderId(OrderID orderID) {
        orderIdMapper.insertSelective(orderID);
    }

    @Override
    public void markOrder(Integer orderid) {
       orderMapper.UpdateLa(orderid);
    }

    @Override
    public void markPraise(Integer id) {
        foodsMapper.findPraise(id);
    }

    @Override
    public int getMoney(Integer id) {
        return orderMapper.selectSum(id);
    }

}
