package project11.groupSolutions.group1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task2 {

    @Test
    public void test1() {
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

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nikiw\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com/");

//        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123");

        WebElement signInButton = driver.findElement(By.xpath("//a[@id='log-in']"));
        signInButton.click();

        String getText = driver.findElement(By.xpath("//h6[@id='time']")).getText();
        System.out.println(getText + " " + " My url:"+ driver.getCurrentUrl());

        driver.quit();

    }
}
