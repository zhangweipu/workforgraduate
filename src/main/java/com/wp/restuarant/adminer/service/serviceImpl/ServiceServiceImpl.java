package com.wp.restuarant.adminer.service.serviceImpl;

import com.wp.restuarant.data.finance.dao.AccountDao;
import com.wp.restuarant.data.finance.dao.TransDao;
import com.wp.restuarant.data.finance.entity.Account;
import com.wp.restuarant.data.finance.entity.Trans;
import com.wp.restuarant.data.food.dao.FoodTypeMapper;
import com.wp.restuarant.data.food.dao.FoodsMapper;
import com.wp.restuarant.data.food.entity.FoodType;
import com.wp.restuarant.data.food.entity.Foods;
import com.wp.restuarant.data.order.dao.OrderIdMapper;
import com.wp.restuarant.data.order.dao.OrderMapper;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
import com.wp.restuarant.adminer.service.ServiceService;
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

    @Autowired
    private TransDao transDao;

    @Autowired
    private AccountDao accountDao;

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
    public List<Order> findOrder(Integer id) {
        return orderMapper.findOrderDetail(id);
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

    @Override
    public void inCome(Trans trans) {
        transDao.insert(trans);
        Account account=new Account();
        account.setAccountId(123333);
        account.setAmount(trans.getTurnover());
        accountDao.update(account);
    }

    @Override
    public void outCome(Trans trans) {
        transDao.insert(trans);
        Account account=new Account();
        account.setAccountId(123333);
        account.setAmount(trans.getTurnover());
        accountDao.updateD(account);
    }
}
