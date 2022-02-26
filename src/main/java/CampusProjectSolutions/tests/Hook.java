package CampusProjectSolutions.tests;

import CampusProjectSolutions.pages.BasePage;
import CampusProjectSolutions.pages.LoginPage;
import CampusProjectSolutions.utilities.ReadFromConfigFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hook extends BasePage {

    LoginPage loginPage = new LoginPage();

    @BeforeTest(groups = {"project15"})
    public void navigateToLoginPage(){
        driver.manage().window().maximize();
        driver.get(ReadFromConfigFile.getValueFor("homepage"));
    }

    @BeforeTest(dependsOnMethods = "navigateToLoginPage", groups = {"project15"})
    public void login(){
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }

    @AfterTest(groups = {"project15"})
    public void closeBrowser(){
       quitDriver();
    }
}
