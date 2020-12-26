package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_011_HotelRoomSearchPositivePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011_Positive {

    @Test
    public void positiveTest1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US_011_HotelRoomSearchPositivePage us_011_hotelRoomSearchPositivePage = new US_011_HotelRoomSearchPositivePage();
        us_011_hotelRoomSearchPositivePage.loginButonu.click();
        us_011_hotelRoomSearchPositivePage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us_011_hotelRoomSearchPositivePage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us_011_hotelRoomSearchPositivePage.girisButtonu.click();
        us_011_hotelRoomSearchPositivePage.hotelManagementLinki.click();
        us_011_hotelRoomSearchPositivePage.hotelRoomsLinki.click();

        Thread.sleep(5000);

        Select select = new Select(us_011_hotelRoomSearchPositivePage.hotelIDDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("ck_IDHotel_name"));

        us_011_hotelRoomSearchPositivePage.searchButton.click();


    }
}

