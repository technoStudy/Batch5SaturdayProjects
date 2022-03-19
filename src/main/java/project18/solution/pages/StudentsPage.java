package project18.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentsPage extends BasePage {
    public StudentsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addStudentPlusButton;

    @FindBy(css = "ms-add-button[tooltip='GENERAL.BUTTON.ADD_REPRESENTATIVE'] svg[data-icon='plus']")
    private WebElement addRepresentativePlusButton;

    @FindBy(xpath = "//div[text()='Representatives']")
    private WebElement representativeTab;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/span")
    private WebElement representativeFullName;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement noRepresentativeText;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    private WebElement representativeType;

    @FindBy(css = "td svg[data-icon='trash-can']")
    private WebElement deleteRepresentativeButton;

    @FindBy(xpath = "//button/span[text()=' Delete ']")
    private WebElement deleteButton;

    public void clickOnAddStudentPlusButton() {
        sleepFor(1000);
        clickOnElement(addStudentPlusButton);
    }

    public void clickOnAddRepresentativePlusButton() {
        clickOnElement(addRepresentativePlusButton);
    }

    public void clickOnRepresentativeTab() {
        clickOnElement(representativeTab);
        sleepFor(1000);
    }

    public String getRepresentativeFullName() {
        return getTextOf(representativeFullName);
    }

    public String getRepresentativeType() {
        return getTextOf(representativeType);
    }

    public void clickOnDeleteRepresentativeButton() {
        clickOnElement(deleteRepresentativeButton);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
        sleepFor(500);
    }

    public String getNoRepresentativeText() {
        return getTextOf(noRepresentativeText).trim();
    }
}
