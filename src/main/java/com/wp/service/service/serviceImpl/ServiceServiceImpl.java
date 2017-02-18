package com.wp.service.service.serviceImpl;

import com.wp.food.dao.foodsMapper;
import com.wp.food.entity.foods;
import com.wp.order.dao.OrderIdMapper;
import com.wp.order.dao.OrderMapper;
import com.wp.order.entity.Order;
import com.wp.order.entity.OrderId;
import com.wp.service.service.ServiceService;
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
    private foodsMapper foodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderIdMapper orderIdMapper;

    public void add(foods food) {
        foodsMapper.insert(food);
    }

    @Override
    public void addFoods(List<foods> list) {
        foodsMapper.insertBatch(list);
    }

    public foods findById(Integer id) {
        return foodsMapper.selectByPrimaryKey(id);
    }

    public List<foods> findAll() {
            return foodsMapper.findAll();
    }

    @Override
    public List<foods> findPage(Conditions conditions) {
        return foodsMapper.selectLimit(conditions);
    }

    @Override
    public int foodCount() {
        return foodsMapper.count();
    }

    public void update(foods food) {
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
    public List<OrderId> findAllorderId() {
        return orderIdMapper.selectAll();
    }

    @Override
    public List<Order> findOrderDetail(Integer id) {
        return orderMapper.findOrder(id);
    }
}
