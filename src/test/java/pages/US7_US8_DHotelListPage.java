package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class US7_US8_DHotelListPage {
    public US7_US8_DHotelListPage(){
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

    @FindBy(xpath = "//a[@href='./HotelAdmin/Edit?Id=1016']")
    public WebElement detailsButton;

    @FindBy(linkText = "General Data")
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

    @FindBy(xpath = "(//select[@class='form-control input-lg required'])[1]")
    public WebElement generelDataIDGroup;

    public void IGroupSelect(){
        Select select = new Select(generelDataIDGroup);
        select.selectByVisibleText("Hotel Type2");
    }




    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButton;

    @FindBy(id = "btnDelete")
    public WebElement deleteButton;


    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement saveSuccessfully;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement alertOk;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement continueAlert;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement alertDeleteOk;

    @FindBy(linkText = "Properties")
    public WebElement propertiesButton;



    @FindBy(id = "lkpBarcodeTypes")
    public WebElement addPropertyTipSelect;

    public void propertyTip(){
        Select select = new Select(addPropertyTipSelect);
        select.selectByVisibleText("Hotel Property1");
    }

    public void propertyTipFree(){
        Select select = new Select(addPropertyTipSelect);
        select.selectByVisibleText("Select Type...");

    }

    public boolean propertyTipFreeBoolean(){
        Select select = new Select(addPropertyTipSelect);
        select.selectByVisibleText("Select Type...");
        return true;
    }

    @FindBy(id = "txtBarcodeCode")
    public WebElement propertyCode;

    @FindBy (id = "txtBarcode")
    public WebElement propertyValue;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement propertySaveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement propertyAlertMessage;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement propertyAlertButton;

    @FindBy(xpath = "//label(@class='error'")
    public WebElement generalDataCodeFalse;


    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement propertyValueFalse;






}
