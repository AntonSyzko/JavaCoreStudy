package JUNIT;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertSame;

/**
 * Created by Admin on 22.08.2016.
 */
public class MyAssertSameTest {

    public String getPropValue(final String key){
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }

    @Test
    public void isSameReferenceTest(){

        MyAssertSameTest msnt = new MyAssertSameTest();
        assertSame(msnt.getPropValue("key1"),msnt.getPropValue("key1"));
    }


}
