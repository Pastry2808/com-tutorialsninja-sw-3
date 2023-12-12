package com.tutorialninja.testsuite;

import com.tutorialninja.pages.ComponentsPage;
import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnDesktopLink();
//        1.3 Verify the text ‘Desktops’
        String actualResult = desktopPage.getDesktopText();
        String expectedResult = "Desktops";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.clickOnLaptopsAndNotebooksLink();
//        2.3 Verify the text ‘Laptops & Notebooks’
        String actualResult = laptopsAndNotebooksPage.getLaptopsText();
        String expectedResult = "Laptops & Notebooks";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.clickOnComponentsLink();
//        3.3 Verify the text ‘Components’
        String actualResult = componentsPage.getComponentsText();
        String expectedResult = "Components";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
