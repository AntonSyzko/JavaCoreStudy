package JUNIT;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

/**
 * Created by Admin on 19.08.2016.
 */
public class MyAssertNotNullTest {

    public String getPropValue(final String key){
        Map<String, String> appProps= new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", null);
        return appProps.get(key);
    }

    @Test
    public void test(){
        MyAssertNotNullTest msnt = new MyAssertNotNullTest();
        assertNotNull(msnt.getPropValue("key1"));
        assertNull(msnt.getPropValue("key33"));
        assertNotSame(msnt.getPropValue("key1"),msnt.getPropValue("key3"));

    }
}
