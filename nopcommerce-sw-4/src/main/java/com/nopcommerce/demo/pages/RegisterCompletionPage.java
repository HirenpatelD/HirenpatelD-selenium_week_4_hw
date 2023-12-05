package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterCompletionPage extends Utility {
    // * 2.22	Verify the message “Your registration completed”
    By completedRegistration = By.className("result");
    public String successfulRegistrationMessage(){
        return getTextFromElement(completedRegistration);
    }

    // * 2.23	Click on “CONTINUE” tab
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
}

