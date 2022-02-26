package project14.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Base{
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "login")
    private WebElement signInIcon;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public void clickSignInIcon(){
        clickOnElement(signInIcon);
    }
    public void enterEmail(String email){
        sendKeysToElement(emailInput,email);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInput,password);
    }
    public void clickSignInButton(){
        clickOnElement(signInButton);
    }
}
