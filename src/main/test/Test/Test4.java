package Test;

import com.wp.restuarant.data.emp.dao.EmpDao;
import com.wp.restuarant.data.emp.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zwp on 17-4-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class Test4 {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testInsert(){
        Emp emp=new Emp();
        emp.setId(1);
        emp.setName("tom");
        //empDao.insert(emp);
    }
}
