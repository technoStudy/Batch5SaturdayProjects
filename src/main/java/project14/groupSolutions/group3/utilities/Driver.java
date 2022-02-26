package project14.groupSolutions.group3.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class Driver {
    protected WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void MyBaseDriver(@Optional("chrome") String browser){

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "\\Users\\HP\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Desktop\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     WebDriverWait wait=new WebDriverWait(driver,10);

     driver.get("http://automationpractice.com/");

        WebElement signIn= driver.findElement(By.cssSelector("a[class=\"login\"]"));
        signIn.click();

        WebElement email= driver.findElement(By.cssSelector("input[id=\"email\"]"));
        email.sendKeys("donaldtrump1@gmail.com");

        WebElement password= driver.findElement(By.cssSelector("#passwd"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("donaldtrump1");

        WebElement signInRegister= driver.findElement(By.cssSelector("i[class=\"icon-lock left\"]"));
        signInRegister.click();


}
    @AfterMethod
    public void QuiteBrowser(){
       driver.quit();
    }
}