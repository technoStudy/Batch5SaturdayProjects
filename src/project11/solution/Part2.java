package project11.solution;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    @Test
    public void test2() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\li\\Desktop\\IT school\\selenium\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //    1) Navigate to https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

        //    2) Maximize the window
        driver.manage().window().maximize();

        //    3) Enter the username as "ttechno@gmail.com"
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("ttechno@gmail.com");

        //    4) Enter the password as "techno123."
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("techno123.");

        //    5) Click on sign in button
        WebElement signInButton = driver.findElement(By.id("log-in"));
        signInButton.click();

        //    6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str
        WebElement redHeader = driver.findElement(By.id("time"));
        String str = redHeader.getText();

        //    7) Print the String str
        System.out.println("str = " + str);

        //    8) Print the URL
        System.out.println("URL = " + driver.getCurrentUrl());

//        driver.quit();
    }
}
