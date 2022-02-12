package project13.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage extends Base {
      public ValidationPage(){
          PageFactory.initElements(driver,this);
      }
    @FindBy(xpath = "(//p[@class='row no-gutters'])[1]")
    private WebElement firstNameInput1;

    @FindBy(xpath = "(//p[@class='row no-gutters'])[2]")
    private WebElement lastNameInput1;

    @FindBy(css = "div[class = 'alert alert-notice']")
    private WebElement addressDestroyMessage;

    public String  getTextOfFirstNameInput(){
        return getTextOf(firstNameInput1);
    }
    public String getTextOfLastNameInput(){
        return getTextOf(lastNameInput1);
    }
    public String getTextOfDestroyMessage(){
        return getTextOf(addressDestroyMessage);
    }
}



