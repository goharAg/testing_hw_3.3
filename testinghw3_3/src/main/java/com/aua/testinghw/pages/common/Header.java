package com.aua.testinghw.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static main.java.com.aua.testinghw.constants.locators.ShutterStockHomePageConstants.HOME_BUTTON;

public class Header {

    WebDriver driver;
    private By shutterStockIconXpath = By.xpath(HOME_BUTTON);

    public Header(WebDriver driver) {this.driver= driver;}
    public ShutterStockHomePage clickHomeButton(){
        driver.findElement(shutterStockIconXpath).click();
        return new ShutterStockHomePage(driver);
    }
}
