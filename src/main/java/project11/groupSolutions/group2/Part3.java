package project11.groupSolutions.group2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Part3 {
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
    @Test
    public void test3() {
//        System.setProperty("webdriver.chrome.driver", "\\Users\\PC\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(" https://www.snapdeal.com/");

        WebElement valueEnterBox=driver.findElement(By.id("inputValEnter"));
        valueEnterBox.sendKeys("teddy bear");

        WebElement searchButton=driver.findElement(By.className("searchTextSpan"));
        searchButton.click();

        WebElement textResultTeddyBear=driver.findElement(By.xpath("//span[contains(text(),'teddy bear')]"));
        String text=textResultTeddyBear.getText();
        System.out.println(text);

        System.out.println("URL : " + driver.getCurrentUrl());

        WebElement logoSnapdeal=driver.findElement(By.xpath("//img[@title='Snapdeal']"));
        logoSnapdeal.click();

        System.out.println("URL : " +driver.getCurrentUrl());



        driver.navigate().back();

        WebElement teddyBearInEnterBox=driver.findElement(By.xpath("(//input[@name='keyword'])"));
        String teddyBearText=teddyBearInEnterBox.getAttribute("value");

        if(teddyBearText.equals("teddy bear")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

//        driver.quit();



    }
}
