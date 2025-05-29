package Test;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_CheckLeftNawMenu extends BaseDriver {

    @Test
    public void Test(){
        POM pom=new POM();

        driver.navigate().to("https://admin-demo.nopcommerce.com/login?");
        pom.logIn.click();

        Assert.assertTrue(pom.logOut.getText().contains("Logout"));

        pom.catalog.click();
        Assert.assertEquals(pom.products.getText(),"Products");

        pom.sales.click();
        Assert.assertEquals(pom.orders.getText(),"Orders");

        pom.customers.click();
        Assert.assertEquals(pom.customersText.getText()," Customers");

        pom.promotions.click();
        Assert.assertEquals(pom.discounts.getText()," Discounts");

        pom.contentManagement.click();
        Assert.assertTrue(pom.topicPages.getText().contains("Topics (pages)"));

        pom.configuration.click();
        Assert.assertTrue(pom.emailAccounts.getText().contains("Email accounts"));

        pom.system.click();
        Assert.assertTrue(pom.log.getText().contains("Log"));

        pom.reports.click();
        Assert.assertTrue(pom.powerBi.getText().contains("PowerBI"));

        pom.help.click();
        Assert.assertTrue(pom.Training.getText().contains("Training"));
    }
}
