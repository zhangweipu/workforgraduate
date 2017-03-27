package com.wp.restuarant.service.service.serviceImpl;

import com.wp.restuarant.food.dao.FoodTypeMapper;
import com.wp.restuarant.food.dao.FoodsMapper;
import com.wp.restuarant.food.entity.FoodType;
import com.wp.restuarant.food.entity.Foods;
import com.wp.restuarant.order.dao.OrderIdMapper;
import com.wp.restuarant.order.dao.OrderMapper;
import com.wp.restuarant.order.entity.Order;
import com.wp.restuarant.order.entity.OrderID;
import com.wp.restuarant.service.service.ServiceService;
import com.wp.utils.Conditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2016/10/8.
 */
@Service
public class ServiceServiceImpl implements ServiceService{

    @Autowired
    private FoodsMapper foodsMapper;

    @Autowired
    private FoodTypeMapper foodTypeMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderIdMapper orderIdMapper;

    public void add(Foods food) {
        foodsMapper.insert(food);
    }

    @Override
    public void addFoods(List<Foods> list) {
        foodsMapper.insertBatch(list);
    }

    public Foods findById(Integer id) {
        return foodsMapper.selectByPrimaryKey(id);
    }

    public List<Foods> findAll() {
            return foodsMapper.findAll();
    }

    @Override
    public List<Foods> findPage(Conditions conditions) {
        return foodsMapper.selectLimit(conditions);
    }

    @Override
    public int foodCount() {
        return foodsMapper.count();
    }

    public void update(Foods food) {
        foodsMapper.updateByPrimaryKey(food);
    }

    public void delete(Integer id) {
        foodsMapper.deleteByPrimaryKey(id);
    }

    public  List<Order> findAllOrder(){
        return orderMapper.findAllOrder();
    }

    public List<Order> findBySeatOrTime() {
        return null;
    }

    @Override
    public List<OrderID> findAllorderId() {
        return orderIdMapper.selectAll();
    }

    @Override
    public List<Order> findOrderDetail(Integer id) {
        return orderMapper.findOrder(id);
    }

    @Override
    public void addFoodType(FoodType foodType) {
        foodTypeMapper.insert(foodType);
    }

    @Override
    public List<FoodType> getFoodTypes() {
        return foodTypeMapper.seach();
    }

    @Override
    public void updateFoodType(FoodType foodType) {

    }

    @Override
    public void deleteFoodType(String type) {

    }
}
