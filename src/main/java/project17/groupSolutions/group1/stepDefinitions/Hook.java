package project17.groupSolutions.group1.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import project17.groupSolutions.group1.uitilites.Driver;
import project17.groupSolutions.group1.uitilites.ReadFromConfigFile;

public class Hook {

    @Before
    public static void navigateToLoginPage() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ReadFromConfigFile.getValueFor("homepage"));
    }

    @After
    public static void closeBrowser() {
        Driver.quitDriver();
    }
}