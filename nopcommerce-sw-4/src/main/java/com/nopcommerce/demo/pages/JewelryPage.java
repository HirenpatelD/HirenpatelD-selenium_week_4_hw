package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryPage = By.xpath("//h1[normalize-space()='Jewelry']");

    public String getJewelryPage() {
        return getTextFromElement(jewelryPage);
    }
}

