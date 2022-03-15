package project16.groupSolutions.group3.POM;

import project16.groupSolutions.group3.Utilities.ReadFromConfigFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SchoolDepartmentsPage extends BasePOM{

    public SchoolDepartmentsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),' Departments')]")
    private WebElement schoolDepartmentStatement;

    @FindBy(xpath = "((//div[@fxlayoutalign='end center'])[3]//button)[1]")
    private WebElement plusSignButton;

    @FindBy(css = "div[class='mat-tab-labels']>div:nth-child(1)")
    private WebElement selectTabOfSchoolDepartmentInNewSchoolDepartment;

    @FindBy(css = "div[class='mat-tab-labels']>div:nth-child(2)")
    private WebElement selectTabOfSectionInNewSchoolDepartment;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'COST')]")
    private WebElement plusIconInSection;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement textBoxForNameOfSchoolDepartment;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement textBoxForCodeOfSchoolDepartment;

    @FindBy(xpath = "(//school-department-section//div//div//mat-form-field//div//div//div//ms-text-field//input)[1]")
    private WebElement textBoxForNameOfSection;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    private WebElement testBoxForShorNameOfSection;

    @FindBy(css = "div[fxflexalign='center']>ms-button")
    private WebElement addButtonInSectionTab;

    @FindBy(tagName = "ms-save-button")
    private WebElement saveButtonOfNewSchoolDepartment;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement existedMessage;

    @FindBy(xpath = "//td[text()='High School Class-007']//following-sibling::td[3]//descendant::ms-delete-button")
    private WebElement trashCanItemForHighSchoolClasses;

    @FindBy(xpath = "//td[text()='High School-007']")
    private WebElement penToSquareItemForHighSchool;

    @FindBy(xpath = "//td[text()='High School Class-007']")
    private WebElement penToSquareItemForHighSchoolClasses;

    @FindBy(xpath = "//td[text()='High School-007']")
    private WebElement textFieldOfNameForHighSchool;

    @FindBy(xpath = "//td[text()='High School Class-007']")
    private WebElement textFieldOfNameForHighSchoolClassAfterEdit;

    @FindBy(xpath = "//td[text()=' HS-007 ']")
    private WebElement textFieldOfCodeForHighSchool;

    @FindBy(xpath = "//td[text()=' HSC-007 ']")
    private WebElement textFieldOfCodeForHighSchoolAfterEdit;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[2])[1]")
    private WebElement textFieldOfNameForJuniorClasses;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[2])[2]")
    private WebElement textFieldOfNameForSeniorClasses;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[3])[1]")
    private WebElement textFieldOfShortNameForJunior;

    @FindBy(xpath = "((//tbody[@role='rowgroup'])[2]//tr//td[3])[2]")
    private WebElement textFieldOfShortNameForSenior;

    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base'])[3]")
    private WebElement dismissButtonForPopupWindow;

    @FindBy(css = "button[type='submit']")
    private WebElement submitDeleteButton;

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement exitMessage;

    @FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    private WebElement searchButton;

    private void clickPlusSignButton(){
        clickOnElement(plusSignButton);
    }
    private void clickSelectTabOfSchoolDepartment(){
        clickOnElement(selectTabOfSchoolDepartmentInNewSchoolDepartment);
    }
    private void clickSelectTabOfSection(){
        clickOnElement(selectTabOfSectionInNewSchoolDepartment);
    }
    private void clickPlusIconInSection(){
        clickOnElement(plusIconInSection);
    }
    private void inputNameOfSchoolDepartment(String string){
        sendKeysToElement(textBoxForNameOfSchoolDepartment,string);
    }
    private String getTextOfNameOfSchoolDepartment(){
        return getTextOfElement(textFieldOfNameForHighSchool);
    }
    private String getTextOfNameOfSchoolDepartmentAfterEdit(){
        return getTextOfElement(textFieldOfNameForHighSchoolClassAfterEdit);
    }
    private String getTextOfCodeOfSchoolDepartmentAfterEdit(){
        return getTextOfElement(textFieldOfCodeForHighSchoolAfterEdit);
    }
    private void inputCodeOfSchoolDepartment(String string){
        sendKeysToElement(textBoxForCodeOfSchoolDepartment,string);
    }
    private String getTextOfCodeOfSchoolDepartment(){
        return getTextOfElement(textFieldOfCodeForHighSchool);
    }
    private void inputNameOfSection(String string){
        sendKeysToElement(textBoxForNameOfSection,string);
    }
    private void inputShortNameOfSection(String string){
        sendKeysToElement(testBoxForShorNameOfSection,string);
    }
    private void clickAddButtonInSectionTab(){
        clickOnElement(addButtonInSectionTab);
    }
    private void clickSaveButton(){
        clickOnElement(saveButtonOfNewSchoolDepartment);
    }
    private String getTextOfSuccessMessage(){
        return getTextOfElement(successMessage);
    }
    private String getTextOfExistedDepartmentMessage(){
        return getTextOfElement(existedMessage);
    }
    private void clickTrashCanItemForHighSchoolClasses(){
        clickOnElement(trashCanItemForHighSchoolClasses);
    }
    private void clickPenToSquareItemForHighSchool(){
        clickOnElement(penToSquareItemForHighSchool);
    }
    private void clickPenToSquareItemForHighSchoolClass(){
        clickOnElement(penToSquareItemForHighSchoolClasses);
    }
    private String getTextOfNameForJuniorClasses(){
        return getTextOfElement(textFieldOfNameForJuniorClasses);
    }
    private String getTextOfNameForSeniorClasses(){
        return getTextOfElement(textFieldOfNameForSeniorClasses);
    }
    private String getTextOfShortNameForJunior(){
        return getTextOfElement(textFieldOfShortNameForJunior);
    }
    private String getTextOfShortNameForSenior(){
        return getTextOfElement(textFieldOfShortNameForSenior);
    }
    private void clickDismissButtonForPopupWindow(){
        clickOnElement(dismissButtonForPopupWindow);
    }
    private void clickSubmitDeleteButton(){
        clickOnElement(submitDeleteButton);
    }
    private void clickExitMessage(){
        clickOnElement(exitMessage);
    }
    private void clickSearchButton(){
        clickOnElement(searchButton);
    }
    private String getDepartmentPageURL(){
        return driver.getCurrentUrl();
    }



    public void ValidateUserOnDepartmentPage(){
        wait.until(ExpectedConditions.visibilityOf(schoolDepartmentStatement));
        Assert.assertEquals(getDepartmentPageURL(), ReadFromConfigFile.getValueFor("departmentpage"),"User is on DepartmentPage now");
    }
    public void createSchoolDepartment(){
        clickPlusSignButton();
        inputNameOfSchoolDepartment("High School-007");
        inputCodeOfSchoolDepartment("HS-007");
        clickSelectTabOfSection();
        clickPlusIconInSection();
        inputNameOfSection("Junior classes");
        inputShortNameOfSection("Junior");
        clickAddButtonInSectionTab();
        inputNameOfSection("Senior Classes");
        inputShortNameOfSection("Senior");
        clickAddButtonInSectionTab();
        clickSaveButton();
    }
    public void validateSuccessMessage(){
        Assert.assertTrue(getTextOfSuccessMessage().toLowerCase().contains("successfully"),"Create school department successfully");
    }
    public void verifyCreatedSchoolDepartment(){
        String actualCreateSchool = getTextOfNameOfSchoolDepartment();
        String expectedCreateSchool = "High School-007";
        Assert.assertEquals(actualCreateSchool, expectedCreateSchool, "Verifying School Success!");
        clickPenToSquareItemForHighSchool();
        clickSelectTabOfSection();
        String actualCreateJuniorClasses = getTextOfNameForJuniorClasses();
        String expectedCreateJuniorClasses = "Junior classes";
        Assert.assertEquals(actualCreateJuniorClasses,expectedCreateJuniorClasses,"Verifying Junior Class success!");
        String actualCreateSeniorClasses = getTextOfNameForSeniorClasses();
        String expectedCreateSeniorClasses = "Senior Classes";
        Assert.assertEquals(actualCreateSeniorClasses,expectedCreateSeniorClasses,"Verifying Senior Class success!");
        clickDismissButtonForPopupWindow();
    }
    public void validateExistedSchoolNameMessage(){
        String actualExistSchoolMessage = getTextOfExistedDepartmentMessage();
        String expectedExistSchoolMessage = "There is already Department with \"High School-007\" name!";
        Assert.assertEquals(actualExistSchoolMessage,expectedExistSchoolMessage,"Verifying ExistSchool Message.");
        clickDismissButtonForPopupWindow();
    }
    public void createSchoolDepartmentWithSameNameAndDifferentCode(){
        clickPlusSignButton();
        inputNameOfSchoolDepartment("High School-007");
        inputCodeOfSchoolDepartment("HSC-007");
        //clickExitMessage();
        clickSaveButton();
    }
    public void createSchoolDepartmentWithDifferentNameAndSameCode(){
        clickPlusSignButton();
        inputNameOfSchoolDepartment("High School Class-007");
        inputCodeOfSchoolDepartment("HS-007");
        //clickExitMessage();
        clickSaveButton();
    }
    public void validateExistedSchoolCodeMessage(){
        String actualExistSchoolMessage3 = getTextOfExistedDepartmentMessage();
        String expectedExistSchoolMessage3 = "There is already Department with \"HS-007\" code!";
        Assert.assertEquals(actualExistSchoolMessage3,expectedExistSchoolMessage3,"Verifying ExistSchool Message.");
        clickDismissButtonForPopupWindow();
    }
    public void editExistedDepartmentWithDifferentNameAndCode(){
        clickPenToSquareItemForHighSchool();
        inputNameOfSchoolDepartment("High School Class-007");
        inputCodeOfSchoolDepartment("HSC-007");
        //clickExitMessage();
        clickSaveButton();
    }
    public void verifySchoolDepartmentAfterEditing(){
        String actualAfterEditSchool = getTextOfNameOfSchoolDepartmentAfterEdit();
        String expectedAfterEditSchool = "High School Class-007";
        Assert.assertEquals(actualAfterEditSchool,expectedAfterEditSchool,"Verifying After Edit School!");
        String actualAfterEditCode = getTextOfCodeOfSchoolDepartmentAfterEdit();
        String expectedAfterEditCode = "HSC-007";
        Assert.assertEquals(actualAfterEditCode,expectedAfterEditCode,"Verifying After Edit Code!");
    }
    public void addThreeSectionsInHighSchoolClass(){
        clickPenToSquareItemForHighSchoolClass();
        clickSelectTabOfSection();
        clickPlusIconInSection();
        inputNameOfSection("High level");
        inputShortNameOfSection("High");
        clickAddButtonInSectionTab();
        inputNameOfSection("Medium level");
        inputShortNameOfSection("Medium");
        clickAddButtonInSectionTab();
        inputNameOfSection("Low level");
        inputShortNameOfSection("Low");
        clickAddButtonInSectionTab();
        clickSaveButton();
    }
    public void deleteHighSchoolClassDepartment(){
        clickSearchButton();
        clickTrashCanItemForHighSchoolClasses();
        clickSubmitDeleteButton();
        clickTrashCanItemForHighSchoolClasses();
        clickSubmitDeleteButton();
    }

}
