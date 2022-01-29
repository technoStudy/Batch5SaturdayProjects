package project11.groupSolutions.group1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task3 {
        @Test
        public void test3() {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\nikiw\\Downloads\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://www.snapdeal.com/");

            WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
            searchInput.sendKeys("teddy bear");

            WebElement clickSearchButton = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
            clickSearchButton.click();

            String printText = driver.findElement(By.xpath("(//div[@class='search-result-txt-section  marT12'])[1]")).getText();
            System.out.println(printText + " " + driver.getCurrentUrl());

            WebElement findLogo = driver.findElement(By.xpath("(//img[@title='Snapdeal'])[1]"));
            findLogo.click();

            String printURL = driver.getCurrentUrl();
            System.out.println("currentURL:" + printURL);

            driver.navigate().back();

            String typedText = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).getAttribute("value");
            if (typedText.equalsIgnoreCase("teddy bear")) {
                System.out.println(typedText);
            } else {
                System.out.println("fail");
            }

            driver.quit();

 /*
        1) Navigate to https://www.snapdeal.com/
        2) Maximize the window
        3) Search for "teddy bear" and click on search button
        4) Get and print the following text -->> We've got .... results for 'teddy bear'
        5) Print the URL
        6) Click on logo snapdeal logo
        7) Print the URL
        8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
           (Hint: You may use the "value" attribute of the input tag for the search bar)
     */
        }
    }
