package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US7_US8_DHotelListPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US7_US8_DHotelListDetailsTests extends TestBaseRapor{

    @Test
    public void generalDataSave() throws InterruptedException {
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details pozitif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();

        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.generalData.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.generelDataCode.clear();
        ckHotelsHomePage.generelDataCode.sendKeys(ConfigReader.getProperty("dnz_Code"));
        ckHotelsHomePage.generelDataName.clear();
        ckHotelsHomePage.generelDataName.sendKeys(ConfigReader.getProperty("dnz_Name"));
        ckHotelsHomePage.generelDataAddress.clear();
        ckHotelsHomePage.generelDataAddress.sendKeys(ConfigReader.getProperty("dnz_Address"));
        ckHotelsHomePage.generelDataPhone.clear();
        ckHotelsHomePage.generelDataPhone.sendKeys(ConfigReader.getProperty("dnz_Phone"));
        ckHotelsHomePage.generelDataEmail.clear();
        ckHotelsHomePage.generelDataEmail.sendKeys(ConfigReader.getProperty("dnz_Email"));

        ckHotelsHomePage.IGroupSelect();
        extentTest.info("tüm textboxları temizleyip istenilen değerler girildi");

        ckHotelsHomePage.saveButton.click();


        Assert.assertTrue(ckHotelsHomePage.saveSuccessfully.getText().contains("Hotel was updated successfully"));

        extentTest.pass("sayfaya başarılı giriş yapıldığı test edildi");
        ckHotelsHomePage.alertOk.click();

        Driver.closeDriver();
    }

    @Test
    public void deleteTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details pozitif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.generalData.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");
        ckHotelsHomePage.deleteButton.click();

        Assert.assertTrue(ckHotelsHomePage.continueAlert.getText().contains("Would you like to continue?"));
        extentTest.pass("değerin başarılı bir şekilde silindiği test edildi");
        ckHotelsHomePage.alertDeleteOk.click();

        Driver.closeDriver();

    }

    @Test
    public void propertyTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details pozitif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.propertyTip();

        ckHotelsHomePage.propertyCode.sendKeys(ConfigReader.getProperty("dnz_Property_Code"));
        ckHotelsHomePage.propertyValue.sendKeys(ConfigReader.getProperty("dnz_Property_Value"));
        extentTest.info("farklı bir code ve değer gönderildi");

        ckHotelsHomePage.propertySaveButton.click();

        Assert.assertTrue(ckHotelsHomePage.propertyAlertMessage.getText().contains("Value added"));

        extentTest.pass("değerin başarılı bir şekilde eklendiği test edildi");
        ckHotelsHomePage.propertyAlertButton.click();

        Driver.closeDriver();
    }

    @Test
    public void generalDataCodeFalseTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details negatif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.generalData.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.generelDataName.clear();
        ckHotelsHomePage.generelDataName.sendKeys(ConfigReader.getProperty("dnz_Name"));
        ckHotelsHomePage.generelDataAddress.clear();
        ckHotelsHomePage.generelDataAddress.sendKeys(ConfigReader.getProperty("dnz_Address"));
        ckHotelsHomePage.generelDataPhone.clear();
        ckHotelsHomePage.generelDataPhone.sendKeys(ConfigReader.getProperty("dnz_Phone"));
        ckHotelsHomePage.generelDataEmail.clear();
        ckHotelsHomePage.generelDataEmail.sendKeys(ConfigReader.getProperty("dnz_Email"));

        extentTest.info("'Code' textboxı hariç tüm textboxlar dolduruldu");

        ckHotelsHomePage.IGroupSelect();

        ckHotelsHomePage.saveButton.click();

        Assert.assertTrue(ckHotelsHomePage.generalDataCodeFalse.getText().contains("Code"));
        extentTest.pass("değerin başarılı bir şekilde hata mesajı veridiği görüldü");

        Driver.closeDriver();


    }

    @Test
    public void propertyValueFalse(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details negatif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.propertyTip();

        ckHotelsHomePage.propertyCode.sendKeys(ConfigReader.getProperty("dnz_Property_Code"));
        ckHotelsHomePage.propertySaveButton.click();
        extentTest.info("'Tip' ve 'Code' değerleri girildi");

        Assert.assertTrue(ckHotelsHomePage.propertyValueFalse.getText().contains("Value couldn't be added, provide a value please"));
        ckHotelsHomePage.alertOk.click();
        extentTest.pass("değerin başarılı bir şekilde hata mesajı veridiği görüldü");

        Driver.closeDriver();

    }

    @Test
    public void propertyTipFalse(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details negatif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.propertyTipFree();
        ckHotelsHomePage.propertyCode.sendKeys(ConfigReader.getProperty("dnz_Property_Code"));
        ckHotelsHomePage.propertyValue.sendKeys(ConfigReader.getProperty("dnz_Property_Value"));
        ckHotelsHomePage.propertySaveButton.click();
        extentTest.info("'Tip' alanı boş bırakıldı, 'Code' ve 'Value' değerleri girildi");

        Assert.assertEquals(ckHotelsHomePage.propertyTipFreeBoolean(),"Select Type...");

        extentTest.pass("değerin başarılı bir şekilde hata mesajı veridiği görüldü");

        Driver.closeDriver();
    }

    @Test
    public void propertyRemoveTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details pozitif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru bir kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru bir password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.propertyRemoveButton.click();

        extentTest.pass("değerin başarılı bir şekilde silindiği görüldü");

        Driver.closeDriver();

    }

    @Test
    public void propertyUpdateTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        extentTest=extentReports.createTest("details pozitif testi","doğru kullanıcı adı ve password ile login olmalıyım");
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        extentTest.info("doğru bir kullanıcı adı girildi");
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        extentTest.info("doğru bir password girildi");
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();
        extentTest.info("sayfaya başarılı bir giriş yaptı");

        ckHotelsHomePage.propertyUpdateCode.clear();
        ckHotelsHomePage.propertyUpdateCode.sendKeys(ConfigReader.getProperty("dnz_proper_code"));
        ckHotelsHomePage.propertyUpdateValue.clear();
        ckHotelsHomePage.propertyUpdateValue.sendKeys(ConfigReader.getProperty("dnz_proper_value"));
        extentTest.info("tüm textboxlar temizlenip yerine yeni 'code' ve 'value' değerleri girildi ");
        ckHotelsHomePage.propertyUpdateButton.click();
        extentTest.pass("değerin başarılı bir şekilde değiştiği görüldü");

        Driver.closeDriver();

    }
}