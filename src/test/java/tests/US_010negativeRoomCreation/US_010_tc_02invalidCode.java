package tests.US_010negativeRoomCreation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_009AddHotelRoom;
import smokeTest.CrystalHotelSingInPositive;
import utilities.ConfigReader;
import utilities.Driver;

public class US_010_tc_02invalidCode {
    public void roomCreationPage(){
        CrystalHotelSingInPositive login = new CrystalHotelSingInPositive();
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        login.SignIn();
        page.management.click();
        page.rooms.click();
        page.addRoom.click();
    }
    @Test
    public void tc_02invalidCode() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        //code gecersiz deger girildi
        page.code.sendKeys(ConfigReader.getProperty("us_10invalidCode"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+ Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.hataMesaji.isDisplayed(),"hata mesaji = "+page.hataMesaji.getText());
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
