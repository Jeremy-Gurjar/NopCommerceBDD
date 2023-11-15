package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private final By _registerResult = By.cssSelector("div.result");

    //Verifies result text is correct
    public void verifyResultTextIsCorrect() {
        String actual = getTextFromElement(_registerResult);
        Assert.assertEquals(actual, loadProp.getProperty("registrationExpectedResult"), loadProp.getProperty("registrationResultTextFail"));
    }

    //Verifies registration is successful
    public void verifySuccessfulRegistration() {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, loadProp.getProperty("registrationSuccessfulResultURL"), loadProp.getProperty("registrationSuccessfulTestFail"));
    }
}
