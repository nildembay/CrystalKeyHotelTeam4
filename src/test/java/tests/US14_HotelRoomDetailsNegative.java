package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US13_US14_PageHotelRoomDetail;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US14_HotelRoomDetailsNegative extends TestBaseRapor {


    @Test
    public void hotelRoomDuzenlemeNegative1() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 1");

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
        select.selectByVisibleText("Select Hotel...");

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
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.selectHotelMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenlemeNegative2() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 2");
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
        select.selectByIndex(2);

        uS13PageHotelRoomDetails.codeTextBox.clear();


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
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.codeMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenlemeNegative3() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 3");
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
        select.selectByIndex(2);

        uS13PageHotelRoomDetails.codeTextBox.clear();
        uS13PageHotelRoomDetails.codeTextBox.sendKeys(ConfigReader.getProperty("nb_generalCode"));

        uS13PageHotelRoomDetails.nameTextBox.clear();


        uS13PageHotelRoomDetails.locationTextBox.clear();
        uS13PageHotelRoomDetails.locationTextBox.sendKeys(ConfigReader.getProperty("nb_generalLocation"));
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        uS13PageHotelRoomDetails.descriptionTextArea.clear();
        uS13PageHotelRoomDetails.descriptionTextArea.sendKeys(ConfigReader.getProperty("nb_Description"));

        uS13PageHotelRoomDetails.priceTextBox.clear();
        uS13PageHotelRoomDetails.priceTextBox.sendKeys(ConfigReader.getProperty("nb_Price"));

        Select select1=new Select(uS13PageHotelRoomDetails.roomTypeDropdown);
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.nameMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenlemeNegative4() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 4");
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
        select.selectByIndex(2);

        uS13PageHotelRoomDetails.codeTextBox.clear();
        uS13PageHotelRoomDetails.codeTextBox.sendKeys(ConfigReader.getProperty("nb_generalCode"));

        uS13PageHotelRoomDetails.nameTextBox.clear();
        uS13PageHotelRoomDetails.nameTextBox.sendKeys(ConfigReader.getProperty("nb_generalName"));


        uS13PageHotelRoomDetails.locationTextBox.clear();

        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        uS13PageHotelRoomDetails.descriptionTextArea.clear();
        uS13PageHotelRoomDetails.descriptionTextArea.sendKeys(ConfigReader.getProperty("nb_Description"));

        uS13PageHotelRoomDetails.priceTextBox.clear();
        uS13PageHotelRoomDetails.priceTextBox.sendKeys(ConfigReader.getProperty("nb_Price"));

        Select select1=new Select(uS13PageHotelRoomDetails.roomTypeDropdown);
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.locationMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenlemeNegative5() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 5");

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
        select.selectByIndex(2);

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


        Select select1=new Select(uS13PageHotelRoomDetails.roomTypeDropdown);
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.priceMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenlemeNegative6() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 6");
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

        Select select = new Select(uS13PageHotelRoomDetails.hotelDropdown);
        select.selectByIndex(2);

        uS13PageHotelRoomDetails.codeTextBox.clear();
        uS13PageHotelRoomDetails.codeTextBox.sendKeys(ConfigReader.getProperty("nb_generalCode"));

        uS13PageHotelRoomDetails.nameTextBox.clear();
        uS13PageHotelRoomDetails.nameTextBox.sendKeys(ConfigReader.getProperty("nb_generalName"));


        uS13PageHotelRoomDetails.locationTextBox.clear();
        uS13PageHotelRoomDetails.locationTextBox.sendKeys(ConfigReader.getProperty("nb_generalLocation"));

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        uS13PageHotelRoomDetails.descriptionTextArea.clear();
        uS13PageHotelRoomDetails.descriptionTextArea.sendKeys(ConfigReader.getProperty("nb_Description"));

        uS13PageHotelRoomDetails.priceTextBox.clear();
        uS13PageHotelRoomDetails.priceTextBox.sendKeys(ConfigReader.getProperty("nb_Price"));


        Select select1 = new Select(uS13PageHotelRoomDetails.roomTypeDropdown);
        select1.selectByVisibleText("Select GroupRoomType...");

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.selectGroupRoomTypeMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();
    }

    @Test
    public void hotelRoomDuzenlemeNegative7() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 7");
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
        select.selectByIndex(2);

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
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();


        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();
        uS13PageHotelRoomDetails.maxChildCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxChild"));

        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.adultCountMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }
    @Test
    public void hotelRoomDuzenlemeNegative8() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda düzenleme negative 8");
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
        select.selectByIndex(2);

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
        select1.selectByIndex(2);

        uS13PageHotelRoomDetails.maxAdultCountTextBox.clear();
        uS13PageHotelRoomDetails.maxAdultCountTextBox.sendKeys(ConfigReader.getProperty("nb_maxAdult"));

        uS13PageHotelRoomDetails.maxChildCountTextBox.clear();


        uS13PageHotelRoomDetails.avaibleCheckBox.click();
        uS13PageHotelRoomDetails.saveButonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.childrenCountMesaji.isDisplayed());
        extentTest.pass("oda duzenleme islemi yapilamadi");
        Driver.closeDriver();

    }

    @Test
    public void hotelRoomsPropertiesEklemeNegative1() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda properties ekleme negative 1");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
        uS13PageHotelRoomDetails.loginButonu.click();
        uS13PageHotelRoomDetails.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        uS13PageHotelRoomDetails.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        uS13PageHotelRoomDetails.girisButtonu.click();
        uS13PageHotelRoomDetails.hotelManagementLinki.click();
        uS13PageHotelRoomDetails.hotelRoomsLinki.click();
        uS13PageHotelRoomDetails.hotelRoomDetailsLinki.click();
        uS13PageHotelRoomDetails.propertiesSekmesi.click();
        Select select=new Select(uS13PageHotelRoomDetails.propertiesTipDropdown);
        select.selectByVisibleText("Select Type...");
        uS13PageHotelRoomDetails.propertiesCodeTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesCode"));
        uS13PageHotelRoomDetails.propertiesValueTextBox.sendKeys(ConfigReader.getProperty("nb_propertiesValue"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        int ilkKayitSayisi=Integer.parseInt(uS13PageHotelRoomDetails.kayitSayisi.getText().replaceAll("\\D", ""));
        uS13PageHotelRoomDetails.propertiesSaveButonu.click();
        Thread.sleep(2000);
        int sonKayitSayisi=Integer.parseInt(uS13PageHotelRoomDetails.kayitSayisi.getText().replaceAll("\\D", ""));
        Assert.assertTrue(ilkKayitSayisi==sonKayitSayisi);
        extentTest.pass("oda properties ekleme islemi yapilamadi");
        Driver.closeDriver();
    }
    @Test
    public void hotelRoomsPropertiesEklemeNegative2() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY HOTEL ROOM DETAILS", "oda properties ekleme negative 2");
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US13_US14_PageHotelRoomDetail uS13PageHotelRoomDetails =new US13_US14_PageHotelRoomDetail();
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

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        //int ilkKayitSayisi=Integer.parseInt(uS13PageHotelRoomDetails.kayitSayisi.getText().replaceAll("\\D", ""));
        uS13PageHotelRoomDetails.propertiesSaveButonu.click();

        //int sonKayitSayisi=Integer.parseInt(uS13PageHotelRoomDetails.kayitSayisi.getText().replaceAll("\\D", ""));
        // Assert.assertTrue(ilkKayitSayisi==sonKayitSayisi);
        Thread.sleep(2000);
        Assert.assertTrue(uS13PageHotelRoomDetails.mesajPenceresi.getText().contains(ConfigReader.getProperty("nb_propertiesEklemeNegativeMesaji")));
        extentTest.pass("oda properties ekleme islemi yapilamadi");
        Driver.closeDriver();
    }




}