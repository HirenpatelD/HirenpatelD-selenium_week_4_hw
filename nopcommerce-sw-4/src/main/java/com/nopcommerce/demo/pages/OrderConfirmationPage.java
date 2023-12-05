package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends Utility {
    // * 2.30	Verify “Payment Method” is “Credit Card”
    By paymentVerification = By.xpath("//li[@class='payment-method']");

    public String getTextOfPaymentVerification() {
        return getTextFromElement(paymentVerification);
    }

    // * 2.32	Verify “Shipping Method” is “Next Day Air”
    By shippingVerification = By.xpath("//li[@class = 'shipping-method']");

    public String getTextOfShippingVerification() {
        return getTextFromElement(shippingVerification);
    }

    // * 2.33	Verify Total is “$2,950.00”
    By totalPriceVerification = By.xpath("//span[text() ='$2,950.00']");

    public String verifyTotalPrice() {
        return getTextFromElement(totalPriceVerification);
    }

    // * 2.34	Click on “CONFIRM”
    By confirmTheOrder = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void clickOnConfirmOrder(){
        clickOnElement(confirmTheOrder);
    }
    // * 2.37	Verify Total is “$698.00” Nokia Lumia
    By totalPriceNokiaLumia = By.xpath("//span[text() ='$698.00']");

    public String verifyNokiaLumiaTotalPrice() {
        return getTextFromElement(totalPriceNokiaLumia);
    }
}

