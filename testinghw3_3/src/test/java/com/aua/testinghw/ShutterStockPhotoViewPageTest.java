package com.aua.testinghw;

import com.aua.testinghw.base.BaseTest;
import com.aua.testinghw.pages.common.ShutterStockPhotoViewPage;
import com.aua.testinghw.pages.common.ShutterStockSearchPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ShutterStockPhotoViewPageTest extends BaseTest {
    ShutterStockSearchPage searchPage;
    ShutterStockPhotoViewPage photoViewPage;

    @Test
    public void openViewPageFromHome(){
        homePage.enterSearchText("flower");
        searchPage = homePage.clickSearch();
        photoViewPage = searchPage.getPhoto();
        // TO be continued ... :)
    }

}
