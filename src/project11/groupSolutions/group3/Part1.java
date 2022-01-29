package project11.groupSolutions.group3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Part1 {

        /*
            1) Navigate to  http://demoqa.com/text-box
            2) Maximize the window
            3) Enter full name as "Automation"
            4) Enter Email as "Testing@gmail.com"
            5) Enter Current Address as "Testing Current Address"
            6) Enter Permanent Address as "Testing Permanent Address"
            7) Click on submit button
            8) Print Name in the text box
            9) Print Email in the text box
            10) Print Current Address in the text box
            11) Print Permanent Address in the text box
     */

    /*
    IMPORTANT NOTE:
    If your Chrome browser refuses to open the website due to security reason and
    shows the following error:

    Your connection is not private
    Attackers might be trying to steal your information from demoqa.com (for example, passwords, messages, or credit cards). Learn more
    NET::ERR_CERT_DATE_INVALID

    Then use the following code for your driver declaration (Do not forget to do the necessary class imports):
        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        WebDriver driver = new ChromeDriver(capability);
     */

    @Test
    public void test1() {

//        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");

        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        WebDriver driver = new ChromeDriver(capability);

        WebDriverWait wait = new WebDriverWait(driver,10);

//        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");


        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");


        WebElement submitButton = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].scrollIntoView();", submitButton);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

        WebElement nameInTheTextBox = driver.findElement(By.xpath("(//div//p[@class='mb-1'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(nameInTheTextBox));
        System.out.println(nameInTheTextBox.getText());

        WebElement emailInTheTextBox = driver.findElement(By.xpath("(//div//p[@class='mb-1'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(emailInTheTextBox));
        System.out.println(emailInTheTextBox.getText());

        WebElement currentAddressInTheTextBox = driver.findElement(By.xpath("(//div//p[@class='mb-1'])[3]"));
        wait.until(ExpectedConditions.visibilityOf(currentAddressInTheTextBox));
        System.out.println(currentAddressInTheTextBox.getText());

        WebElement permanentAddressInTheTextBox = driver.findElement(By.xpath("(//div//p[@class='mb-1'])[4]"));
        wait.until(ExpectedConditions.visibilityOf(permanentAddressInTheTextBox));
        System.out.println(permanentAddressInTheTextBox.getText());

        driver.quit();

    }
}
