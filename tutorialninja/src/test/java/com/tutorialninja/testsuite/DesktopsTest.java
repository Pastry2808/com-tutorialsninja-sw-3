package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.HpProductDetail;
import com.tutorialninja.pages.ShoppingCartPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    HpProductDetail hpProductDetail = new HpProductDetail();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnDesktopLink();
        desktopPage.verifyProductArrangeInAlphabeticalOrder();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        homePage.clickOnDesktopLink();
        desktopPage.verifyProductAddedToShoppingCartSuccessFully();
        String actualResult6 = hpProductDetail.getHpText();
        String expectedResult6 = "HP LP3065";
        Assert.assertEquals(actualResult6,expectedResult6);
        hpProductDetail.changeDeliveryDate();
        hpProductDetail.changeQuantity();
        String actualResult = hpProductDetail.getShoppingCartText();
        String expectedResult = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualResult,expectedResult);
        hpProductDetail.clickOnShoppingCartLink();
        String actualResult1 = shoppingCartPage.getShoppingCartText();
        String expectedResult1 = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(actualResult1,expectedResult1);
        String actualResult2 = shoppingCartPage.verifyProductName();
        String expectedResult2 = "HP LP3065";
        Assert.assertEquals(actualResult2,expectedResult2);
        String actualResult3 = shoppingCartPage.verifyDeliveryDate();
        String expectedResult3 = "Delivery Date:2023-12-25";
        Assert.assertEquals(actualResult3,expectedResult3);
        String actualResult4 = shoppingCartPage.verifyModel();
        String expectedResult4 = "Product 21";
        Assert.assertEquals(actualResult4,expectedResult4);
        String actualResult5 = shoppingCartPage.verifyTotal();
        String expectedResult5 = "$122.00";
        Assert.assertEquals(actualResult5,expectedResult5);
    }
}
