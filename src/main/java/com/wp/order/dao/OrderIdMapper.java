package com.wp.order.dao;

import com.wp.order.entity.OrderID;
import com.wp.utils.MyBatis;

import java.util.List;
@MyBatis
public interface OrderIdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderID record);

    int insertSelective(OrderID record);

    OrderID selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderID record);

    int updateByPrimaryKey(OrderID record);

    List<OrderID> selectAll();
}