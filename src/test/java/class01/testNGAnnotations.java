package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {
    //first test case
    @Test
    public void AfirstTestCase(){
        System.out.println("I am first test case");
    }
    @Test
    public void BSecondTestCase(){
        System.out.println("I'm second case test");
    }
    @Test
    public void ThirdTestCase(){
        System.out.println("Third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I'm before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
}
