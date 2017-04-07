package com.wp.restuarant.cooker.service.impl;

import com.wp.restuarant.cooker.service.CookerService;
import com.wp.restuarant.data.order.dao.OrderIdMapper;
import com.wp.restuarant.data.order.dao.OrderMapper;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhang on 2017/3/16.
 */

@Repository
public class CookerServiceimpl implements CookerService{

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderIdMapper orderIdMapper;

    @Override
    public List<OrderID> getAllOrderID(Integer id) {
        return orderIdMapper.selectND(id);
    }

    @Override
    public List<Order> getOrder(int id) {
        return orderMapper.findOrder(id);
    }

    @Override
    public void updateOrder(Integer oid, Integer fid) {
        orderMapper.updateOrder(oid,fid);
    }

    @Override
    public void updateOrderId(Integer id) {
        orderIdMapper.updateOrderId(id);
    }
}
