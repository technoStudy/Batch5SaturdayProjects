package CampusProjectSolutions.stepDefinitions;

import CampusProjectSolutions.pages.LoginPage;
import CampusProjectSolutions.pages.TopMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Project17Steps {

    LoginPage loginPage = new LoginPage();
    TopMenu topMenu = new TopMenu();

    @Then("Verify user page opens")
    public void verify_user_page_opens() {
        Assert.assertTrue(topMenu.isUserProfileImageDisplayed());
    }

    @And("User signs out")
    public void user_signs_out() {
        topMenu.clickOnUserProfileImage();
        topMenu.clickOnSignOutButton();
    }

    @Given("Enter username {word}")
    public void enter_username(String username) {
        loginPage.enterUsername(username);
    }

    @Given("Enter password {word}")
    public void enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("Verify the login error message")
    public void verify_login_error_message() {
        String expectedErrorMessage = "Invalid username or password";
        String actualErrorMessage = loginPage.getLoginErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        loginPage.dismissErrorMessageBox();
    }

    @Given("Refresh login page")
    public void refresh_login_page(){
        loginPage.refreshPage();
    }

    @Then("Verify {word} or {word} required message")
    public void verify_username_or_password_required_message(String username, String password){
        if (username.isBlank()){
            String expectedUsernameRequiredMessage = "Email is required";
            String actualUsernameRequiredMessage = loginPage.getUsernameRequiredMessage();
            Assert.assertEquals(actualUsernameRequiredMessage, expectedUsernameRequiredMessage);
        }
        if (password.isBlank()){
            String expectedPasswordRequiredMessage = "Password is required";
            String actualPasswordRequiredMessage = loginPage.getPasswordRequiredMessage();
            Assert.assertEquals(actualPasswordRequiredMessage, expectedPasswordRequiredMessage);
        }
    }
}
