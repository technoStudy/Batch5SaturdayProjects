package project17.groupSolutions.group1.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project17.groupSolutions.group1.pages.LoginPage;
import project17.groupSolutions.group1.uitilites.ReadFromConfigFile;
import org.testng.Assert;

public class Project17Steps {
    LoginPage loginPage = new LoginPage();

    @Given("User enter valid username")
    public void user_enter_valid_username() {
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
    }
    @When("User enter valid password")
    public void user_enter_valid_password() {
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));

    }
    @Then("Click login button")
    public void click_login_button() {
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.clickOnLoginButton();
    }

    @Given("with an invalid {string} and a valid {string}")
    public void with_an_invalid_and_a_valid(String username, String password) {
        loginPage.enterUsername2(username);
        loginPage.enterPassword2(password);
        loginPage.clickOnLoginButton();
    }
    @Then("And User verify login {string}")
    public void and_user_verify_login(String expectedMessage) {
        String actualMessage = loginPage.getTextOfInvalidMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Invalid username or password");
    }

    @Given("with an valid {string} but no {string}")
    public void with_an_valid_but_no(String username1, String password1) {
        loginPage.enterUsername2(username1);
        loginPage.enterPassword2(password1);
        loginPage.clickOnLoginButton();
    }


}
