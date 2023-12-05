package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {
    // * 2.24	Click on Radio Button “Next Day Air($0.00)”
    By radioButton = By.id("shippingoption_1");

    public void shippingMethodOption() {
        clickOnElement(radioButton);
    }

    // * 2.25	Click on “CONTINUE”
    By clickOnContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void continueButton() {
        clickOnElement(clickOnContinueButton);
    }

}

