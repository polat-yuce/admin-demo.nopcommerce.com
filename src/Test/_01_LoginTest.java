package Test;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_LoginTest extends BaseDriver {

    @Test
    public void Test(){
        POM pom=new POM();

        driver.navigate().to("https://admin-demo.nopcommerce.com/login?");
        pom.logIn.click();

        Assert.assertTrue(pom.logOut.getText().contains("Logout"));


    }


}
