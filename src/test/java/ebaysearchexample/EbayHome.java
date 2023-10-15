package ebaysearchexample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EbayHome {

    //to locate an element - Search Box & assigned to the web element
    @FindBy(xpath ="//input[@id='gh-ac']")
    public WebElement txtInputField;


    //to locate an element - Drop Down List
    @FindBy(xpath ="//select[@id='gh-cat']")
    public WebElement selectDropDown;

    //to locate an element - Search Button
    @FindBy(xpath ="//input[@id='gh-btn']")
    public WebElement btnSearch;




    public void typeOnInputField(String txtValue){
        txtInputField.sendKeys(txtValue);
    }


    public void selectByVisibleText(String selectTxt){
        new Select(selectDropDown).selectByVisibleText(selectTxt);
    }


    public void ClickSearchBtn(){
        btnSearch.click();
    }








}
