package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.Us06_HotelAramaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US06_HotelAramaPositiveTest {

    Us06_HotelAramaPage us06_hotelAramaPage = new Us06_HotelAramaPage();
    @Test

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        us06_hotelAramaPage.loginButonu.click();



    }

    @Test
     public void HotelAramaIdGroupDropDown(){
        login();

    }

}
