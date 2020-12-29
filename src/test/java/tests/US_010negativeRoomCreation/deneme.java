package tests.US_010negativeRoomCreation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US_009AddHotelRoom;
import smokeTest.CrystalHotelSingInPositive;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

class US_010RoomCreationNegatives extends TestBaseRapor {
    public void roomCreationPage(){
        CrystalHotelSingInPositive login = new CrystalHotelSingInPositive();
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        login.SignIn();
        page.management.click();
        page.rooms.click();
        page.addRoom.click();
    }
    @Test
    public void tc_01IDHotel() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative; IDHotel", "IDHotel dropdown menusunden secim yapilmadan oda eklenememeli");
        roomCreationPage();
        //IDHotel dropdown menusunden secim yapilmadi
        extentTest.info("IDHotel dropdown menusunden secim yapilmadi");
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+ Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.hataMesaji.isDisplayed());
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_02invalidCode() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative; invalid code", "gecersiz kod ile oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        //code gecersiz deger girildi
        extentTest.info("gecersiz kod girildi");
        page.code.sendKeys(ConfigReader.getProperty("us_10invalidCode"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.hataMesaji.isDisplayed(),"hata mesaji = "+page.hataMesaji.getText());
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_03name() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative; name", "name kutusu bosken oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        //name kutusu bos biralikdi
        extentTest.info("name kutusu bos birakildi");
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.hataMesaji.isDisplayed(),"name hata mesaji cikmiyor. Kod hatali.");
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_04location() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative; location", "location kutusu bosken oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name")+Keys.END);
        //location kutusu bos birakildi
        extentTest.info("location kutusu bos birakildi");
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.hataMesaji.isDisplayed(),"location hata mesaji cikmiyor. Kod hatali.");
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_05price() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative, invalid price", "gecersiz price ile oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        //price kutusuna gecersiz deger girildi
        extentTest.info("price kutusuna negatif deger girildi");
        page.price.sendKeys(ConfigReader.getProperty("us_10invalidPrice"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.onayMesaji.isDisplayed(),"invalid price'i kabul etti, kod hatali");
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_06roomType() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative; room type", "roomtype dropdown menusunden secim yapilmadan oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        //room type bos birakildi
        extentTest.info("room type dropdown menusunden secim yapilmadi");
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.hataMesaji.isDisplayed(),"room type hata mesaji cikmiyor. Kod hatali.");
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_07adultCount() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative, adult count", "gecersiz adult count ile oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        //max adult count kutusuna gecersiz deger girildi
        extentTest.info("max adult count kutusuna negatif deger girildi");
        page.adultCount.sendKeys(ConfigReader.getProperty("us_10invalidAdult"));
        page.childCount.sendKeys(ConfigReader.getProperty("us_9child"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.onayMesaji.isDisplayed(),"invalid adult count'i kabul etti, kod hatali");
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Test
    public void tc_08childCount() throws InterruptedException {
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("crystalkey hotel room creation negative, child count", "gecersiz child count ile oda eklenememeli");
        roomCreationPage();
        Select selectHotel=new Select(page.idHotel);
        selectHotel.selectByVisibleText(ConfigReader.getProperty("us_9hotel"));
        page.code.sendKeys(ConfigReader.getProperty("us_9code"));
        page.name.sendKeys(ConfigReader.getProperty("us_9name"));
        page.location.sendKeys(ConfigReader.getProperty("us_9location")+Keys.END);
        Thread.sleep(1000);
        page.price.sendKeys(ConfigReader.getProperty("us_9price"));
        Select selectRoomType=new Select(page.roomType);
        selectRoomType.selectByVisibleText(ConfigReader.getProperty("us_9roomType"));
        page.adultCount.sendKeys(ConfigReader.getProperty("us_9adult"));
        //max child count kutusuna gecersiz deger girildi
        extentTest.info("max child count kutusuna negatif deger girildi");
        page.childCount.sendKeys(ConfigReader.getProperty("us_10invalidChild"));
        page.saveButonu.click();
        Thread.sleep(1000);
        softAssert.assertTrue(page.onayMesaji.isDisplayed(),"invalid child count'i kabul etti, kod hatali");
        extentTest.pass("oda eklenmedi. Hata mesaji alindi =\""+page.hataMesaji.getText()+"\"");
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
