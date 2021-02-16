package com.accessHq.pages;

import com.accessHq.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPages extends TestBase {

    @FindBy(xpath = "//a[@aria-label='submit']")
    private WebElement submitBtn;

    public void clickOnSubmitBtn(){
        submitBtn.click();
    }

    public boolean displayErrorMessage(String error){
        WebElement element = Driver.getDriver().findElement(By.id(error+"-err"));
        return element.isDisplayed();
    }


}
