package project16.groupSolutions.group4.pages;

import project16.groupSolutions.group4.enums.LocatorType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends BasePOM{
    public TopMenu() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[data-icon='bars']")
    private WebElement moreButton;

    private WebElement getTopMenuItem(String menuName) {
        return getDynamicElement(LocatorType.XPATH, "//button//span[text()='" + menuName + "']");
    }

    public void navigateToTopMenu() {
        clickOnElement(moreButton);
        hoverOverElement(getTopMenuItem("Setup"));
        hoverOverElement(getTopMenuItem("School Setup"));
        clickOnElement(getTopMenuItem("Departments"));
    }
}


