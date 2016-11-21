import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: kangkang.lv
 * @date: 16-11-21 上午11:46
 */
public class FastjsonTest {

    @Test
    public void test01(){
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setName("testName");
        user.setId1(9102102800000000003l);
        user.setId2(9102102800000000008l);
        list.add(user);
        JSONObject json = new JSONObject();
        json.put("bean",list);
        String result = JSONObject.toJSONString(json, SerializerFeature.BrowserCompatible);
        System.out.println(result);
    }


}
