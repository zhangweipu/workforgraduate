package com.wp.client.service.impl;

import com.wp.client.service.ClientService;
import com.wp.order.dao.OrderIdMapper;
import com.wp.order.dao.OrderMapper;
import com.wp.order.entity.Order;
import com.wp.order.entity.OrderID;
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
}
