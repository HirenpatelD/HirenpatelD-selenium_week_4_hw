package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    //1. userShouldAddProductSuccessFullyToShoppingCart()
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // * *	Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.mouseHoverToGearMenuList();

        // * *	Click on Bags
        homePage.clickOnBags();

        // * *	Click on Product Name ‘Overnight Duffle’
        bagsPage.mouseHoverOnOverNightDuffleProductName();

        // * *	Verify the text ‘Overnight Duffle’
        Thread.sleep(2000);
        String actualProductName = overnightDufflePage.verifyOvernightDuffleTextOnPage();
        String expectedProductName = "Overnight Duffle";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect Product Name displayed!");

        // * *	Change Qty 3
        Thread.sleep(2000);
        overnightDufflePage.clearQuantityField();

        Thread.sleep(2000);
        overnightDufflePage.changeQuantityNumber("3");

        // * *	Click on ‘Add to Cart’ Button.
        Thread.sleep(2000);
        overnightDufflePage.clickOnAddToCart();

        // * *	Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualText = overnightDufflePage.verifyItemsAddedToShoppingCart();
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(actualText, expectedText, "Incorrect Message Displayed!");

        // * *	Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnShoppingCartLinkInsideTheMessage();

        // * *	Verify the product name ‘Overnight Duffle’
        Thread.sleep(2000);
        String actualProductItemName = shoppingCartPage.verifyProductNameCronusYogaPant();
        String expectedProductItemName = "Overnight Duffle";
        Assert.assertEquals(actualProductItemName, expectedProductItemName, "Incorrect Product Name Displayed!");

        // * *	Verify the Qty is ‘3’
        Thread.sleep(2000);
        String actualProductQuantity= shoppingCartPage.verifyTheQuantityIsThree();
        String expectedProductQuantity = "3";
        Assert.assertEquals(actualProductQuantity, expectedProductQuantity, "Incorrect Quantity Displayed!");

        // * *	Verify the product price ‘$135.00’
        Thread.sleep(2000);
        String actualProductPrice= shoppingCartPage.verifyProductPrice();
        String expectedProductPrice = "$135.00";
        Assert.assertEquals(actualProductPrice, expectedProductPrice, "Incorrect Price Displayed!");

        // * *	Change Qty to ‘5’
        shoppingCartPage.clearQuantityField();
        Thread.sleep(2000);
        shoppingCartPage.changeQuantityNumber("5");
        Thread.sleep(2000);

        // * *	Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();

        // * *	Verify the product price ‘$225.00’
        Thread.sleep(2000);
        String actualProductTotalPrice= shoppingCartPage.verifyTheProductTotalPrice();
        String expectedProductTotalPrice = "$225.00";
        Assert.assertEquals(actualProductTotalPrice, expectedProductTotalPrice, "Incorrect total price displayed!");
    }
}

