package com.aua.testinghw.pages.common;

import com.aua.testinghw.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.aua.testinghw.constants.locators.ShutterStockHomePageConstants.SEARCH_BAR;
import static com.aua.testinghw.constants.locators.ShutterStockHomePageConstants.SEARCH_BUTTON;

public class ShutterStockHomePage extends BasePage {
    
    WebDriver driver;
    private By searchButtonClass = By.className(SEARCH_BUTTON);
    private By searchBarClass = By.className(SEARCH_BAR);

    public ShutterStockHomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
	}

    public void enterSearchText(String text){
        getElement(searchBarClass).sendKeys(text);
    }

    public ShutterStockSearchPage clickSearch() {

        WebElement searchButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(searchButtonClass));

//        searchButton.click();
        searchButton.sendKeys(Keys.ENTER);
        return new ShutterStockSearchPage(driver);
    }
    

}
