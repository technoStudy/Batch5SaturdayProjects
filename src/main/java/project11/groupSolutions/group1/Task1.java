package project11.groupSolutions.group1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

   @Test
    public void test1() {

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

//        System.setProperty("webdriver.chrome.driver","C:\\Users\\nikiw\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demoqa.com/text-box");

        WebElement fullName =driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Automation");

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailInput.sendKeys("Testing@gmail.com");

        WebElement currentAddressInput = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddressInput.sendKeys("Testing Current Address");


        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement clickSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        js.executeScript("arguments[0].scrollIntoView();", clickSubmit);
        clickSubmit.click();

        List<WebElement> printAllinfo = driver.findElements(By.tagName("p"));
        for (int i = 0; i < printAllinfo.size(); i++) {
            System.out.println(printAllinfo.get(i).getText());
        }

//        driver.quit();
    }
}
