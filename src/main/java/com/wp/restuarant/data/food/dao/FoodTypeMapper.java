package com.wp.restuarant.data.food.dao;

import com.wp.restuarant.data.food.entity.FoodType;
import com.wp.utils.MyBatis;

import java.util.List;

/**
 * Created by zhang on 2017/3/26.
 */
@MyBatis
public interface FoodTypeMapper {
    List<FoodType> seach();
    void insert(FoodType foodType);
    void insertBatch(List<FoodType> foodTypes);
    void update(FoodType foodType);
    void delete(String tpye);
}
