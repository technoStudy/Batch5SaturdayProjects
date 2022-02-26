package project12.groupSolutions.group3.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class _01_HomePage {

    public _01_HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[href='/addresses']")
    public WebElement addresses;

    @FindBy(xpath = "//a[text()='Sign out']")
    public WebElement signOutButton;

    @FindBy(tagName = "h2")
    public WebElement addressesText;

    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement addNewAddress;

    @FindBy(xpath = "//a[text()='Destroy']")
    public WebElement destroyButton;

    @FindBy(css = "div[class='alert alert-notice']")
    public WebElement destroyedMessage;

}
