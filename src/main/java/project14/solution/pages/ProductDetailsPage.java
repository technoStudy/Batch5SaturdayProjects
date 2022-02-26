package project14.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends Base {
    public ProductDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public void clickOnProceedToCheckout(){
        clickOnElement(proceedToCheckoutButton);
    }
}
