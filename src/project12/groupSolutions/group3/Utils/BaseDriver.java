package project12.groupSolutions.group3.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void SetUp() {

//        System.setProperty("webdriver.chrome.driver", "\\Users\\busra\\OneDrive\\Masaüstü\\MySelenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver,10);

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement userName = driver.findElement(By.id("session_email"));
        userName.sendKeys("testing_project11@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Xpath1234");

        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Sign in']"));
        signInButton.click();


    }

    @AfterMethod
    public void quit(){

        driver.quit();
    }

}
