package com.aua.testinghw.pages.common;

import com.aua.testinghw.pages.base.BasePage;
import org.openqa.selenium.WebDriver;

public class ShutterStockPhotoViewPage extends BasePage {
        
    WebDriver driver;

    public ShutterStockPhotoViewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
