package project16.groupSolutions.group4.pages;

import project16.groupSolutions.group4.enums.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import project16.groupSolutions.group4.utilities.Driver;


public class BasePOM {

    public WebDriver driver = Driver.getDriver();

    private final WebDriverWait wait = new WebDriverWait(driver, 10);

    protected void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void validateSuccessMessage(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.getText().toLowerCase().contains("successfully"));
    }

    protected void sendKeysToElement(WebElement element, String key) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(key);
    }

    protected void clickAndSendKeysToElement(WebElement element,String keys){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
        element.clear();
        element.sendKeys(keys);
    }

    protected String getTextOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    protected WebElement getDynamicElement(LocatorType locatorType, String path) {
        By locator = By.xpath(path);
        switch (locatorType) {
            case CSS:
                locator = By.cssSelector(path);
                break;
            case XPATH:
        }
        return driver.findElement(locator);
    }

    protected void hoverOverElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    protected void quitDriver() {
        Driver.quitDriver();
    }

    public void waitUntilElementVisibleAndClickableThenClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

//    protected void selectFromDropDownMenuByIndex(WebElement dropDownMenu, int index) {
//        Select select = new Select(dropDownMenu);
//        select.selectByIndex(index);
//    }

}
