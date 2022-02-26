package project15.solution.pages;

import CampusProjectSolutions.enums.LocatorType;
import CampusProjectSolutions.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends BasePage {
    public TopMenu() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[data-icon='bars']")
    private WebElement moreButton;

//    @FindBy(xpath = "//button//span[text()='Setup']")
//    private WebElement setupMenu;
//
//    @FindBy(xpath = "//button//span[text()='School Setup']")
//    private WebElement schoolSetupMenu;
//
//    @FindBy(xpath = "//button//span[text()='Departments']")
//    private WebElement departmentsMenu;
//
//    @FindBy(xpath = "//button//span[text()='Messaging']")
//    private WebElement messagingMenu;
//
//    @FindBy(xpath = "//button//span[text()='Student']")
//    private WebElement studentMenu;



    private WebElement getTopMenuItem(String menuName) {
        return getDynamicElement(LocatorType.XPATH, "//button//span[text()='" + menuName + "']");
    }

    public void clickOnMoreButton(){
        clickOnElement(moreButton);
    }

    public void hoverOverSetupMenu(){
        hoverOverElement(getTopMenuItem("Setup"));
    }

    public void hoverOverSchoolSetupMenu(){
        hoverOverElement(getTopMenuItem("School Setup"));
    }

    public void clickOnDepartmentsMenu(){
        clickOnElement(getTopMenuItem("Departments"));
    }

}
