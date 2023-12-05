package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1.	Create the class ElectronicsTest Write the following test
 * 1.	Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 * 1.1	Mouse Hover on “Electronics” Tab
 * 1.2	Mouse Hover on “Cell phones” and click
 * 1.3	Verify the text “Cell phones”
 * 2.	Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 * 2.1	Mouse Hover on “Electronics” Tab
 * 2.2	Mouse Hover on “Cell phones” and click
 * 2.3	Verify the text “Cell phones”
 * 2.4	Click on List View Tab
 * 2.5	Click on product name “Nokia Lumia 1020” link
 * 2.6	Verify the text “Nokia Lumia 1020”
 * 2.7	Verify the price “$349.00”
 * 2.8	Change quantity to 2
 * 2.9	Click on “ADD TO CART” tab
 * 2.10	Verify the Message "The product has been added to your shopping cart" on Top green Bar
 * After that close the bar clicking on the cross button.
 * 2.11	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.12	Verify the message "Shopping cart"
 * 2.13	Verify the quantity is 2
 * 2.14	Verify the Total $698.00
 * 2.15	click on checkbox “I agree with the terms of service”
 * 2.16	Click on “CHECKOUT”
 * 2.17	Verify the Text “Welcome, Please Sign In!”
 * 2.18	Click on “REGISTER” tab
 * 2.19	Verify the text “Register”
 * 2.20	Fill the mandatory fields
 * 2.21	Click on “REGISTER” Button
 * 2.22	Verify the message “Your registration completed”
 * 2.23	Click on “CONTINUE” tab
 * 2.24	Verify the text “Shopping card”
 * 2.25	click on checkbox “I agree with the terms of service”
 * 2.26	Click on “CHECKOUT”
 * 2.27	Fill the Mandatory fields
 * 2.28	Click on “CONTINUE”
 * 2.29	Click on Radio Button “2nd Day Air ($0.00)”
 * 2.30	Click on “CONTINUE”
 * 2.31	Select Radio Button “Credit Card”
 * 2.32	Select “Visa” From Select credit card dropdown
 * 2.33	Fill all the details
 * 2.34	Click on “CONTINUE”
 * 2.35	Verify “Payment Method” is “Credit Card”
 * 2.36	Verify “Shipping Method” is “2nd Day Air”
 * 2.37	Verify Total is “$698.00”
 * 2.38	Click on “CONFIRM”
 * 2.39	Verify the Text “Thank You”
 * 2.40	Verify the message “Your order has been successfully processed!”
 * 2.41	Click on “CONTINUE”
 * 2.42	Verify the text “Welcome to our store”
 * 2.43	Click on “Logout” link
 * 2.44	Verify the URL is “https://demo.nopcommerce.com/”
 */

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    NokiaLumiaCheckOutPage nokiaLumiaCheckOutPage = new NokiaLumiaCheckOutPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    RegisterPage registerPage = new RegisterPage();
    RegisterCompletionPage registerCompletionPage = new RegisterCompletionPage();
    OrderCompletionPage orderCompletionPage = new OrderCompletionPage();
    LoginLinkPage loginLinkPage = new LoginLinkPage();

    @Test
    //* 1.	    Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //* 1.1	Mouse Hover on “Electronics” Tab
        homePage.mouseHoverAndClickOnElectronics();

        // * 1.2	Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverToCellPhones();

        // * 1.3	Verify the text “Cell phones”
        String actualText = cellPhonesPage.verifyCellPhonesText();
        String expectedText = "Cell phones";
        Assert.assertEquals(actualText, expectedText, "Incorrect Top Menu");
    }

    @Test
    // 2.	    Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // * 2.1	Mouse Hover on “Electronics” Tab
        homePage.mouseHoverAndClickOnElectronics();
        // * 2.2	Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverToCellPhones();
        // * 2.3	Verify the text “Cell phones”
        String actualText = cellPhonesPage.verifyCellPhonesText();
        String expectedText = "Cell phones";
        Assert.assertEquals(actualText, expectedText, "Incorrect Top Menu");

        // * 2.4	Click on List View Tab
        Thread.sleep(2000);
        cellPhonesPage.clickOnListIcon();

        // * 2.5	Click on product name “Nokia Lumia 1020” link
        Thread.sleep(2000);
        cellPhonesPage.nokiaLumia1020Link();

        // * 2.6	Verify the text “Nokia Lumia 1020”
        String actualProductName = nokiaLumia1020Page.getTextForNokiaLumia1020();
        String expectedProductName = "Nokia Lumia 1020";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect Product displayed!");

        // * 2.7	Verify the price “$349.00”
        String actualPrice = nokiaLumia1020Page.getPriceForNokiaLumia1020();
        String expectedPrice = "$349.00";
        Assert.assertEquals(actualPrice, expectedPrice, "Incorrect Price Displayed!");

        // * 2.8	Change quantity to 2
        nokiaLumia1020Page.updateQuantity();

        // * 2.9	Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickOnAddToCart();

        // * 2.10	Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualMessage = nokiaLumia1020Page.shoppingCartMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect Message displayed!");

        // * After that close the bar clicking on the cross button.
        nokiaLumia1020Page.crossBarCheck();

        //2.11	Then MouseHover on "Shopping cart"
        Thread.sleep(2000);
        nokiaLumia1020Page.checkShoppingCart();

        //and Click on "GO TO CART" button.
        Thread.sleep(2000);
        nokiaLumia1020Page.mouseHoverOnGoToCartButton();

        // * 2.12	Verify the message "Shopping cart"
        Thread.sleep(2000);
        String actualCartMessage = shoppingCartPage.verifyShoppingCartTitle();
        String expectedCartMessage = "Shopping cart";
        Assert.assertEquals(actualCartMessage, expectedCartMessage, "Incorrect message displayed!");

        // * 2.13	Verify the quantity is 2
        Thread.sleep(2000);
        String actualQuantity = shoppingCartPage.verifyTheQuantityIsTwo();
        String expectedQuantity = "(2)";
        Assert.assertEquals(actualQuantity, expectedQuantity, "Incorrect Quantity displayed!");

        // * 2.14	Verify the Total $698.00
        Thread.sleep(2000);
        String actualTotalPrice = shoppingCartPage.getTotalPrice();
        String expectedTotalPrice = "$698.00";
        Assert.assertEquals(actualQuantity, expectedQuantity, "Incorrect Total Price displayed!");

        //2.15	click on checkbox “I agree with the terms of service”
        shoppingCartPage.termsAndConditionCheckBox();

        // * 2.16	Click on “CHECKOUT”
        shoppingCartPage.clickCheckOut();

        // * 2.17	Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeText = checkOutPage.welcomeMessagePage();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcomeText, expectedWelcomeText, "Incorrect welcome message displayed!");


        // * 2.18	Click on “REGISTER” tab
        checkOutPage.clickOnRegisterTab();

        // * 2.19	Verify the text “Register”
        String actualRegisterText = registerPage.getRegisterText();
        String expectedRegisterText = "Register";
        Assert.assertEquals(actualRegisterText, expectedRegisterText, "Incorrect Register text displayed!");

        // * 2.20	Fill the mandatory fields
        registerPage.enterFirstName("Robert");
        registerPage.enterLastName("Jackson");
        registerPage.enterDate("18");
        registerPage.enterMonth("December");
        registerPage.enterYear("1990");
        registerPage.enterEmail();
        registerPage.enterPassword("12345678");
        registerPage.enterConfirmPassword("12345678");

        // * 2.21	Click on “REGISTER” Button
        Thread.sleep(2000);
        registerPage.clickOnRegisterButton();

        // * 2.22	Verify the message “Register”
        Thread.sleep(2000);
        String actualRegistrationCompleted = registerPage.getRegisterText();
        String expectedRegistrationCompleted = "Register";
        Assert.assertEquals(actualRegistrationCompleted, expectedRegistrationCompleted, "Incorrect Registration message displayed!");

        // * 2.23	Click on “CONTINUE” tab
        registerCompletionPage.clickOnContinueTab();

        // * 2.24	Verify the text “Shopping cart”
        String actualShoppingCart = shoppingCartPage.verifyShoppingCartTitle();
        String expectedShoppingCart = "Shopping cart";
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart, "Incorrect shopping cart displayed!");

        //Click on login button
        loginLinkPage.clickOnLoginButton();

        //Verify the Text "Welcome, Please Sign In!"
        String actualWelcome = loginLinkPage.welcomeMessage();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome, expectedWelcome, "Incorrect welcome text displayed!");
        loginLinkPage.welcomeMessage();

        //Enter Email into the email field
        loginLinkPage.enterEmailAddress(RegisterPage.generatedEmail);

        //Enter Password into the password field
        loginLinkPage.enterPassword("12345678");

        //Click on Login button
        loginLinkPage.clickOnLogin();

        // * 2.25	click on checkbox “I agree with the terms of service”
        shoppingCartPage.termsAndConditionCheckBox();

        // * 2.26	Click on “CHECKOUT”
        shoppingCartPage.clickCheckOut();

        // * 2.27	Fill the Mandatory fields
        nokiaLumiaCheckOutPage.enterFirstName("John");
        nokiaLumiaCheckOutPage.enterLastName("Smith");
        nokiaLumiaCheckOutPage.enterEmail(RegisterPage.generatedEmail);
        nokiaLumiaCheckOutPage.selectCountryFromDropDown();
        nokiaLumiaCheckOutPage.enterCity("London");
        nokiaLumiaCheckOutPage.enterAddress("101 House");
        nokiaLumiaCheckOutPage.enterPostCode("GS1 2FG");
        nokiaLumiaCheckOutPage.enterPhoneNumber("02022039384");

        // * 2.28	Click on “CONTINUE”
        Thread.sleep(2000);
        nokiaLumiaCheckOutPage.clickOnContinue();

        // * 2.29	Click on Radio Button “2nd Day Air ($0.00)”
        nokiaLumiaCheckOutPage.clickOnRadioButtonSecondDayAir();

        // * 2.30	Click on “CONTINUE”
        Thread.sleep(2000);
        nokiaLumiaCheckOutPage.clickOnButtonContinueInShippingMethod();

        // * 2.31	Select Radio Button “Credit Card”
        nokiaLumiaCheckOutPage.clickOnRadioButtonOfCreditCard();
        nokiaLumiaCheckOutPage.clickOnButtonContinueFromPaymentMethod();

        // * 2.32	Select “Visa” From Select credit card dropdown
        nokiaLumiaCheckOutPage.selectVisaCard("Visa");

        // * 2.33	Fill all the details
        nokiaLumiaCheckOutPage.enterCardHolderName("Robert Jackson");
        nokiaLumiaCheckOutPage.enterCardNumber("0000 0000 0000 0000");
        nokiaLumiaCheckOutPage.clickOnExpiryOfMasterCard();
        nokiaLumiaCheckOutPage.enterExpiryOfTheMonth("10");
        nokiaLumiaCheckOutPage.enterExpiryOfTheYear("2026");
        nokiaLumiaCheckOutPage.enterSecurityCardCode("526");

        // * 2.34	Click on “CONTINUE”
        Thread.sleep(3000);
        nokiaLumiaCheckOutPage.clickOnPaymentContinueButton();

        // * 2.35	Verify “Payment Method” is “Credit Card”
        Thread.sleep(3000);
        String actualPaymentMethod = orderConfirmationPage.getTextOfPaymentVerification();
        String expectedPaymentMethod = "Payment Method: Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Incorrect message displayed!");

        // * 2.36	Verify “Shipping Method” is “2nd Day Air”
        Thread.sleep(3000);
        String actualShippingMethod = orderConfirmationPage.getTextOfShippingVerification();
        String expectedShippingMethod = "Shipping Method: 2nd Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Incorrect message displayed!");

        // * 2.37	Verify Total is “$698.00”
        Thread.sleep(3000);
        String actualPriceTotal = orderConfirmationPage.verifyNokiaLumiaTotalPrice();
        String expectedPriceTotal = "$698.00";
        Assert.assertEquals(actualPriceTotal, expectedPriceTotal, "Incorrect message displayed!");

        // * 2.38	Click on “CONFIRM”
        orderConfirmationPage.clickOnConfirmOrder();

        // * 2.39	Verify the Text “Thank You”
        Thread.sleep(3000);
        String actualThanksMessage = orderCompletionPage.verifyingThankYouText();
        String expectedThanksMessage = "Thank you";
        Assert.assertEquals(actualThanksMessage, expectedThanksMessage, "Incorrect message displayed!");

        // * 2.40	Verify the message “Your order has been successfully processed!”
        Thread.sleep(3000);
        String actualSuccessfulText = orderCompletionPage.verifyingSuccessfulOrderMessage();
        String expectedSuccessfulText = "Your order has been successfully processed!";
        Assert.assertEquals(actualSuccessfulText, expectedSuccessfulText, "Incorrect message displayed!");

        // * 2.41	Click on “CONTINUE”
        orderCompletionPage.clickOnContinueOrderCompletion();

        // * 2.42	Verify the text “Welcome to our store”
        Thread.sleep(3000);
        String actualWelcomeMessage = homePage.getTextFromWelcomeStore();
        String expectedWelcomeMessage = "Welcome to our store";
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Incorrect message displayed!");

        // * 2.43	Click on “Logout” link
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[normalize-space()='Log out']"));


        // * 2.44	Verify the URL is “https://demo.nopcommerce.com/”
        String actualCurrentUrl = getCurrentUrlForVerification();
        String expectedCurrentUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(actualCurrentUrl,expectedCurrentUrl, "Error message");
    }
}

