package Test;

import com.wp.restuarant.data.order.dao.OrderMapper;
import com.wp.restuarant.data.order.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by admin on 2016/10/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class Test1 {

    @Autowired
    OrderMapper orderMapper;
    @Test
    public void test(){
        List<Order> list=orderMapper.search(1,false);
        for(Order o:list){
            System.out.println(o);
        }
    }
}
