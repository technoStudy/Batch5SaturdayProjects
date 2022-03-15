package project16.groupSolutions.group1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentsPage extends Base {
    public DepartmentsPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement plusIcon;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameField;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement codeField;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()='School Department']")
    private WebElement schoolDepartmentTab;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement exitButton;

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement clickExitMessage;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement existSchoolMessage;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    public void clickPlusIcon(){
        clickOnElement(plusIcon);
    }
    public void sendName(String name){
        clickAndSendKeysToElement(nameField,name);
    }

    public void sendCode(String code){
        sendKeysToElement(codeField,code);
    }

    public void clickSaveButton(){
        clickOnElement(saveButton);
    }
    public void clickSchoolDepartmentTab(){
        clickOnElement(schoolDepartmentTab);
    }
    public void clickExitButton(){
        clickOnElement(exitButton);
    }
    public void clickExitMessage(){
        clickOnElement(clickExitMessage);
    }
    public  void clickEditButton(){
        clickOnElement(editButton);
    }

    public String getTextOfExistMessage(){
        return getTextOf(existSchoolMessage);
    }
}
