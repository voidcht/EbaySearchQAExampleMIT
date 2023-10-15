package ebaysearchexample;

import org.openqa.selenium.WebDriver;

public class BaseUrl {

    WebDriver driver = null;

    public BaseUrl(WebDriver driver){
        this.driver = driver;
    }


    public void loadURL(){
        driver.get("https://www.ebay.com");
    }


}
