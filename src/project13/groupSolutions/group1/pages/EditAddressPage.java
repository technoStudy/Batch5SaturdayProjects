package project13.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddressPage extends Base{
    public EditAddressPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[text()='Edit'])[1])" )
    private WebElement editButtonIcon;

    @FindBy(xpath = "//input[@data-disable-with='Update Address']")
    private WebElement updateAddressIcon;

    @FindBy(xpath = "(//a[text()='Destroy'])[1]")
    private WebElement destroyButtonIcon;

    public void clickEditButton(){
        clickOnElement(editButtonIcon);
    }
    public void clickUpdateAddress(){
        clickOnElement(updateAddressIcon);
    }
    public void clickDestroy(){
        clickOnElement(destroyButtonIcon);
    }

}
