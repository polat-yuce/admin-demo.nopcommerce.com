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

    @FindBy(xpath = "(//ul[@role='menu']/li)[3]")
    public WebElement catalog;

    @FindBy(xpath = "(//ul[@role='menu']/li)[4]")
    public WebElement sales;

    @FindBy(xpath = "(//ul[@role='menu']/li)[5]")
    public WebElement customers;

    @FindBy(xpath = "(//ul[@role='menu']/li)[6]")
    public WebElement promotions;

    @FindBy(xpath = "(//ul[@role='menu']/li)[7]")
    public WebElement contentManagement;

    @FindBy(xpath = "(//ul[@role='menu']/li)[8]")
    public WebElement configuration;

    @FindBy(xpath = "(//ul[@role='menu']/li)[9]")
    public WebElement system;

    @FindBy(xpath = "(//ul[@role='menu']/li)[10]")
    public WebElement reports;

    @FindBy(xpath = "(//ul[@role='menu']/li)[11]")
    public WebElement help;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement products;

    @FindBy(xpath = "//p[text()=' Orders']")
    public WebElement orders;

    @FindBy(xpath = "//p[text()=' Customers']")
    public WebElement customersText;

    @FindBy(xpath = "//p[text()=' Discounts']")
    public WebElement discounts;

    @FindBy(xpath = "//p[text()=' Topics (pages)']")
    public WebElement topicPages;

    @FindBy(xpath = "//p[text()=' Email accounts']")
    public WebElement emailAccounts;

    @FindBy(xpath = "//p[text()=' Log']")
    public WebElement log;

    @FindBy(xpath = "//p[text()=' PowerBI']")
    public WebElement powerBi;

    @FindBy(xpath = "//p[text()=' Training']")
    public WebElement Training;
}

