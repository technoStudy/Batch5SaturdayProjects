package project14.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPages extends Base {
    public AccountPages() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    private WebElement orderReferenceCode;

    public String getOrderReferenceCode() {
        return getTextOf(orderReferenceCode);
    }
}
