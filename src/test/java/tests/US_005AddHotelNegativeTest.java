package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_005HotelCreationAddHotelPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_005AddHotelNegativeTest extends TestBaseRapor {

    public void crystalHotelSignIn() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US_005HotelCreationAddHotelPage us_005HotelCreationAddHotelPage = new US_005HotelCreationAddHotelPage();
        us_005HotelCreationAddHotelPage.loginButonu.click();
        us_005HotelCreationAddHotelPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us_005HotelCreationAddHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us_005HotelCreationAddHotelPage.girisButton.click();

    }
    @Test
    public void negativeTest01() throws InterruptedException {
        //phone kutusuna tıklayıp içinde harf ve karakter olan bir deger girelim
        extentTest=extentReports.createTest("negative test01","phone kutusuna icinde harf ve karakter olan bir deger girelim" +
                " ve save etmemesi gerektigini test ettik");
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        extentTest.info("login sayfasina giris yap");
        Thread.sleep(5000);
        page.hotelManagement.click();
        extentTest.info("Hotel Management butonuna tikla ");
        page.hotelList.click();
        extentTest.info("Hotel List butonuna tikla");
        Thread.sleep(5000);
        page.addHotel.click();
        extentTest.info("add Hotel butonuna tikla");
        Thread.sleep(10000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        extentTest.info("gecerli kod degerini gir");
        page.name.sendKeys(ConfigReader.getProperty("name"));
        extentTest.info(("gecerli name degerini gir"));
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("gecerli adress degerini gir");
        page.phone.sendKeys(ConfigReader.getProperty("invalid_phone"));
        extentTest.info("gecersiz phone numarasini gir");
        page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("gecerli email degerini gir");
        Select select=new Select(page.dropdown);
        select.selectByIndex(1);
        extentTest.info("Hotel Type'ini sec");
        page.save.click();
        extentTest.info("Save butonuna tıkla");
        Thread.sleep(5000);
        Assert.assertFalse(page.otelOlusturulduYazisi.isDisplayed());
        extentTest.pass("otel olusturuldu yazisi goruldu,Test FAIL");

    }


    @Test
    public void negativeTest02() throws InterruptedException {
        //email box kutusuna icinde "@" ve "com" içermeyen deger girin
        extentTest=extentReports.createTest("negative test02","gecersiz email ile seve edilmemeli");
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        extentTest.info("log in sayfasina giris yap");
        Thread.sleep(5000);
        page.hotelManagement.click();
        extentTest.info("Hotel Management butonuna tikla");
        page.hotelList.click();
        extentTest.info("Hotel List butonuna tikla");
        Thread.sleep(5000);
        page.addHotel.click();
        extentTest.info("add Hotel butonuna tikla");
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        extentTest.info(" gecerli bir cod gir");
        page.name.sendKeys(ConfigReader.getProperty("name"));
        extentTest.info(" gecerli bir name gir");
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info(" gecerli bir adress gir");
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("gecerli bir phone gir ");
        page.email.sendKeys(ConfigReader.getProperty("invalid_email"));
        extentTest.info("gecersiz bir email gir");
        Select select=new Select(page.dropdown);
        select.selectByIndex(1);
        extentTest.info("Hotel Typ'ini sec");
        page.save.click();
        extentTest.info("save butonuna tikla");
        Thread.sleep(5000);
        Assert.assertFalse(page.otelOlusturulduYazisi.isDisplayed());
        extentTest.pass("gecersiz email ile otel olusturuldu yazisi goruldu, Test FAIL");

    }

    @Test
    public void negativeTest03() throws InterruptedException {
        //ID Group secilmeden save butonuna tıklayın
        extentTest=extentReports.createTest("negative test03","ID Group secilmeden save edilmemeli ");
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        extentTest.info("Log in sayfasina giris yap");
        Thread.sleep(5000);
        page.hotelManagement.click();
        extentTest.info("Hotel Management butonuna tikla");
        page.hotelList.click();
        extentTest.info("Hotel List butonuna tikla");
        Thread.sleep(5000);
        page.addHotel.click();
        extentTest.info("add Hotel butonuna tiklayin");
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        extentTest.info("gecerli cod degerini gir");
        page.name.sendKeys(ConfigReader.getProperty("name"));
        extentTest.info("gecerli name degerini gir");
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("gecerli adress degerini gir");
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("gecerli phone degerini gir");
        page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("gecerli email degerini gir");
        page.save.click();
        extentTest.info("save butonuna tiklayin");
        Thread.sleep(5000);
        Assert.assertTrue(page.CreateHotel.isDisplayed());
        extentTest.pass("Hotel Typ secilmeden save edilmedi,TEST PASS");

    }
    @Test

     public  void negativeTest04() throws InterruptedException {
        //Herhangi bir texBox bos birakılıp save butonuna tıklayın
        extentTest=extentReports.createTest("negative test04","herhangi bir textBox bos birakildiginda save edilmemeli");
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        extentTest.info("log in sayfasina giris yap");
        Thread.sleep(5000);
        page.hotelManagement.click();
        extentTest.info("Hotel Management butonuna tikla");
        page.hotelList.click();
        extentTest.info("hotel List butonuna tikla");
        Thread.sleep(5000);
        page.addHotel.click();
        extentTest.info("add Hotel butonuna tikla");
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        extentTest.info("gecerli code degerini gir");
        page.name.sendKeys(ConfigReader.getProperty("name"));
        extentTest.info("gecerli code degerini gir");
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        extentTest.info("gecerli adress degerini gir");
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("gecerli phone degerini gir");
        page.save.click();
        extentTest.info("save butonuna tikla");
        Thread.sleep(5000);
        Assert.assertTrue(page.CreateHotel.isDisplayed());
        extentTest.pass("Herhangi bir textBox bos birakildiginda seve edilmedi,TEST PASS");



    }










}