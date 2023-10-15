package ebaysearchexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbaySearch {

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


    @Test
    public void searchMobilePhones() throws InterruptedException {

        //to identify the search element using xpath & to provide the text to input.
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobile Phones");

        //find the drop-down box
        //needs a web element for Select object
        Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));

        //Selecting the category
        select.selectByVisibleText("Cell Phones & Accessories");

        //find the search button and execute click method
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();


        //adding a delay
        Thread.sleep(2000);



    //ChromeDriver was not still closed, was running in the background.
       //closing the driver
//        driver.close();


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}