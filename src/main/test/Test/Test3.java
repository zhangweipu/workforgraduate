package Test;

import com.wp.restuarant.food.dao.FoodTypeMapper;
import com.wp.restuarant.food.entity.FoodType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zhang on 2017/3/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class Test3 {

    @Autowired
    private FoodTypeMapper foodTypeMapper;

    @Test
    public void testInsert(){
        FoodType foodType=new FoodType();
        foodType.setType("sss");
        foodType.setId(1);
        foodTypeMapper.insert(foodType);
    }

    @Test
    public void testsearch(){
        List<FoodType> list=foodTypeMapper.seach();
    }
}
