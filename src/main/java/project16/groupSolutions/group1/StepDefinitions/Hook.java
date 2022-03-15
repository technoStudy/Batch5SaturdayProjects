package project16.groupSolutions.group1.StepDefinitions;

import project16.groupSolutions.group1.Pages.Base;
import project16.groupSolutions.group1.Pages.LogInPage;
import project16.groupSolutions.group1.Utilites.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base {
    LogInPage logInPage = new LogInPage();

    @Before
    public void navigateToLogInPage() {
        logInPage.maximizeWindow();
        logInPage.navigateTo(ProjectConstants.SIGN_IN_URL.getText());
    }

    @After
    public void tearDown() {
       Driver.quitDriver();
    }
}
