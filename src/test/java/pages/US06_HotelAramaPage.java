package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.lang.ref.WeakReference;
import java.security.cert.X509Certificate;

public class US06_HotelAramaPage {

    public US06_HotelAramaPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(linkText = "Log in")
    public WebElement loginButonu;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListButton;

    @FindBy(xpath = "//select[@id='lkpGroups']")
    public WebElement idGroupDropDown;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@class='btn btn-sm red filter-cancel']")
    public WebElement clearButton;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[1]")
    public WebElement idHotelTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[2]")
    public WebElement codeTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[3]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[4]")
    public WebElement addressTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[5]")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[6]")
    public WebElement emailTextBox;

    @FindBy(id = "datatable_ajax_info")
    public WebElement searhResults;

    @FindBy(xpath = "//*[text()='Found total 1 records']")
    public WebElement tekHotelAramaSonucu;

    @FindBy(className = "dataTables_info")
    public WebElement bulunamadiYazisi;

    @FindBy(linkText = "Log out")
    public WebElement logOutButton;






}


