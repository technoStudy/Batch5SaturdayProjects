package project14.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends Base {

    public ContactUsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactUsIcon;

    @FindBy(id = "id_contact")
    private WebElement subjectHeadingIcon;

    @FindBy(id = "message")
    private WebElement textareaIcon;

    @FindBy(id = "submitMessage")
    private WebElement sendIcon;

    public void clickContactIcon(){
        clickOnElement(contactUsIcon);
    }
    public void selectSubjectHeading(String dropDown){
        selectDropDownByIndex(subjectHeadingIcon,dropDown);
    }
    public void sendTextInTextBox(String text){
        sendKeysToElement(textareaIcon,text);
    }
    public void clickSendIcon(){
        clickOnElement(sendIcon);
    }
}
