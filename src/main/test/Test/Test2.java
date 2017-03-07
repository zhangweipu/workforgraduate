package Test;

import com.wp.client.service.ClientService;
import com.wp.order.entity.Order;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by zhang on 2017/3/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class Test2 {

    @Autowired
    ClientService clientService;

    @Test
    public void test(){
       int i= clientService.addOrderID("aaa");
        System.out.println(i);
    }

    @Test
    public void testOrder(){
        Order o=new Order();
        o.setTime(new Date());
        o.setfoodID(1);
        o.setFoodPrice(5);
        o.setOrderId(3);
       int i= clientService.addOrder(o);
    }

    @Test
    public void testJson(){
        Order o=new Order();
        o.setTime(new Date());
        o.setfoodID(1);
        o.setFoodPrice(5);
        o.setOrderId(3);
        JSONObject jso=JSONObject.fromObject(o);
        System.out.println(jso.toString());
        System.out.println(o.toString());
    }
}
