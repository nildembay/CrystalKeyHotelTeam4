package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US7_US8_DHotelListPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US7_US8_DHotelListDetailsTests {

    @Test
            public void generalDataSave(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.generalData.click();

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

        ckHotelsHomePage.saveButton.click();


        Assert.assertTrue(ckHotelsHomePage.saveSuccessfully.getText().contains("Hotel was updated successfully"));
        ckHotelsHomePage.alertOk.click();
    }

    @Test
    public void deleteTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.generalData.click();
        ckHotelsHomePage.deleteButton.click();

        Assert.assertTrue(ckHotelsHomePage.continueAlert.getText().contains("Would you like to continue?"));
        ckHotelsHomePage.alertDeleteOk.click();

    }

    @Test
    public void propertyTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();

        ckHotelsHomePage.propertyTip();

        ckHotelsHomePage.propertyCode.sendKeys(ConfigReader.getProperty("dnz_Property_Code"));
        ckHotelsHomePage.propertyValue.sendKeys(ConfigReader.getProperty("dnz_Property_Value"));

        ckHotelsHomePage.propertySaveButton.click();

        Assert.assertTrue(ckHotelsHomePage.propertyAlertMessage.getText().contains("Value added"));
        ckHotelsHomePage.propertyAlertButton.click();
    }

    @Test
    public void generalDataCodeFalseTest(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.generalData.click();


        ckHotelsHomePage.generelDataName.sendKeys(ConfigReader.getProperty("dnz_Name"));
        ckHotelsHomePage.generelDataAddress.clear();
        ckHotelsHomePage.generelDataAddress.sendKeys(ConfigReader.getProperty("dnz_Address"));
        ckHotelsHomePage.generelDataPhone.clear();
        ckHotelsHomePage.generelDataPhone.sendKeys(ConfigReader.getProperty("dnz_Phone"));
        ckHotelsHomePage.generelDataEmail.clear();
        ckHotelsHomePage.generelDataEmail.sendKeys(ConfigReader.getProperty("dnz_Email"));

        ckHotelsHomePage.IGroupSelect();

        ckHotelsHomePage.saveButton.click();

        Assert.assertTrue(ckHotelsHomePage.generalDataCodeFalse.getText().contains("Code"));


    }

    @Test
    public void propertyValueFalse(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();

        ckHotelsHomePage.propertyTip();

        ckHotelsHomePage.propertyCode.sendKeys(ConfigReader.getProperty("dnz_Property_Code"));
        ckHotelsHomePage.propertySaveButton.click();

        Assert.assertTrue(ckHotelsHomePage.propertyValueFalse.getText().contains("Value couldn't be added, provide a value please"));
        ckHotelsHomePage.alertOk.click();

    }

    @Test
    public void propertyTipFalse(){
        US7_US8_DHotelListPage ckHotelsHomePage=new US7_US8_DHotelListPage();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.sagUstLogin.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.loginButonu.click();

        ckHotelsHomePage.hotelManagmentButton.click();
        ckHotelsHomePage.hotelListButton.click();
        ckHotelsHomePage.detailsButton.click();
        ckHotelsHomePage.propertiesButton.click();

        ckHotelsHomePage.propertyTipFree();
        ckHotelsHomePage.propertyCode.sendKeys(ConfigReader.getProperty("dnz_Property_Code"));
        ckHotelsHomePage.propertyValue.sendKeys(ConfigReader.getProperty("dnz_Property_Value"));
        ckHotelsHomePage.propertySaveButton.click();

        Assert.assertEquals(ckHotelsHomePage.propertyTipFreeBoolean(),"Select Type...");


    }
}
