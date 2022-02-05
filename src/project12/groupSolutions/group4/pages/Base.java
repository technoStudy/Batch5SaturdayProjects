package project12.groupSolutions.group4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import project12.groupSolutions.group4.Utils.Driver;

import java.util.concurrent.TimeUnit;

public class Base {

    protected WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

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


//    @BeforeMethod
//    public void beforeTest() {
////        System.setProperty("webdriver.chrome.driver", "/Users/dzurejdzcrnkic/Documents/Selenium/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.get("http://a.testaddressbook.com/sign_in");
//
//        WebElement emailElement = driver.findElement(By.id("session_email"));
//        emailElement.sendKeys("testng@gmail.com");
//
//        WebElement passwordElement = driver.findElement(By.id("session_password"));
//        passwordElement.sendKeys("testtesttest");
//
//        WebElement signInButton = driver.findElement(By.cssSelector("input[name='commit']"));
//        signInButton.click();
//
//    }
//
//    @AfterMethod
//    public void afterTest() {
//        driver.quit();
//    }

}
