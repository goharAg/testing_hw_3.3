package com.aua.testinghw.pages.common;

import com.aua.testinghw.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static main.java.com.aua.testinghw.constants.locators.ShutterStockSearchPageLoactors.FIRST_IMAGE_DIV;
import static main.java.com.aua.testinghw.constants.locators.ShutterStockSearchPageLoactors.TAG_NAME;

public class ShutterStockSearchPage extends BasePage {
        
    WebDriver driver;
    private By tagNameHeader = By.tagName(TAG_NAME);
    private By firstElementXpath = By.xpath(FIRST_IMAGE_DIV);

    public ShutterStockSearchPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
	}

    public String getHeader(){
       return  getElement(tagNameHeader).getAccessibleName();
    }

    public ShutterStockPhotoViewPage getPhoto(){
        getElement(firstElementXpath).click();
        return new ShutterStockPhotoViewPage(driver);

    }
}
