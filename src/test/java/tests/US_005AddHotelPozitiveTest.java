package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US_005HotelCreationAddHotelPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_005AddHotelPozitiveTest extends TestBaseRapor {

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
        extentTest=extentReports.createTest("Add Hotel pozitive Test","Gecerli degerler ile otel save edebilmeyi test ettik");
        US_005HotelCreationAddHotelPage us_005HotelCreationAddHotelPage=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        extentTest.info("log in sayfasina giris yap");
        Thread.sleep(5000);
        us_005HotelCreationAddHotelPage.hotelManagement.click();
        extentTest.info("Hotel Management butonuna tikla");
        us_005HotelCreationAddHotelPage.hotelList.click();
        extentTest.info("Hotel List butonuna tikla");
        us_005HotelCreationAddHotelPage.addHotel.click();
        extentTest.info("add Hotel butonuna tikla");
        Thread.sleep(5000);
        us_005HotelCreationAddHotelPage.code.sendKeys(ConfigReader.getProperty("code"));
        extentTest.info("gecerli bir code degeri gir");
        Thread.sleep(5000);
        us_005HotelCreationAddHotelPage.name.sendKeys(ConfigReader.getProperty("name"));
        extentTest.info("gecerli bir name degeri gir");
        us_005HotelCreationAddHotelPage.adress.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("gecerli bir adress degeri gir");
        us_005HotelCreationAddHotelPage.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("gecerli bir email degeri gir");
        us_005HotelCreationAddHotelPage.phone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("gecerli bir phone degeri gir");
        Select selectIDGroup =new Select(us_005HotelCreationAddHotelPage.dropdown);
        selectIDGroup.selectByIndex(1);
        extentTest.info("Hotel Type sec");
        us_005HotelCreationAddHotelPage.save.click();
        extentTest.info("save butonuna tikla");
        Thread.sleep(5000);

        Assert.assertTrue(us_005HotelCreationAddHotelPage.otelOlusturulduYazisi.isDisplayed());
        extentTest.pass("otel olusturuldu yazisinin goruldu,test PASS");
        us_005HotelCreationAddHotelPage.ok.click();
        extentTest.info("ok butonuna tikla");



        Driver.closeDriver();


    }



}

