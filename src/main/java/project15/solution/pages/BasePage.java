package project15.solution.pages;

import project15.solution.enums.LocatorType;
import project15.solution.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

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

    protected ArrayList<String> getTextsOfElementList(List<WebElement> elementList) {
        ArrayList<String> textList = new ArrayList<>();
        for (WebElement element : elementList) {
            textList.add(getTextOf(element));
        }
        return textList;
    }

    protected void waitTillElementDisappears(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void sleepFor(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
