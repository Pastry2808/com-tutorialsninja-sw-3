package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {
    By myAccountLink = By.xpath("//ul[@class='list-inline']/li[2]/a/span[1]");
    By register = By.xpath("//ul[@class='list-inline']/li[2]/ul/li[1]/a");
    By login = By.xpath("//ul[@class='list-inline']/li[2]/ul/li[2]/a");
    By logOut = By.xpath("//ul[@class='list-inline']/li[2]/ul/li[5]/a");
    By verifyAccountLogoutText = By.xpath("//div[@id='content']/h1");
    By clickContinueButton = By.xpath("//div[@class='pull-right']/a");
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        clickOnElement(myAccountLink);
        clickOnElement(register);
    }
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        clickOnElement(myAccountLink);
        clickOnElement(login);
    }
    public void logOut(){
        clickOnElement(myAccountLink);
        clickOnElement(logOut);
    }
    public String getVerifyAccountLogoutText(){
        return getTextFromElement(verifyAccountLogoutText);
    }
    public void clickContinue(){
        clickOnElement(clickContinueButton);
    }
}
