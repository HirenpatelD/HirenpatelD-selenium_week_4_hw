package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class OrderCompletionPage extends Utility {
    // * 2.35	Verify the Text “Thank You”
    By verifyTheTextThankYou = By.xpath("//h1[text() = 'Thank you']");
    public String verifyingThankYouText(){
        return getTextFromElement(verifyTheTextThankYou);
    }

    // * 2.36	Verify the message “Your order has been successfully processed!”
    By verifySuccessfulMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public String verifyingSuccessfulOrderMessage(){
        return getTextFromElement(verifySuccessfulMessage);
    }

    // * 2.37	Click on “CONTINUE”
    By clickOnContinueButtonOnOrderPage = By.xpath("//button[@class = 'button-1 order-completed-continue-button']");
    public void clickOnContinueOrderCompletion(){
        clickOnElement(clickOnContinueButtonOnOrderPage);
    }
}

