package project17.solution.stepDefinitions;

import project17.solution.pages.BasePage;
import project17.solution.pages.LoginPage;
import project17.solution.utilities.Driver;
import project17.solution.utilities.ReadFromConfigFile;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class Hook extends BasePage{

    @Before(value = "@First", order = 1)
    public void navigateToLoginPage() {
        driver.manage().window().maximize();
        driver.get(ReadFromConfigFile.getValueFor("homepage"));
    }

    @Before(value = "@First", order = 2)
    public static void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }

    @AfterAll
    public static void closeBrowser() {
        Driver.quitDriver();
    }
}
