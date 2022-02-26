package project11.solution;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    @Test
    public void test3() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\li\\Desktop\\IT school\\selenium\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //   1) Navigate to https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");

        //   2) Maximize the window
        driver.manage().window().maximize();

        //   3) Search for "teddy bear" and click on search button
        WebElement searchBox = driver.findElement(By.id("inputValEnter"));
        searchBox.sendKeys("teddy bear");
        WebElement searchButton = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']"));
        searchButton.click();

        //   4) Get and print the following text -->> We've got .... results for 'teddy bear'
        WebElement searchResult = driver.findElement(By.id("searchMessageContainer"));
        System.out.println("searchResult = " + searchResult.getText());

        //   5) Print the URL
        System.out.println("URL = " + driver.getCurrentUrl());

        //   6) Click on logo snepdeal logo
        WebElement snapdealLogo = driver.findElement(By.cssSelector("img[title='Snapdeal']"));
        snapdealLogo.click();

        //   7) Print the URL
        System.out.println("URL after clicking snapdeal logo: " + driver.getCurrentUrl());

        //   8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
        //      (Hint: You may use the "value" attribute of the input tag for the search bar)
        driver.navigate().back();
        WebElement searchBoxSecond = driver.findElement(By.id("inputValEnter"));
        String actualResult = searchBoxSecond.getAttribute("value");
        String expectedResult ="teddy bear";
        Assert.assertEquals(expectedResult,actualResult);

//        driver.quit();
    }
}
