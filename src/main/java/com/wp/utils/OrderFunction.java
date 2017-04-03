package com.wp.utils;

import com.wp.restuarant.order.dao.OrderMapper;

/**
 * Created by zhang on 2017/4/3.
 */
public class OrderFunction {

    private static OrderMapper orderMapper;

    public static OrderMapper getOrderMapper() {
        return orderMapper;
    }

    public void setOrderMapper(OrderMapper orderMapper) {
        OrderFunction.orderMapper = orderMapper;
    }

    public static Integer getNum(Integer id){
        return orderMapper.findNum(id);
    }


}
