package com.wp.client.service;


import com.wp.order.entity.Order;
import com.wp.order.entity.OrderID;

/**
 * Created by zhang on 2017/3/5.
 */
public interface ClientService {
    int addOrderID(String seat);
    int addOrder(Order order);
}
