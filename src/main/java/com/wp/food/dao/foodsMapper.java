package com.wp.food.dao;


import com.wp.food.entity.foods;
import com.wp.utils.MyBatis;

import java.util.List;

@MyBatis
public interface foodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(foods record);

    void insertBatch(List<foods> list);

    int insertSelective(foods record);

    foods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(foods record);

    int updateByPrimaryKey(foods record);

    List<foods> findAll();

    List<foods> selectLimit(int page);

    int count();

    foods findSizePriceByName(String tab);
}