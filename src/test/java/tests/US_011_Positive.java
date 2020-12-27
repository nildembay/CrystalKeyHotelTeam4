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

public class US_011_Positive extends TestBaseRapor {

    US_011_012_HotelRoomSearchPage us_011_hotelRoomSearchPositivePage = new US_011_012_HotelRoomSearchPage();
    @BeforeMethod
    public void login (){
        extentTest = extentReports.createTest("ck hotel login sayfasi ");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        extentTest.info("ck hotels ana sayfaya git");
        us_011_hotelRoomSearchPositivePage.loginButonu.click();
        us_011_hotelRoomSearchPositivePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("valid kullanici adi girildi");
        us_011_hotelRoomSearchPositivePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("valid sifre girildi");
        us_011_hotelRoomSearchPositivePage.girisButtonu.click();
        us_011_hotelRoomSearchPositivePage.hotelManagementLinki.click();
        us_011_hotelRoomSearchPositivePage.hotelRoomsLinki.click();
        extentTest.pass("hotel room page sayfasina basarili bir sekilde girildi");
    }
    @Test
    public void tc_001 () throws InterruptedException {


        Thread.sleep(5000);

        Select select = new Select(us_011_hotelRoomSearchPositivePage.hotelIDDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("tc1_IDHotel_name"));

        us_011_hotelRoomSearchPositivePage.searchButton.click();
        Assert.assertTrue(us_011_hotelRoomSearchPositivePage.sonucYazisi.isDisplayed());
        extentTest.pass("search islemi basarili oldu");
        Driver.closeDriver();


    }
    @Test
    public void tc_002(){

        Select select = new Select(us_011_hotelRoomSearchPositivePage.groupRoomTypeDropdown);
        select.selectByValue("318");
        us_011_hotelRoomSearchPositivePage.searchButton.click();
        Assert.assertTrue(us_011_hotelRoomSearchPositivePage.sonucYazisi.isDisplayed());
        extentTest.pass("search islemi basarili oldu");
        Driver.closeDriver();

    }
    @Test
    public void tc_003(){

        us_011_hotelRoomSearchPositivePage.idTextBox.sendKeys(ConfigReader.getProperty("tc3and10_ID_textbox"));
        us_011_hotelRoomSearchPositivePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc3_code_textbox"));
        us_011_hotelRoomSearchPositivePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc3_name_textbox"));
        us_011_hotelRoomSearchPositivePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc3_location_textbox"));
        us_011_hotelRoomSearchPositivePage.priceTextBox.sendKeys(ConfigReader.getProperty("tc3and10_price_textbox"));
        Select select = new Select(us_011_hotelRoomSearchPositivePage.isAvalaibleDropdown);
        select.selectByVisibleText("True");
        us_011_hotelRoomSearchPositivePage.searchButton.click();
        Assert.assertTrue(us_011_hotelRoomSearchPositivePage.sonucYazisi.isDisplayed());
        extentTest.pass("search islemi basarili oldu");
        Driver.closeDriver();
    }
    @Test
    public void tc_004(){

        us_011_hotelRoomSearchPositivePage.idTextBox.sendKeys(ConfigReader.getProperty("tc4and5_ID_textbox"));
        Select select = new Select(us_011_hotelRoomSearchPositivePage.hotelIDDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("tc4and5_IDHotel_name"));
        us_011_hotelRoomSearchPositivePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc4and5_code_textbox"));
        us_011_hotelRoomSearchPositivePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc4and5_name_textbox"));
        us_011_hotelRoomSearchPositivePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc4and5_location_textbox"));
        us_011_hotelRoomSearchPositivePage.priceTextBox.sendKeys(ConfigReader.getProperty("tc4and5_price_textbox"));
        Select select1 = new Select(us_011_hotelRoomSearchPositivePage.isAvalaibleDropdown);
        select1.selectByVisibleText("True");
        us_011_hotelRoomSearchPositivePage.searchButton.click();
        Assert.assertTrue(us_011_hotelRoomSearchPositivePage.sonucYazisi.isDisplayed());
        extentTest.pass("search islemi basarili oldu");
        Driver.closeDriver();
    }
    @Test
    public void tc_005(){

        us_011_hotelRoomSearchPositivePage.idTextBox.sendKeys(ConfigReader.getProperty("tc4and5_ID_textbox"));
        Select select = new Select(us_011_hotelRoomSearchPositivePage.hotelIDDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("tc4and5_IDHotel_name"));
        us_011_hotelRoomSearchPositivePage.codeTextBox.sendKeys(ConfigReader.getProperty("tc4and5_code_textbox"));
        us_011_hotelRoomSearchPositivePage.nameTextBox.sendKeys(ConfigReader.getProperty("tc4and5_name_textbox"));
        us_011_hotelRoomSearchPositivePage.locationTextBox.sendKeys(ConfigReader.getProperty("tc4and5_location_textbox"));
        us_011_hotelRoomSearchPositivePage.priceTextBox.sendKeys(ConfigReader.getProperty("tc4and5_price_textbox"));
        Select select1 = new Select(us_011_hotelRoomSearchPositivePage.isAvalaibleDropdown);
        select1.selectByVisibleText("True");
        us_011_hotelRoomSearchPositivePage.clearButton.click();
        Assert.assertEquals(us_011_hotelRoomSearchPositivePage.idTextBox.getText(),ConfigReader.getProperty("clear_dogrulama"));
        extentTest.pass("clear islemi basarili oldu");
        Driver.closeDriver();
    }
}

