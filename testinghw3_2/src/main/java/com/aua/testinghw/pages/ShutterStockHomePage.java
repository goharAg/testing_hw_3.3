import main.java.com.aua.testinghw.pages.ShutterStockSearchPage;
import main.java.com.aua.testinghw.constants.locators.*;
import main.java.com.aua.testinghw.pages.common.BasePage;
import org.openqa.selenium.WebDriver;

public class ShutterStockHomePage extends BasePage {
    
    WebDriver webDriver;
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
        driver.findElement(searchBarXPath).sendKey(text);
    }

    public ShutterStockSearchPage clickSearch() {
        driver.findElement(searchButtonXpath).click();
        return new ShutterStockSearchPage(dirver);
    }
    

}
