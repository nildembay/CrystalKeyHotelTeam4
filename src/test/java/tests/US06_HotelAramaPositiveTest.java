package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US06_HotelAramaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.ref.SoftReference;
import java.net.SocketTimeoutException;

public class US06_HotelAramaPositiveTest extends TestBaseRapor {

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
     public void hotelAramaIdGroupDropDown(){
        login();
        WebElement idGroupDropDown = Driver.getDriver().findElement(By.xpath("//select[@id='lkpGroups']"));
        Select select = new Select(idGroupDropDown);
        select.selectByValue("2");
        us06_hotelAramaPage.searchButton.click();
        String allSearchResult = Driver.getDriver().findElement(By.className("dataTables_info")).getText();
        System.out.println(allSearchResult);

    }

    @Test
    public void hotelAramaIDHotel(){
        login();
        us06_hotelAramaPage.idHotelTextBox.sendKeys(ConfigReader.getProperty("valid_idHotel"));
        us06_hotelAramaPage.searchButton.click();
        SoftAssert softAssert = new SoftAssert();
    }

    @Test
    public void hotelAramaCode(){
        login();
        us06_hotelAramaPage.codeTextBox.sendKeys(ConfigReader.getProperty("valid_code"));
        us06_hotelAramaPage.searchButton.click();
        SoftAssert softAssert = new SoftAssert();
    }

    @Test
    public void hotelAramaName(){
        login();
        us06_hotelAramaPage.nameTextBox.sendKeys(ConfigReader.getProperty("valid_name"));
        us06_hotelAramaPage.searchButton.click();
        SoftAssert softAssert = new SoftAssert();
    }

    @Test
    public void hotelAramaAddress(){
        login();
        us06_hotelAramaPage.addressTextBox.sendKeys(ConfigReader.getProperty("valid_address"));
        us06_hotelAramaPage.searchButton.click();
        SoftAssert softAssert = new SoftAssert();
    }

    @Test
    public void hotelAramaPhone(){
        login();
        us06_hotelAramaPage.phoneTextBox.sendKeys(ConfigReader.getProperty("valid_phone"));
        us06_hotelAramaPage.searchButton.click();
        SoftAssert softAssert =new SoftAssert();
    }

    @Test
    public void hotelAramaEmail(){
        login();
        us06_hotelAramaPage.emailTextBox.sendKeys(ConfigReader.getProperty("valid_email"));
        us06_hotelAramaPage.searchButton.click();
        SoftAssert softAssert = new SoftAssert();
    }

    @Test
    public void clearButton(){
        login();
        us06_hotelAramaPage.idHotelTextBox.sendKeys(ConfigReader.getProperty("valid_idHotel"));
        us06_hotelAramaPage.codeTextBox.sendKeys(ConfigReader.getProperty("valid_code"));
        us06_hotelAramaPage.nameTextBox.sendKeys(ConfigReader.getProperty("valid_name"));
        us06_hotelAramaPage.addressTextBox.sendKeys(ConfigReader.getProperty("valid_address"));
        us06_hotelAramaPage.phoneTextBox.sendKeys(ConfigReader.getProperty("valid_phone"));
        us06_hotelAramaPage.emailTextBox.sendKeys(ConfigReader.getProperty("valid_email"));
        us06_hotelAramaPage.clearButton.click();

    }
}
