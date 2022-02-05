package project12.groupSolutions.group2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class project12 {

    @Test
    public void test() {

//        System.setProperty("webdriver.chrome.driver", "\\Users\\apple\\Documents\\Selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("seleniumtest508@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("321654987");

        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        signInButton.click();

        WebElement address = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        address.click();

        WebElement newAddress = driver.findElement(By.cssSelector("a[data-test='create']"));
        newAddress.click();

        WebElement firstName = driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");

        WebElement lastName = driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");

        WebElement address1 = driver.findElement(By.id("address_street_address"));
        address1.sendKeys("Anfield Rd");

        WebElement address2 = driver.findElement(By.id("address_secondary_address"));
        address2.sendKeys("Anfield");

        WebElement city = driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");

        WebElement state = driver.findElement(By.id("address_state"));
        Random rnd = new Random();
        Select select = new Select(state);
        List<WebElement> states = select.getOptions();
        int randomNumber = rnd.nextInt(states.size());
        select.selectByIndex(randomNumber);

        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");

        WebElement birthday = driver.findElement(By.id("address_birthday"));
        birthday.sendKeys("03/20/1984");

        WebElement country = driver.findElement(By.id("address_country_us"));
        country.click();

        WebElement age = driver.findElement(By.id("address_age"));
        age.sendKeys("36");

        WebElement website = driver.findElement(By.id("address_website"));
        website.sendKeys("https://www.google.com/");

        WebElement phone = driver.findElement(By.id("address_phone"));
        phone.sendKeys("8625747878");

        WebElement climbing = driver.findElement(By.id("address_interest_climb"));
        climbing.click();

        WebElement dancing = driver.findElement(By.id("address_interest_dance"));
        dancing.click();

        WebElement note = driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");

        WebElement createAddressButton = driver.findElement(By.cssSelector("input[type='submit']"));
        createAddressButton.click();

        //     Verify if the first name is "Fernando"
        //     Verify if the last name is "Torres"
        String actualResult_firstName = driver.findElement(By.cssSelector("span[data-test='first_name']")).getText();
//        Assert.assertTrue(actualResult_firstName.equals("Fernando1/lkfnkl"));
        Assert.assertEquals(actualResult_firstName, "Fernando");

        String actualResult_lastName = driver.findElement(By.cssSelector("span[data-test='last_name']")).getText();
        Assert.assertTrue(actualResult_lastName.equals("Torres"));

        WebElement addresses = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addresses.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h2")));

        WebElement editButton = driver.findElement(By.xpath("//a[text()='Edit']"));
        editButton.click();

        WebElement changedFirstName = driver.findElement(By.id("address_first_name"));
        changedFirstName.clear();
        changedFirstName.sendKeys("Peter");

        WebElement changedLastName = driver.findElement(By.id("address_last_name"));
        changedLastName.clear();
        changedLastName.sendKeys("Crouch");

        WebElement updateAddressButton = driver.findElement(By.cssSelector("input[type='submit']"));
        updateAddressButton.click();

        //     Verify if the first name is "Peter"
        //     Verify if the last name is "Crouch"
        String actualResult_firstName_AfterUpdate = driver.findElement(By.cssSelector("span[data-test='first_name']")).getText();
        Assert.assertTrue(actualResult_firstName_AfterUpdate.equals("Peter"));

        String actualResult_lastName_AfterUpdate = driver.findElement(By.cssSelector("span[data-test='last_name']")).getText();
        Assert.assertTrue(actualResult_lastName_AfterUpdate.equals("Crouch"));

        WebElement addressesAfterUpdate = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addressesAfterUpdate.click();

        WebElement destroyButton = driver.findElement(By.cssSelector("td>a[data-method='delete']"));
        destroyButton.click();

        driver.switchTo().alert().accept();

        //Verify if the address was removed
        String destroyedMessage = driver.findElement(By.cssSelector("div[class='alert alert-notice']")).getText();
        Assert.assertTrue(destroyedMessage.equals("Address was successfully destroyed."));

        driver.quit();
    }
}
