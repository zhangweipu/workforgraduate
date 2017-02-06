package com.wp.service.service;

import com.wp.food.entity.foods;
import com.wp.order.entity.Order;

import java.util.List;

/**
 * Created by admin on 2016/10/8.
 */
public interface ServiceService {
    void add(foods food);
    foods findById(Integer id);
    List<foods>  findAll();
    void update(foods food);
    void delete(Integer id);
    List<Order> findAllOrder();
    List<Order> findBySeatOrTime();
}
