package JUNIT;

/**
 * Created by Admin on 18.08.2016.
 */
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassTestForOneTest {


    List testListNull = null;
    List testList = null;

    @Before//runs before  test annotated classes
    public void initialize() {
        testListNull = null;
        testList = new ArrayList();
    }
    @Test
    public void testEvenOddNumber(){
        ClassForTestingOne meo = new ClassForTestingOne();
        assertEquals("10 is a even number", true, meo.isEvenNumber(14));
    }

    @Test
    public void testEmtyListOrNot(){
        org.junit.Assert.assertTrue(testList.isEmpty());
    }
    @Test(expected = NullPointerException.class)//checks for expected exceptions
    public void testEmtyListOrNotException(){
        org.junit.Assert.assertTrue(testListNull.isEmpty());
    }

    @After
    public void killEmAll(){
        System.exit(0);
    }
}
