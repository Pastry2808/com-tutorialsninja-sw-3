package com.tutorialninja.testsuite;

import com.tutorialninja.pages.LoginPage;
import com.tutorialninja.pages.MyAccountsPage;
import com.tutorialninja.pages.RegisterAccountsPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {
    MyAccountsPage myAccountsPage = new MyAccountsPage();
    RegisterAccountsPage registerAccountsPage = new RegisterAccountsPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        myAccountsPage.verifyUserShouldNavigateToRegisterPageSuccessfully();
        String actualResult = registerAccountsPage.getRegisterText();
        String expectedResult = "Register Account";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        myAccountsPage.verifyUserShouldNavigateToLoginPageSuccessfully();
        String actualResult = loginPage.getReturningCustomerText();
        String expectedResult = "Returning Customer";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        myAccountsPage.verifyUserShouldNavigateToRegisterPageSuccessfully();
        registerAccountsPage.verifyThatUserRegisterAccountSuccessfully();
        String actualResult = registerAccountsPage.verifyMessageAccountCreated();
        String expectedResult = "Your Account Has Been Created!";
        Assert.assertEquals(actualResult,expectedResult);
        registerAccountsPage.clickOnContinue();
        myAccountsPage.logOut();
        String actualResult1 = myAccountsPage.getVerifyAccountLogoutText();
        String expectedResult1 = "Account Logout";
        Assert.assertEquals(actualResult1,expectedResult1);
        myAccountsPage.clickContinue();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        myAccountsPage.verifyUserShouldNavigateToLoginPageSuccessfully();
        loginPage.login();
        String actualResult = loginPage.verifyText();
        String expectedResult = "My Account";
        Assert.assertEquals(actualResult,expectedResult);
        myAccountsPage.logOut();
        String actualResult1 = myAccountsPage.getVerifyAccountLogoutText();
        String expectedResult1 = "Account Logout";
        Assert.assertEquals(actualResult1,expectedResult1);
        myAccountsPage.clickContinue();
    }
}
