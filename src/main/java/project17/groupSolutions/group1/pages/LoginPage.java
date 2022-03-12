package project17.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[data-placeholder='Username']")
    private WebElement usernameTextBox;

    @FindBy(css = "input[data-placeholder='Password']")
    private WebElement passwordTextBox;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "button.consent-give")
    private WebElement acceptAllCookiesButton;

    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//div[(text()='Invalid username or password')]")
    private WebElement invalidMessage;

    public void enterUsername(String username) {
        sendKeysToElement(usernameTextBox, username);
    }

    public void enterPassword(String password) {
        sendKeysToElement(passwordTextBox, password);
    }

    public void enterPassword2(String invalidPassword) {
        sendKeysToElement(passwordTextBox, invalidPassword);
    }

    public void enterUsername2(String Username) {
        sendKeysToElement(usernameTextBox, Username);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnAcceptAllCookiesButton() {
        clickOnElement(acceptAllCookiesButton);
    }

    public String getTextOfInvalidMessage() {
        return getTextOf(invalidMessage);
    }

}
