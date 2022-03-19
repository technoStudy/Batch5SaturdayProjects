package project18.groupSolutions.group3.pages;

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

    @FindBy(xpath = "//div[text()='Invalid username or password']")
    private WebElement loginErrorMessage;

    @FindBy(css = "button[aria-label='Close']")
    private WebElement dialogBoxDismissButton;

    @FindBy(xpath = "//mat-error[contains(text(), 'Email is required')] ")
    private WebElement usernameRequiredMessage;

    @FindBy(xpath = "//mat-error[contains(text(), 'Password is required')] ")
    private WebElement passwordRequiredMessage;

    public void enterUsername(String username) {
        sendKeysToElement(usernameTextBox, username);
    }

    public void enterPassword(String password) {
        sendKeysToElement(passwordTextBox, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnAcceptAllCookiesButton() {
        clickOnElement(acceptAllCookiesButton);
    }

    public String getLoginErrorMessage() {
        return getTextOf(loginErrorMessage);
    }

    public void dismissErrorMessageBox() {
        clickOnElement(dialogBoxDismissButton);
    }

    public String getUsernameRequiredMessage() {
        return getTextOf(usernameRequiredMessage).trim();
    }

    public String getPasswordRequiredMessage() {
        return getTextOf(passwordRequiredMessage).trim();
    }
}
