package com.redbus.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(id = "src")
    WebElement fromCity;

    @FindBy(id = "dest")
    WebElement toCity;
    
    @FindBy(id = "onward_cal")
    WebElement dateField;

    @FindBy(xpath = "//*[@id=\"search_butn\"]")
    WebElement searchButton;
    

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFromCity(String city){
        fromCity.sendKeys(city);
    }

    public void enterToCity(String city){
        toCity.sendKeys(city);
    }
    
    public void openDatePicker() {
        dateField.click();
    }
    
    public void selectDate(String date) {
        
        driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
    }

    public void clickSearch(){
        searchButton.click();
    }
}
