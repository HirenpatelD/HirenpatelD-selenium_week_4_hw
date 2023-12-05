package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
/**
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphabeticalOrder()
 * 1.1	Click on Computer Menu.
 * 1.2	Click on Desktop
 * 1.3	Select Sort By position "Name: Z to A"
 * 1.4	Verify the Product will arrange in Descending order.
 * 2.	Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1	Click on Computer Menu.
 * 2.2	Click on Desktop
 * 2.3	Select Sort By position "Name: A to Z"
 * 2.4	Click on "Add To Cart"
 * 2.5	Verify the Text "Build your own computer"
 * 2.6	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 * 2.7.Select "8GB [+$60.00]" using Select class.
 * 2.8	Select HDD radio "400 GB [+$100.00]"
 * 2.9	Select OS radio "Vista Premium [+$60.00]"
 * 2.10	Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
 * [+$5.00]"
 * 2.11	Verify the price "$1,475.00"
 * 2.12	Click on "ADD TO CARD" Button.
 * 2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar
 * After that close the bar clicking on the cross button.
 * 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.15	Verify the message "Shopping cart"
 * 2.16	Change the Qty to "2" and Click on "Update shopping cart"
 * 2.17	Verify the Total"$2,950.00"
 * 2.18	click on checkbox “I agree with the terms of service”
 * 2.19	Click on “CHECKOUT”
 * 2.20	Verify the Text “Welcome, Please Sign In!”
 * 2.21Click on “CHECKOUT AS GUEST” Tab
 * 2.22	Fill the all mandatory field
 * 2.23	Click on “CONTINUE”
 * 2.24	Click on Radio Button “Next Day Air($0.00)”
 * 2.25	Click on “CONTINUE”
 * 2.26	Select Radio Button “Credit Card”
 * 2.27	Select “Master card” From Select credit card dropdown
 * 2.28	Fill all the details
 * 2.29	Click on “CONTINUE”
 * 2.30	Verify “Payment Method” is “Credit Card”
 * 2.32	Verify “Shipping Method” is “Next Day Air”
 * 2.33	Verify Total is “$2,950.00”
 * 2.34	Click on “CONFIRM”
 * 2.35	Verify the Text “Thank You”
 * 2.36	Verify the message “Your order has been successfully processed!”
 * 2.37	Click on “CONTINUE”
 * 2.37 Verify the text “Welcome to our store”
 */

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentPage paymentPage = new PaymentPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    OrderCompletionPage orderCompletionPage = new OrderCompletionPage();

    @Test
    // * 1.Test name verifyProductArrangeInAlphabeticalOrder()
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        // * 1.1	Click on Computer Menu.
        homePage.mouseHoverAndClickOnComputers();
        // * 1.2	Click on Desktop
        computersPage.clickOnDesktop();
        // * 1.3	Select Sort By position "Name: Z to A"
        desktopPage.selectSortByPosition("6");
        // * 1.4	Verify the Product will arrange in Descending order.
        ArrayList<String> actualList = getArrayListFromWebElements(desktopPage.listOfProductsName());
        actualList.sort(String.CASE_INSENSITIVE_ORDER.reversed());// actual list in reverse order
        System.out.println("actual list: " + actualList);
        ArrayList<String> expectedList = getArrayListFromWebElements(desktopPage.listOfProductsName());

        expectedList.sort(String.CASE_INSENSITIVE_ORDER.reversed());//expected list in reverse order
        System.out.println("expected: " + expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in descending order");
    }

    @Test
    // * 2.	Test name verifyProductAddedToShoppingCartSuccessFully()
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // * 2.1	Click on Computer Menu.
        homePage.mouseHoverAndClickOnComputers();

        // * 2.2	Click on Desktop
        computersPage.clickOnDesktop();

        // * 2.3	Select Sort By position "Name: A to Z"
        desktopPage.selectSortByPosition("5");

        // * 2.4	Click on "Add To Cart"
        Thread.sleep(1000);
        desktopPage.addToCartClick();

        // * 2.5	Verify the Text "Build your own computer"
        Thread.sleep(1000);
        String actualText = buildYourOwnComputerPage.getMessageFromBuildYourOwnComputerPage();
        String expectedText = "Build your own computer";
        Assert.assertEquals(actualText, expectedText, "Incorrect message displayed!");


        // * 2.6	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");


        // * 2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");

        // * 2.8	Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectHdd();


        // * 2.9	Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectOs();


        // * 2.10	Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectSoftware();


        // * 2.11	Verify the price "$1,475.00"
        Thread.sleep(1000);
        String actualPrice = buildYourOwnComputerPage.checkTotalPrice();
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(actualPrice, expectedPrice, "Incorrect message displayed!");


        // * 2.12	Click on "ADD TO CARD" Button.
        Thread.sleep(1000);
        buildYourOwnComputerPage.addToCartLink();


        // * 2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(1000);
        String actualMessage = buildYourOwnComputerPage.shoppingCartMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect message displayed!");


        // * After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        buildYourOwnComputerPage.crossBarCheck();


        // * 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(1000);
        buildYourOwnComputerPage.checkShoppingCart();


        // * 2.15	Verify the message "Shopping cart"
        Thread.sleep(1000);
        String actualCartMessage = shoppingCartPage.verifyShoppingCartTitle();
        String expectedCartMessage = "Shopping cart";
        Assert.assertEquals(actualCartMessage, expectedCartMessage, "Incorrect message displayed!");


        // * 2.16	Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(1000);
        shoppingCartPage.quantityField();
        shoppingCartPage.updateCart();


        // * 2.17	Verify the Total"$2,950.00"
        Thread.sleep(1000);
        String actualTotalPrice = shoppingCartPage.getUpdatedPrice();
        String expectedTotalPrice = "$2,950.00";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Incorrect price displayed!");


        // * 2.18	click on checkbox “I agree with the terms of service”
        Thread.sleep(1000);
        shoppingCartPage.termsAndConditionCheckBox();

        // * 2.19	Click on “CHECKOUT”
        Thread.sleep(1000);
        shoppingCartPage.clickCheckOut();


        // * 2.20	Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        String actualWelcomeMessage = checkOutPage.welcomeMessagePage();
        String expectedWelcomeMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Incorrect message displayed!");


        // * 2.21   Click on “CHECKOUT AS GUEST” Tab
        Thread.sleep(1000);
        checkOutPage.clickAsGuestTab();


        // * 2.22	Fill the all mandatory field
        Thread.sleep(1000);
        checkOutPage.enterFirstName("Robert");
        checkOutPage.enterLastName("Jackson");
        checkOutPage.enterEmail("robert_jackson@gmail.conm");
        checkOutPage.enterCountry("233");
        checkOutPage.enterCity("London");
        checkOutPage.enterAddress("Harry Porter Road");
        checkOutPage.enterPostCode("HP4 2PH");
        checkOutPage.enterTelephone("07895645632");


        // * 2.23	Click on “CONTINUE”
        Thread.sleep(1000);
        checkOutPage.clickOnContinueButton();

        // * 2.24	Click on Radio Button “Next Day Air($0.00)”
        Thread.sleep(1000);
        shippingPage.shippingMethodOption();


        // * 2.25	Click on “CONTINUE”
        Thread.sleep(1000);
        shippingPage.continueButton();


        // * 2.26	Select Radio Button “Credit Card”
        paymentPage.creditCardButton();
        paymentPage.clickContinue();

        // * 2.27	Select “Master card” From Select credit card dropdown
        paymentPage.selectMasterCard("Master card");

        // * 2.28	Fill all the details
        paymentPage.enterCardHolderName("Robert Jackson");
        paymentPage.enterCardNumber("0000 0000 0000 0000");
        paymentPage.clickOnExpiryOfMasterCard();
        paymentPage.enterExpiryOfTheMonth("10");
        paymentPage.enterExpiryOfTheYear("2026");
        paymentPage.enterSecurityCardCode("526");

        // * 2.29	Click on “CONTINUE”
        Thread.sleep(3000);
        paymentPage.clickOnPaymentContinueButton();

        // * 2.30	Verify “Payment Method” is “Credit Card”
        Thread.sleep(3000);
        String actualPaymentMethod = orderConfirmationPage.getTextOfPaymentVerification();
        String expectedPaymentMethod = "Payment Method: Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Incorrect message displayed!");

        // * 2.32	Verify “Shipping Method” is “Next Day Air”
        Thread.sleep(3000);
        String actualShippingMethod = orderConfirmationPage.getTextOfShippingVerification();
        String expectedShippingMethod = "Shipping Method: Next Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Incorrect message displayed!");


        // * 2.33	Verify Total is “$2,950.00”
        Thread.sleep(3000);
        String actualPriceTotal = orderConfirmationPage.verifyTotalPrice();
        String expectedPriceTotal = "$2,950.00";
        Assert.assertEquals(actualPriceTotal, expectedPriceTotal, "Incorrect message displayed!");


        // * 2.34	Click on “CONFIRM”
        orderConfirmationPage.clickOnConfirmOrder();

        // * 2.35	Verify the Text “Thank You”
        Thread.sleep(3000);
        String actualThanksMessage = orderCompletionPage.verifyingThankYouText();
        String expectedThanksMessage = "Thank you";
        Assert.assertEquals(actualThanksMessage, expectedThanksMessage, "Incorrect message displayed!");


        // * 2.36	Verify the message “Your order has been successfully processed!”
        Thread.sleep(3000);
        String actualSuccessfulText = orderCompletionPage.verifyingSuccessfulOrderMessage();
        String expectedSuccessfulText = "Your order has been successfully processed!";
        Assert.assertEquals(actualSuccessfulText, expectedSuccessfulText, "Incorrect message displayed!");

        // * 2.37	Click on “CONTINUE”
        orderCompletionPage.clickOnContinueOrderCompletion();

        // * 2.37 Verify the text “Welcome to our store”
        Thread.sleep(3000);
        String actualWelcomeText = homePage.getTextFromWelcomeStore();
        String expectedWelcomeText = "Welcome to our store";
        Assert.assertEquals(actualWelcomeText, expectedWelcomeText, "Incorrect message displayed!");
    }
}

