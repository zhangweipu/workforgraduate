package com.wp.restuarant.food.dao;


import com.wp.restuarant.food.entity.Foods;
import com.wp.utils.Conditions;
import com.wp.utils.MyBatis;

import java.util.List;

@MyBatis
public interface FoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    void insertBatch(List<Foods> list);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);

    List<Foods> findAll();

    List<Foods> selectLimit(Conditions conditions);

    int count();

    Foods findSizePriceByName(String tab);
}