package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {
    // * 2.26	Select Radio Button “Credit Card”
    By creditCardRadioButton = By.id("paymentmethod_1");

    public void creditCardButton() {
        clickOnElement(creditCardRadioButton);
    }

    By clickOnContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void clickContinue() {
        clickOnElement(clickOnContinue);
    }

    // * 2.27	Select “Master card” From Select credit card dropdown
    By selectMasterCardFromDropDown = By.id("CreditCardType");

    public void selectMasterCard(String creditCard) {
        selectVisibleTextFromDropDown(selectMasterCardFromDropDown, creditCard);
    }

    // * 2.28	Fill all the details
    By cardHolderNameField = By.id("CardholderName");

    public void enterCardHolderName(String cardHolderName) {
        sendTextToElement(cardHolderNameField, cardHolderName);
    }

    By cardNumberField = By.id("CardNumber");

    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    By ExpireMonthField = By.id("ExpireMonth");

    public void clickOnExpiryOfMasterCard() {
        clickOnElement(expireMonthField);
    }

    By expireMonthField = By.id("ExpireMonth");

    public void enterExpiryOfTheMonth(String expiryMonth) {
        selectByValueFromDropDown(expireMonthField, expiryMonth);
    }

    By expireYearField = By.id("ExpireYear");

    public void enterExpiryOfTheYear(String expiryYear) {
        selectByValueFromDropDown(expireYearField, expiryYear);
    }

    By threeDigitCodeField = By.id("CardCode");

    public void enterSecurityCardCode(String cardCode) {
        sendTextToElement(threeDigitCodeField, cardCode);
    }

    // * 2.29	Click on “CONTINUE”
    // By clickOnPaymentContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By clickOnPaymentContinue = By.cssSelector(".button-1.payment-info-next-step-button");

    public void clickOnPaymentContinueButton() {
        clickOnElement(clickOnPaymentContinue);
    }
}

