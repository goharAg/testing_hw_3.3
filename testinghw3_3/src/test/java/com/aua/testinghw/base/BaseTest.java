package com.aua.testinghw.base;

import com.aua.testinghw.pages.common.ShutterStockHomePage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import org.openqa.selenium.OutputType;
import static com.aua.testinghw.constants.urls.SUTurl.baseUrl;

public class BaseTest {
    public static WebDriver driver;
    public static ShutterStockHomePage homePage;
    
    @BeforeClass
    public void initWebDriver() throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//        driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(" http://localhost:4444"), chromeOptions);
    }

    @BeforeMethod
    public void goHome(){
        driver.manage().window().maximize();
        homePage = new ShutterStockHomePage(driver);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot.toPath(), new File("src/test/screenshots/" +  result.getName() + ".jpg").toPath());
        }catch(IOException e) {
            e.printStackTrace();
        }
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
