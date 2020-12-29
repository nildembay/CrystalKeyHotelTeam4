package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_009AddHotelRoom;
import smokeTest.CrystalHotelSingInPositive;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_009RoomCreationPositive extends TestBaseRapor {
    public void roomCreationPage(){
        CrystalHotelSingInPositive login = new CrystalHotelSingInPositive();
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        login.SignIn();
        page.management.click();
        page.rooms.click();
        page.addRoom.click();
    }
    @Test
    public void test1() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        roomCreationPage();
        extentTest=extentReports.createTest("crystalkey hotel room creation positive", "gecerli degerler ile oda eklenebilmeli");
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        extentTest.info("bilgiler girildi");
        page.saveButonu.click();
        Thread.sleep(1000);
        Assert.assertTrue(page.onayMesaji.isDisplayed());
        extentTest.pass("oda eklendi");
        Driver.closeDriver();
    }
}