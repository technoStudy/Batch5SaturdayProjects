package project18.groupSolutions.group3.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import project18.groupSolutions.group3.pages.LoginPage;
import project18.groupSolutions.group3.pages.StudentPage;
import project18.groupSolutions.group3.pages.TopMenu;
import project18.groupSolutions.group3.utilities.Driver;
import project18.groupSolutions.group3.utilities.ReadFromConfigFile;

import java.io.File;
import java.io.IOException;

public class Hooks {

    WebDriver driver = Driver.getDriver();

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

    @Before(value = "@Second", order = 1)
    public static void navigateToStudentFunctionPage(){
        TopMenu topMenu = new TopMenu();
        topMenu.clickOnMoreButton();
        topMenu.hoverOverStudentMenu();
        topMenu.clickOnStudentMenu();
    }

    @Before(value = "@Second", order = 2)
    public static void navigateToRepresentativeAddPage(){
        StudentPage studentPage = new StudentPage();
        studentPage.clickOnPlusIcon();
        studentPage.scrollToRepresentativeTab();
        studentPage.clickOnRepresentativesTab();
    }

    @After
    public void screenShot(Scenario scenario){

        if (scenario.isFailed()) {
            TakesScreenshot screenshot = ((TakesScreenshot)driver);
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            String featureFileName = scenario.getName();
            File destinationFile = new File("target/FailedScreenshots/" + featureFileName + ".png");
            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterAll
    public static void closeBrowser() {
        Driver.quitDriver();
    }
}
