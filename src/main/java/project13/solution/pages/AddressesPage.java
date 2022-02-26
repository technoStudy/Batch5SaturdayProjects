package project13.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage extends Base{
    public AddressesPage(){
        PageFactory.initElements(driver,this);
    }

    // List the web elements. Make sure that the web elements are private
    @FindBy(css = "a[data-test='addresses']")
    private WebElement addressesTab;

    @FindBy(css = "a[data-test='create']")
    private WebElement newAddressButton;

    @FindBy(css = "span[data-test='first_name']")
    private WebElement firstName;

    @FindBy(css = "span[data-test='last_name']")
    private WebElement lastName;

    @FindBy(css = "tr:nth-child(1) > td:nth-child(6) > a")
    private WebElement editButton;

    @FindBy(css = "input[value='Update Address']")
    private WebElement updateButton;

    @FindBy(linkText = "Destroy")
    private WebElement destroyButton;

    @FindBy(css = "div[data-test='notice']")
    private WebElement noticeMessage;

    // List the actions of the web elements. Use the generic web elelment action methods inherited from Base class.
    public void clickOnAddressesTab(){
        clickOnElement(addressesTab);
    }
    public void clickOnNewAddressesButton(){
        clickOnElement(newAddressButton);
    }
    public String getFirstName(){
        return  getTextOf(firstName);
    }
    public String getLastName(){
        return  getTextOf(lastName);
    }
    public void clickOnEditButton(){
        clickOnElement(editButton);
    }
    public void clickOnUpdateButton(){
        clickOnElement(updateButton);
    }
    public void clickOnDestroyButton(){
        clickOnElement(destroyButton);
    }
    public String getNoticeMessageText(){
        return getTextOf(noticeMessage);
    }
}
