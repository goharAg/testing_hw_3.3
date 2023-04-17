package com.aua.testinghw;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;

import main.java.com.aua.testinghw.pages.ShutterStockSearchPage;  



public class ShutterStockSearchPageTest extends BaseTest
{
    ShutterStockSearchPage searchPage;

    @Test
    public void searchTextTest(){
        homePage.enterSearchText("flower");
        searchPage = homePage.clickSearch();
        assertTrue(searchPage.getHeader().contains("Flowers"));
    }

   
}
