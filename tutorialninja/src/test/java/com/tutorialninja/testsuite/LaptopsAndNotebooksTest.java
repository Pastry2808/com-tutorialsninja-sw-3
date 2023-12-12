package com.tutorialninja.testsuite;

import com.tutorialninja.pages.*;
import com.tutorialninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends TestBase {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    MacBookProductDetail macBookProductDetail = new MacBookProductDetail();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        homePage.clickOnLaptopsAndNotebooksLink();
        laptopsAndNotebooksPage.verifyProductsPriceDisplayHighToLowSuccessfully();
    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
        homePage.clickOnLaptopsAndNotebooksLink();
        laptopsAndNotebooksPage.verifyThatUserPlaceOrderSuccessfully();
        String actualResult = macBookProductDetail.verifyMacBookText();
        String expectedResult = "MacBook";
        Assert.assertEquals(actualResult, expectedResult);
        macBookProductDetail.addToCart();
        String actualResult1 = macBookProductDetail.verifyShoppingCartMessage();
        String expectedResult1 = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualResult1,expectedResult1);
        macBookProductDetail.clickOnShoppingCart();
        String actualResult2 = shoppingCartPage.getShoppingCartText();
        String expectedResult2 = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actualResult2,expectedResult2);
        String actualResult3 = shoppingCartPage.verifyProductName();
        String expectedResult3 = "MacBook";
        Assert.assertEquals(actualResult3,expectedResult3);
        shoppingCartPage.changeQuantity();
        String actualResult4 = shoppingCartPage.verifyMessage();
        String expectedResult4 = "Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualResult4, expectedResult4);
        String actualResult5 = shoppingCartPage.verifyTotal();
        String expectedResult5 = "$1,204.00";
        Assert.assertEquals(actualResult5,expectedResult5);
        shoppingCartPage.clickOnCheckout();
        String actualResult6 = checkoutPage.getNewCustomerText();
        String expectedResult6 = "New Customer";
        Assert.assertEquals(actualResult6,expectedResult6);
        checkoutPage.clickOnCheckout();
        String actualResult7 = checkoutPage.verifyWarningMessage();
        System.out.println(actualResult7);
        String expectedResult7 = "Warning: Payment method required!\n" +
                "×";
        Assert.assertEquals(actualResult7,expectedResult7);
    }
}
