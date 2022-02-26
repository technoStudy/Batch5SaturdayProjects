package project13.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Base{
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "session_email")
    private WebElement emailButton;

    @FindBy(id = "session_password")
    private  WebElement passwordButton;

    @FindBy(css = "input[value='Sign in']")
    private WebElement signInButton;

    public void sendEmail(){
        sendKeysToElement(emailButton,"fakeemail@gmail.com");
    }
    public void sendPassword(){
        sendKeysToElement(passwordButton,"123");
    }
    public void clickSignInButton(){
        clickOnElement(signInButton);
    }
}
