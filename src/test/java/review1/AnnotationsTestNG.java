package review1;

import org.testng.annotations.*;

public class AnnotationsTestNG {
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("I am before method");

    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("I am after method");

    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("I am before class");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("I am after class");
    }

    @Test
    public void ActualTestCase() {
        System.out.println("This is my actual test case");
    }

    @Test
    public void secondTest() {
        System.out.println("This is my  second test case");
    }
}