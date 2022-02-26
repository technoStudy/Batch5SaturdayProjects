package project12.groupSolutions.group3.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_EditingAddressPage {

    public _04_EditingAddressPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "address_first_name")
    public WebElement firstName;

    @FindBy(id = "address_last_name")
    public WebElement lastName;

    @FindBy(css = "input[data-disable-with='Update Address']")
    public WebElement updateButton;

}
