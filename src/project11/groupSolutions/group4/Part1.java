package project11.groupSolutions.group4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

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
//        System.setProperty("webdriver.chrome.driver", "/Users/dzurejdzcrnkic/Documents/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");


        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        WebDriver driver = new ChromeDriver(capability);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Automation");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("Testing@gmail.com");

        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("Testing Current Address");

        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        System.out.println("\nData from text box below after submitting: ");

        WebElement namePrint = driver.findElement(By.id("name"));
        System.out.println(namePrint.getText());

        WebElement emailPrint = driver.findElement(By.id("email"));
        System.out.println(emailPrint.getText());

        WebElement currentAddressPrint = driver.findElement(By.cssSelector("p[id='currentAddress']"));
        System.out.println(currentAddressPrint.getText());

        WebElement permanentAddressPrint = driver.findElement(By.cssSelector("p[id='permanentAddress']"));
        System.out.println(permanentAddressPrint.getText());

        driver.quit();

    }
}
