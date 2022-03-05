package CampusProjectSolutions.pages;

import CampusProjectSolutions.enums.LocatorType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SchoolDepartmentsPage extends BasePage {
    public SchoolDepartmentsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement plusIcon;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement schoolDepartmentNameTextBox;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement sectionNameTextBox;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement codeTextBox;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(css = "div>dynamic-view>div")
    private WebElement dialogBox;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement closeButton;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement sectionTab;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement shortNameTextBox;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement addButton;

    @FindBy(css = "ms-delete-button")
    private WebElement deleteSchoolDepartmentButton;

    @FindBy(xpath = "//button//span[contains(text(), 'Delete')]")
    private WebElement deleteButton;

    @FindBys(
            @FindBy(xpath = "//tbody//td[2]")
    )
    private List<WebElement> schoolDepartmentsNameList;

    @FindBys(
            @FindBy(xpath = "//tbody//td[3]")
    )
    private List<WebElement> schoolDepartmentsCodeList;

    @FindBys(
            @FindBy(xpath = "//school-department-section//tbody//td[2]")
    )
    private List<WebElement> schoolDepartmentsSectionNameList;

    @FindBys(
            @FindBy(xpath = "//school-department-section//tbody//td[3]")
    )
    private List<WebElement> schoolDepartmentsSectionShortNameList;

    private WebElement getRowContainsSchoolDepartmentNameOf(String schoolDepartmentName) {
        return getDynamicElement(LocatorType.XPATH, "//tbody//tr//td[text() = '" + schoolDepartmentName + "']");
    }

    public void clickOnSectionTab() {
        clickOnElement(sectionTab);
        sleepFor(1000);
    }

    public void enterShortName(String shortName) {
        sendKeysToElement(shortNameTextBox, shortName);
    }

    public void clickOnAddButtonInSection() {
        clickOnElement(addButton);
    }

    public void clickOnPlusIcon() {
        clickOnElement(plusIcon);
        sleepFor(1000);
    }

    public void enterSchoolDepartmentName(String name) {
        sendKeysToElement(schoolDepartmentNameTextBox, name);
    }

    public void enterSectionName(String name) {
        sendKeysToElement(sectionNameTextBox, name);
    }

    public void enterCode(String code) {
        sendKeysToElement(codeTextBox, code);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
        sleepFor(1000);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
        sleepFor(1000);
    }

    public void clickOnSchoolDepartmentDeleteButton() {
        clickOnElement(deleteSchoolDepartmentButton);
        sleepFor(1000);
    }

    public void closeModalWindow() {
        clickOnElement(closeButton);
    }

    public String getDialogBoxMessage() {
        return getTextOf(dialogBox);
    }

    public void waitUntilDialogBoxDisappears() {
        waitTillElementDisappears(dialogBox);
    }

    public ArrayList<String> getSchoolDepartmentsNameList() {
        return getTextsOfElementList(schoolDepartmentsNameList);
    }

    public ArrayList<String> getSchoolDepartmentsCodeList() {
        return getTextsOfElementList(schoolDepartmentsCodeList);
    }

    public ArrayList<String> getSchoolDepartmentsSectionShortNameList() {
        return getTextsOfElementList(schoolDepartmentsSectionShortNameList);
    }

    public ArrayList<String> getSchoolDepartmentsSectionNameList() {
        return getTextsOfElementList(schoolDepartmentsSectionNameList);
    }

    public void clickOnSchoolDepartmentRowWithName(String schoolDepartmentName) {
        clickOnElement(getRowContainsSchoolDepartmentNameOf(schoolDepartmentName));
        sleepFor(1000);
    }

}
