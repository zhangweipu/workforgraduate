package com.wp.restuarant.adminer.service;

import com.wp.restuarant.data.food.entity.FoodType;
import com.wp.restuarant.data.food.entity.Foods;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
import com.wp.utils.Conditions;

import java.util.List;

/**
 * Created by admin on 2016/10/8.
 */
public interface ServiceService {
    void add(Foods food);
    void addFoods(List<Foods> list);
    Foods findById(Integer id);
    List<Foods>  findAll();
    List<Foods>  findPage(Conditions conditions);
    int foodCount();
    void update(Foods food);
    void delete(Integer id);
    List<Order> findAllOrder();
    List<Order> findBySeatOrTime();
    List<OrderID> findAllorderId();
    List<Order> findOrderDetail(Integer id);
    void addFoodType(FoodType foodType);
    List<FoodType> getFoodTypes();
    void updateFoodType(FoodType foodType);
    void deleteFoodType(String type);
}
