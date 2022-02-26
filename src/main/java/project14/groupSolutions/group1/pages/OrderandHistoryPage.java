package project14.groupSolutions.group1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderandHistoryPage extends Base {

    public OrderandHistoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[class='account']")
    private WebElement accountIcon;

    @FindBy(css = "a[title='Orders']")
    private WebElement orderHistoryAndDetailIcon;

    @FindBy(css = "a[class='color-myaccount']")
    private WebElement orderReferenceList;

    public void clickAccountIcon(){
        clickOnElement(accountIcon);
    }
    public void clickOrderHistoryAndDetail(){
        clickOnElement(orderHistoryAndDetailIcon);
    }
    public String getOrderReferenceFromOrderList(){
        return getTextOf(orderReferenceList);
    }
}
