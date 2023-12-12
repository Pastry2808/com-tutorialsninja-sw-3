package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class RegisterAccountsPage extends Utility {
    By registerText = By.xpath("//div[@id='content']/h1");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.id("input-email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.name("confirm");
    By subscribeButton = By.xpath("//div[@id='content']/form/fieldset[3]/div/div/label[1]/input");
    By privacyPolicy = By.xpath("//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[1]");
    By continueButton = By.xpath("//div[@class='pull-right']/input[2]");
    By verifyMessage = By.xpath("//div[@id='content']/h1");
    By continueButton1 = By.xpath("//div[@class='pull-right']/a");

    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    public void verifyThatUserRegisterAccountSuccessfully(){
        sendTextToElement(firstName, "Khushbu");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "khush28004@gmail.com");
        sendTextToElement(telephone, "9879731846");
        sendTextToElement(password, "Khushbu@2802#");
        sendTextToElement(confirmPassword, "Khushbu@2802#");
        clickOnElement(subscribeButton);
        clickOnElement(privacyPolicy);
        clickOnElement(continueButton);
    }
    public String verifyMessageAccountCreated(){
        return getTextFromElement(verifyMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton1);
    }
}
