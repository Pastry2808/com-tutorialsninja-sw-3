package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//div[@id='checkout-cart']/div/div/h1");
    By productName = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDate = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[2]/small[1]");
    By model = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]");
    By total = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[6]");
    By quantity = By.xpath("//div[@class='input-group btn-block']/input");
    By updateTab = By.xpath("//button[@type='submit']/i");
    By shoppingCartMessage = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");
    By checkout = By.xpath("//div[@class='pull-right']/a");
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String verifyProductName(){
        return getTextFromElement(productName);
    }
    public String verifyDeliveryDate(){
        return getTextFromElement(deliveryDate);
    }
    public String verifyModel(){
        return getTextFromElement(model);
    }
    public String verifyTotal(){
        return getTextFromElement(total);
    }
    public void changeQuantity(){
        clearTextFromField(quantity);
        sendTextToElement(quantity,"2");
        clickOnElement(updateTab);
    }
    public String verifyMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void clickOnCheckout(){
        clickOnElement(checkout);
    }
}
