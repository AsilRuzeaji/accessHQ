package com.accessHq.pages;

import com.accessHq.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public TestBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void navigateTo(){
        String tabXpath = "//*[@id=\"app\"]/div[6]/nav/div/div[2]/a[4]";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(tabXpath))).click();
        System.out.println("Clicking on ");
    }
}
