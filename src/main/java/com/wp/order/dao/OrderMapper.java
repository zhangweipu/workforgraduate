package com.wp.order.dao;

import com.wp.order.entity.Order;
import com.wp.utils.MyBatis;

import java.util.List;

@MyBatis
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> findBySeat(Integer tab);

    void deleteBySeat(Integer tab);//删除订单

    List<Order> findAllOrder();
}