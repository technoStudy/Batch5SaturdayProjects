package project16.groupSolutions.group4.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SchoolDepartmentPage extends BasePOM{

    public SchoolDepartmentPage() { PageFactory.initElements(driver, this); }

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

    @FindBy(xpath = "//td[text()='High School889900']")
    private WebElement highSchoolInList;

    @FindBy(xpath = "//td[text()='Junior classes']")
    private WebElement juniorClassesInList;

    @FindBy(xpath = "//td[text()='Senior Classes']")
    private WebElement seniorClassesInList;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//td[text()='High School Classes8899002']")
    private WebElement afterEditHighSchoolList;

    @FindBy(xpath = "//td[text()=' HSC-18899002 ']")
    private WebElement afterEditSchoolCode;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement sectionTab;

    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'COST')]")
    private WebElement plusIconInSection;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement shortNameField;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;



    public String getTextOfHighSchool(){ return getTextOf(highSchoolInList); }
    public void clickHighSchool(){ clickOnElement(highSchoolInList); }
    public String getTextOfJuniorClasses(){ return getTextOf(juniorClassesInList); }
    public String getTextOfSeniorClasses(){ return getTextOf(seniorClassesInList); }
    public String getTextOfEditHighSchool(){ return getTextOf(afterEditHighSchoolList); }
    public String getTextOfEditSchoolCode(){ return getTextOf(afterEditSchoolCode); }

    public void clickPlusIcon(){ clickOnElement(plusIcon); }
    public void sendName(String name){clickAndSendKeysToElement(nameField,name); }
    public void sendCode(String code){ sendKeysToElement(codeField,code); }
    public void clickSaveButton(){ clickOnElement(saveButton); }
    public void clickSchoolDepartmentTab(){ clickOnElement(schoolDepartmentTab); }
    public void clickExitButton(){ clickOnElement(exitButton); }
    public void clickExitMessage(){ clickOnElement(clickExitMessage); }
    public void clickPlusInSection(){
        clickOnElement(plusIconInSection);
    }
    public void clickSectionButton(){
        clickOnElement(sectionTab);
    }
    public void sendshortName(String shortName){
        clickAndSendKeysToElement(shortNameField,shortName);
    }
    public void clickAddButtonInSection(){
        clickOnElement(addButton);
    }
    public  void clickEditButton(){ clickOnElement(editButton); }
    public String getTextOfExistMessage(){ return getTextOf(existSchoolMessage); }

    public void addNewDepartment() {

        clickPlusIcon();
        sendName("High School889900");
        sendCode("HS-188990");
        clickSectionButton();
        clickPlusInSection();
        sendName("Junior classes");
        sendshortName("Junior");
        clickAddButtonInSection();
        sendName("Senior Classes");
        sendshortName("Senior");
        clickAddButtonInSection();
        clickSchoolDepartmentTab();
        clickSaveButton();
        clickExitButton();

    }

    public void addDepartmentAgain() {
        clickPlusIcon();
        sendName("High School889900");
        sendCode("HS-188990");
        clickSaveButton();
        waitUntilElementVisibleAndClickableThenClick(exitButton);
    }

    public void addSameSchoolDiffCode() {
        clickPlusIcon();
        sendName("High School889900");
        sendCode("HSC-188991");
        clickSaveButton();
        waitUntilElementVisibleAndClickableThenClick(exitButton);
    }

    public void addDiffSchoolSameCode() {
        clickPlusIcon();
        sendName("High School Classes8899001");
        sendCode("HS-188990");
        clickSaveButton();
        waitUntilElementVisibleAndClickableThenClick(exitButton);
    }

    public void editSchoolAndCode() {
        clickEditButton();
        sendName("High School Classes8899002");
        sendCode("HSC-18899002");
        clickSaveButton();
        clickExitMessage();
    }

    public  void validateMessageSuccess() { validateSuccessMessage(successMessage); }

    public void verifyAlertMessage() {
        String actualExistSchoolMessage = getTextOfExistMessage();
        String expectExistSchoolMessage = "There is already Department with \"High School889900\" name!";
        Assert.assertEquals(actualExistSchoolMessage, expectExistSchoolMessage, "Verifying ExistSchoolMessage ");
    }

    public void verifySecondAlertMessage() {
        String actualExistSchoolMessage2 = getTextOfExistMessage();
        String expectExistSchoolMessage2 = "There is already Department with \"High School889900\" name!";
        Assert.assertEquals(actualExistSchoolMessage2, expectExistSchoolMessage2, "Verifying ExistSchoolMessage ");
    }

    public void verifyThirdAlertMessage() {
        String actualExistSchoolMessage3 = getTextOfExistMessage();
        String expectExistSchoolMessage3 = "There is already Department with \"HS-188990\" code!";
        Assert.assertEquals(actualExistSchoolMessage3, expectExistSchoolMessage3, "Verifying ExistSchoolMessage ");
    }

    public void verifyAfterEdit() {
        String actualAfterEditSchoolList = getTextOfEditHighSchool();
        String expectAfterEditSchoolList = "High School Classes8899002";
        Assert.assertEquals(actualAfterEditSchoolList, expectAfterEditSchoolList, "Verifying After Edit School");
        String actualAfterEditSchoolCode = getTextOfEditSchoolCode();
        String expectAfterEditSchoolCode = "HSC-18899002";
        Assert.assertEquals(actualAfterEditSchoolCode, expectAfterEditSchoolCode, "Verifying After Edit Code");

    }
}
