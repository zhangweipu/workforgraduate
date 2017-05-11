package com.wp.restuarant.data.finance.dao;

import com.wp.restuarant.data.finance.entity.Trans;
import com.wp.utils.MyBatis;

import java.util.List;

/**
 * Created by zwp on 17-5-9.
 */
@MyBatis
public interface TransDao {
    void insert(Trans trans);
    List<Trans> select();
    void update(Trans trans);
    void delete(Integer TransId);
}
