package project11.groupSolutions.group3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Part2 {

    /*
        1) Navigate to https://demo.applitools.com/
        2) Maximize the window
        3) Enter the username as "ttechno@gmail.com"
        4) Enter the password as "techno123."
        5) Click on sign in button
        6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str
        7) Print the String str
        8) Print the URL
     */

    @Test
    public void test2() {

//        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://demo.applitools.com/");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement password  = driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        WebElement signInButton = driver.findElement(By.cssSelector("a[id='log-in']"));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();

        WebElement header = driver.findElement(By.cssSelector("h6[id='time']"));
        wait.until(ExpectedConditions.urlMatches("https://demo.applitools.com/app.html"));

        String str = header.getText();
        System.out.println("header text: " + str);

        System.out.println("current url: " + driver.getCurrentUrl());

        driver.quit();

    }
}
