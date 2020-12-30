package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_15roomrezervation {

    public US_15roomrezervation(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(linkText = "Hotel Management")
    public WebElement management;

    @FindBy(partialLinkText = "Room reservations")
    public WebElement Room_reservations;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    public WebElement Add_Room_Reservation;
    @FindBy(id = "IDUser")
    public WebElement id_User;

    @FindBy(id = "IDHotelRoom")
    public WebElement IDHotelRoom;

    @FindBy(id = "Price")
    public WebElement Price;

    @FindBy(id = "DateStart")
    public WebElement DateStar;

    @FindBy(id = "DateEnd")
    public WebElement DateEnd;

    @FindBy(id = "AdultAmount")
    public WebElement AdultAmount;

    @FindBy(id = "ChildrenAmount")
    public WebElement ChildrenAmount;

    @FindBy(id = "ContactNameSurname")
    public WebElement ContactNameSurname;

    @FindBy(id = "ContactPhone")
    public WebElement ContactPhone;

    @FindBy(id = "ContactEmail")
    public WebElement ContactEmail;

    @FindBy(id = "Notes")
    public WebElement Notes;

    @FindBy(id = "btnSubmit")
    public WebElement save;

    @FindBy(className= "bootbox-body")
    public WebElement bildirim;








}













