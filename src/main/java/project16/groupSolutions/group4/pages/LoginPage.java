package project16.groupSolutions.group4.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePOM{

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button")
    private WebElement acceptCookies;

    public void enterUsername(String username){ sendKeysToElement(usernameInput, username); }

    public void enterPassword(String password){ sendKeysToElement(passwordInput, password); }

    public void clickOnLoginButton(){ clickOnElement(loginButton); }

    public void clickOnAcceptAllCookiesButton(){ clickOnElement(acceptCookies); }

    private String expectedUrlOnLoginPage = "https://test.mersys.io/";
    private String expectedUrlAfterLogin = "https://test.mersys.io/user-courses";


    public void validateUserOnLoginPage() {
        Assert.assertTrue(usernameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrlOnLoginPage);
    }

    public void validateUserSuccessfullyLoggedIn() {
        waitUntilElementVisibleAndClickableThenClick(welcomeMessage);
        Assert.assertTrue(welcomeMessage.isDisplayed());
        Assert.assertTrue(welcomeMessage.getText().contains("Welcome"));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrlAfterLogin);
    }

}


