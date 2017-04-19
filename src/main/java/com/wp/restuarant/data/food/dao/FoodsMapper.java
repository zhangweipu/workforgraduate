package com.wp.restuarant.data.food.dao;


import com.wp.restuarant.data.food.entity.Foods;
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

    List<Foods> selectByType(String type);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);

    List<Foods> findAll();

    List<Foods> selectLimit(Conditions conditions);

    int count();

    Foods findSizePriceByName(String tab);

    Integer findPraise(Integer id);

    void updatePraiseNum(Integer id);

    List<Foods> findByType(String type);
}