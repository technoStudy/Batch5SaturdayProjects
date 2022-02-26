package project15.groupSolutions.group1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage extends Base {
    public DeletePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']//button)[1]")
    private WebElement trashIconForHighSchoolClasses;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']//button)[2]")
    private WebElement trashIconForSchoolDepartment;

    @FindBy(css = "button[type='submit']")
    private WebElement deleteButton;

    @FindBy(xpath = "//td[text()=' There is no data to display ']")
    private WebElement noDataDisplayMessage;

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
    public String getTextOFNodataDisplayMessage(){
        return getTextOf(noDataDisplayMessage);
    }

}
