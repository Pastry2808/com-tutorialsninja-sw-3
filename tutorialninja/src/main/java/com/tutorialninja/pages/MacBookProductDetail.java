package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class MacBookProductDetail extends Utility {
    By macBookText = By.xpath("//div[@id='content']/div/div[2]/h1");
    By addToCart = By.id("button-cart");
    By shoppingCartMessage = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");
    By shoppingCartLink = By.xpath("//ul[@class='list-inline']/li[4]/a/i");

    public String verifyMacBookText(){
        return getTextFromElement(macBookText);
    }
    public void addToCart(){
        clickOnElement(addToCart);
    }
    public String verifyShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
}
