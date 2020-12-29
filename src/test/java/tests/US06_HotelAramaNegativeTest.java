package tests;

import org.testng.annotations.Test;
import pages.US06_HotelAramaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US06_HotelAramaNegativeTest {

    US06_HotelAramaPage us06_hotelAramaPage = new US06_HotelAramaPage();

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        us06_hotelAramaPage.loginButonu.click();
        us06_hotelAramaPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us06_hotelAramaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us06_hotelAramaPage.signInButton.click();
        us06_hotelAramaPage.hotelManagementButton.click();
        us06_hotelAramaPage.hotelListButton.click();
    }

    @Test
    public void yanlisIDHotel(){

    }

    @Test
    public void yanlisCode(){

    }

    @Test
    public void yanlisName(){

    }

    @Test
    public void  yanlisAddress(){

    }

    @Test
    public void yanlisPhone(){

    }

    @Test
    public void yanlisEmail(){

    }


}
