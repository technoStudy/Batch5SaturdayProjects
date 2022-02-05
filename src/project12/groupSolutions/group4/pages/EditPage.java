package project12.groupSolutions.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {

    public EditPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//table[@class='table']//a[text()='Edit']")
    public WebElement editButton;

   @FindBy(css = "input[name='commit']")
    public WebElement updateAddressButton;

}
