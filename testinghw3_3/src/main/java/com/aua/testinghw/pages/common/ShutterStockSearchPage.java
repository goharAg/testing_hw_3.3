package com.aua.testinghw.pages.common;

import com.aua.testinghw.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.aua.testinghw.constants.locators.ShutterStockSearchPageLoactors.FIRST_IMAGE_DIV;
import static com.aua.testinghw.constants.locators.ShutterStockSearchPageLoactors.TAG_NAME;

public class ShutterStockSearchPage extends BasePage {
        
    WebDriver driver;
    private By tagNameHeader = By.tagName(TAG_NAME);
    private By firstElementClass = By.className(FIRST_IMAGE_DIV);

    public ShutterStockSearchPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
	}

    public String getHeader(){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(tagNameHeader));
        return  getElement(tagNameHeader).getAccessibleName();
    }

    public ShutterStockPhotoViewPage getPhoto(){
        getElement(firstElementClass).click();
        return new ShutterStockPhotoViewPage(driver);

    }
}
