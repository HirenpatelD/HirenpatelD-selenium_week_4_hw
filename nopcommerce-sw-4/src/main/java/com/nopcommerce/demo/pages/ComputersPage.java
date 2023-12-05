package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By computersPage = By.xpath("//h1[normalize-space()='Computers']");

    public String getComputersPage() {
        return getTextFromElement(computersPage);
    }

    // * 1.2	Click on Desktop
    By desktops = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    By sortByDesktopPage = By.xpath("//select[@id='products-orderby']");

    public void clickOnDesktop() {
        clickOnElement(desktops);
    }
}
