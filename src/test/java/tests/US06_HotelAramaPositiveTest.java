package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US06_HotelAramaPositiveTest {

    US06_HotelAramaPositiveTest us06_hotelAramaPositiveTest = new US06_HotelAramaPositiveTest();
    @Test

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("p_url"));
        Driver.getDriver().findElement(By.linkText("Log in")).click();
        Driver.getDriver().findElement(By.id("UserName")).sendKeys(ConfigReader.getProperty("valid_user"));
        Driver.getDriver().findElement(By.id("Password")).sendKeys(ConfigReader.getProperty("valid_password"));
        Driver.getDriver().findElement(By.id("btnSubmit")).click();
        Driver.getDriver().findElement(By.xpath("//*[text()='Hotel Management']")).click();
        Driver.getDriver().findElement(By.xpath("(//i[@class='icon-calendar'])[2]")).click();

    }

    @Test
     public void HotelAramaIdGroupDropDown(){
        login();
        WebElement dropDown = Driver.getDriver().findElement(By.xpath("//select[@id='lkpGroups']"));
        Select select = new Select(dropDown);
        select.selectByValue("2");
        Driver.getDriver().findElement(By.className("btn btn-sm yellow filter-submit margin-bottom")).click();
    }

}
