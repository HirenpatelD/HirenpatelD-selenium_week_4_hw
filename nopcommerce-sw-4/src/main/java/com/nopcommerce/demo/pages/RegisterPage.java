package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.UUID;

public class RegisterPage extends Utility {
    public static String generatedEmail;

    By registerLinkPage = By.xpath("//a[normalize-space()='Register']");

    public String getRegisterLinkPage() {
        return getTextFromElement(registerLinkPage);
    }

    // * 2.19	Verify the text “Register”
    By checkRegisterText = By.xpath("//h1[normalize-space()='Register']");
    public String getRegisterText(){
        return getTextFromElement(checkRegisterText);
    }
    // * 2.20	Fill the mandatory fields
    By firstName = By.id("FirstName");
    public void enterFirstName(String firstName1){
        sendTextToElement(firstName, firstName1);
    }
    By lastNameOption = By.id("LastName");
    public void enterLastName(String lastName){
        sendTextToElement(lastNameOption, lastName);
    }
    By date = By.name("DateOfBirthDay");
    public void enterDate(String date1){
        sendTextToElement(date, date1);
    }
    By month = By.name("DateOfBirthMonth");
    public void enterMonth(String month1){
        sendTextToElement(month, month1);
    }
    By year = By.name("DateOfBirthYear");
    public void enterYear(String year1){
        sendTextToElement(year, year1);
    }
    //final String randomEmail = randomEmail();
    By email = By.id("Email");
    public void enterEmail(){
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "robert" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        sendTextToElement(email, generatedEmail);
    }
    By password = By.name("Password");
    public void enterPassword(String password1){
        sendTextToElement(password, password1);
    }
    By confirmPassword = By.name("ConfirmPassword");
    public void enterConfirmPassword(String confirmPassword1){
        sendTextToElement(confirmPassword, confirmPassword1);
    }
    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    // * 2.21	Click on “REGISTER” Button
    By registerButton = By.name("register-button");
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

}

