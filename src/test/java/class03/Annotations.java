package class03;

import org.testng.annotations.*;

public class Annotations {
@BeforeTest
public void BeforeTest(){
    System.out.println("I am before test");
}

    @AfterTest
    public void AfterTest(){
        System.out.println("I am After test");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("I am before class method");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am before method");
    }
    @Test
    public void AFirstTest(){
        System.out.println("I am a 1 Test");
    }
    @Test
    public void BSecondTest(){
        System.out.println("I am a 2 Test");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am After method");
}
    @AfterClass
    public void AfterClass(){
        System.out.println("I am After class method");
    }
}
