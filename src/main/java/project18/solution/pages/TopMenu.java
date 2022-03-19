package project18.solution.pages;

import project18.solution.enums.LocatorType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends BasePage {
    public TopMenu() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[data-icon='bars']")
    private WebElement moreButton;

    @FindBy(xpath = "//button[@aria-haspopup]//img")
    private WebElement userProfileImage;

    @FindBy(xpath = "//span[text()='Sign out']")
    private WebElement signOutButton;

    private WebElement getTopMenuItem(String menuName) {
        return getDynamicElement(LocatorType.XPATH, "//button//span[text()='" + menuName + "']");
    }

    public void clickOnMoreButton() {
        clickOnElement(moreButton);
    }

    public void hoverOverSetupMenu() {
        hoverOverElement(getTopMenuItem("Setup"));
    }

    public void hoverOverSchoolSetupMenu() {
        hoverOverElement(getTopMenuItem("School Setup"));
    }

    public void clickOnDepartmentsMenu() {
        clickOnElement(getTopMenuItem("Departments"));
    }

    public void clickOnStudentMenu() {
        clickOnElement(getTopMenuItem("Student"));
    }

    public void clickOnStudentsMenu() {
        clickOnElement(getTopMenuItem("Students"));
    }

    public boolean isUserProfileImageDisplayed() {
        return isElementDisplayed(userProfileImage);
    }

    public void clickOnUserProfileImage() {
        clickOnElement(userProfileImage);
    }

    public void clickOnSignOutButton() {
        clickOnElement(signOutButton);
    }
}
