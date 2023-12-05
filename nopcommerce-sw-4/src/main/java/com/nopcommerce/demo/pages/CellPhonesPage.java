package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
    // * 1.3	Verify the text “Cell phones”
    By verifyCellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");

    public String verifyCellPhonesText() {
        return getTextFromElement(verifyCellPhoneText);
    }

    // * 2.4	Click on List View Tab
    By listElement = By.linkText("List");

    public void clickOnListIcon() {
        clickOnElement(listElement);
    }

    // * 2.5	Click on product name “Nokia Lumia 1020” link
    // By productNokiaLumia1020 = By.linkText("Nokia Lumia 1020");
    By productNokiaLumia1020 = By.linkText("Nokia Lumia 1020");

    public void nokiaLumia1020Link() {
        clickOnElement(productNokiaLumia1020);
    }


}

