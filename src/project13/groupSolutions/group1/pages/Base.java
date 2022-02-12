package project13.groupSolutions.group1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project13.groupSolutions.group1.utilities.Driver;
import java.util.List;
import java.util.Random;

public class Base {
    protected WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);

    protected void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void sendKeysToElement(WebElement element, String key){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(key);
    }

    protected String getTextOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    protected void chooseStateRamdom(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Random random = new Random();
        Select selectState = new Select(element);
        List<WebElement> dropdowns = selectState.getOptions();
        int stateList = random.nextInt(dropdowns.size());
        dropdowns.get(stateList).click();
    }
}
