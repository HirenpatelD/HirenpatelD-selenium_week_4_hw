package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {
    // * 2.3	Select Sort By position "Name: A to Z"
    By sortByPosition = By.xpath("//select[@id='products-orderby']");

    public void selectSortByPosition(String value) {
        selectByValueFromDropDown(sortByPosition, value);
    }
    By productArrangements = By.xpath("//div[@class='details']/child::h2/a");
    //By productArrangements = By.xpath("//h2[@class='product-title']/a");
    public List<WebElement> listOfProductsName() {
        List<WebElement> listOfElement = findElementsList(productArrangements);
        return listOfElement;
    }

    //2.4 Click on "Add To Cart"
    // By addToCart = By.xpath("//div[@class='details']//button[@type='button']");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    //By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    public void addToCartClick() {
        clickOnElement(addToCart);
    }
}

