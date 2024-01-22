package com.example.restservice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginStepDefinitions {

	@Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        // code to navigate to the login page
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        // code to enter valid credentials
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        // code to click the login button
    }

    @Then("I should be redirected to my account page")
    public void iShouldBeRedirectedToMyAccountPage() {
        // code to check that the user is redirected to their account page
    }


}
