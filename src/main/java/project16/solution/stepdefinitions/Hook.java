package project16.solution.stepdefinitions;

import project16.solution.pages.LoginPage;
import project16.solution.utilities.Driver;
import project16.solution.utilities.ReadFromConfigFile;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {

    @BeforeAll(order = 1)
    public static void navigateToLoginPage(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ReadFromConfigFile.getValueFor("homepage"));
    }

    @BeforeAll(order = 2)
    public static  void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }

    @AfterAll
    public static void closeBrowser(){
        Driver.quitDriver();
    }
}
