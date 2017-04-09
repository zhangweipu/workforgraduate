package com.wp.client.service;


import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;

/**
 * Created by zhang on 2017/3/5.
 */
public interface ClientService {
    int addOrderID(String seat);
    int addOrder(Order order);
    void subOrder(Order order);
    void delOrder(Integer id);
    void addOrderId(OrderID orderID);
    void markOrder(Integer orderid);
    void markPraise(Integer id);
}
