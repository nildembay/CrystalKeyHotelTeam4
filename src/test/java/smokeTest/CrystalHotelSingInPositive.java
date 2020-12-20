package smokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import utilities.ConfigReader;
import utilities.Driver;

public class CrystalHotelSingInPositive {

    @Test
    public void SignIn(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn=new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();


    }


}
