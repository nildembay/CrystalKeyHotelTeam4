package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US13_PageHotelRoomDetails {
    public US13_PageHotelRoomDetails(){
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

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement hotelRoomDetailsLinki;

    @FindBy(linkText = "General Data")
    public WebElement generalDataSekmesi;

    @FindBy(id="IDHotel")
    public WebElement hotelDropdown;

    @FindBy(id = "Code")
    public WebElement codeTextBox;

    @FindBy(id = "Name")
    public WebElement nameTextBox;

    @FindBy(id = "Location")
    public WebElement locationTextBox;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement descriptionTextArea;

    @FindBy(id = "Price")
    public WebElement priceTextBox;

    @FindBy(partialLinkText = "400")
    public WebElement priceDrapDrop;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropdown;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCountTextBox;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildCountTextBox;

    @FindBy (xpath = "//input[@id='IsAvailable']")
    public WebElement avaibleCheckBox;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonu;

    @FindBy(xpath = "(//div[@class='modal-content'])[2]")
    public WebElement mesajPenceresi;

    @FindBy(className = "btn btn-primary")
    public WebElement okDuzenlemeButonu;

    @FindBy(xpath = "//button[@data-bb-handler='confirm']")
    public WebElement silmeOnayButonu;

    @FindBy(id = "btnDelete")
    public WebElement deleteButonu;

    @FindBy(linkText = "Photos")
    public WebElement photosSekmesi;

    @FindBy(id = "tab_images_uploader_pickfiles")
    public WebElement selectFileButonu;

    @FindBy(id = "tab_images_uploader_uploadfiles")
    public WebElement upLoadFilesButonu;

    @FindBy(id = "Properties")
    public WebElement propertiesSekmesi;

    @FindBy(id = "lkpBarcodeTypes")
    public WebElement propertiesTipDropdown;

    @FindBy(id = "txtBarcodeCode")
    public WebElement propertiesCodeTextBox;

    @FindBy(id = "txtBarcode")
    public WebElement propertiesValueTextBox;

    @FindBy(xpath = "//button[@class='btn green'])[2]")
    public WebElement propertiesSaveButonu;

    @FindBy(id = "product_barcodeCode_70")
    public WebElement propertiesUpdateCodeTextBox;

    @FindBy(id = "product_barcode_70")
    public WebElement propertiesUpdateValueTextBox;

    @FindBy(partialLinkText = "Remove")
    public WebElement propertiesRemoveButonu;

    @FindBy(partialLinkText = "Update")
    public WebElement propertiesUpdateButonu;

}