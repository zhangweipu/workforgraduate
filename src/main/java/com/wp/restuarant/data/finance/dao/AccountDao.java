package com.wp.restuarant.data.finance.dao;

import com.wp.restuarant.data.finance.entity.Account;
import com.wp.utils.MyBatis;

import java.util.List;

/**
 * 餐厅资金账户
 * Created by zwp on 17-5-9.
 */
@MyBatis
public interface AccountDao {
    void insert(Account account);
    List<Account> select();
    Account selectById(Integer accountId);
    void update(Account account);
    void delete(Integer accountId);
}
