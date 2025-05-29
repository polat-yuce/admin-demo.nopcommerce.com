package Test;

import Utlity.BaseDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_EditCustomer extends BaseDriver {

    @Test
    public void Test(){
        POM pom = new POM();

        driver.navigate().to("https://admin-demo.nopcommerce.com/login?");
        pom.logIn.click();

        pom.customers.click();
        pom.SearchEmail.sendKeys("steve_gates@nopCommerce.com");
        pom.SearchFirstName.sendKeys("Steve");
        pom.SearchLastName.sendKeys("Gates");
        pom.searchCustomers.click();
        pom.edit.click();
        pom.password.sendKeys("jdsavnjkdsf"+ Keys.ENTER);
        Assert.assertTrue(pom.kaydedildi.getText().contains("successfully"));







    }
}
