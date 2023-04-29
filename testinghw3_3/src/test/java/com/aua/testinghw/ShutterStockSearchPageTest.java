package com.aua.testinghw;

import com.aua.testinghw.base.BaseTest;
import com.aua.testinghw.pages.common.ShutterStockSearchPage;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ShutterStockSearchPageTest extends BaseTest
{
    ShutterStockSearchPage searchPage;

    @Test
    public void searchTextTest(){

        System.out.println("HERE");
        homePage.enterSearchText("flower");
        searchPage = homePage.clickSearch();
        assertTrue(searchPage.getHeader().contains("Flowers"));
    }

}
