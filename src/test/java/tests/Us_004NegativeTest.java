package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US_003CrytalHotelSignPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_004NegativeTest extends TestBaseRapor {
    @Test
    public void usernameBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","Please select a username yazisi olşmali");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_004_invalidUsername1"));
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
        extentTest.info("Doğru ve doğru olmayan bilgiler girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.invalidUsernameText.isDisplayed());
        extentTest.pass("Room Rezervation duzenleme islemi invalid username ile yapildi");
        Driver.closeDriver();
    }

    @Test
    public void usernameInvalid() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","Username should be at least 4 characters long yazisi oluşmali");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_004_invalidUsername"));
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
        extentTest.info("Doğru bilgiler ve hatalı olabilecek bilgiler  girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.invalidUsernameText.isDisplayed(), "Username should be at least 4 characters long");
        extentTest.pass("Room Rezervation duzenleme islemi invalid username ile yapildi");
        Driver.closeDriver();
    }

    @Test
    public void InvalidPassword1() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","At least one special character is required yazisi olşmali");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_003_username"));
        us_003CrytalHotelSignPage.PasswordButonu.sendKeys(ConfigReader.getProperty("Us_004_invalidPassword01"));
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
        extentTest.info("Doğru bilgiler ve ve invalid password girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.invalidPassword1.isDisplayed(), "At least one special character is required");
        extentTest.pass("Room Rezervation duzenleme islemi ile invalid password girişi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void InvalidPassword2() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","Password should be at least 5 characters long yazisi olşmali");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_003_username"));
        us_003CrytalHotelSignPage.PasswordButonu.sendKeys(ConfigReader.getProperty("Us_004_invalidPassword02"));
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
        extentTest.info("Doğru bilgilerile invalid password girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.invalidPassword1.isDisplayed(), "Password should be at least 5 characters long");
        extentTest.pass("Room Rezervation duzenleme islemi invalid password ile yapildi");
        Driver.closeDriver();
    }

    @Test
    public void InvalidPassword3() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","At least one digit is required");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_003_username"));
        us_003CrytalHotelSignPage.PasswordButonu.sendKeys(ConfigReader.getProperty("Us_004_invalidPassword03"));
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
        extentTest.info("Doğru bilgiler ile invalid password girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.invalidPassword1.isDisplayed(), "At least one digit is required");
        extentTest.pass("Room Rezervation duzenleme islemi invalid password yapildi");
        Driver.closeDriver();
    }

    @Test
    public void emailBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","Please enter an email address yazisi olşmali");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_003_username"));
        us_003CrytalHotelSignPage.PasswordButonu.sendKeys(ConfigReader.getProperty("Us_003_password"));
        us_003CrytalHotelSignPage.EmailButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankEmail"));
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
        extentTest.info("Doğru bilgiler ile invalid e-mail girildi");
        Assert.assertTrue(us_003CrytalHotelSignPage.emailEmpty.isDisplayed(), "Please enter an email address");
        extentTest.pass("Room Rezervation duzenleme islemi invalid e-mail ile yapildi");
        Driver.closeDriver();
    }

    @Test
    public void fullNameBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","This field is required. yazisi olşmali");

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage = new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();
        us_003CrytalHotelSignPage.UsernameButonu.sendKeys(ConfigReader.getProperty("Us_003_username"));
        us_003CrytalHotelSignPage.PasswordButonu.sendKeys(ConfigReader.getProperty("Us_003_password"));
        us_003CrytalHotelSignPage.EmailButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankEmail"));
        us_003CrytalHotelSignPage.FullnameButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankFullName"));
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
        extentTest.info("Doğru bilgiler  ile invalid fullname girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.fullNameEmpty.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid fullname ile yapildi");
        Driver.closeDriver();
    }

    @Test
    public void PhoneNumberBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel Negative test","Please enter phone number yazisi olşmali");

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
        us_003CrytalHotelSignPage.PhoneNumberButton.sendKeys(ConfigReader.getProperty("Us_004_BlankPhoneNumber"));
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
        extentTest.info("Doğru bilgiler ile invalid phone number girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.phoneNumberEmpty.isDisplayed(), "Please enter phone number");
        extentTest.pass("Room Rezervation duzenleme islemi ivalid phone number ile  yapildi");
        Driver.closeDriver();
    }
    @Test
    public void sSNBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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
        us_003CrytalHotelSignPage.SsnButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankSecurityNumber"));
        us_003CrytalHotelSignPage.DlButonu.sendKeys(ConfigReader.getProperty("Us_003_DriverLicenceNumber"));

        Select select = new Select(us_003CrytalHotelSignPage.DropDownCountryButonu);
        select.selectByVisibleText(ConfigReader.getProperty("Us_003_Country"));

        Select select1 = new Select(us_003CrytalHotelSignPage.DropDownStateButonu);
        select1.selectByVisibleText(ConfigReader.getProperty("Us_003_State"));

        us_003CrytalHotelSignPage.AdresButonu.sendKeys(ConfigReader.getProperty("Us_003_Adres"));
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_003_workingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_003_Birthrate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid SSN girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.SSNEmpty.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid SSN ile yapildi");
        Driver.closeDriver();
    }
    @Test
    public void driverLicenceBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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
        us_003CrytalHotelSignPage.DlButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankDriverLicence"));

        Select select = new Select(us_003CrytalHotelSignPage.DropDownCountryButonu);
        select.selectByVisibleText(ConfigReader.getProperty("Us_003_Country"));

        Select select1 = new Select(us_003CrytalHotelSignPage.DropDownStateButonu);
        select1.selectByVisibleText(ConfigReader.getProperty("Us_003_State"));

        us_003CrytalHotelSignPage.AdresButonu.sendKeys(ConfigReader.getProperty("Us_003_Adres"));
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_003_workingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_003_Birthrate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid girildi");
        Assert.assertTrue(us_003CrytalHotelSignPage.DriverLicenceEmpty.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid bilgiler ie yapildi");
        Driver.closeDriver();
    }

    @Test
    public void adressBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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

        us_003CrytalHotelSignPage.AdresButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankAdress"));
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_003_workingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_003_Birthrate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid adress girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.adressEmpty.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid adress ie yapildi");

        Driver.closeDriver();
    }
    @Test
    public void workingBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_004_BlankWorkingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_003_Birthrate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid working sector girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.workingSectorEmpty.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid workig sector ie yapildi");

        Driver.closeDriver();

    }
    @Test
    public void birthDateBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_004_BlankBirthDate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid birthdate girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.BirthDateEmpty.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid birthdate ie yapildi");

        Driver.closeDriver();
    }


    @Test
    public void CountryBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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
        select.selectByIndex(0);

        Select select1 = new Select(us_003CrytalHotelSignPage.DropDownStateButonu);
        select1.selectByIndex(0);

        us_003CrytalHotelSignPage.AdresButonu.sendKeys(ConfigReader.getProperty("Us_003_Adres"));
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_003_workingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_004_BlankBirthDate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid country girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.DropDownCountryButonu.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid country ie yapildi");

        Driver.closeDriver();
    }

    @Test
    public void stateBlank() {
        extentTest=extentReports.createTest("CyristalKeyHotel negative test","This field is required. yazisi bulunmali ");

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
        select1.selectByIndex(0);

        us_003CrytalHotelSignPage.AdresButonu.sendKeys(ConfigReader.getProperty("Us_003_Adres"));
        us_003CrytalHotelSignPage.WorkingSectorButonu.sendKeys(ConfigReader.getProperty("Us_003_workingSector"));
        us_003CrytalHotelSignPage.BirthdateButtonu.sendKeys(ConfigReader.getProperty("Us_004_BlankBirthDate"));
        us_003CrytalHotelSignPage.RegistrationSaveButtonu.click();
        extentTest.info("Doğru bilgiler ile invalid state girildi");

        Assert.assertTrue(us_003CrytalHotelSignPage.DropDownStateButonu.isDisplayed(), "This field is required.");
        extentTest.pass("Room Rezervation duzenleme islemi invalid state ile yapildi");

        Driver.closeDriver();
    }

}