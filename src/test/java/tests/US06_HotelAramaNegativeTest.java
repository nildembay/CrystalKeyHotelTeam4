package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US06_HotelAramaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US06_HotelAramaNegativeTest extends TestBaseRapor {

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
    public void yanlisIDHotel(){
        extentTest = extentReports.createTest("IDHotel Arama Negative Test","Yanlis IDHotel ile arama yapilmamali");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.idHotelTextBox.sendKeys(ConfigReader.getProperty("bgm_invalid_idHotel"));
        extentTest.info("IDHotel arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("Sayfanin bulunamadi yazisini icerdigini test et");
    }

    @Test
    public void yanlisCode(){
        extentTest = extentReports.createTest("Code Arama Negative Test","Yanlis Code ile arama yapilmamali");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.codeTextBox.sendKeys(ConfigReader.getProperty("bgm_invalid_code"));
        extentTest.info("Code arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("Sayfanin bulunamadi yazisini icerdigini test et");
    }

    @Test
    public void yanlisName(){
        extentTest = extentReports.createTest("Name Arama Negative Test","Yanlis Name ile arama yapilmamali");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.nameTextBox.sendKeys(ConfigReader.getProperty("bgm_invalid_name"));
        extentTest.info("Name arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("Sayfanin bulunamadi yazisini icerdigini test et");
    }

    @Test
    public void  yanlisAddress(){
        extentTest = extentReports.createTest("Address Arama Negative Test","Yanlis Address ile arama yapilmamali");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.addressTextBox.sendKeys(ConfigReader.getProperty("bgm_invalid_address"));
        extentTest.info("Address arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("Sayfanin bulunamadi yazisini icerdigini test et");
    }

    @Test
    public void yanlisPhone(){
        extentTest = extentReports.createTest("Phone Arama Negative Test","Yanlis Phone ile arama yapilmamali");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.phoneTextBox.sendKeys(ConfigReader.getProperty("bgm_invalid_phone"));
        extentTest.info("Phone arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("Sayfanin bulunamadi yazisini icerdigini test et");
    }

    @Test
    public void yanlisEmail(){
        extentTest = extentReports.createTest("Email Arama Negative Test","Yanlis Email ile arama yapilmamali");
        US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();
        us06_hotelAramaPage.emailTextBox.sendKeys(ConfigReader.getProperty("bgm_invalid_email"));
        extentTest.info("Email arama kutusuna invalid bir deger gir");
        us06_hotelAramaPage.searchButton.click();
        extentTest.info("SEARCH butonuna tikla");
        Assert.assertTrue(us06_hotelAramaPage.bulunamadiYazisi.isDisplayed());
        extentTest.pass("Sayfanin bulunamadi yazisini icerdigini test et");
    }


}
