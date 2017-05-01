package Test;

import com.wp.utils.ChineseToPinyinUtil;
import org.junit.Test;

/**
 * Created by zwp on 17-5-1.
 */
public class PinYinTest {


    @Test
    public void pinYin(){
        String str="你好";
       String a= ChineseToPinyinUtil.getPinYin(str);

        System.out.println(a);
    }
}
