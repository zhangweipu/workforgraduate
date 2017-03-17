package com.wp.cooker.service.impl;

import com.wp.cooker.service.CookerService;
import com.wp.order.dao.OrderIdMapper;
import com.wp.order.dao.OrderMapper;
import com.wp.order.entity.OrderID;
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
    public List<OrderID> getAllOrderID() {
        return orderIdMapper.selectAll();
    }
}
