package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
//    3.3 Verify the text ‘Components’
    By componentsText = By.xpath("//div[@id='content']/h2");
    public String getComponentsText() {
        return getTextFromElement(componentsText);
    }
}
