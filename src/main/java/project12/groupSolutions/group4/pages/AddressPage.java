package project12.groupSolutions.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddressPage extends Base {

    public AddressPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Addresses']")
    private WebElement addressButton;

    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement newAddressButton;

    public void clickOnAddressButton() {
        clickOnElement(addressButton);
    }

}
