package com.accessHq;

import com.accessHq.pages.ContactPages;
import org.junit.Assert;
import org.junit.Test;


public class ContactPage {

    ContactPages contactPages = new ContactPages();
    String foreNameErrorAttribute = "forename";
    String emailErrorAttribute = "email";
    String messageErrorAttribute = "message";


    @Test
    public void test1_mandatory_error_messages(){
        Driver.getDriver().get("https://d21ukcuahl9n1x.cloudfront.net");
        contactPages.navigateTo();
        contactPages.clickOnSubmitBtn();
        Assert.assertTrue(contactPages.displayErrorMessage(foreNameErrorAttribute));
        Assert.assertTrue(contactPages.displayErrorMessage(emailErrorAttribute));
        Assert.assertTrue(contactPages.displayErrorMessage(messageErrorAttribute));


    }




}
