package project11.groupSolutions.group2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

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

//        System.setProperty("webdriver.chrome.driver", "\\Users\\PC\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://demo.applitools.com/");

        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        WebElement signInButton=driver.findElement(By.id("log-in"));
        signInButton.click();

        WebElement headerText=driver.findElement(By.id("time"));
        String header=headerText.getText();
        System.out.println(header);

        String url=driver.getCurrentUrl();
        System.out.println("URL : " + url);

         driver.quit();
    }
}
