package project17.groupSolutions.group4.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import project17.groupSolutions.group4.pages.LoginPage;
import utilities.Driver;
import project17.groupSolutions.group4.utilities.ReadFromConfigFile;

public class Project17Steps {
    LoginPage loginPage;
    @Given("Validate user is on login page")
        public void validate_user_is_on_loginpage() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ReadFromConfigFile.getValueFor("homepage"));
    }

    @When("User enter valid credentials")
    public void user_enter_valid_credentials() {
        loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        loginPage = new LoginPage();
        Assert.assertTrue(loginPage.getWelcomeMessage().contains("Welcome"));
    }

    @When("User enters invalid username {string} or password {string}")
    public void user_enters_invalid_username_or_password(String username, String password) {
        loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }
    @Then("User should stay on login page")
    public void user_should_stay_on_login_page() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ReadFromConfigFile.getValueFor("homepage"));
    }
    @And("Invalid username or password message should appear")
    public void invalid_username_or_password_message_should_appear() {
        Assert.assertTrue(loginPage.getInvalidInputMessage().contains("Invalid"));
    }



}
