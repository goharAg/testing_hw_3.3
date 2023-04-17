package test.java.com.aua.testinghw.base;

import main.java.com.aua.testinghw.pages.*;;

public class BaseTest {
    public static WebDriver driver;
    public static String baseUrl = "https://www.shutterstock.com/";
    public static ShutterStockHomePage homePage;
    
    @BeforeClass
    public static void initWebDriver(){
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
        
    }

    @BeforeMethod
    public static void goHome(){
        driver.manage().window().maximize();

        homePage = new ShutterStockHomePage(driver);
        driver.get(baseUrl);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
