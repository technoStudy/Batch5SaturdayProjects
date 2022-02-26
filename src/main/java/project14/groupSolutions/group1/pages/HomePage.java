package project14.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base{
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "img[class='logo img-responsive']")
    private WebElement logoIcon;

    @FindBy(xpath = "(//a[@title='Blouse'])[2]")
    private WebElement blouseItem;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    private WebElement summaryPageProceedCheckout;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    private WebElement addressPageProceedCheckout;

    @FindBy(css = "input[value='1']")
    private WebElement acceptTermOfService;

    @FindBy(css = "button[name='processCarrier']")
    private WebElement shippingPageProceedCheckout;

    @FindBy(css = "a[title='Pay by bank wire']")
    private WebElement bankWireIcon;

    @FindBy(css = "button[class='button btn btn-default button-medium']")
    private WebElement confirmOrderButton;

    @FindBy(css = "p[class='cheque-indent']")
    private WebElement completeOrderText;

    @FindBy(css = "div[class='box'")
    private WebElement orderReferenceInTextArea;

    public void clicklogoIcon(){
        clickOnElement(logoIcon);
    }
    public void clickBlouseItem(){
        clickOnElement(blouseItem);
    }
    public void clickAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public void clickProceedToCheckout(){
        scrollToSpecificElement(proceedToCheckoutButton);
    }
    public void clickSummaryPageCheckout(){
        scrollToSpecificElement(summaryPageProceedCheckout);
    }
    public void clickAddressPageCheckout(){
        scrollToSpecificElement(addressPageProceedCheckout);
    }
    public void clickCheckBox(){
        scrollInsideElement(acceptTermOfService);
    }
    public void clickShippingPageCheckout(){
        scrollToSpecificElement(shippingPageProceedCheckout);
    }
    public void clickPayBankWire(){
        clickOnElement(bankWireIcon);
    }
    public void clickConfirmOrder(){
        clickOnElement(confirmOrderButton);
    }
    public String getCompleteOrderText(){
       return getTextOf(completeOrderText);
    }
    public String getorderReferenceTextInTextarea(){
       return getTextOfscrollToSpecficElement(orderReferenceInTextArea);
    }
}
