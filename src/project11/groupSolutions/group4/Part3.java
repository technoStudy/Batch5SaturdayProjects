package project11.groupSolutions.group4;

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

//        System.setProperty("webdriver.chrome.driver", "/Users/dzurejdzcrnkic/Documents/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.sendKeys("teddy bear");

        WebElement searchButton = driver.findElement(By.xpath("//span[text() = 'Search']"));
        searchButton.click();

        WebElement searchResults = driver.findElement(By.className("nnn"));
        String str = searchResults.getText();
        System.out.println(str);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL 1: " + currentURL);

        WebElement logo = driver.findElement(By.xpath("//img[@title='Snapdeal']"));
        logo.click();

        String currentURL2 = driver.getCurrentUrl();
        System.out.println("Current URL 2: " + currentURL2);

        driver.navigate().back();
        WebElement searchedText = driver.findElement(By.cssSelector("input[value='teddy bear']"));
        String textInSearchBar = searchedText.getAttribute("value");

        if (textInSearchBar.equals("teddy bear"))
            System.out.println("Written text in the search bar is \"teddy bear\"");

//        or
//        boolean teddyBear=searchedText.isDisplayed();
//        System.out.println("written text in the search bar is \"teddy bear\": " + teddyBear);

//        driver.quit();
    }
}
