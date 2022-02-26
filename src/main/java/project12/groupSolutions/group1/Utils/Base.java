package project12.groupSolutions.group1.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {

    protected WebDriver driver;

   @BeforeMethod
    public void signIn() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikiw\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

       WebElement emailInput = driver.findElement(By.id("session_email"));
       emailInput.sendKeys("fakeemail@gmail.com");

       WebElement passwordInput = driver.findElement(By.id("session_password"));
       passwordInput.sendKeys("123");

       WebElement SigninButton = driver.findElement(By.cssSelector("input[value='Sign in']"));
       SigninButton.click();
    }

    @AfterMethod
    public void lastPart(){
       driver.quit();
    }
}