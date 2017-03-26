package com.wp.restuarant.cooker.service;

import com.wp.restuarant.order.entity.Order;
import com.wp.restuarant.order.entity.OrderID;

import java.util.List;

/**
 * Created by zhang on 2017/3/16.
 */
public interface CookerService {
    List<OrderID> getAllOrderID(Integer id);
    List<Order> getOrder(int id);
    void updateOrder(Integer oid,Integer fid);
    void updateOrderId(Integer id);
}
