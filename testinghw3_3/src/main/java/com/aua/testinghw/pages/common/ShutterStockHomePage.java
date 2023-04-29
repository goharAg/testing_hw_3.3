package com.aua.testinghw.pages.common;

import com.aua.testinghw.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static main.java.com.aua.testinghw.constants.locators.ShutterStockHomePageConstants.*;

public class ShutterStockHomePage extends BasePage {
    
    WebDriver driver;
    private By searchButtonXpath = By.xpath(SEARCH_BUTTON);
    private By searchBarXPath = By.xpath(SEARCH_BAR);

    public ShutterStockHomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
	}

    public void enterSearchText(String text){
        getElement(searchBarXPath).sendKeys(text);
    }

    public ShutterStockSearchPage clickSearch() {

        WebElement searchButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(searchButtonXpath));

        searchButton.click();
        return new ShutterStockSearchPage(driver);
    }
    

}
