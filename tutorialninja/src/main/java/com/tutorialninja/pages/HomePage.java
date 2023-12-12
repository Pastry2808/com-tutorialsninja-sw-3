package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

//  1.1 Mouse hover on “Desktops” Tab and click
    By desktoplink = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");

//    1.2 call selectMenu method and pass the menu = “Show All Desktops”
    By showAllDesktopsLink = By.xpath("//ul[@class='nav navbar-nav']/li[1]/div/a");

//    2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    By laptopsAndNotebooksLink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");

//    2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    By showAllLaptopsAndNotebooks = By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a");

//    3.1 Mouse hover on “Components” Tab and click
    By componentsLink = By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");

//    3.2 call selectMenu method and pass the menu = “Show All Components”

    By showAllComponents = By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");

    public void clickOnDesktopLink() {
        mouseHoverToElementAndClick(desktoplink);
        clickOnElement(showAllDesktopsLink);
    }
    public void clickOnLaptopsAndNotebooksLink(){
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    public void clickOnComponentsLink(){
        mouseHoverToElementAndClick(componentsLink);
        clickOnElement(showAllComponents);
    }
}
