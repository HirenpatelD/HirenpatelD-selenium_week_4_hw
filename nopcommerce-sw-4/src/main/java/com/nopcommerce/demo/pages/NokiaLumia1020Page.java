package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020Page extends Utility {
    // * 2.6	Verify the text “Nokia Lumia 1020”
    By verifyNokiaLumia1020Text = By.xpath("//h1[text() = 'Nokia Lumia 1020']");
    public String getTextForNokiaLumia1020(){
        return getTextFromElement(verifyNokiaLumia1020Text);
    }
    // * 2.7	Verify the price “$349.00”
    By verifyPrice = By.id("price-value-20");
    public String getPriceForNokiaLumia1020(){
        return getTextFromElement(verifyPrice);
    }

    // * 2.8	Change quantity to 2
    By clearField = By.id("product_enteredQuantity_20");
    By changeQuantity = By.id("product_enteredQuantity_20");
    public void updateQuantity(){
        clearTextField(clearField);
        sendTextToElement(changeQuantity, "2");
    }
    // * 2.9	Click on “ADD TO CART” tab
    By addToCart = By.id("add-to-cart-button-20");
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    // * 2.10	Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By messageConfirmationGreenColor = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    public String shoppingCartMessage(){
        return getTextFromElement(messageConfirmationGreenColor);
    }
    // * After that close the bar clicking on the cross button.
    By crossToCloseBrowser = By.xpath("//span[@class = 'close']");
    public void crossBarCheck(){
        clickOnElement(crossToCloseBrowser);
    }
    // * 2.11	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By verifyShoppingCart = By.xpath("//a[@class='ico-cart']");
    public void checkShoppingCart(){
        mouseHoverToElementAndClick(verifyShoppingCart);
    }

    //Click on "GO TO CART" button.
    By goToCartButton = By.xpath("//span[@class='cart-label']");
    public void mouseHoverOnGoToCartButton(){
        mouseHoverToElementAndClick(goToCartButton);
    }

}

