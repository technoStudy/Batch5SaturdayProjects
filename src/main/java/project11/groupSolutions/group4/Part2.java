package project11.groupSolutions.group4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

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
//        System.setProperty("webdriver.chrome.driver", "/Users/dzurejdzcrnkic/Documents/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("ttechno@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("techno123.");

        WebElement signIn = driver.findElement(By.id("log-in"));
        signIn.click();

        WebElement headerText = driver.findElement(By.id("time"));
        String str = headerText.getText();
        System.out.println("\nHeader text in red: " + str);

        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.quit();

    }
}
