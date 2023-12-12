package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By returningCustomerText = By.xpath("//div[@id='content']/div/div[2]/div/h2");
    By email = By.id("input-email");
    By password = By.name("password");
    By login = By.xpath("//div[@id='content']/div/div[2]/div/form/input");
    By verifyMyAcountText = By.xpath("//div[@id='content']/h2");

    public String getReturningCustomerText(){
        return getTextFromElement(returningCustomerText);
    }
    public void login(){
        sendTextToElement(email, "khush28004@gmail.com");
        sendTextToElement(password, "Khushbu@2802#");
        clickOnElement(login);
    }
    public String verifyText(){
        return getTextFromElement(verifyMyAcountText);
    }
}
