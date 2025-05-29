package Test;

import Utlity.BaseDriver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class _06_SearchTest extends BaseDriver {

    @Test
    public void Test(){
        POM pom = new POM();

        driver.navigate().to("https://admin-demo.nopcommerce.com/login?");
        pom.logIn.click();
        pom.search.sendKeys("Shipments");
        pom.sales1.click();

    }

}
