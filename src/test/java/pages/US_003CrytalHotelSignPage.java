package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_003CrytalHotelSignPage {
    public US_003CrytalHotelSignPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginButonu;
    @FindBy(linkText = "Create a new account")
    public WebElement CreateNewAccount;
    @FindBy(id = "UserName")
    public WebElement UsernameButonu;
    @FindBy(id = "Password")
    public WebElement PasswordButonu;
    @FindBy(id = "Email")
    public WebElement EmailButonu;
    @FindBy(id = "NameSurname")
    public WebElement FullnameButonu;
    @FindBy(id = "PhoneNo")
    public WebElement PhoneNumberButton;
    @FindBy(id = "SSN")
    public WebElement SsnButonu;
    @FindBy(id = "DrivingLicense")
    public WebElement DlButonu;
    @FindBy(id = "IDCountry")
    public WebElement DropDownCountryButonu;
    @FindBy(id = "IDState")
    public WebElement DropDownStateButonu;
    @FindBy(id = "Address")
    public WebElement AdresButonu;
    @FindBy(id = "WorkingSector")
    public WebElement WorkingSectorButonu;
    @FindBy(id = "BirthDate")
    public WebElement BirthdateButtonu;
    @FindBy(id = "btnSubmit")
    public WebElement RegistrationSaveButtonu;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement okeyButonu;
    @FindBy(id = "divMessage")
    public WebElement DogrulamaYazisi;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement succesfullyText;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement SonOkButonu;

    @FindBy(xpath = "//label[@class='error']")
    public WebElement invalidUsernameText;
    @FindBy(xpath = "//label[@class='error']")
    public WebElement invalidPassword1;
    @FindBy(xpath = "//label[@for='Email']")
    public WebElement emailEmpty;
    @FindBy(xpath = "//label[@for='NameSurname']")
    public WebElement fullNameEmpty;
    @FindBy(xpath = "//label[@for='PhoneNo']")
    public WebElement phoneNumberEmpty;
    @FindBy(xpath = "//label[@for='SSN']")
    public WebElement SSNEmpty;
    @FindBy(xpath = "//label[@for='DrivingLicense']")
    public WebElement DriverLicenceEmpty;
    @FindBy(xpath = "//label[@for='IDCountry']")
    public WebElement countryEmpty;
    @FindBy(xpath = "//label[@for='Address']")
    public WebElement adressEmpty;
    @FindBy(xpath = "//label[@for='WorkingSector']")
    public WebElement workingSectorEmpty;
    @FindBy(xpath = "//label[@for='BirthDate']")
    public WebElement BirthDateEmpty;
}