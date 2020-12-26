package tests;

import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import utilities.ConfigReader;
import utilities.Driver;

public class Dnz_HotelListDetailsTests {

    @Test
            public void generalDataSave(){
        CrystalHotelSignIn ckHotelsHomePage=new CrystalHotelSignIn();
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        ckHotelsHomePage.loginButonu.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        ckHotelsHomePage.girisButton.click();
    }


}
