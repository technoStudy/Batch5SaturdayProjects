package project16.groupSolutions.group3.StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import project16.groupSolutions.group3.POM.LoginPage;
import project16.groupSolutions.group3.Utilities.Driver;
import project16.groupSolutions.group3.Utilities.ReadFromConfigFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

//    LoginPage loginPage = new LoginPage();

    @BeforeAll(order = 1)
    public static void navigateToLoginPage(){
        LoginPage loginPage = new LoginPage();
        loginPage.navigateTo(ReadFromConfigFile.getValueFor("loginpage"));
        loginPage.clickAcceptCookiesButton();
        loginPage.maximizeWindow();
    }

    @BeforeAll(order = 2)
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.inputUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.inputPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickLoginButton();
    }

    @AfterAll
    public static void tearDown(){
        Driver.quitDriver();
    }
}
