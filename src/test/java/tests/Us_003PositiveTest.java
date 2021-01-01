package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US_003CrytalHotelSignPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Iterator;
import java.util.Set;

public class Us_003PositiveTest extends TestBaseRapor {
    @Test
    public void positiveTest() throws InterruptedException {
        extentTest=extentReports.createTest("CyristalKeyHotel positive test","CyristalKeyHotel sayfasindaregistration sayfasina girip kayit olma ");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_003_username"));
        us_003CrytalHotelSignPage.PasswordButonu.sendKeys(ConfigReader.getProperty("Us_003_password"));
        us_003CrytalHotelSignPage.EmailButonu.sendKeys(ConfigReader.getProperty("Us_003_email"));
        us_003CrytalHotelSignPage.FullnameButonu.sendKeys(ConfigReader.getProperty("Us_003_Fullname"));
        us_003CrytalHotelSignPage.PhoneNumberButton.sendKeys(ConfigReader.getProperty("Us_003_phoneNumber"));
        us_003CrytalHotelSignPage.SsnButonu.sendKeys(ConfigReader.getProperty("Us_003_SocialSecurityNumber"));
        us_003CrytalHotelSignPage.DlButonu.sendKeys(ConfigReader.getProperty("Us_003_DriverLicenceNumber"));

        Select select = new Select(us_003CrytalHotelSignPage.DropDownCountryButonu);
        select.selectByVisibleText(ConfigReader.getProperty("Us_003_Country"));

        Select select1 = new Select(us_003CrytalHotelSignPage.DropDownStateButonu);
        select1.selectByVisibleText(ConfigReader.getProperty("Us_003_State"));

        us_003CrytalHotelSignPage.AdresButonu.sendKeys(ConfigReader.getProperty("Us_003_Adres"));
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_003_workingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_003_Birthrate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();

        String successfulnessesText=us_003CrytalHotelSignPage.succesfullyText.getText();
        Thread.sleep(3000);
        us_003CrytalHotelSignPage.SonOkButonu.click();
        extentTest.info("Doğru bilgiler girildi");

        Assert.assertEquals(successfulnessesText,"User Data was inserted successfully");
        extentTest.pass("Room Rezervation duzenleme islemi yapildi");




    }
}
