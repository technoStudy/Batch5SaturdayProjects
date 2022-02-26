package project14.groupSolutions.group3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceAnOrder {
    public PlaceAnOrder(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "img[alt=\"My Store\"]")
    public WebElement homePage;

    @FindBy(css = "img[title=\"Faded Short Sleeve T-shirts\"]")
    public WebElement hoverOver;

    @FindBy(xpath = "(//span[text()=\"Add to cart\"])[1]")
    public WebElement addCart;

    @FindBy(css = "a[class=\"btn btn-default button button-medium\"]")
    public WebElement proceedCheckOut;

    @FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
    public WebElement ProceedCheckOut2;

    @FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
    public WebElement ProceedCheckOut3;

    @FindBy(css = "#cgv")
    public WebElement checkbox;

    @FindBy(css = "button[name=\"processCarrier\"]")
    public WebElement ProceedCheckOut4;

    @FindBy(css = "a[class=\"bankwire\"]")
    public WebElement bankWire;

    @FindBy(css = "button[class=\"button btn btn-default button-medium\"]")
    public WebElement submit;

    @FindBy(xpath = "//strong[text()=\"Your order on My Store is complete.\"]")
    public WebElement validate;

    @FindBy(css = "div[class='box']")
    public WebElement completed;

    @FindBy(xpath = "//a[text()='My orders']")
    public WebElement myOrders;

    @FindBy(css = "a[class='color-myaccount']")
    public WebElement code;









}
