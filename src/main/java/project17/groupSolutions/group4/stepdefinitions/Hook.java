package project17.groupSolutions.group4.stepdefinitions;

import io.cucumber.java.*;
import project17.groupSolutions.group4.pages.LoginPage;
import utilities.Driver;
import project17.groupSolutions.group4.utilities.ReadFromConfigFile;

public class Hook {

    @Before(order = 1)
    public static void navigateToLoginPage(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ReadFromConfigFile.getValueFor("homepage"));
    }

    @Before(order = 2, value="@Project16")
    public static  void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }

    @After
    public static void closeBrowser(){
        Driver.quitDriver();
    }
}
