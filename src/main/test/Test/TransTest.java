package Test;

import com.wp.restuarant.data.finance.dao.TransDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zwp on 17-5-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class TransTest {

    @Autowired
    TransDao transDao;

    @Test
    public void test(){
        transDao.select();
    }
}
