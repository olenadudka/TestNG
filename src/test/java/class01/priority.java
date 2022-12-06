package class01;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 3, groups="regression")
    public void ATest(){
        System.out.println("I am A test");
    }

    @Test(priority = 1)
    public void BTest(){
        System.out.println("I am B test");
    }

    @Test(priority = 2)
    public void CTest(){
        System.out.println("I am C test");
    }

    @Test
    public void DTest(){
        System.out.println("I am D test");
    }
    @Test
    public void AB(){
        System.out.println("I am AB test");
    }
}
