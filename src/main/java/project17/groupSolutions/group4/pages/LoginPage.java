package project17.groupSolutions.group4.pages;

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

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    private WebElement invalidInputMessage;

    public void enterUsername(String username){
        sendKeysToElement(usernameTextBox, username);
    }

    public void enterPassword(String password){
        sendKeysToElement(passwordTextBox, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public void clickOnAcceptAllCookiesButton(){
        clickOnElement(acceptAllCookiesButton);
    }

    public String getWelcomeMessage() {
        return getTextOf(welcomeMessage);
    }

    public String getInvalidInputMessage() {
        return getTextOf(invalidInputMessage);
    }
}
