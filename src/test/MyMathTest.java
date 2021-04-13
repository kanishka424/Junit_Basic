package test;

import main.MyMath;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest  {

    @BeforeClass
    public static void beforeClass(){//class level methods apply to whole class so it should be static
        System.out.println("Before Class");
    }

    @Before
    public void beforeMethod(){
        System.out.println("Before");
    }

    @Test
    void testSum() {
        MyMath myMath=new MyMath();
        int result=myMath.sum(new int[]{1,2,3});
        System.out.println("test 1");
        assertEquals(6,result);//how to check if the result is equal to what we expected
    }


    @Test
    void test2() {
        System.out.println("test 2");
    }

    @After
    public void afterMethod(){
        System.out.println("After");
    }


    @AfterClass
    public static void afterClass(){//class level methods apply to whole class so it should be static
        System.out.println("Before Class");
    }

}

//========other JUNIT methods===========
//assertTrue() and assertFalse()
//assertNotNull() and assertNUll()
