package Test;

import com.wp.restuarant.data.food.dao.FoodTypeMapper;
import com.wp.restuarant.data.food.entity.FoodType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2017/3/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
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

    @Test
    public void testInsertBatch(){
        List<FoodType> foodTypes=new ArrayList<>();
        for(int i=0;i<10;i++){
            FoodType foodType=new FoodType(""+i);
            foodTypes.add(foodType);
        }
        foodTypeMapper.insertBatch(foodTypes);
    }
}
