package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class HpProductDetail extends Utility {
    By hpText = By.xpath("//div[@id='product-product']/div/div/div/div[2]/h1");
    By deliveryDate = By.xpath("//div[@class='input-group date']/input");
    By quantity = By.xpath("//input[@id='input-quantity']");
    By addToCart = By.id("button-cart");
    By shoppingCartMessage = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");
    By shoppingCartLink = By.xpath("//ul[@class='list-inline']/li[4]/a/i");

    public String getHpText() {
        return getTextFromElement(hpText);
    }
    public void changeDeliveryDate(){
        clearTextFromField(deliveryDate);
        sendTextToElement(deliveryDate, "2023-12-25");
    }
    public void changeQuantity(){
        clearTextFromField(quantity);
        sendTextToElement(quantity, "1");
        clickOnElement(addToCart);}
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
}
