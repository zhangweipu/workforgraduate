package Test;

import com.wp.restuarant.data.finance.dao.AccountDao;
import com.wp.restuarant.data.finance.entity.Account;
import com.wp.restuarant.data.order.dao.OrderMapper;
import com.wp.restuarant.data.order.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zwp on 17-5-9.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class AccountTest {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void tet(){
        orderMapper.updateOrder(174);
    }



    @Test
    public void add(){
        Account account=new Account();
        account.setAccountId(1333);
        account.setAmount(12.22);
        account.setType("suoyou");
        accountDao.insert(account);
    }

    @Test
    public void get(){
        Integer id=123333;
        accountDao.selectById(id);
    }

    @Test
    public void upda(){
        Account account=new Account();
        account.setAccountId(1333);
        account.setAmount(22.0);
        account.setType("suoy");
        accountDao.update(account);
    }
}
