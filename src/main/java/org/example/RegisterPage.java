package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class RegisterPage extends Utils {
    //Calls loadprop class
    LoadProp loadProp = new LoadProp();

    //Password box
    private final By _password = By.name("Password");

    //Confirm password box
    private final By _confirmPassword = By.name("ConfirmPassword");

    //Email box
    private final By _email = By.id("Email");

    //dob day drop down list
    private final By _dateOfBirthDay = By.name("DateOfBirthDay");

    //dob month drop down list
    private final By _dateOfBirthMonth = By.name("DateOfBirthMonth");

    //dob year drop down list
    private final By _dateOfBirthYear = By.name("DateOfBirthYear");

    //first name box
    private final By _firstName = By.id("FirstName");

    //last name box
    private final By _lastName = By.id("LastName");

    //Register button
    private final By _registerButton = By.id("register-button");

    //Verfies user is on register page
    public void verifyThatUserIsOnRegisterPage() {
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/register?returnUrl=%2F"), "User is not on register page.");
    }

    //Enters details for registration
    public void enterDetailsForRegistration() {
        //Enters firstname and lastname
        typeText(_firstName, loadProp.getProperty("firstName"));
        typeText(_lastName, loadProp.getProperty("lastName"));

        //Enter email
        typeText(_email, email);

        //Types and confirms password
        typeText(_password, loadProp.getProperty("password"));
        typeText(_confirmPassword, loadProp.getProperty("password"));

        //Selects date of birth
        selectFromDropDownList(_dateOfBirthDay, 3);
        selectFromDropDownList(_dateOfBirthMonth, 3);
        selectFromDropDownList(_dateOfBirthYear, 3);

        //Clicks register to confirm register
        waitForClickable(_registerButton, Duration.ofSeconds(3));
        clickElement(_registerButton);
    }
}
