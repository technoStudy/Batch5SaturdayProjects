package project14.groupSolutions.group3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
    public ContactUs(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#contact-link>a")
    public WebElement contactUs;

    @FindBy(css = "#id_contact")
    public WebElement subjectHeading;

    @FindBy(css = "select[name=\"id_order\"]")
    public WebElement choose;

    @FindBy(css = "span[class=\"action\"]")
    public WebElement chooseFile;

    @FindBy(css = "#message")
    public WebElement message;

    @FindBy(xpath = "//span[text()=\"Send\"]")
    public WebElement sendButton;





}