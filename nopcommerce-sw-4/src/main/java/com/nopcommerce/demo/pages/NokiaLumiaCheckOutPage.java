package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaCheckOutPage extends Utility {
    // * 2.27	Fill the Mandatory fields
    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    public void enterFirstName(String firstName){
        clearTextField(firstNameField);
        sendTextToElement(firstNameField, firstName);
    }
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    public void enterLastName(String lastName){
        clearTextField(lastNameField);
        sendTextToElement(lastNameField, lastName);
    }
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    public void enterEmail(String email){
        clearTextField(emailField);
        sendTextToElement(emailField, email);
    }
    By countryList = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public void selectCountryFromDropDown() {
        selectByIndexFromDropDown(countryList, 2);
    }
    By cityBox = By.xpath("//input[@id='BillingNewAddress_City']");
    public void enterCity(String cityName){
        sendTextToElement(cityBox, cityName);
    }
    By address1Line= By.xpath("//input[@id='BillingNewAddress_Address1']");
    public void enterAddress(String address){
        sendTextToElement(address1Line,address );
    }
    By postalCodeBox = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    public void enterPostCode(String postcode){
        sendTextToElement(postalCodeBox, postcode);
    }
    By phoneNumberBox = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberBox, phoneNumber);
    }

    // * 2.28	Click on “CONTINUE”
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    // * 2.29	Click on Radio Button “2nd Day Air ($0.00)”
    By nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_2']");
    public void clickOnRadioButtonSecondDayAir(){
        clickOnElement(nextDayAirRadioButton);
    }
    // * 2.30	Click on “CONTINUE”
    By shippingMethodContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void clickOnButtonContinueInShippingMethod(){
        clickOnElement(shippingMethodContinueButton);
    }

    // * 2.31	Select Radio Button “Credit Card”
    By creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");
    public void clickOnRadioButtonOfCreditCard(){
        clickOnElement(creditCardRadioButton);
    }
    // click on continue button
    By clickContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public void clickOnButtonContinueFromPaymentMethod(){
        clickOnElement(clickContinueButton);
    }
    // * 2.32	Select “Visa” From Select credit card dropdown
    By selectVisaCardFromDropDown= By.xpath("//select[@id='CreditCardType']");
    public void selectVisaCard(String creditCard) {
        selectVisibleTextFromDropDown(selectVisaCardFromDropDown, creditCard);
    }
    // * 2.33	Fill all the details
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

    // * 2.34	Click on “CONTINUE”
    By clickOnPaymentContinue = By.cssSelector(".button-1.payment-info-next-step-button");

    public void clickOnPaymentContinueButton() {
        clickOnElement(clickOnPaymentContinue);
    }

}

