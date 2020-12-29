package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_005HotelCreationAddHotelPage {

    public US_005HotelCreationAddHotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButonu;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement girisButton;

    @FindBy(xpath= "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelList;

    @FindBy(xpath = "//*[text()='Add Hotel ']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement code;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement adress;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;

   @FindBy(id = "IDGroup")
    public WebElement dropdown;

    @FindBy(id = "btnSubmit")
   public WebElement save;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement otelOlusturulduYazisi;

    @FindBy(xpath = "//*[text()='OK']")
    public  WebElement ok;




}
