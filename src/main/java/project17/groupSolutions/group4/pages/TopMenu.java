package project17.groupSolutions.group4.pages;

import project17.groupSolutions.group4.enums.LocatorType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends BasePage {
    public TopMenu() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[data-icon='bars']")
    private WebElement moreButton;

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
