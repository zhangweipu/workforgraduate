package com.wp.restuarant.data.order.dao;

import com.wp.restuarant.data.order.entity.Order;
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

    void deleteOrder(Order order);

    List<Order> findAllOrder();

    List<Order> findOrder(Integer id);

    List<Order> findOrderDetail(Integer id);

    List<Order> search(int a,boolean b);

    int getBefore(Integer id);

    void updateOrder(Integer oid,Integer fid);

    void UpdateLa(Integer orderid);
    Integer findNum(Integer foodid);
}