package Test;

import com.wp.utils.PropertyUtil;
import org.junit.Test;

/**
 * Created by zwp on 17-4-30.
 */
public class PropertyTest {

    @Test
    public void test(){
      String a=  PropertyUtil.getProperty("ND");
        System.out.println(a);
    }
}
