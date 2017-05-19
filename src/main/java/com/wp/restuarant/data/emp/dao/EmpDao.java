package com.wp.restuarant.data.emp.dao;

import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.utils.MyBatis;

import java.util.List;


/**
 * Created by zwp on 17-4-12.
 */
@MyBatis
public interface EmpDao {
    void insert(Emp emp);
    List<Emp> select();
    void update(Emp emp);
    void resetPsd(Integer id);
    void delete(Integer id);
    Emp selectById(Integer id);
}
