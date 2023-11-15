package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //Details button for nopcommerce new releases
    private final By _detailsButton = By.xpath("//a[@href = \"/nopcommerce-new-release\"][@class = \"read-more\"]");

    //Register button on home page
    private final By _registerButton = By.className("ico-register");

    //Clicks on register button on home page
    public void clickOnRegisterButton() {
        clickElement(_registerButton);
    }

    //CLicks on details button on nopcommerce new releases
    public void clickOnDetailsButton() {
        clickElement(_detailsButton);
    }
}
