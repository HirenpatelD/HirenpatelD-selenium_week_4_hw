package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    // * 2.20	Verify the Text “Welcome, Please Sign In!”
    By welcomeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");

    public String welcomeMessagePage() {
        return getTextFromElement(welcomeMessage);
    }

    // * 2.21   Click on “CHECKOUT AS GUEST” Tab
    By guestTab = By.xpath("//button[normalize-space()='Checkout as Guest']");

    public void clickAsGuestTab() {
        clickOnElement(guestTab);
    }

    // * 2.22	Fill the all mandatory field
    By firstNameField = By.id("BillingNewAddress_FirstName");

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    By lastNameField = By.id("BillingNewAddress_LastName");

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    By emailField = By.name("BillingNewAddress.Email");

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    By countryField = By.id("BillingNewAddress_CountryId");

    public void enterCountry(String country) {
        selectByValueFromDropDown(countryField, country);
    }

    By cityField = By.id("BillingNewAddress_City");

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    By addressFiled = By.name("BillingNewAddress.Address1");

    public void enterAddress(String address) {
        sendTextToElement(addressFiled, address);
    }

    By postCodeField = By.id("BillingNewAddress_ZipPostalCode");

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeField, postcode);
    }

    By telephoneField = By.id("BillingNewAddress_PhoneNumber");

    public void enterTelephone(String telephoneNumber) {
        sendTextToElement(telephoneField, telephoneNumber);
    }

    // * 2.23	Click on “CONTINUE”
    //By clickOnContinue = By.id("shippingoption_1");
    By clickOnContinue = By.xpath("//button[@onclick='Billing.save()']");

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }
    //******************************************************************************************************************
    // * 2.18	Click on “REGISTER” tab
    By registerTab = By.xpath("//button[@class = 'button-1 register-button']");
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }
}
