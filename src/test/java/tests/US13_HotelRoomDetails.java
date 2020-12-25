package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US13_US14_PageHotelRoomDetail;
import utilities.ConfigReader;
import utilities.Driver;

public class US13_US14_HotelRoomDetails {
    US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();

    public void ortak(){

        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();


    }

    @Test
    public void hotelRoomDuzenleme1() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
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
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SavedBasariliMesaji")));
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenleme2() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
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
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SavedBasariliMesaji")));
        System.out.println(uS13PageHotelRoomDetails.mesajPenceresi.getText());
        Driver.closeDriver();

    }

    @Test
    public void hotelRoomSilme() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
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
        System.out.println(uS13PageHotelRoomDetails.mesajPenceresi.getText());
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SilmeOnayMesaji")));
        uS13PageHotelRoomDetails.silmeOnayButonu.click();
        Thread.sleep(1000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_SilmeMesaji")));
        Driver.closeDriver();
    }
    @Test
    public void hotelRoomsPropertiesEkleme() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.propertiesSekmesi.click();
        Select select=new Select(uS13PageHotelRoomDetails.propertiesTipDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("nb_tipValue"));
        uS13PageHotelRoomDetails.propertiesCodeTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesCode"));
        uS13PageHotelRoomDetails.propertiesValueTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesValue"));
        uS13PageHotelRoomDetails.propertiesSaveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesSaveMesaji")));
        Driver.closeDriver();
    }

    @Test
    public void hotelRoomsPropertiesUpdate() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.propertiesSekmesi.click();

        uS13PageHotelRoomDetails.propertiesUpdateCodeTextBox.clear();
        uS13PageHotelRoomDetails.propertiesUpdateCodeTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesNewCode"));

        uS13PageHotelRoomDetails.propertiesUpdateValueTextBox.clear();
        uS13PageHotelRoomDetails.propertiesUpdateValueTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesNewValue"));

        uS13PageHotelRoomDetails.propertiesUpdateButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesUpdateMesaji")));
        Driver.closeDriver();

    }

    @Test
    public void hotelRoomsPropertiesDelete() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.propertiesSekmesi.click();
        uS13PageHotelRoomDetails.propertiesRemoveButonu.click();
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesRemoveOnayMesaji")));
        uS13PageHotelRoomDetails.silmeOnayButonu.click();
        Thread.sleep(1000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesRemoveMesaji")));
        Driver.closeDriver();


    }

    @Test
    public void hotelRoomsPhotosEklemeSilme(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.photosSekmesi.click();
        String homePath= System.getProperty("user.home");
        String filePath= homePath+"\\Desktop\\oda.jpg";
        uS13PageHotelRoomDetails.selectFileButonu.click();
        WebElement a=Driver.getDriver().findElement(By.id("uploaded_file_o_1eqdqln27qqb1df517emn71i8n7"));
         a.sendKeys(filePath);
        uS13PageHotelRoomDetails.upLoadFilesButonu.click();




    }


}
