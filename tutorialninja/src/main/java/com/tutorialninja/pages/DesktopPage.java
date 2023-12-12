package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {
    //    1.3 Verify the text ‘Desktops’
    By desktopsText = By.xpath("//div[@id='content']/h2");
    By sortAlphabeticalOrder = By.id("input-sort");
    By verifyAllProducts = By.xpath("//div[@id=\"content\"]/div[4]/div");
    By product = By.xpath("//div[@id='product-category']/div/div/div[4]/div[3]/div/div[2]/div[1]/h4/a");

    public String getDesktopText() {
        return getTextFromElement(desktopsText);
    }
    public void verifyProductArrangeInAlphabeticalOrder() {
        selectByVisibleTextFromDropDown(sortAlphabeticalOrder, "Name (Z - A)");
        List<WebElement> productElements = driver.findElements(verifyAllProducts);
        // Extract product names and store them in a list
        List<String> productNames = new ArrayList<>();
        for (WebElement productElement : productElements) {
            productNames.add(productElement.getText());
        }
//        Check if product names are in alphabetical order
        boolean isAlphabeticalOrder = true;
        for (int i = 1; i < productNames.size(); i++) {
            if (productNames.get(i - 1).compareToIgnoreCase(productNames.get(i)) > 0) {
                isAlphabeticalOrder = false;
                break;
            }
        }
        if (isAlphabeticalOrder) {
            System.out.println("Products are arranged in alphabetical order A-Z. ");
        } else {
            System.out.println("Products are arranged in alphabetical order Z-A.");
        }
    }
    public void verifyProductAddedToShoppingCartSuccessFully(){
        selectByVisibleTextFromDropDown(sortAlphabeticalOrder, "Name (A - Z)");
        clickOnElement(product);
    }
}
