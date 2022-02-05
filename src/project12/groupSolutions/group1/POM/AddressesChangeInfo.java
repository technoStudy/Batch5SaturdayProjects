package project12.groupSolutions.group1.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesChangeInfo {
    public AddressesChangeInfo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[text()='Edit'])[1]")
    public WebElement clickEditButton;

    @FindBy(xpath = "//input[@data-disable-with='Update Address']")
    public  WebElement updateAddress;

    @FindBy(xpath = "(//a[text()='Destroy'])[1]")
    public  WebElement clickDestroyButton;

    @FindBy(css = "div[class = 'alert alert-notice']")
    public  WebElement addressDestroyMessage;

}
