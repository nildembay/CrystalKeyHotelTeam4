package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_005HotelCreationAddHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005AddHotelNegativeTest {

    public void crystalHotelSignIn() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US_005HotelCreationAddHotelPage us_005HotelCreationAddHotelPage = new US_005HotelCreationAddHotelPage();
        us_005HotelCreationAddHotelPage.loginButonu.click();
        us_005HotelCreationAddHotelPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us_005HotelCreationAddHotelPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us_005HotelCreationAddHotelPage.girisButton.click();

    }
    @Test
    public void negativeTest01() throws InterruptedException {
        //phone kutusuna tıklayıp içinde harf ve karakter olan bir deger girelim
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        Thread.sleep(5000);
        page.hotelManagement.click();
        page.hotelList.click();
        Thread.sleep(5000);
        page.addHotel.click();
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        page.name.sendKeys(ConfigReader.getProperty("name"));
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        page.phone.sendKeys(ConfigReader.getProperty("invalid_phone"));
        page.email.sendKeys(ConfigReader.getProperty("email"));
        Select select=new Select(page.dropdown);
        select.selectByIndex(1);
        page.save.click();
        Thread.sleep(5000);
        Assert.assertFalse(page.otelOlusturulduYazisi.isDisplayed());

    }


    @Test
    public void negativeTest02() throws InterruptedException {
        //email box kutusuna icinde "@" ve "com" içermeyen deger girin
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        Thread.sleep(5000);
        page.hotelManagement.click();
        page.hotelList.click();
        Thread.sleep(5000);
        page.addHotel.click();
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        page.name.sendKeys(ConfigReader.getProperty("name"));
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        page.email.sendKeys(ConfigReader.getProperty("invalid_email"));
        Select select=new Select(page.dropdown);
        select.selectByIndex(1);
        page.save.click();
        Thread.sleep(5000);
        Assert.assertFalse(page.otelOlusturulduYazisi.isDisplayed());

    }

    @Test
    public void negativeTest03() throws InterruptedException {
        //ID Group secilmeden save butonuna tıklayın
        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        Thread.sleep(5000);
        page.hotelManagement.click();
        page.hotelList.click();
        Thread.sleep(5000);
        page.addHotel.click();
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        page.name.sendKeys(ConfigReader.getProperty("name"));
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        page.email.sendKeys(ConfigReader.getProperty("email"));
        page.save.click();
        Thread.sleep(5000);
        Assert.assertTrue(!page.otelOlusturulduYazisi.isDisplayed());

    }
    @Test

     public  void negativeTest04() throws InterruptedException {
        //Herhangi bir texBox bos birakılıp save butonuna tıklayın

        US_005HotelCreationAddHotelPage page=new US_005HotelCreationAddHotelPage();
        crystalHotelSignIn();
        Thread.sleep(5000);
        page.hotelManagement.click();
        page.hotelList.click();
        Thread.sleep(5000);
        page.addHotel.click();
        Thread.sleep(7000);
        page.code.sendKeys(ConfigReader.getProperty("code"));
        page.name.sendKeys(ConfigReader.getProperty("name"));
        page.adress.sendKeys(ConfigReader.getProperty("adress"));
        page.phone.sendKeys(ConfigReader.getProperty("phone"));
        page.save.click();
        Thread.sleep(5000);
        Assert.assertTrue(!page.otelOlusturulduYazisi.isDisplayed());



    }










}