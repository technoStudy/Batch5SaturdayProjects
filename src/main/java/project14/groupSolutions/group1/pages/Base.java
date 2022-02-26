package project14.groupSolutions.group1.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project14.groupSolutions.group1.utilities.Driver;

public class Base {
    protected WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    protected void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void sendKeysToElement(WebElement element, String key) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(key);
    }

    protected String getTextOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    protected void selectDropDownByIndex(WebElement option, String value) {
        Select select = new Select(option);
         select.selectByVisibleText(value);
    }

    protected void scrollToSpecificElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver ;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }
    protected void scrollInsideElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollBy(500,0)", element);
        element.click();
    }

    protected String getTextOfscrollToSpecficElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver ;
        wait.until(ExpectedConditions.visibilityOf(element));
        js.executeScript("arguments[0].scrollIntoView();", element);
        return element.getText().toLowerCase();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }
}
