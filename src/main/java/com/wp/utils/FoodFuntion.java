package com.wp.utils;

import com.wp.restuarant.data.food.dao.FoodsMapper;
import com.wp.restuarant.data.food.entity.Foods;

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

    public static List<Foods> getByType(Integer type){
        return foodsMapper.selectByType(type);
    }

    public static Integer findPraise(Integer id){
        return foodsMapper.findPraise(id);
    }

}
