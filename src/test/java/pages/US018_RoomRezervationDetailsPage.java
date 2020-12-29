package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US018_RoomRezervationDetailsPage {
    public US018_RoomRezervationDetailsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText="Log in")
    public WebElement ilkLogIn;

    @FindBy(id="UserName")
    public WebElement userNameTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement loginButonu;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelMenagementButton;

    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomRezervationsButton;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsButton;


    @FindBy(xpath = "//select[@id='IDHotelRoom']")
    public WebElement detailsHotelRoomDropDown;



    @FindBy(xpath = "//select[@id='IDUser']")
    public WebElement detailsUserDropDown;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement detailsPrice;

    @FindBy(xpath = "(//input[@class='form-control input'])[1]")
    public WebElement detailsDateStart;



    @FindBy(xpath = "(//input[@class='form-control input'])[2]")
    public WebElement detailsDateEnd;


    @FindBy(xpath = "//select[@id='IDState']")
    public WebElement detailsState;

    @FindBy(xpath = "//input[@id='AdultAmount']")
    public WebElement detailsAdultAmount;

    @FindBy(xpath = "//input[@id='ChildrenAmount']")
    public WebElement detailsChildrenAmount;

    @FindBy(xpath = "//input[@id='ContactNameSurname']")
    public WebElement detailsContactNameSurname;

    @FindBy(xpath = "//input[@id='ContactPhone']")
    public WebElement detailsContactPhone;

    @FindBy(xpath = "//input[@id='ContactEmail']")
    public WebElement detailsContactEmail;


    @FindBy(xpath = "//input[@id='Notes']")
    public WebElement detailsNotes;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement detailsSaveButton;

    @FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
    public WebElement detailsProperties;

    @FindBy(xpath = "(//select[@name='lkpBarcodeTypes']")
    public WebElement detailsTip;

    @FindBy(xpath = "(//label[@for='IDHotelRoom']")
    public WebElement detailsHotelRoomHataMesaji;

    @FindBy(xpath = "//label[@for='IDUser']")
    public WebElement detailsUserHataMesaji;

    @FindBy(xpath = "(//label[@for='IDPrice']")
    public WebElement detailsPriceHataMesaji;


    @FindBy(xpath = "((//td[@class='old day'])[1]")
    public  WebElement detailsOldDateSelect;

    @FindBy(xpath = "//label[@for='Price']")
    public  WebElement priceHataMesaji;


    @FindBy(xpath = "//label[@for='AdultAmount']")
    public  WebElement adultAmountHataMesaji;

    @FindBy(xpath = "//label[@for='ChildrenAmount']")
    public  WebElement childrenAmountHataMesaji;

    @FindBy(xpath = "//label[@for='ContactNameSurname']")
    public  WebElement contactNameSurnameHataMesaji;

    @FindBy(xpath = "//label[@for='ContactPhone']")
    public  WebElement contactPhoneHataMesaji;

    @FindBy(xpath = "//label[@for='ContactEmail']")
    public  WebElement contactEmailHataMesaji;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement detailsDeleteButton;


    @FindBy(xpath = "//a[@href='#tab_properties']")
    public  WebElement propertiesButton;

    @FindBy(xpath = "//select[@id='lkpBarcodeTypes']")
    public  WebElement propertiesTipDropdown;

    @FindBy(xpath = "//input[@id='txtBarcodeCode']")
    public  WebElement propertiesCodeTextBox;

    @FindBy(xpath = "//textarea[@id='txtBarcode']")
    public  WebElement propertiesValueTextBox;

    @FindBy(xpath = "(//*[text()='Save'])[2]")
    public  WebElement propertiesSaveButton;


    @FindBy(xpath = "//*[text()='Value added']")
    public  WebElement propertiesAlertMesaji;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public  WebElement propertiesAlertMesajiAccept;

    @FindBy(xpath = "(//i[@class='fa fa-times'])[2]")
    public  WebElement propertiesRemoveButton;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public  WebElement propertiesRemoveButtonAccept;


    @FindBy(xpath = "//div[@class='bootbox-body']")
    public  WebElement propertiesRemoveMessage;


    @FindBy(xpath = "(//i[@class='fa fa-check'])[3]")
    public  WebElement propertiesUpdateButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public  WebElement propertiesUpdateMessage;

    @FindBy(xpath = "//textarea[@id='product_barcode_101']")
    public  WebElement propertiesUpdateTextArea;


    @FindBy(xpath = "//div[@class='bootbox-body']")
    public  WebElement propertiesUpdateHataMesaji;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement propertiesDeleteButton;


































































}


