package smokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.Assert;
import utilities.TestBaseRapor;

public class CrystalHotelSingInPositive extends TestBaseRapor {
    @Test
    public void SignIn(){
        extentTest= extentReports.createTest("CrystalKey SignIn PositiveTest","geçerli veriler ile sayfaya giriş sağlanabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn=new CrystalHotelSignIn();

        crystalHotelSignIn.loginButonu.click();
        extentTest.info("login butonuna tıklanıp, id-sifre sayfasına gelindi.");
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();
        extentTest.info("geçerli bilgiler girildi.");
        Assert.assertTrue(crystalHotelSignIn.managerButton.isDisplayed());
        extentTest.pass("Geçerli bilgiler ile başarılı bir şekilde giriş saglandı.");
        Driver.closeDriver();



    }


}