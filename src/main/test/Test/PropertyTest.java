package Test;

import com.wp.utils.PropertyUtil;
import org.junit.Test;

/**
 * Created by zwp on 17-4-30.
 */
public class PropertyTest {

    @Test
    public void test(){
      String a=  PropertyUtil.getProperty("sex.1");
        System.out.println(a);
    }

    @Test
    public void test2(){
        String b=PropertyUtil.getProperty("power","1");
        System.out.println(b);
    }
}
