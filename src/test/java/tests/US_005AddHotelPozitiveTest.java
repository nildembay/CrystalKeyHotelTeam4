package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US_005HotelCreationAddHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005AddHotelPozitiveTest {

    public void crystalHotelSignIn()  {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US_005HotelCreationAddHotelPage us_005HotelCreationAddHotelPage=new US_005HotelCreationAddHotelPage();
        us_005HotelCreationAddHotelPage.loginButonu.click();
        us_005HotelCreationAddHotelPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us_005HotelCreationAddHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us_005HotelCreationAddHotelPage.girisButton.click();


    }
    @Test
    public  void addHotelPozitiveTest() throws InterruptedException {
        US_005HotelCreationAddHotelPage us_005HotelCreationAddHotelPage=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        Thread.sleep(5000);
        us_005HotelCreationAddHotelPage.hotelManagement.click();
        us_005HotelCreationAddHotelPage.hotelList.click();
        us_005HotelCreationAddHotelPage.addHotel.click();
        Thread.sleep(5000);
        us_005HotelCreationAddHotelPage.code.sendKeys(ConfigReader.getProperty("code"));
        Thread.sleep(5000);
        us_005HotelCreationAddHotelPage.name.sendKeys(ConfigReader.getProperty("name"));
        us_005HotelCreationAddHotelPage.adress.sendKeys(ConfigReader.getProperty("adress"));
        us_005HotelCreationAddHotelPage.email.sendKeys(ConfigReader.getProperty("email"));
        us_005HotelCreationAddHotelPage.phone.sendKeys(ConfigReader.getProperty("phone"));
        Select selectIDGroup =new Select(us_005HotelCreationAddHotelPage.dropdown);
        selectIDGroup.selectByIndex(1);
        us_005HotelCreationAddHotelPage.save.click();
        Thread.sleep(5000);

        Assert.assertTrue(us_005HotelCreationAddHotelPage.otelOlusturulduYazisi.isDisplayed());
        us_005HotelCreationAddHotelPage.ok.click();



        Driver.closeDriver();


    }



}

