package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardsPage = By.xpath("//h1[normalize-space()='Gift Cards']");

    public String getGiftCardsPage() {
        return getTextFromElement(giftCardsPage);
    }
}

