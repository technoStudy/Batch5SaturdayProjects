package project12.groupSolutions.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestroyPage {

    public DestroyPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Destroy']")
    public WebElement destroyButton;

    @FindBy(css = "div[data-test='notice']")
    public WebElement destroyConfirmMessage;

}
