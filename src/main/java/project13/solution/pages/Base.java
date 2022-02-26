package project13.solution.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project12.groupSolutions.group4.Utils.Driver;

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

    protected void selectFromDropDownMenuByIndex(WebElement dropDownMenu, int index){
        wait.until((ExpectedConditions.elementToBeClickable(dropDownMenu)));
        Select select = new Select(dropDownMenu);
        select.selectByIndex(index);
    }

    public void acceptAlertBox(){
        driver.switchTo().alert().accept();
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void navigateTo(String url){
        driver.get(url);
    }
}
