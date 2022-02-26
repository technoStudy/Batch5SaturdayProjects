package project15.solution.pages;

import CampusProjectSolutions.enums.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project14.solution.utilities.Driver;

public class BasePage {

    public WebDriver driver = Driver.getDriver();

    private final WebDriverWait wait = new WebDriverWait(driver, 10);

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

//    protected void selectFromDropDownMenuByIndex(WebElement dropDownMenu, int index) {
//        Select select = new Select(dropDownMenu);
//        select.selectByIndex(index);
//    }


}
