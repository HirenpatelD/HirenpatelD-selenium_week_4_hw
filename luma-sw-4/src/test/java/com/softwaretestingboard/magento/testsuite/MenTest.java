package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MensPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

/**
 * Write down the following test into ‘MenTest’ class
 * 1. userShouldAddProductSuccessFullyTo ShoppingCart()
 * *	Mouse Hover on Men Menu
 * *	Mouse Hover on Bottoms
 * *	Click on Pants
 * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
 * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
 * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
 * *	Verify the text You added Cronus Yoga Pant to your shopping cart.
 * *	Click on ‘shopping cart’ Link into message
 * *	Verify the text ‘Shopping Cart.’
 * *	Verify the product name ‘Cronus Yoga Pant’
 * *	Verify the product size ‘32’
 * *	Verify the product colour ‘Black’
 */

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MensPage mensPage = new MensPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    //1. userShouldAddProductSuccessFullyTo ShoppingCart()
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        // * *	Mouse Hover on Men Menu
        Thread.sleep(2000);
        homePage.mouseHoverToMenMenuList();

        // * *	Mouse Hover on Bottoms
        Thread.sleep(2000);
        homePage.mouseHoverOnMenBottoms();

        // * *	Click on Pants
        Thread.sleep(2000);
        homePage.clickOnPants();

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
        mensPage.mouseHoverCronusYogaPant();
        //and click on size 32.
        mensPage.clickOnSize(32);

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        mensPage.mouseHoverAndClickOnColour("Black");

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
        mensPage.mouseHoverToCronusYogaPant();

        // and click on ‘Add To Cart’ Button.
        mensPage.clickOnAddToCartButton();

        // * *	Verify the text You added Cronus Yoga Pant to your shopping cart.
        mensPage.getTextCronusYogaPantAdded();

        // * *	Click on ‘shopping cart’ Link into message
        mensPage.clickOnShoppingCartLinkInsideMessage();

        // * *	Verify the text ‘Shopping Cart.’
        shoppingCartPage.verifyShoppingCartText();

        // * *	Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.verifyProductsNameIsCronusYogaPant();

        // * *	Verify the product size ‘32’
        shoppingCartPage.verifyProductSizeIs32();

        // * *	Verify the product colour ‘Black’
        shoppingCartPage.verifyProductColourIsBlack();
    }
}

