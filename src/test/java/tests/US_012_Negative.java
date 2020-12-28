package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US_011_012_HotelRoomSearchPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_012_Negative extends TestBaseRapor {


    @BeforeMethod
    public void login () {

        extentTest = extentReports.createTest("ck hotel login sayfasi ");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        extentTest.info("ck hotels ana sayfaya git");
        US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();
        us_012_hotelRoomSearchNegativePage.loginButonu.click();
        us_012_hotelRoomSearchNegativePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("valid kullanici adi girildi");
        us_012_hotelRoomSearchNegativePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("valid sifre girildi");
        us_012_hotelRoomSearchNegativePage.girisButtonu.click();
        us_012_hotelRoomSearchNegativePage.hotelManagementLinki.click();
        us_012_hotelRoomSearchNegativePage.hotelRoomsLinki.click();
        extentTest.pass("hotel room page sayfasina basarili bir sekilde girildi");



    }
    @Test
    public void tc_006(){

        US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.idTextBox.sendKeys(ConfigReader.getProperty("tc6_ID_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("search islemi basarisiz oldu");


    }
    @Test
    public void tc_007(){

        US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc7and10_code_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.aradiginDataYok.isDisplayed());
        extentTest.pass("search islemi basarisiz oldu");
        Driver.closeDriver();
    }
    @Test
    public void tc_008(){

        US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc8_name_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("search islemi basarisiz oldu");
        Driver.closeDriver();
    }
    @Test
    public void tc_009(){

        US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();
        us_012_hotelRoomSearchNegativePage.clearButton.click();
        us_012_hotelRoomSearchNegativePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc9and10_location_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("search islemi basarisiz oldu");
        Driver.closeDriver();
    }
    @Test
    public void tc_010(){

        US_011_012_HotelRoomSearchPage us_012_hotelRoomSearchNegativePage = new US_011_012_HotelRoomSearchPage();
        us_012_hotelRoomSearchNegativePage.idTextBox.sendKeys(ConfigReader.getProperty("tc3and10_ID_textbox"));
        us_012_hotelRoomSearchNegativePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc7and10_code_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc10_name_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc9and10_location_textbox_invalid"));
        us_012_hotelRoomSearchNegativePage.priceTextBox.sendKeys(ConfigReader.getProperty("tc3and10_price_textbox"));
        Select select=new Select(us_012_hotelRoomSearchNegativePage.isAvalaibleDropdown);
        select.selectByVisibleText("False");
        us_012_hotelRoomSearchNegativePage.searchButton.click();
        Assert.assertTrue(us_012_hotelRoomSearchNegativePage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("search islemi basarisiz oldu");
        Driver.closeDriver();




    }

}
