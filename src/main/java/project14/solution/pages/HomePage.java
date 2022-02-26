package project14.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Base {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

    @FindBys({
            @FindBy(css = "a.product_img_link")
    })
    private List<WebElement> productList;

    public void clickOnContactUsLink() {
        clickOnElement(contactUsLink);
    }

    public void clickOnFirstProduct(){
        clickOnElement(productList.get(0));
    }
}
