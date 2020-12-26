package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CrystalHotelSignIn {

    public CrystalHotelSignIn(){
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

    @FindBy(xpath = "//label[@for='UserName']")
    public WebElement userBosHataMesaj;

    @FindBy(xpath = "//label[@for='Password']")
    public WebElement passBosHataMesaj;

    @FindBy(className = "validation-summary-errors")
    public WebElement tryAgainMesaj;

    @FindBy(id = "divMessageResult")
    public WebElement tryAgainWrongPassMesaj;



}
