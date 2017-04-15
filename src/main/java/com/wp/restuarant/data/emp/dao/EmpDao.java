package com.wp.restuarant.data.emp.dao;

import com.wp.restuarant.data.emp.entity.Emp;
import com.wp.utils.MyBatis;

/**
 * Created by zwp on 17-4-12.
 */
@MyBatis
public interface EmpDao {
    void insert(Emp emp);
}
