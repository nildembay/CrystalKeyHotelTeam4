package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_009AddHotelRoom {

    public US_009AddHotelRoom(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(linkText = "Hotel Management")
    public WebElement management;
    @FindBy(partialLinkText = "Hotel Rooms")
    public  WebElement rooms;
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addRoom;
    @FindBy(id = "IDHotel")
    public WebElement idHotel;
    @FindBy(id = "Code")
    public WebElement code;
    @FindBy(id = "Name")
    public WebElement name;
    @FindBy(id = "Location")
    public WebElement location;
    @FindBy(id = "Price")
    public WebElement price;
    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;
    @FindBy(id = "MaxAdultCount")
    public WebElement adultCount;
    @FindBy(id = "MaxChildCount")
    public WebElement childCount;
    @FindBy(id = "btnSubmit")
    public WebElement saveButonu;
    @FindBy(className = "bootbox-body")
    public WebElement onayMesaji;
    @FindBy(xpath = "//label[@class='error']")
    public WebElement hataMesaji;


}