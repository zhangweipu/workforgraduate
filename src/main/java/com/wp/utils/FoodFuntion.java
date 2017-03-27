package com.wp.utils;

import com.wp.restuarant.food.dao.FoodsMapper;
import com.wp.restuarant.food.entity.Foods;

import java.util.List;

/**
 * Created by zhang on 2017/3/27.
 */
public class FoodFuntion {


    private static FoodsMapper foodsMapper;

    public FoodsMapper getFoodsMapper() {
        return foodsMapper;
    }

    public void setFoodsMapper(FoodsMapper foodsMapper) {
        this.foodsMapper = foodsMapper;
    }

    public static List<Foods> getByType(String type){
        return foodsMapper.selectByType(type);
    }
}
