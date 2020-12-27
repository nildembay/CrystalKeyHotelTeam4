package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_011_012_HotelRoomSearchPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012_Negative {
    US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();

    public void login () {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));

        us_012_hotelRoomSearchNegativePage.loginButonu.click();
        us_012_hotelRoomSearchNegativePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us_012_hotelRoomSearchNegativePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us_012_hotelRoomSearchNegativePage.girisButtonu.click();
        us_012_hotelRoomSearchNegativePage.hotelManagementLinki.click();
        us_012_hotelRoomSearchNegativePage.hotelRoomsLinki.click();

    }
    @Test
    public void tc_006(){
        login();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.idTextBox.sendKeys(ConfigReader.getProperty("tc6_ID_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());

    }
    @Test
    public void tc_007(){
        login();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc7and10_code_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.aradiginDataYok.isDisplayed());
    }
    @Test
    public void tc_008(){
        login();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc8_name_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());
    }
    @Test
    public void tc_009(){
        login();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc9and10_location_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());
    }
    @Test
    public void tc_010(){
        login();
        us_012_hotelRoomSearchNegativePage.idTextBox.sendKeys(ConfigReader.getProperty("tc3and10_ID_textbox"));
        us_012_hotelRoomSearchNegativePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc7and10_code_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc10_name_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc9and10_location_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.priceTextBox.sendKeys(ConfigReader.getProperty("tc3and10_price_textbox"));
        Select select=new Select(us_012_hotelRoomSearchNegativePage.isAvalaibleDropdown);
        select.selectByVisibleText("False");
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());




    }

}
