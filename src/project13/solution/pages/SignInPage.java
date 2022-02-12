package project13.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Base{
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }

    // List the web elements. Make sure that the web elements are private
    @FindBy(id = "session_email")
    private WebElement emailTextBox;

    @FindBy(id = "session_password")
    private WebElement passwordTextBox;

    @FindBy(css = "input[value='Sign in']")
    private WebElement signInButton;


    // List the actions of the web elements. Use the generic web elelment action methods inherited from Base class.
    public void enterEmail(String email){
        sendKeysToElement(emailTextBox, email);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordTextBox, password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
}
