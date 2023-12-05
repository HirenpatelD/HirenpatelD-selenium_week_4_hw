package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsPage = By.xpath("//h1[contains(text(),'Electronics')]");

    public String getElectronicsPage() {
        return getTextFromElement(electronicsPage);
    }
    //* 1.1	Mouse Hover on “Electronics” Tab
    // * 1.2	Mouse Hover on “Cell phones” and click
    //By cellPhones = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]");
    By cellPhones = By.linkText("Cell phones");
    public void mouseHoverToCellPhones(){
        mouseHoverToElementAndClick(cellPhones);
    }
}


