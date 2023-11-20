package com.redbus.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.redbus.automation.HomePage;

public class BookingTest {
    WebDriver driver;
    HomePage homePage;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.redbus.com/");
        homePage = new HomePage(driver);
    }

    @Test
    public void testBusSearch() throws InterruptedException{
        homePage.enterFromCity("New York");
        Thread.sleep(5000);
        homePage.enterToCity("Boston");
        Thread.sleep(5000);
        homePage.openDatePicker();
        homePage.selectDate("20");
        homePage.clickSearch();

       
    }

    @AfterTest
    public void teardown() throws InterruptedException{
    	
        
    }
}
