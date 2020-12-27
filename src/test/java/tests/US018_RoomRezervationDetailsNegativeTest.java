package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US018_RoomRezervationDetailsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US018_RoomRezervationDetailsNegativeTest {
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
    public void negativeTestDropDownSecimsizTC02() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();

        Thread.sleep(3000);
        Select select2=new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("2");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        //Buraya actions lazim
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
        Assert.assertTrue(us018_roomRezervationDetailsPage.detailsHotelRoomHataMesaji.isDisplayed());
         // bu bitti
    }
    @Test
    public void negativeTestUserDropDownSecimsizTC03() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();

        Select select1=new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("16");
        Thread.sleep(3000);


        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        //buraya actions ekle
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
        Assert.assertTrue(us018_roomRezervationDetailsPage.detailsUserHataMesaji.isDisplayed());
        //bitti

    }

    @Test
    public void negativeTestPricetextBoxBosTC04() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();

        Select select1=new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("16");
        Thread.sleep(3000);
        Select select2=new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("2");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        //buraya actions
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
        Assert.assertTrue(us018_roomRezervationDetailsPage.priceHataMesaji.isDisplayed());
        //bitti

    }
    @Test
    public void negativeTestDateStartGecmisGunTC05() throws InterruptedException {
        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        Select select1=new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("16");
        Thread.sleep(3000);
        Select select2=new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("2");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        //buraya actions
        us018_roomRezervationDetailsPage.detailsDateStart.click();
        us018_roomRezervationDetailsPage.detailsOldDateSelect.click();
        us018_roomRezervationDetailsPage.detailsDateEnd.click();
        us018_roomRezervationDetailsPage.detailsDateEndSelect.click();
        Thread.sleep(3000);
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
        Assert.assertTrue(us018_roomRezervationDetailsPage.detailsPriceHataMesaji.isDisplayed()); //"eski tarih secmemalisiniz" mesaji yok
        System.out.println("Son calisma");
        //bitti
    }

    @Test
    public void negativeTestDateEndGecmisGunTC06() throws InterruptedException {
    US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
    Select select1=new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("16");
        Thread.sleep(3000);
    Select select2=new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("2");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        //buraya actions
        us018_roomRezervationDetailsPage.detailsDateStart.click();
        us018_roomRezervationDetailsPage.detailsDateStartSelect.click();
        us018_roomRezervationDetailsPage.detailsDateEnd.click();
        us018_roomRezervationDetailsPage.detailsOldDateSelect.click();
        Thread.sleep(3000);
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
        Assert.assertTrue(us018_roomRezervationDetailsPage.detailsPriceHataMesaji.isDisplayed()); //"eski tarih secmemalisiniz" mesaji yok


    }
    @Test
    public void negativeTestAdultAmountBosBirakTC07() throws InterruptedException {

        US018_RoomRezervationDetailsPage us018_roomRezervationDetailsPage=new US018_RoomRezervationDetailsPage();
        Select select1=new Select(us018_roomRezervationDetailsPage.detailsHotelRoomDropDown);
        select1.selectByValue("16");
        Thread.sleep(3000);
        Select select2=new Select(us018_roomRezervationDetailsPage.detailsUserDropDown);
        select2.selectByValue("2");
        us018_roomRezervationDetailsPage.detailsPrice.clear();
        us018_roomRezervationDetailsPage.detailsPrice.sendKeys(ConfigReader.getProperty("Tvalid_price"));
        //buraya actions
        us018_roomRezervationDetailsPage.detailsDateStart.click();
        us018_roomRezervationDetailsPage.detailsDateStartSelect.click();
        us018_roomRezervationDetailsPage.detailsDateEnd.click();
        Thread.sleep(3000);
        us018_roomRezervationDetailsPage.detailsDateEndSelect.click();
        us018_roomRezervationDetailsPage.detailsAdultAmount.clear();
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
        //bitti

    }
    @Test
    public void negativeTestChildrenAmountBosBirakTC08() throws InterruptedException {
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
        us018_roomRezervationDetailsPage.detailsChildrenAmount.clear();
        us018_roomRezervationDetailsPage.detailsContactNameSurname.sendKeys(ConfigReader.getProperty("TContactNameSurname"));
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.childrenAmountHataMesaji.isDisplayed());
        //bitti


    }
    @Test
    public void negativeTestContactNameSurnameBosBirakTC09() throws InterruptedException {

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
        us018_roomRezervationDetailsPage.detailsContactNameSurname.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.clear();
        us018_roomRezervationDetailsPage.detailsContactPhone.sendKeys(ConfigReader.getProperty("TContactPhone"));
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.contactNameSurnameHataMesaji.isDisplayed());

    }
    @Test
    public void negativeTestContactPhoneBosBirakTC10() throws InterruptedException {

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
        us018_roomRezervationDetailsPage.detailsContactEmail.clear();
        us018_roomRezervationDetailsPage.detailsContactEmail.sendKeys(ConfigReader.getProperty("TContactEmail"));
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.contactPhoneHataMesaji.isDisplayed());
        //bitti
    }

    @Test
    public void negativeTestContactEmailBosBirakTC11() throws InterruptedException {
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
        us018_roomRezervationDetailsPage.detailsNotes.clear();
        us018_roomRezervationDetailsPage.detailsNotes.sendKeys(ConfigReader.getProperty("Tnotes"));
        us018_roomRezervationDetailsPage.detailsSaveButton.click();
        Assert.assertTrue(us018_roomRezervationDetailsPage.contactEmailHataMesaji.isDisplayed());
        //bitti
    }

}


