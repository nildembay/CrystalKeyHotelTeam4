package tests;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US06_HotelAramaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.net.PortUnreachableException;

public class US06_HotelAramaPositiveTest extends TestBaseRapor {

    @BeforeMethod
    public void login(){
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        us06_hotelAramaPage.loginButonu.click();
        us06_hotelAramaPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us06_hotelAramaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us06_hotelAramaPage.signInButton.click();
        us06_hotelAramaPage.hotelManagementButton.click();
        us06_hotelAramaPage.hotelListButton.click();
    }

    @Test
     public void hotelAramaIdGroupDropDown(){
        extentTest = extentReports.createTest("IDGourp ile DropDown Arama Positive Test","IdGroup DropDown dan secim yaparak arama yapabilmeli ve sonuclar goruntulenmeli");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        Select select = new Select(us06_hotelAramaPage.idGroupDropDown);
        select.selectByValue(ConfigReader.getProperty("idgroupValue_HotelType1"));
        extentTest.info("DropDown dan gecerli bir value degeri sec");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());
        extentTest.pass("Aramadan sonra sayfanin Sonuc yazisi icerdigini test et");
    }

    @Test
    public void idHotelSearchBoxTest(){
        extentTest = extentReports.createTest("IDHotel ile Arama Positive Test","Dogru IDHotel ile arama yapabilmeli ve sonuclari goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.idHotelTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_idHotel"));
        extentTest.info("IDHotel arama kutusuna valid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());
        extentTest.pass("Aramadan sonra sayfanin Sonuc yazisi icerdigini test et");
    }

    @Test
    public void codeSearchBoxTest(){
        extentTest = extentReports.createTest("Code ile Arama Positive Test","Dogru code ile arama yapabilmeli ve sonuclari goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.codeTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_code"));
        extentTest.info("Code arama kutusuna valid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());

    }
    @Test
    public void nameSearchBoxTest(){
        extentTest = extentReports.createTest("Name ile Arama Positive Test","Dogru name ile arama yapabilmeli ve sonuclari goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.nameTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_name"));
        extentTest.info("Name arama kutusuna valid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());
        extentTest.pass("Aramadan sonra sayfanin Sonuc yazisi icerdigini test et");

    }
    @Test
    public void addressSearchBoxTest(){
        extentTest = extentReports.createTest("Address ile Arama Positive Test","Dogru address ile arama yapabilmeli ve sonuclari goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.addressTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_address"));
        extentTest.info("Address arama kutusuna valid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());
        extentTest.pass("Aramadan sonra sayfanin Sonuc yazisi icerdigini test et");

    }
    @Test
    public void phoneSearchBoxTest(){
        extentTest = extentReports.createTest("Phone ile Arama Positive Test","Dogru phone ile arama yapabilmeli ve sonuclari goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.phoneTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_phone"));
        extentTest.info("IDHotel arama kutusuna valid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());
        extentTest.pass("Aramadan sonra sayfanin Sonuc yazisi icerdigini test et");

    }
    @Test
    public void emailSearchBoxTest(){
        extentTest = extentReports.createTest("Email ile Arama Positive Test","Dogru Email ile arama yapabilmeli ve sonuclari goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.emailTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_email"));
        extentTest.info("Email arama kutusuna valid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.searhResults.isDisplayed());
        extentTest.pass("Aramadan sonra sayfanin Sonuc yazisi icerdigini test et");

    }

    @Test
    public void clearButton() throws InterruptedException {
        extentTest = extentReports.createTest("CLEAR butonu Positive Test","invalid deger girilen tum arama kutularini CLEAR butonu ile silebilmeli ve bos oldugunu goruntuleyebilmeli ");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.idHotelTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_idHotel"));
        extentTest.info("IDHotel arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.codeTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_code"));
        extentTest.info("Code arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.nameTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_name"));
        extentTest.info("Name arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.addressTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_address"));
        extentTest.info("Address arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.phoneTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_phone"));
        extentTest.info("Phone arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.emailTextBox.sendKeys(ConfigReader.getProperty("bgm_valid_email"));
        extentTest.info("Email arama kutusuna invalid bir deger gir");
        Select select = new Select(us06_hotelAramaPage.idGroupDropDown);
        select.selectByValue(ConfigReader.getProperty("idgroupValue_HotelType1"));
        extentTest.info("DropDown dan gecerli bir value degeri sec");
        us06_hotelAramaPage.clearButton.click();
        extentTest.info("CLEAR butonunu tikla");
        Assert.assertEquals(us06_hotelAramaPage.idHotelTextBox.getText(),ConfigReader.getProperty("bgm_clear_dogrulama"));
        extentTest.pass("arama butonlarinin bos oldugunu test et");
    }
}
