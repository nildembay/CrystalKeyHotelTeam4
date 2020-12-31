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

    }


}
