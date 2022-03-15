package project16.groupSolutions.group1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SectionTabPage extends Base{

    public SectionTabPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement sectionTab;

    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'COST')]")
    private WebElement plusIconInSection;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement shortNameField;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement addButton;

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
}
