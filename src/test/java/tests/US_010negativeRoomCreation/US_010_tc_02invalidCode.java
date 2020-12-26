package tests;

import pages.US_009AddHotelRoom;
import smokeTest.CrystalHotelSingInPositive;

public class US_010_tc_02invalidCode {
    public void roomCreationPage(){
        CrystalHotelSingInPositive login = new CrystalHotelSingInPositive();
        US_009AddHotelRoom page = new US_009AddHotelRoom();
        login.SignIn();
        page.management.click();
        page.rooms.click();
        page.addRoom.click();
    }

}
