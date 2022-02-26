package project11.groupSolutions.group3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

//        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();

        WebElement alertButton = driver.findElement(By.id("pushDenied"));
        wait.until(ExpectedConditions.visibilityOf(alertButton));
        alertButton.click();

        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.sendKeys("teddy bear");

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']"));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();

        WebElement textAppearsForResults = driver.findElement(By.xpath("(//span[contains(text(),'results')])[1]"));
        wait.until(ExpectedConditions.urlContains("https://www.snapdeal.com/search?keyword=teddy%20bear"));
        System.out.println("text that appears for results: " + textAppearsForResults.getText());

        System.out.println("current url: " + driver.getCurrentUrl());

        WebElement snapDealLogo = driver.findElement(By.xpath("//a[@class='notIeLogoHeader hashAdded']//img"));
        snapDealLogo.click();
        wait.until(ExpectedConditions.invisibilityOf(textAppearsForResults));

        System.out.println("current url after we click snapdeal logo: " + driver.getCurrentUrl());

        driver.navigate().back();

        WebElement automaticallyWrittenText = driver.findElement(By.xpath("//div[@class='header_wrapper']//input[@value='teddy bear']"));
        String valueIsTeddyBear = automaticallyWrittenText.getAttribute("value");
        System.out.println(valueIsTeddyBear);
        boolean valueIsEqualToTeddyBear = valueIsTeddyBear.equals("teddy bear");

        if (valueIsEqualToTeddyBear)
            System.out.println("Input contains " + valueIsTeddyBear + ": " + valueIsEqualToTeddyBear);
        else throw new TheTextIsDifferentThanYouSearched();

        driver.quit();

    }
}
