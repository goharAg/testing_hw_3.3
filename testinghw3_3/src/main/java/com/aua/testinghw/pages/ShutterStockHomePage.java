package com.aua.testinghw.pages;

import main.java.com.aua.testinghw.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static main.java.com.aua.testinghw.constants.locators.ShutterStockHomePageConstants.*;

public class ShutterStockHomePage extends BasePage {
    
    WebDriver driver;
    private By xpath = By.xpath(HOME_BUTTON);
    private By searchButtonXpath = By.xpath(SEARCH_BUTTON);
    private By searchBarXPath = By.xpath(SEARCH_BAR);

    public ShutterStockHomePage(WebDriver driver) {
		this.driver=driver;
	}

    public ShutterStockHomePage clickHomeButton(){
        driver.findElement(xpath).click();
        return this;
    }

    public void enterSearchText(String text){
        driver.findElement(searchBarXPath).sendKeys(text);
    }

    public ShutterStockSearchPage clickSearch() {
        driver.findElement(searchButtonXpath).click();
        return new ShutterStockSearchPage(driver);
    }
    

}
