package project12.groupSolutions.group3.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_ValuesAfterCreatingAddress {

    public _03_ValuesAfterCreatingAddress(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "span[data-test='first_name']")
    public WebElement validateFName;

    @FindBy(css = "span[data-test='last_name']")
    public WebElement validateLastName;

    @FindBy(linkText = "Edit")
    public WebElement editButton;

}
