package class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void Login(){
        System.out.println("I have loggen in succesfully");
    }

    @Test(dependsOnMethods={"Login"})
    public void DashBoardVerification(){
        System.out.println("after login in I am verifying the dashboard page");
    }
}
