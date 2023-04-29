package main.java.com.aua.testinghw.pages;

import main.java.com.aua.testinghw.pages.common.BasePage;
import main.java.com.aua.testinghw.constants.locators.*;

public class ShutterStockSearchPage extends BasePage {
        
    WebDriver webDriver;
    private By tagNameHeader = By.tagName(TAG_NAME);
    private By firstElementXpath = By.xpath(FIRST_IMAGE_DIV);

    public ShutterStockSearchPage(WebDriver driver) {
		this.driver=driver;
	}

    public String getHeader(){
       return  driver.findElement(tagNameHeader);
    }

    public ShutterStockPhotoViewPage getPhoto(){
        this.driver.findElement(firstElementXpath).click();
        return new ShutterStockPhotoViewPage(driver);

    }
}
