package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_15roomrezervation;
import smokeTest.CrystalHotelSingInPositive;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_15positiveRoomrezervation extends TestBaseRapor{

    public void loginpage(){
        CrystalHotelSingInPositive login = new CrystalHotelSingInPositive();

        US_15roomrezervation page = new US_15roomrezervation();

        login.SignIn();
        page.management.click();
        page.Room_reservations.click();
        page.Add_Room_Reservation.click();

    }
        @Test
        public void pozitive_rezervation() throws InterruptedException {

            US_15roomrezervation page = new US_15roomrezervation();

        loginpage();
        extentTest=extentReports.createTest("Rezervasyon oluşturma Pozitiv Test","Geçerli değerler ile rezervasyon  oluşturulabilmeli");
            Select Usermenu=new Select(page.id_User);
            Usermenu.selectByVisibleText(ConfigReader.getProperty("fo_user"));
            Select HotelSelect=new Select((page.IDHotelRoom));
            HotelSelect.selectByVisibleText(ConfigReader.getProperty("fo_hotel"));
            page.Price.sendKeys(ConfigReader.getProperty("fo_price"));
            page.DateStar.sendKeys(ConfigReader.getProperty("fo_datestart"));
            page.DateEnd.sendKeys(ConfigReader.getProperty("fo_dateend"));
            page.AdultAmount.sendKeys(ConfigReader.getProperty("fo_adult"));
            page.ChildrenAmount.sendKeys(ConfigReader.getProperty("fo_child"));
            page.ContactNameSurname.sendKeys(ConfigReader.getProperty("fo_contactname"));
            Thread.sleep(1000);

            page.ContactPhone.sendKeys(Keys.HOME+ConfigReader.getProperty("fo_contactno"));
            page.ContactEmail.sendKeys(ConfigReader.getProperty("fo_contackmail"));
            page.Notes.sendKeys(ConfigReader.getProperty("fo_notes"));

            extentTest.info("bilgiler girildi");
            page.save.click();
            Thread.sleep(1000);
            Assert.assertTrue(page.bildirim.getText().contains(ConfigReader.getProperty("fo_bildirim")));
            extentTest.pass("Oda rezervasyonu yapıldı");
            Driver.closeDriver();





        }

















}



























































