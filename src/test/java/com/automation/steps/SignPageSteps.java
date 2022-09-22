package com.automation.steps;

import Pages.HomePage;
import Pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignPageSteps {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I Click on SignIn Link$")
    public void iClickOnSignInLink() {
        new HomePage().clickonsignin();
    }

    @Then("^I verify that \"([^\"]*)\" message is displayed$")
    public void iVerifyThatMessageIsDisplayed(String autho) {
        Assert.assertEquals(autho,new HomePage().verifytext());
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String Username)  {
        new SignInPage().enteremail(Username);
    }

    @And("^I Click on SignIn Button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickonsigninbutton();
    }

    @Then("^I verify Error message \"([^\"]*)\"$")
    public void iVerifyErrorMessage(String message) {
        Assert.assertEquals(message,new SignInPage().verifyText(message));

    }

    @And("^I enter a \"([^\"]*)\"$")
    public void iEnterA(String Password)  {
        new SignInPage().enterpassword(Password);

    }

    @Then("^I verify Sign out link is display$")
    public void iVerifySignOutLinkIsDisplay() {
        String acctualresult = new SignInPage().verifysignout();
        String expectedresult = "Sign out";
        Assert.assertEquals(acctualresult,expectedresult);
    }

    @And("^I click on Signout Link$")
    public void iClickOnSignoutLink() {
        new SignInPage().clickonsignout();
    }

    @Then("^I verify that Signin Link is didplay$")
    public void iVerifyThatSigninLinkIsDidplay() {
        String acctualresult1 = new SignInPage().verifysigninlink();
        String expectedresult1 = "Sign in";
        Assert.assertEquals(acctualresult1,expectedresult1);
    }
}
}
