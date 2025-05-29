package Test;


import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement logIn;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logOut;
}
