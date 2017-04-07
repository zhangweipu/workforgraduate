package com.wp.utils;

import com.wp.restuarant.data.food.dao.FoodTypeMapper;
import com.wp.restuarant.data.food.entity.FoodType;

import java.util.List;

/**
 * Created by zhang on 2017/2/10.
 */
public class FuntionDemo {

    private static FoodTypeMapper foodTypeMapper;

    public FoodTypeMapper getFoodTypeMapper() {
        return foodTypeMapper;
    }

    public void setFoodTypeMapper(FoodTypeMapper foodTypeMapper) {
        FuntionDemo.foodTypeMapper = foodTypeMapper;
    }

    public static List<FoodType> getFuntion(){
        List<FoodType> str=foodTypeMapper.seach();
        return str;
    }
}
