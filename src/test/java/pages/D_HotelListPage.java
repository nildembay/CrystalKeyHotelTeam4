package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class D_HotelListPage {
    public D_HotelListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText="Log in")
    public WebElement sagUstLogin;


    @FindBy(id="UserName")
    public WebElement userNameTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagmentButton;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListButton;

    @FindBy(partialLinkText = " Details")
    public WebElement detailsButton;

    @FindBy(partialLinkText = "General Data")
    public WebElement generalData;

    @FindBy(id = "Code")
    public WebElement generelDataCode;

    @FindBy(id = "Name")
    public WebElement generelDataName;

    @FindBy(id = "Address")
    public WebElement generelDataAddress;

    @FindBy(id = "Phone")
    public WebElement generelDataPhone;

    @FindBy(id = "Email")
    public WebElement generelDataEmail;

    @FindBy(id = "IDGroup")
    public WebElement generelDataIDGroup;


    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButton;

    @FindBy(id = "btnDelete")
    public WebElement deleteButton;




}
