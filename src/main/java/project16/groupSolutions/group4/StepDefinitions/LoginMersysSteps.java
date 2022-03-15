package project16.groupSolutions.group4.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project16.groupSolutions.group4.pages.LoginPage;
import project16.groupSolutions.group4.utilities.ReadFromConfigFile;

public class LoginMersysSteps {

    LoginPage loginPage;

    @Given("User is on login page")
    public void user_is_on_login_page() {
     loginPage = new LoginPage();
     loginPage.validateUserOnLoginPage();
    }
    @When("User enter admin credentials")
    public void user_enter_admin_credentials() {
        loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
       loginPage = new LoginPage();
       loginPage.validateUserSuccessfullyLoggedIn();
    }
}
