package com.wp.order.dao;

import com.wp.food.entity.OrderId;

public interface OrderIdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderId record);

    int insertSelective(OrderId record);

    OrderId selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderId record);

    int updateByPrimaryKey(OrderId record);
}