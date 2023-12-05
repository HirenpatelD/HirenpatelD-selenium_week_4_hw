package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    // * 2.5	Verify the Text "Build your own computer"
    // By buildYourOwnComputerText = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String getMessageFromBuildYourOwnComputerPage() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    // * 2.6	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By processorDropDownList = By.id("product_attribute_1");

    public void selectProcessor(String processor) {
        selectVisibleTextFromDropDown(processorDropDownList, processor);
    }

    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By ramDropDownList = By.id("product_attribute_2");

    // * 2.7.Select RAM "8GB [+$60.00]" using Select class.
    public void selectRam(String ram) {
        selectVisibleTextFromDropDown(ramDropDownList, ram);
    }

    // * 2.8	Select HDD radio "400 GB [+$100.00]"
    By hddRadioButton = By.id("product_attribute_3_7");

    public void selectHdd() {
        clickOnElement(hddRadioButton);
    }

    // * 2.9	Select OS radio "Vista Premium [+$60.00]"
    By osRadioButton = By.id("product_attribute_4_9");

    public void selectOs() {
        clickOnElement(osRadioButton);
    }

    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By msOfficeCheckBox = By.id("product_attribute_5_12");
    By totalCommanderCheckBox = By.id("product_attribute_5_12");

    public void selectSoftware() {
        //clickOnElement(msOfficeCheckBox);
        clickOnElement(totalCommanderCheckBox);
    }

    // * 2.11	Verify the price "$1,475.00"
    By totalPrice = By.id("price-value-1");

    public String checkTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    // * 2.12	Click on "ADD TO CARD" Button.
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");

    public void addToCartLink() {
        mouseHoverToElementAndClick(addToCart);
    }

    // * 2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By messageConfirmationGreenColor = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    public String shoppingCartMessage() {
        return getTextFromElement(messageConfirmationGreenColor);
    }

    // * After that close the bar clicking on the cross button.
    By crossToCloseBrowser = By.xpath("//span[@class = 'close']");

    public void crossBarCheck() {
        clickOnElement(crossToCloseBrowser);
    }

    // * 2.14	Then MouseHover on "Shopping cart"
    By verifyShoppingCart = By.xpath("//a[@class='ico-cart']");

    public void checkShoppingCart() {
        mouseHoverToElementAndClick(verifyShoppingCart);
    }

    //and Click on "GO TO CART" button.
    By goToCartButton = By.xpath("//span[@class='cart-label']");

    public void mouseHoverOnGoToCartButton() {
        mouseHoverToElementAndClick(goToCartButton);
    }
}

