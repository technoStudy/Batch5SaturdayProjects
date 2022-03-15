package project16.groupSolutions.group1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Base{
    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement cookiesButton;

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement userNameInput;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginInButton;

    public void clickCookiesIcon(){
        clickOnElement(cookiesButton);
    }

    public void sendUserName(String userName){
        sendKeysToElement(userNameInput,userName);
    }
    public void sendPassword(String password){
        sendKeysToElement(passwordInput,password);
    }
    public void clickLogIn(){
        clickOnElement(loginInButton);
    }

}
