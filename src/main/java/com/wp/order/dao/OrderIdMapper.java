package com.wp.order.dao;

import com.wp.order.entity.OrderId;
import com.wp.utils.MyBatis;

import java.util.List;
@MyBatis
public interface OrderIdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderId record);

    int insertSelective(OrderId record);

    OrderId selectByPrimaryKey(Integer id);

    List<OrderId> selectAll();

    int updateByPrimaryKeySelective(OrderId record);

    int updateByPrimaryKey(OrderId record);
}