package project11.solution;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class Part1 {
    @Test
    public void test1() {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\li\\Desktop\\IT school\\selenium\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        WebDriver driver = new ChromeDriver(capability);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //    1) Navigate to  http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");

        //    2) Maximize the window
        driver.manage().window().maximize();

        //    3) Enter full name as "Automation"
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Automation");

        //    4) Enter Email as "Testing@gmail.com"
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("Testing@gmail.com");

        //    5) Enter Current Address as "Testing Current Address"
        WebElement currentAddress = driver.findElement(By.cssSelector("textarea#currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

        //    6) Enter Permanent Address as "Testing Permanent Address"
        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea#permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");

        //    7) Click on submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //    8) Print Name in the text box
       WebElement nameOutput = driver.findElement(By.id("name"));
        System.out.println(nameOutput.getText());

        //    9) Print Email in the text box
        WebElement emailOutput = driver.findElement(By.id("email"));
        System.out.println(emailOutput.getText());

        //    10) Print Current Address in the text box
        WebElement currentAddressOutput = driver.findElement(By.cssSelector("p#currentAddress"));
        System.out.println(currentAddressOutput.getText());

        //    11) Print Permanent Address in the text box
        WebElement permanentAddressOutput = driver.findElement(By.cssSelector("p#permanentAddress"));
        System.out.println(permanentAddressOutput.getText());
    }
}
