package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_011_012_HotelRoomSearchPage {
    public US_011_012_HotelRoomSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginButonu;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement girisButtonu;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath="//select[@id='lkpHotels']")
    public WebElement hotelIDDropdown;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButton;

    @FindBy(id = "datatable_ajax_length")
    public WebElement sonucYazisi;

    @FindBy(id = "lkpGroupRoomTypes")
    public WebElement groupRoomTypeDropdown;

    @FindBy(xpath = "//*[@id='datatable_ajax']//thead//tr[2]//td[1]//input")
    public WebElement idTextBox;

    @FindBy(xpath = "//*[@id='datatable_ajax']//thead//tr[2]//td[3]/input")
    public WebElement codeTextBox;

    @FindBy(xpath = "//*[@id='datatable_ajax']//thead//tr[2]//td[4]//input")
    public WebElement nameTextBox;

    @FindBy(xpath = "//*[@id='datatable_ajax']//thead//tr[2]//td[5]//input")
    public WebElement locationTextBox;

    @FindBy(xpath = "//*[@id='datatable_ajax']//thead//tr[2]//td[6]//input")
    public WebElement priceTextBox;

    @FindBy(xpath = "//*[@id='datatable_ajax']//thead//tr[2]//td[8]//select")
    public WebElement isAvalaibleDropdown;

    @FindBy(xpath = "//button[@class='btn btn-sm red filter-cancel']")
    public WebElement clearButton;

    @FindBy(xpath = "//*[@id=\"datatable_ajax\"]/tbody/tr/td")
    public WebElement bulunamadiYazisi;

    @FindBy(xpath = "//*[@id=\"datatable_ajax_info\"]")
    public WebElement aradiginDataYok;



}
