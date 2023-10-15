package ebaysearchexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseUrl {

    WebDriver driver = null;

    public BaseUrl(WebDriver driver){
        this.driver = driver;
    }


    public EbayHome loadURL(){

        driver.get("https://www.ebay.com");

        return PageFactory.initElements(driver,EbayHome.class);
    }


}
