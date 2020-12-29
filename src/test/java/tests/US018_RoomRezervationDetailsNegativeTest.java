package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US018_RoomRezervationDetailsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US018_RoomRezervationDetailsNegativeTest extends TestBaseRapor {
    @BeforeMethod
    public void SignIn() {
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.ilkLogIn.click();
        us018_roomRezervationDetailsPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us018_roomRezervationDetailsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us018_roomRezervationDetailsPage.loginButonu.click();
        us018_roomRezervationDetailsPage.hotelMenagementButton.click();
        us018_roomRezervationDetailsPage.roomRezervationsButton.click();
        us018_roomRezervationDetailsPage.detailsButton.click();
    }

    @Test
    public void negativeTestDropDownSecimsizTC02() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();

        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByIndex(0);
        extentTest.info("Room DropDown Secimsiz girildi");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.detailsHotelRoomHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation Room DropDown negative testi yapildi");

        // bu bitti
    }
    @Test
    public void negativeTestUserDropDownSecimsizTC03() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByIndex(0);
        extentTest.info("UserDropDownSecimsiz birakildi");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(us018_roomRezervationDetailsPage.detailsUserHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation Room DropDown negative testi yapildi");

        //bitti

    }

    @Test
    public void negativeTestPricetextBoxBosTC04() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();

        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        extentTest.info("PricetextBox bos birakildi");
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.priceHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation PricetextBox negative testi yapildi");
        //bitti

    }

    @Test
    public void negativeTestDateStartGecmisGunTC05() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2019");
        extentTest.info("DateStartGecmisGun gecmis gun secildi");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertFalse(true); //"eski tarih secmemalisiniz" mesaji yok // o yuzden fail olsun diye bunu yazdim
        extentTest.pass("Room Rezervation DateStartGecmisGun negative testi yapildi");

        //bitti
    }

    @Test
    public void negativeTestDateEndGecmisGunTC06() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2019");
        extentTest.info("DateEnd GecmisGun gecmis gun secildi");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertFalse(true); //"eski tarih secmemalisiniz" mesaji yok// o yuzden fail olsun diye bunu yazdim
        extentTest.pass("Room Rezervation DateEnd GecmisGun negative testi yapildi");

    }

    @Test
    public void negativeTestAdultAmountBosBirakTC07() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        //buraya actions
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.clear();
        extentTest.info("AdultAmount Bos Birakildi");
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.adultAmountHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation AdultAmount negative testi yapildi");

        //bitti

    }

    @Test
    public void negativeTestChildrenAmountBosBirakTC08() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.clear();
        extentTest.info("Children Amount Bos Birakildi");
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        extentTest.info("Doğru bilgiler girildi");
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.childrenAmountHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation Children Amount negative testi yapildi");

        //bitti


    }

    @Test
    public void negativeTestContactNameSurnameBosBirakTC09() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");


        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.clear();
        extentTest.info("NameSurname Bos Birakildi");
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.contactNameSurnameHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation NameSurname negative testi yapildi");

    }

    @Test
    public void negativeTestContactPhoneBosBirakTC10() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");


        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        extentTest.info("ContactPhone textbox Bos Birakildi");
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.contactPhoneHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation ContactPhone negative testi yapildi");
        //bitti
    }

    @Test
    public void negativeTestContactEmailBosBirakTC11() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        Select select1 = new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("28");
        Thread.sleep(3000);
        Select select2 = new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("3");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        us018_roomRezervationDetailsPage.detailsDateStart.clear();
        us018_roomRezervationDetailsPage.detailsDateStart.sendKeys("01/13/2021");
        us018_roomRezervationDetailsPage.detailsDateEnd.clear();
        us018_roomRezervationDetailsPage.detailsDateEnd.sendKeys("01/30/2021");
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.detailsAdultAmount.sendKeys(ConfigReader.getProperty("TAdultAmount"));
        us018_roomRezervationDetailsPage.detailsChildrenAmount.sendKeys(ConfigReader.getProperty("TChildrenAmount"));
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        extentTest.info("ContactEmail textbox Bos Birakildi");
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.contactEmailHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation ContactEmail negative testi yapildi");
        //bitti
    }





    @Test
    public void negativeTestPropertiesSaveTC16() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        WebElement tipDropdown=us018_roomRezervationDetailsPage.propertiesTipDropdown;
        Select select=new Select(tipDropdown);
        select.selectByIndex(0);
        us018_roomRezervationDetailsPage.propertiesCodeTextBox.sendKeys("12345");
        us018_roomRezervationDetailsPage.propertiesValueTextBox.sendKeys("yeni degisiklikler yapildi");
        Thread.sleep(3000);
        extentTest.info("Properties Save negative testi datalari girildi");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.propertiesSaveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(false);
        extentTest.pass("Room Rezervation Properties Save negative testi yapildi");


    }
    @Test
    public void negativeTestPropertiesSaveTC17() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        WebElement tipDropdown=us018_roomRezervationDetailsPage.propertiesTipDropdown;
        Select select=new Select(tipDropdown);
        select.selectByValue("23");
        us018_roomRezervationDetailsPage.propertiesCodeTextBox.clear();
        us018_roomRezervationDetailsPage.propertiesValueTextBox.sendKeys("yeni degisiklikler yapildi");
        Thread.sleep(3000);
        extentTest.info("Properties Save negative testi datalari girildi");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.propertiesSaveButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.propertiesUpdateHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation properties Save negative testi yapildi");


    }
    @Test
    public void negativeTestPropertiesSaveTC18() throws InterruptedException {
        extentTest=extentReports.createTest("CRYSTALKEY  ROOM REVERZATION DETAILS", "rezervasyon duzenlenebilmeli");

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        WebElement tipDropdown=us018_roomRezervationDetailsPage.propertiesTipDropdown;
        Select select=new Select(tipDropdown);
        select.selectByValue("23");
        us018_roomRezervationDetailsPage.propertiesCodeTextBox.sendKeys("12345");
        us018_roomRezervationDetailsPage.propertiesValueTextBox.clear();
        Thread.sleep(3000);
        extentTest.info("Properties Save negative testi datalari girildi");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.propertiesSaveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.propertiesUpdateHataMesaji.isDisplayed());
        extentTest.pass("Room Rezervation properties Save negative testi yapildi");


    }











}


    @Test
    public void negativeTestPropertiesSaveTC16() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        WebElement tipDropdown=us018_roomRezervationDetailsPage.propertiesTipDropdown;
        Select select=new Select(tipDropdown);
        select.selectByIndex(0);
        us018_roomRezervationDetailsPage.propertiesCodeTextBox.sendKeys("12345");
        us018_roomRezervationDetailsPage.propertiesValueTextBox.sendKeys("yeni degisiklikler yapildi");
        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.propertiesSaveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.propertiesUpdateHataMesaji.isDisplayed());

    }
    @Test
    public void negativeTestPropertiesSaveTC17() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        WebElement tipDropdown=us018_roomRezervationDetailsPage.propertiesTipDropdown;
        Select select=new Select(tipDropdown);
        select.selectByValue("23");
        us018_roomRezervationDetailsPage.propertiesCodeTextBox.clear();
        us018_roomRezervationDetailsPage.propertiesValueTextBox.sendKeys("yeni degisiklikler yapildi");
        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.propertiesSaveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.propertiesUpdateHataMesaji.isDisplayed());

    }
    @Test
    public void negativeTestPropertiesSaveTC18() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        WebElement tipDropdown=us018_roomRezervationDetailsPage.propertiesTipDropdown;
        Select select=new Select(tipDropdown);
        select.selectByValue("23");
        us018_roomRezervationDetailsPage.propertiesCodeTextBox.sendKeys("12345");
        us018_roomRezervationDetailsPage.propertiesValueTextBox.clear();
        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.propertiesSaveButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.propertiesUpdateHataMesaji.isDisplayed());

    }
    @Test
    public void pozitiveTestPropertiesDeleteTC19() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage = new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.propertiesButton.click();
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        us018_roomRezervationDetailsPage.propertiesDeleteButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(us018_roomRezervationDetailsPage.propertiesUpdateHataMesaji.isDisplayed());



    }












}
