package project18.solution.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project18.solution.pages.BasePage;
import project18.solution.pages.LoginPage;
import project18.solution.utilities.Driver;
import project18.solution.utilities.ReadFromConfigFile;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class Hook extends BasePage{

    @Before(value = "@First", order = 1)
    public void login() {
        driver.manage().window().maximize();
        driver.get(ReadFromConfigFile.getValueFor("homepage"));
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnAcceptAllCookiesButton();
        loginPage.enterUsername(ReadFromConfigFile.getValueFor("username"));
        loginPage.enterPassword(ReadFromConfigFile.getValueFor("password"));
        loginPage.clickOnLoginButton();
    }

    @After
    public void takeScreenshotWhenScenarioFails(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    @AfterAll
    public static void closeBrowser() {
        Driver.quitDriver();
    }
}
