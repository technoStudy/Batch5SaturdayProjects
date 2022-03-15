package project16.groupSolutions.group4.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage extends BasePOM{

    public DeletePage() {
        PageFactory.initElements(driver, this); }
    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']//button)[1]")
    private WebElement trashIconForHighSchoolClasses;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']//button)[2]")
    private WebElement trashIconForSchoolDepartment;

    @FindBy(css = "button[type='submit']")
    private WebElement deleteButton;

    @FindBy(xpath = "//td[text()=' There is no data to display ']")
    private WebElement noDataDisplayMessage;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    public void clickTrashIconOnHighSchoolClasses(){
        clickOnElement(trashIconForHighSchoolClasses);
    }
    public void clickTrashIconOnSchoolDepartment(){
        clickOnElement(trashIconForSchoolDepartment);
    }
    public void confirmDeleteHighSchoolClasses(){
        clickOnElement(deleteButton);
    }
    public void confirmDeleteSchoolDepartment(){
        clickOnElement(deleteButton);
    }

    public void deleteDepartmentAndClasses() {
        clickTrashIconOnHighSchoolClasses();
        confirmDeleteHighSchoolClasses();
        clickTrashIconOnSchoolDepartment();
        confirmDeleteSchoolDepartment();
    }

    public void validateDeleteSuccessMessage() {
        validateSuccessMessage(successMessage);
    }
}
