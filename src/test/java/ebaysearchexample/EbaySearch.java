package ebaysearchexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class EbaySearch extends TestNGUtilities{

    @Test
    public void searchMobilePhones() throws InterruptedException {

        //providing the URL for the website to open
        BaseUrl baseUrl = new BaseUrl(driver);
        EbayHome home = baseUrl.loadURL();

        Thread.sleep(1000);
        home.typeOnInputField("Mobile Phones");
        Thread.sleep(2000);

        home.selectByVisibleText("Cell Phones & Accessories");
        home.ClickSearchBtn();





        //deprecated since using PageObject Model (EbayHome class)

//        //to identify the search element using xpath & to provide the text to input.
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobile Phones");
//
//        //find the drop-down box
//        //needs a web element for Select object
//        Select select = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
//
//        //Selecting the category
//        select.selectByVisibleText("Cell Phones & Accessories");
//
//        //find the search button and execute click method
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();


        //adding a delay
        Thread.sleep(2000);






    }

}
