package project14.solution.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPages extends Base {
    public ShoppingCartPages() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p//span[contains(text(), 'Proceed to checkout')]")
    private WebElement proceedToCheckoutButton;

    @FindBy(id = "uniform-cgv")
    private WebElement termsOfServiceCheckbox;

    @FindBy(css = "a[title='Pay by bank wire']")
    private WebElement bankWireButton;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    private WebElement confirmOrderButton;

    @FindBy(css = "p.cheque-indent")
    private WebElement orderCompletedMessage;

    @FindBy(css = "div.box")
    private WebElement orderReferenceCodeMessage;

    @FindBy(css = "a[title = 'Back to orders']")
    private WebElement backToOrdersLink;

    public void clickOnProceedToCheckoutButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", proceedToCheckoutButton);
        clickOnElement(proceedToCheckoutButton);
    }

    public void clickOnTermsOfServiceCheckbox() {
        clickOnElement(termsOfServiceCheckbox);
    }

    public void clickOnPayByBankWire() {
        clickOnElement(bankWireButton);
    }

    public void clickOnConfirmOrderButton() {
        clickOnElement(confirmOrderButton);
    }

    public String getOrderCompletedMessage() {
        return getTextOf(orderCompletedMessage);
    }

    public String getOrderReferenceCodeMessage() {
        return getTextOf(orderReferenceCodeMessage);
    }

    public void clickOnBackToOrdersLink() {
        clickOnElement(backToOrdersLink);
    }
}
