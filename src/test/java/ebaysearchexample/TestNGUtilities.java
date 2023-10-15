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


    }


    @AfterMethod
    public void closeBrowser(){

        //closing the driver
//        driver.close();  //ChromeDriver was not still closed, was running in the background.

        driver.quit();
    }

}
