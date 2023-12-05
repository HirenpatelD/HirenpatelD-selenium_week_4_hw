package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksPage = By.xpath("//h1[normalize-space()='Books']");

    public String getBooksPage() {
        return getTextFromElement(booksPage);
    }
}

