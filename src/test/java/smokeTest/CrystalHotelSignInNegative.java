package smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import utilities.ConfigReader;
import utilities.Driver;

public class CrystalHotelSignInNegative {
    @Test
    public void test2(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        //  crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty(""));
        //  crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty(""));
        crystalHotelSignIn.girisButton.click();
        Assert.assertEquals(crystalHotelSignIn.userBosHataMesaj.getText(),"This field is required.");
        Assert.assertEquals(crystalHotelSignIn.passBosHataMesaj.getText(),"This field is required.");
        Driver.closeDriver();
        }
    @Test
    public void test3(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        //  crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty(""));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();
        Assert.assertEquals(crystalHotelSignIn.userBosHataMesaj.getText(),"This field is required.");
        Driver.closeDriver();
        }
    @Test
    public void test4(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        //  crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty(""));
        crystalHotelSignIn.girisButton.click();
        Assert.assertEquals(crystalHotelSignIn.passBosHataMesaj.getText(),"This field is required.");
        Driver.closeDriver();
        }
    @Test
    public void test5() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("invalid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("Wrong_password"));
        crystalHotelSignIn.girisButton.click();
        Assert.assertTrue(crystalHotelSignIn.tryAgainMesaj.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test6() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("Wrong_password"));
        crystalHotelSignIn.girisButton.click();
        Assert.assertTrue(crystalHotelSignIn.tryAgainWrongPassMesaj.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test7() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        CrystalHotelSignIn crystalHotelSignIn = new CrystalHotelSignIn();
        crystalHotelSignIn.loginButonu.click();
        crystalHotelSignIn.userNameTextBox.sendKeys(ConfigReader.getProperty("invalid_user"));
        crystalHotelSignIn.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        crystalHotelSignIn.girisButton.click();
        Assert.assertTrue(crystalHotelSignIn.tryAgainMesaj.isDisplayed());
        Driver.closeDriver();
    }
}

