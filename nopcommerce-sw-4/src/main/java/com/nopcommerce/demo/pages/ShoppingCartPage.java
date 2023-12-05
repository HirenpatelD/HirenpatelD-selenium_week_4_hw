package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    // * 2.15	Verify the message "Shopping cart"
    By shoppingCartTitlePage = By.xpath("//h1[normalize-space()='Shopping cart']");

    public String verifyShoppingCartTitle() {
        return getTextFromElement(shoppingCartTitlePage);
    }

    // * 2.16	Change the Qty to "2" and Click on "Update shopping cart"

    By clearField = By.xpath("//input[@class='qty-input']");
    By quantityField = By.xpath("//input[@class='qty-input']");

    public void quantityField() {
        clearTextField(clearField);
        sendTextToElement(quantityField, "2");
    }
    //Click on "Update shopping cart"
    By updateCart = By.xpath("//button[@id='updatecart']");
    public void updateCart(){
        clickOnElement(updateCart);
    }

    // * 2.17	Verify the Total"$2,950.00"
    By totalUpdatedPrice = By.xpath("//span[@class='product-subtotal']");

    public String getUpdatedPrice() {
        return getTextFromElement(totalUpdatedPrice);
    }

    // * 2.18	click on checkbox “I agree with the terms of service”
    By termsAndConditionBox = By.xpath("//input[@id='termsofservice']");
    public void termsAndConditionCheckBox(){
        clickOnElement(termsAndConditionBox);
    }
    // * 2.19	Click on “CHECKOUT”
    By checkOutButton = By.id("checkout");
    public void clickCheckOut(){
        clickOnElement(checkOutButton);
    }

    //*****************************************Electronics Test*****************************************************
    // * 2.13 Verify the quantity is 2
    By checkTheQuantity = By.xpath("//span[contains(text(),'(2)')]");
    public String verifyTheQuantityIsTwo(){
        return getTextFromElement(checkTheQuantity);
    }
    // * 2.14	Verify the Total $698.00
    By checkTotalPrice = By.xpath("//span[text() = '$698.00']");
    public String getTotalPrice(){
        return getTextFromElement(checkTotalPrice);
    }
}

