package com.aua.testinghw;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;  



public class ShutterStockSearchPageTest extends BaseTest
{

    @Test
    public void WebDriverTest(){
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.className("mui-1pucve2-select"));

    }
}
