package project18.solution.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project18.solution.enums.LocatorType;

public class AddRepresentativeModalPage extends BasePage {
    public AddRepresentativeModalPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text() = ' Add ']/parent::button")
    private WebElement addButton;

    @FindBy(xpath = "//span[text() = ' Close ']/parent::button")
    private WebElement closeButton;

    @FindBy(xpath = "//span[text()='Representative']")
    private WebElement representativeFormControlOption;

    private WebElement getRepresentativeOptionOf(String optionName) {
        return getDynamicElement(LocatorType.XPATH, "//span[contains(text(), '" + optionName + "')]");
    }

    private WebElement getFormControlOptionOf(String formControlName) {
        return getDynamicElement(LocatorType.CSS, "input[formcontrolname='" + formControlName + "']");
    }

    public void clickOnRepresentativeOptionOf(String optionName) {
        clickOnElement(getRepresentativeOptionOf(optionName));
    }

    public void enterFirstName(String firstName) {
        sendKeysToElement(getFormControlOptionOf("firstName"), firstName);
    }

    public void enterLastName(String lastName) {
        sendKeysToElement(getFormControlOptionOf("lastName"), lastName);
    }

    public void enterMobilePhone(String mobilePhone) {
        sendKeysToElement(getFormControlOptionOf("phone"), mobilePhone);
    }

    public void enterCountry(String country) {
        WebElement countryTextBox = getFormControlOptionOf("country");
        if (country.isBlank())
            for (int i = 0; i < 10; i++) {
                countryTextBox.sendKeys(Keys.BACK_SPACE);
            }
        else
            sendKeysToElement(countryTextBox, country);
    }

    public void clickOnRepresentativeFormControlOption() {
        clickOnElement(representativeFormControlOption);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        sleepFor(500);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
    }

    public boolean isAddButtonEnabled() {
        return addButton.isEnabled();
    }
}
