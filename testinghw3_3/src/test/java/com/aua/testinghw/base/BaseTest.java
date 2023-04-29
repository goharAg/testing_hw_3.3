package com.aua.testinghw.base;

import com.aua.testinghw.pages.common.ShutterStockHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.aua.testinghw.constants.urls.SUTurl.baseUrl;

public class BaseTest {
    public static WebDriver driver;
    public static ShutterStockHomePage homePage;
    
    @BeforeClass
    public void initWebDriver(){
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void goHome(){
        driver.manage().window().maximize();
        homePage = new ShutterStockHomePage(driver);
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
