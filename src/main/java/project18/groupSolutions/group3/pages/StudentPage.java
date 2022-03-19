package project18.groupSolutions.group3.pages;

import project18.groupSolutions.group3.enums.LocatorType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class StudentPage extends BasePage{
    public StudentPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement plusIcon;

    @FindBy(xpath = "(//div[text()='Representatives']//..)[1]")
    private WebElement representativesTab;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD_REPRESENTATIVE')]//button")
    private WebElement plusRepresentativesIcon;

    @FindBy(xpath = "//span[text()='Representative']")
    private WebElement representativesSelectText;

    @FindBy(xpath = "//span[text()=' Self ']")
    private WebElement selfInRepresentativesTest;

    @FindBy(css = "input[data-placeholder='First Name']")
    private WebElement firstnameTextBox;

    @FindBy(css = "input[data-placeholder='Last Name']")
    private WebElement lastnameTextBox;

    @FindBy(xpath = "(//input[@data-placeholder='Mobile Phone'])[2]")
    private WebElement mobilePhoneTextBox;

    @FindBy(css = "input[data-placeholder='Country']")
    private WebElement countryTextBox;

    @FindBy(xpath = "//span[text()=' Add ']//..")
    private WebElement addButton;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBys(
            @FindBy(xpath = "//tr//td[contains(@class,'mat-column-fullName')]")
    )
    private List<WebElement> representativeFullNameList;

    @FindBys(
            @FindBy(xpath = "//tr//td[contains(@class,'mat-column-type')]")
    )
    private List<WebElement> representativeTypeList;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement closeDialogButton;

    private WebElement getElementFromRepresentativeTestSelect(String representativeTypeName){
        return getDynamicElement(LocatorType.XPATH,"//span[text() = ' " + representativeTypeName + " ']");
    }

    private WebElement getTextElementAfterEnterCounty(String country){
        return getDynamicElement(LocatorType.XPATH, "//span[text() = '" + country + "']");
    }

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement matIconButton;

    @FindBy(css = "button[type='submit']")
    private WebElement deleteConfirmButton;

    public void clickOnRepresentativeTypeByName(String representativeTypeName){
        clickOnElement(getElementFromRepresentativeTestSelect(representativeTypeName));
        sleepFor(1000);
    }

    public void clickOnPlusIcon() {
        clickOnElement(plusIcon);
        sleepFor(1000);
    }

    public void scrollToRepresentativeTab(){
        scrollToSpecificElement(representativesTab);
    }

    public void clickOnRepresentativesTab(){
        clickOnElement(representativesTab);
    }

    public void clickOnPlusRepresentativesIcon(){
        clickOnElement(plusRepresentativesIcon);
    }

    public void clickOnRepresentativesText(){
        clickOnElement(representativesSelectText);
    }

    public void clickSelf(){
        clickOnElement(selfInRepresentativesTest);
    }

    public void enterRepresentativeFirstname(String firstname){
        sendKeysToElement(firstnameTextBox, firstname);
        sleepFor(1000);
    }

    public void enterRepresentativeLastname(String lastname){
        sendKeysToElement(lastnameTextBox, lastname);
        sleepFor(1000);
    }

    public void enterRepresentativeMobilePhone(String mobilePhone){
        sendKeysToElement(mobilePhoneTextBox, mobilePhone);
        sleepFor(1000);
    }

    public void enterRepresentativeCountry(String country){
        sendKeysToElement(countryTextBox, country);
        sleepFor(1000);
    }

    public void clickOnAddButton(){
        clickOnElement(addButton);
        sleepFor(1000);
    }

    public boolean getAddButtonStatus(){
        return addButton.isEnabled();
    }

    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }

    public ArrayList<String> getRepresentativeFullNameList(){
        return getTextsOfElementList(representativeFullNameList);
    }

    public ArrayList<String> getRepresentativeTypeList(){
        return getTextsOfElementList(representativeTypeList);
    }

    public void clickCloseDialogButton(){
        clickOnElement(closeDialogButton);
    }

    public void clickMatIconButton(){
        clickOnElement(matIconButton);
        sleepFor(1000);
    }

    public void clickDeleteConfirmButton(){
        clickOnElement(deleteConfirmButton);
    }

    public void clickOnTextAfterEnterCountry(String country){
        clickOnElement(getTextElementAfterEnterCounty(country));
    }
}
