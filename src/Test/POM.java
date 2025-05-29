package Test;


import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Queue;

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

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement addNew;

    @FindBy(xpath = "(//div[@class='col-md-9'])[1]")
    public WebElement email;

    @FindBy(xpath = "(//div[@class='col-md-9'])[2]")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='col-md-9'])[3]")
    public WebElement firstName;

    @FindBy(xpath = "(//div[@class='col-md-9'])[4]")
    public WebElement lastName;

    @FindBy(id = "Gender_Male")
    public WebElement male;

    @FindBy(xpath = "(//div[@class='col-md-9'])[6]")
    public WebElement companyName;

    @FindBy(id = "IsTaxExempt")
    public WebElement isTaxExempt;

    @FindBy(xpath = "(//div[@class='col-md-9'])[8]")
    public WebElement newslatter;

    @FindBy(xpath = "//*[text()='Vendor 1']")
    public WebElement vendor1;

    @FindBy(id = "AdminComment")
    public WebElement AdminComment;

    @FindBy(css = "[name='save']")
    public WebElement save;

    @FindBy(xpath = "(//button[@class='close'])[1]")
    public WebElement kaydedildi;
}


