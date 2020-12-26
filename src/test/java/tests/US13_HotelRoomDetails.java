package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US13_US14_PageHotelRoomDetail;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US13_HotelRoomDetails extends TestBaseRapor {

    @Test
    public void hotelRoomDuzenleme1() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda duzenlenebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.generalDataSekmesi.click();

        Select select=new Select(uS13PageHotelRoomDetails.hotelDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("nb_HotelName"));

        uS13PageHotelRoomDetails.codeTextBox.clear();
        uS13PageHotelRoomDetails.codeTextBox.sendKeys(ConfigReader.getProperty("nb_generalCode"));

        uS13PageHotelRoomDetails.nameTextBox.clear();
        uS13PageHotelRoomDetails.nameTextBox.sendKeys(ConfigReader.getProperty("nb_generalName"));

        uS13PageHotelRoomDetails.locationTextBox.clear();
        uS13PageHotelRoomDetails.locationTextBox.sendKeys(ConfigReader.getProperty("nb_generalLocation"));
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        uS13PageHotelRoomDetails.descriptionTextArea.clear();
        uS13PageHotelRoomDetails.descriptionTextArea.sendKeys(ConfigReader.getProperty("nb_Description"));

        uS13PageHotelRoomDetails.priceTextBox.clear();
        uS13PageHotelRoomDetails.priceTextBox.sendKeys(ConfigReader.getProperty("nb_Price"));

        Select select1=new Select(uS13PageHotelRoomDetails.roomTypeDropdown);
        select1.selectByVisibleText(ConfigReader.getProperty("nb_roomType"));

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        extentTest.info("Doğru bilgiler girildi");
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SavedBasariliMesaji")));
        extentTest.pass("Room duzenleme islemi yapildi");

        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenleme2() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda duzenlenebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();

        uS13PageHotelRoomDetails.generalDataSekmesi.click();

        Select select=new Select(uS13PageHotelRoomDetails.hotelDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("nb_HotelName"));

        uS13PageHotelRoomDetails.codeTextBox.clear();
        uS13PageHotelRoomDetails.codeTextBox.sendKeys(ConfigReader.getProperty("nb_generalCode"));

        uS13PageHotelRoomDetails.nameTextBox.clear();
        uS13PageHotelRoomDetails.nameTextBox.sendKeys(ConfigReader.getProperty("nb_generalName"));

        uS13PageHotelRoomDetails.locationTextBox.clear();
        uS13PageHotelRoomDetails.locationTextBox.sendKeys(ConfigReader.getProperty("nb_generalLocation"));
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        uS13PageHotelRoomDetails.descriptionTextArea.clear();
        uS13PageHotelRoomDetails.descriptionTextArea.sendKeys(ConfigReader.getProperty("nb_Description"));

        uS13PageHotelRoomDetails.priceTextBox.clear();
        actions.dragAndDrop(uS13PageHotelRoomDetails.priceDrapDrop, uS13PageHotelRoomDetails.priceTextBox).perform();
        //pageHotelRoomDetailsNilBay.priceTextBox.sendKeys(ConfigReader.getProperty("nb_Price"));

        Select select1=new Select(uS13PageHotelRoomDetails.roomTypeDropdown);
        select1.selectByVisibleText(ConfigReader.getProperty("nb_roomType"));

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        extentTest.info("Doğru bilgiler girildi");
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SavedBasariliMesaji")));
        System.out.println(uS13PageHotelRoomDetails.mesajPenceresi.getText());
        extentTest.pass("Room duzenleme islemi yapildi");
        Driver.closeDriver();

    }

    @Test
    public void hotelRoomSilme() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda silinebilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.generalDataSekmesi.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(1000);
        uS13PageHotelRoomDetails.deleteButonu.click();
        Thread.sleep(1000);
       // System.out.println(uS13PageHotelRoomDetails.mesajPenceresi.getText());
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SilmeOnayMesaji")));
        uS13PageHotelRoomDetails.silmeOnayButonu.click();
        Thread.sleep(1000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SilmeMesaji")));
        extentTest.pass("Room delete islemi yapildi");
        Driver.closeDriver();
    }
    @Test
    public void hotelRoomsPropertiesEkleme() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda properties ekleme");

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        Thread.sleep(1000);
        uS13PageHotelRoomDetails.propertiesSekmesi.click();
        Select select=new Select(uS13PageHotelRoomDetails.propertiesTipDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("nb_tipValue"));
        uS13PageHotelRoomDetails.propertiesCodeTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesCode"));
        uS13PageHotelRoomDetails.propertiesValueTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesValue"));
        uS13PageHotelRoomDetails.propertiesSaveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesSaveMesaji")));
        extentTest.pass("Room properties ekleme islemi yapildi");
        Driver.closeDriver();
    }

    @Test
    public void hotelRoomsPropertiesUpdate() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda properties update");

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        Thread.sleep(1000);
        uS13PageHotelRoomDetails.propertiesSekmesi.click();

        uS13PageHotelRoomDetails.propertiesUpdateCodeTextBox.clear();
        uS13PageHotelRoomDetails.propertiesUpdateCodeTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesNewCode"));

        uS13PageHotelRoomDetails.propertiesUpdateValueTextBox.clear();
        uS13PageHotelRoomDetails.propertiesUpdateValueTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesNewValue"));

        uS13PageHotelRoomDetails.propertiesUpdateButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesUpdateMesaji")));
        extentTest.pass("Room properties guncelleme islemi yapildi");
        Driver.closeDriver();

    }

    @Test
    public void hotelRoomsPropertiesDelete() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda properties delete");

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        Thread.sleep(1000);
        uS13PageHotelRoomDetails.propertiesSekmesi.click();
        uS13PageHotelRoomDetails.propertiesRemoveButonu.click();
        Thread.sleep(1000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesRemoveOnayMesaji")));
        uS13PageHotelRoomDetails.silmeOnayButonu.click();
        Thread.sleep(1000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesRemoveMesaji")));
        Driver.closeDriver();
        extentTest.pass("Room properties silme islemi yapildi");

    }

    @Test
    public void hotelRoomsPhotosEklemeSilme() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda fotograf ekleme silme");

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        Thread.sleep(1000);

        uS13PageHotelRoomDetails.photosSekmesi.click();
        String homePath= System.getProperty("user.home");
        String filePath= homePath+"\\Desktop\\oda.jpg";
        uS13PageHotelRoomDetails.selectFileButonu.sendKeys(filePath);
        uS13PageHotelRoomDetails.upLoadFilesButonu.click();
        extentTest.pass("Room resim ekleme silme islemi yapildi");
        Driver.closeDriver();




    }




}
