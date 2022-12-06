package review1;

import org.testng.annotations.Test;

public class PriorityExample
{
    @Test(priority=2)
    public void MyFirstTestCase(){
        System.out.println("My first test case");
    }
    @Test(priority=1)
    public void MySecondTestCase(){
        System.out.println("My second test case");
    }
}
