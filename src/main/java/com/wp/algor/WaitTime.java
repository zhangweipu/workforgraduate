package com.wp.algor;

import com.wp.restuarant.order.dao.OrderIdMapper;
import com.wp.restuarant.order.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 根据订单的数量进行时间的估算
 * Created by zhang on 2017/3/16.
 */
@Repository
public class WaitTime {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderIdMapper orderIdMapper;

    /**
     * todo：待完善
     * 获取等待时间的方法 设置三分钟出菜
     * @param id 订单id
     * @return 返回等待时间，单位分钟
     */
    public Integer getTime(Integer id){
        int count=orderMapper.getBefore(id);
       return count*3;
    }

}
