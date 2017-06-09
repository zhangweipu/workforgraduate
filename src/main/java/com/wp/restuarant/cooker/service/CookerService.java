package com.wp.restuarant.cooker.service;

import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;

import java.util.List;

/**
 * Created by zhang on 2017/3/16.
 */
public interface CookerService {
    List<OrderID> getAllOrderID(Integer id);
    List<Order> getOrder(int id);
    List<Order> getOrder();
    void updateOrder(Integer id);
    void updateOrderId(Integer id);
}
