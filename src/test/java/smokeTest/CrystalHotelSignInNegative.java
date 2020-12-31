package smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class CrystalHotelSignInNegative extends TestBaseRapor {
    @Test
    public void test2(){
        extentTest=extentReports.createTest("CrystalKey Negative SignIn-Test","username-password butonları bos bırakılırsa giriş yapılamamalı, hata vermeli");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonuna tıklayıp, id-sifre sayfasına gelindi.");
        //  crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty(""));
        //  crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty(""));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("id-sifre butonları bos bırakılıp login'e tıklandı.");
        Assert.assertEquals(crystalHotelSignIn.userBosHataMesaj.getText(),"This field is required.");
        Assert.assertEquals(crystalHotelSignIn.passBosHataMesaj.getText(),"This field is required.");
        extentTest.pass("boş butonların altında hata mesajı alındı ve giriş sağlanamadı.");
        Driver.closeDriver();
    }
    @Test
    public void test3(){
        extentTest=extentReports.createTest("CrystalKey Negative SignIn-Test","username kutusu boş iken sayfaya giriş yapılamamalı.");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonuna tıklayıp, username-password sayfasına gelindi.");
        //  crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty(""));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("username butonu boş bırakılıp login'e tıklandı.");
        Assert.assertEquals(crystalHotelSignIn.userBosHataMesaj.getText(),"This field is required.");
        extentTest.pass("username butonu altına hata mesajı alındı ve sayafaya giriş sağlanamadı.");
        Driver.closeDriver();
    }
    @Test
    public void test4(){
        extentTest=extentReports.createTest("CrystalKey Negative SignIn-Test","password butonu boş iken sayfaya giriş sağlanamamalı.");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonuna tıklanıp username passowrd sayfasıan giriş sağlandı.");
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        //  crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty(""));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("password butonu boş bırakıldı ve login'e tıklandı");
        Assert.assertEquals(crystalHotelSignIn.passBosHataMesaj.getText(),"This field is required.");
        extentTest.pass("passowrd butonu altına hata mesajı alındı ve sayfaya giriş sağlanamadı");
        Driver.closeDriver();
    }
    @Test
    public void test5() {
        extentTest=extentReports.createTest("CrystalKey Negative SignIn-Test","yanlış username-password ile sayafaya giriş sağlanamamalı.");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonuna tıklanıp username-password sayfasına giriş sağlandu.");
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("invalid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("Wrong_password"));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("yanlış username-password bilgileri girildi, login butonuna tıklandı");
        Assert.assertTrue(crystalHotelSignIn.tryAgainMesaj.isDisplayed());
        extentTest.pass("Try again mesajı alındı ve sayfaya yanlış bilgiler ile giriş sağlanamadı.");
        Driver.closeDriver();
    }
    @Test
    public void test6() {
        extentTest=extentReports.createTest("CrystalKey Negative SignIn-Test","doğru id, yanlış şifre ile sayfaya giriş sağlanamamalı.");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonuna tıklanıp username-password sayfasıan giriş sağlandı.");
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("Wrong_password"));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("geçerli bir username, geçersiz bir password girildi, login butonuna tıklandı");
        Assert.assertTrue(crystalHotelSignIn.tryAgainWrongPassMesaj.isDisplayed());
        extentTest.pass("try again mesajı alındı, geçerli username-geçersiz sifre ile sayfaya giriş sağlanamadı.");
        Driver.closeDriver();

    }
    @Test
    public void test7() {
        extentTest=extentReports.createTest("CrystalKey Negative SignIn-Test","geçersiz username-geçerli şifre ile sayfaya giriş sağlanamamalı.");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonu ile username-password sayfasına erişim sağlandı.");
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("invalid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("geçersiz username-geçerli sifre bilgileri girildi, login butonuna tıklandı.");
        Assert.assertTrue(crystalHotelSignIn.tryAgainMesaj.isDisplayed());
        extentTest.pass("try again mesajı alındı, geçersiz username-geçerli sifre ile sayfaya erişim sağlanamadı.");
        Driver.closeDriver();
    }
}