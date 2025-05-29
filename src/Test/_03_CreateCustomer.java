package Test;

import Utlity.BaseDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_CreateCustomer extends BaseDriver {

    @Test
    public void Test() {
        POM pom = new POM();

        driver.navigate().to("https://admin-demo.nopcommerce.com/login?");
        pom.logIn.click();

        pom.customers.click();
        pom.customersText.click();
        pom.addNew.click();

        pom.email.sendKeys("vjksdjfkabskj@gmail.com");
        pom.password.sendKeys("sdklgasklgdsgd");
        pom.firstName.sendKeys("leo");
        pom.lastName.sendKeys("baron");
        pom.male.click();
        pom.companyName.sendKeys("sdlfmas");
        pom.isTaxExempt.click();
        pom.newslatter.click();
        pom.newslatter.sendKeys(Keys.ENTER);
        pom.vendor1.click();
        pom.AdminComment.sendKeys("kdsjgksjgfsg");
        pom.save.click();
        Assert.assertTrue(pom.kaydedildi.getText().contains("successfully"));





    }
}
