package project14.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends Base {
    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_contact")
    private WebElement subjectHeadingMenu;

    @FindBy(id = "email")
    private WebElement emailAddressTextBox;

    @FindBy(id = "id_order")
    private WebElement orderReferenceTextBox;

    @FindBy(id = "message")
    private WebElement messageTextBox;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(css = "p.alert.alert-success")
    private WebElement alertSuccessMessage;

    public void selectFromSubjectHeadingMenu(int index) {
        selectFromDropDownMenuByIndex(subjectHeadingMenu, index);
    }

    public void enterEmailAddress(String email){
        sendKeysToElement(emailAddressTextBox, email);
    }

    public void enterOrderReference(String reference){
        sendKeysToElement(orderReferenceTextBox, reference);
    }

    public void enterMessage(String message){
        sendKeysToElement(messageTextBox, message);
    }

    public void clickOnSendButton(){
        clickOnElement(sendButton);
    }

    public String getAlertSuccessMessage(){
        return getTextOf(alertSuccessMessage);
    }
}
