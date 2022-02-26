package project12.groupSolutions.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage extends Base{

    public ValidationPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "span[data-test='first_name']")
    private WebElement firstNameInput;

    @FindBy (css = "span[data-test='last_name']")
    public WebElement lastNameInputValidation;

    public String getTextOfFirstNameInput(){
        return getTextOf(firstNameInput);
    }

}
