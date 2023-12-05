package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1.1	create method with name "selectMenu" it has one parameter name "menu" of type string
 * 1.2	This method should click on the menu whatever name is passed as parameter.
 * 1.3	create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it
 * and verify the page navigation.
 */

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    LoginLinkPage loginLinkPage = new LoginLinkPage();

    RegisterPage registerLinkPage = new RegisterPage();

    @Test
    public void userShouldNavigateToComputersPageSuccessfully() {
        homePage.mouseHoverAndClickOnComputers();
        String expectedResult = "Computers";
        String actualResult = computersPage.getComputersPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePage.mouseHoverAndClickOnElectronics();
        String expectedResult = "Electronics";
        String actualResult = electronicsPage.getElectronicsPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        homePage.mouseHoverAndClickOnApparel();
        String expectedResult = "Apparel";
        String actualResult = apparelPage.getApparelPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        homePage.mouseHoverAndClickOnDigitalDownloads();
        String expectedResult = "Digital downloads";
        String actualResult = digitalDownloadsPage.getDigitalDownloadsPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePage.mouseHoverAndClickOnBooks();
        String expectedResult = "Books";
        String actualResult = booksPage.getBooksPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        homePage.mouseHoverAndClickOnJewelry();
        String expectedResult = "Jewelry";
        String actualResult = jewelryPage.getJewelryPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        homePage.mouseHoverAndClickOnGiftCards();
        String expectedResult = "Gift Cards";
        String actualResult = giftCardsPage.getGiftCardsPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.mouseHoverAndClickOnLoginLink();
        String expectedResult = "Welcome, Please Sign In!";
        String actualResult = loginLinkPage.getLoginLinkPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToRegisterLinkPageSuccessfully() {
        homePage.mouseHoverAndClickOnRegisterLink();
        String expectedResult = "Register";
        String actualResult = registerLinkPage.getRegisterLinkPage();
        Assert.assertEquals(actualResult, expectedResult, "Incorrect Text displayed!");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }


//    @Test
//    public void verifyPageNavigationOfTopMenu() {
//        homePage.selectMenu("Computers");
//        homePage.selectMenu("Electronics");
//        homePage.selectMenu("Apparel");
//        homePage.selectMenu("Digital downloads");
//        homePage.selectMenu("Books");
//        homePage.selectMenu("Jewelry");
//        homePage.selectMenu("Gift Cards");
//    }

}

