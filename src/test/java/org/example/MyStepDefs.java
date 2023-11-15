package org.example;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Given("I am on NopCommerce homepage")
    public void i_am_on_nop_commerce_homepage() {
    }

    @When("I click on register button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterButton();
    }

    @Then("I should be on register page")
    public void i_should_be_on_register_page() {
        registerPage.verifyThatUserIsOnRegisterPage();
    }


    @When("I enter all required details")
    public void i_enter_all_required_details() {
        registerPage.enterDetailsForRegistration();
    }

    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        registerResultPage.verifySuccessfulRegistration();
    }

    @Then("My result text should be correct")
    public void my_result_text_should_be_correct() {
        registerResultPage.verifyResultTextIsCorrect();
    }



    @Given("I am on homepage")
    public void i_am_on_homepage() {

    }

}
