package project16.groupSolutions.group3.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopManuBar extends BasePOM{

    public TopManuBar(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//span[@class='ng-star-inserted']//button)[1]")
    private WebElement hamburgerButton;

    @FindBy(xpath = "(//span[text()='Setup'])[1]/..")
    private WebElement setupButtonInMenu;

    @FindBy(xpath = "(//span[text()='School Setup'])[1]/..")
    private WebElement schoolSetupButtonInMenu;

    @FindBy(xpath = "(//span[text()='Departments'])[1]/..")
    private WebElement departmentsButtonInMenu;

    private void clickHamburgerButton(){
        clickOnElement(hamburgerButton);
    }
    private void clickSetupButtonInMenu(){
        clickOnElement(setupButtonInMenu);
    }
    private void clickSchoolSetupButtonInMenu(){
        clickOnElement(schoolSetupButtonInMenu);
    }
    private void clickDepartmentButtonInMenu(){
        clickOnElement(departmentsButtonInMenu);
    }


    public void navigateToDepartmentPage(){
        clickHamburgerButton();
        clickSetupButtonInMenu();
        clickSchoolSetupButtonInMenu();
        clickDepartmentButtonInMenu();
    }



}
