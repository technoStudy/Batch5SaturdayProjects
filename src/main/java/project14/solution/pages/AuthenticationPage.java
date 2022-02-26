package project14.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends Base{
    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public void enterEmail(String email){
        sendKeysToElement(emailInput,email);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInput,password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
}
