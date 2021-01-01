package smokeTest;

import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US_003CrytalHotelSignPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_003CrystalHotelPositive {

    @Test
    public void AnasayfaGiris(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();

        US_003CrytalHotelSignPage us_003CrytalHotelSignPage=new US_003CrytalHotelSignPage();
        us_003CrytalHotelSignPage.loginButonu.click();
        us_003CrytalHotelSignPage.CreateNewAccount.click();






    }


}
