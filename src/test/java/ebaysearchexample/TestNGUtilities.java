package ebaysearchexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGUtilities {

    WebDriver driver;
    @BeforeMethod
    public void initializeBrowser(){
        //Using Selenium's ChromeDriver to open Chrome web browser
        driver = new ChromeDriver();

        //optional: to maximize the browser window
        driver.manage().window().maximize();

        //providing the URL for the website to open
        driver.get("https://www.ebay.com");
    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
