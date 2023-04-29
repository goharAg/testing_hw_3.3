package com.aua.testinghw.pages;

import main.java.com.aua.testinghw.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static main.java.com.aua.testinghw.constants.locators.ShutterStockSearchPageLoactors.FIRST_IMAGE_DIV;
import static main.java.com.aua.testinghw.constants.locators.ShutterStockSearchPageLoactors.TAG_NAME;

public class ShutterStockSearchPage extends BasePage {
        
    WebDriver driver;
    private By tagNameHeader = By.tagName(TAG_NAME);
    private By firstElementXpath = By.xpath(FIRST_IMAGE_DIV);

    public ShutterStockSearchPage(WebDriver driver) {
		this.driver=driver;
	}

    public String getHeader(){
       return  driver.findElement(tagNameHeader).getTagName();
    }

    public ShutterStockPhotoViewPage getPhoto(){
        this.driver.findElement(firstElementXpath).click();
        return new ShutterStockPhotoViewPage(driver);

    }
}
