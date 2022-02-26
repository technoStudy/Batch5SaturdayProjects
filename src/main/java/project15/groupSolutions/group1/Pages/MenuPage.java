package project15.groupSolutions.group1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends Base {
    public MenuPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[@class='ng-star-inserted'])[1]")
    private WebElement menuIcon;

    @FindBy(xpath = "(//button[@role='menuitem'])[1]")
    private WebElement setUpIcon;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetUpIcon;

    @FindBy(xpath = "//span[text()='Departments']/..")
    private WebElement departmentsIcon;

    public void clickMenu(){
        clickOnElement(menuIcon);
    }
    public void clickSetUp(){
        clickOnElement(setUpIcon);
    }
    public void clickSchoolSetUp(){
        clickOnElement(schoolSetUpIcon);
    }
    public void clickDepartments(){
        clickOnElement(departmentsIcon);
    }
}
