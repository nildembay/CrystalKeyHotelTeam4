package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CrystalHotelSignIn;
import pages.US018_RoomRezervationDetailsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US018_RoomRezervationDetailsPozitiveTest {
    @BeforeMethod
    public void SignIn(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        us018_roomRezervationDetailsPage.ilkLogIn.click();
        us018_roomRezervationDetailsPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
        us018_roomRezervationDetailsPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
        us018_roomRezervationDetailsPage.loginButonu.click();
        us018_roomRezervationDetailsPage.hotelMenagementButton.click();
        us018_roomRezervationDetailsPage.roomRezervationsButton.click();
        us018_roomRezervationDetailsPage.detailsButton.click();
    }

    @Test
    public void pozitiveDetails() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        Select select1=new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("16");
        Thread.sleep(3000);
        Select select2=new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("2");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
       //buraya actions yazilacak
        us018_roomRezervationDetailsPage.detailsDateStart.click();
        us018_roomRezervationDetailsPage.detailsDateStartSelect.click();
        us018_roomRezervationDetailsPage.detailsDateEnd.click();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.detailsDateEndSelect.click();
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






    }


}
