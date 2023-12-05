package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    //By listOfTopMenuBar = By.xpath("//ul[@class='top-menu notmobile']/li/a");
    By computersTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By apparelTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By digitalDownloadsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By booksTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By jewelryTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By giftCardsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
    By loginLink = By.xpath("//a[normalize-space()='Log in']");
    By registerLink = By.xpath("//a[normalize-space()='Register']");


//    public void selectMenu(String menu) {
//        //listOfProductsElement(By.xpath("//div[@class='header-menu']/ul[@class ='top-menu notmobile']/li/a"), "topMenu");
//        List<WebElement> listOfMenuElements = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a"));
//        for (WebElement element : listOfMenuElements) {
//            System.out.println(element.getText());
//
//            if (element.getText().trim().equalsIgnoreCase(menu)) {
//                element.click();
//                break;
//            }
//        }
//        if (menu == "Computers") {
//            //mouse hover computer tab and click
//            mouseHoverToElementAndClick(computersTab);
//        } else if (menu == "Electronics") {
//            mouseHoverToElementAndClick(electronicsTab);
//        } else if (menu == "Apparel") {
//            mouseHoverToElementAndClick(apparelTab);
//        } else if (menu == "Digital downloads") {
//            mouseHoverToElementAndClick(digitalDownloadsTab);
//        } else if (menu == "Books") {
//            mouseHoverToElementAndClick(booksTab);
//        } else if (menu == "Jewelry") {
//            mouseHoverToElementAndClick(jewelryTab);
//        } else if (menu == "Gift Cards") {
//            mouseHoverToElementAndClick(giftCardsTab);
//        } else {
//            System.out.println("Please enter valid Top-menu tab or check actual name of the top menu");
//        }

    //2.37 Verify the text “Welcome to our store”
    public String getTextFromWelcomeStore() {
        return getTextFromElement(welcomeToOurStore);
    }

    public void mouseHoverAndClickOnComputers() {
        mouseHoverToElementAndClick(computersTab);
    }

    public void mouseHoverAndClickOnElectronics() {
        mouseHoverToElementAndClick(electronicsTab);
    }

    public void mouseHoverAndClickOnApparel() {
        mouseHoverToElementAndClick(apparelTab);
    }

    public void mouseHoverAndClickOnDigitalDownloads() {
        mouseHoverToElementAndClick(digitalDownloadsTab);
    }

    public void mouseHoverAndClickOnBooks() {
        mouseHoverToElementAndClick(booksTab);
    }

    public void mouseHoverAndClickOnJewelry() {
        mouseHoverToElementAndClick(jewelryTab);
    }

    public void mouseHoverAndClickOnGiftCards() {
        mouseHoverToElementAndClick(giftCardsTab);
    }

    public void mouseHoverAndClickOnLoginLink() {
        mouseHoverToElementAndClick(loginLink);
    }

    public void mouseHoverAndClickOnRegisterLink() {
        mouseHoverToElementAndClick(registerLink);
    }
}

