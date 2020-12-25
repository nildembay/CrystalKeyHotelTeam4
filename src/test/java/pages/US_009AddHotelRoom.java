package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_009AddHotelRoom {

    public US_009AddHotelRoom(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Hotel Management")
    public WebElement management;

}
