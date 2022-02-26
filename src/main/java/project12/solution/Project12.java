package project12.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Project12 {
    //    NOTE: Create your own account in the website http://a.testaddressbook.com/sign_in manually
    //          before you start your automation. I suggest you to use a fake email address. This is just for testing.

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //     Navigate to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //     Enter the username and password
        WebElement userName = driver.findElement(By.id("session_email"));
        userName.sendKeys("project14@pp.com");
        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("12345");

        //     Click on sign in button
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Sign in']"));
        signInButton.click();

        //     Click on Addresses
        WebElement addresses = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addresses.click();

        //     Click on new address button
        WebElement newAddress = driver.findElement(By.cssSelector("a[data-test='create']"));
        newAddress.click();

        //     Enter the first name "Fernando"
        WebElement firstName = driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");

        //     Enter the last name  "Torres"
        WebElement lastName = driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");

        //     Enter the address 1 "Anfield Rd"
        WebElement address1 = driver.findElement(By.id("address_street_address"));
        address1.sendKeys("Anfield Rd");

        //     Enter the address 2 "Anfield"
        WebElement address2 = driver.findElement(By.id("address_secondary_address"));
        address2.sendKeys("Anfield");

        //     Enter the city "Liverpool"
        WebElement city = driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");

        //     Choose a RANDOM option from the state dropdown
        Select stateDropdown = new Select(driver.findElement(By.id("address_state")));
        stateDropdown.selectByIndex(new Random().nextInt(52));

        //     Enter the Zipcode "L4 0TH"
        WebElement zipCode = driver.findElement(By.id("address_zip_code"));
        zipCode.sendKeys("L4 0TH");

        //     Click on United States
        WebElement pickCountry = driver.findElement(By.id("address_country_us"));
        pickCountry.click();

        //     Enter the birthday "03/20/1984"
        WebElement birthDay = driver.findElement(By.id("address_birthday"));
        birthDay.sendKeys("1984/03/20");

        //     Enter the age "36"
        WebElement addressAge = driver.findElement(By.id("address_age"));
        addressAge.sendKeys("36");

        //     Enter the WebSite "https://www.google.com/"
        WebElement webSite = driver.findElement(By.id("address_website"));
        webSite.sendKeys("https://www.google.com/");

        //     Enter the phone "8625747878"
        WebElement addressPhone = driver.findElement(By.id("address_phone"));
        addressPhone.sendKeys("8625747878");

        //     Click on Climbing and Dancing
        WebElement climb = driver.findElement(By.id("address_interest_climb"));
        WebElement dance = driver.findElement(By.id("address_interest_dance"));
        climb.click();
        dance.click();

        //     Enter the Note "Never Back Down"
        WebElement note = driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");

        //     Click on Create Address button
        WebElement createAddress = driver.findElement(By.cssSelector("input[value='Create Address']"));
        createAddress.click();

        //     Verify if the first name is "Fernando"
        WebElement actualFirstName = driver.findElement(By.cssSelector("span[data-test='first_name']"));
        String actualFirstName2 = actualFirstName.getText();
        String expectedFirstName = "Fernando";
        Assert.assertEquals(actualFirstName2, expectedFirstName, "Verified the FirstName WRONG");

        //     Verify if the last name is "Torres"
        WebElement lastNameOutput = driver.findElement(By.cssSelector("span[data-test='last_name']"));
        String actualLastName2 = lastNameOutput.getText();
        String expectedLastName = "Torres";
        Assert.assertEquals(actualLastName2, expectedLastName, "Verified the LastName WRONG");

        //     Click on Addresses
        WebElement addresses2 = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addresses2.click();

        //     Click on Edit button
        WebElement editButton = driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(6) > a"));
        editButton.click();

        //     Change the first name as "Peter"
        WebElement firstName3 = driver.findElement(By.id("address_first_name"));
        firstName3.clear();
        firstName3.sendKeys("Peter");

        //     Change the last name as "Crouch"
        WebElement lastName3 = driver.findElement(By.id("address_last_name"));
        lastName3.clear();
        lastName3.sendKeys("Crouch");

        //     Click on Update address
        WebElement updateAddress = driver.findElement(By.cssSelector("input[value='Update Address']"));
        updateAddress.click();

        //     Verify if the first name is "Peter"
        WebElement actualFirstName3 = driver.findElement(By.cssSelector("span[data-test='first_name']"));
        String actualFirstName4 = actualFirstName3.getText();
        String expectedFirstName4 = "Peter";
        Assert.assertEquals(actualFirstName4, expectedFirstName4, "Verified the FirstName WRONG");

        //     Verify if the last name is "Crouch"
        WebElement lastNameName3 = driver.findElement(By.cssSelector("span[data-test='last_name']"));
        String actualLastName3 = lastNameName3.getText();
        String expectedLastName3 = "Crouch";
        Assert.assertEquals(actualLastName3, expectedLastName3, "Verified the LastName WRONG");

        //     Click on Addresses
        WebElement addresses3 = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addresses3.click();

        //     Click on Destroy
        WebElement destroyButton = driver.findElement(By.linkText("Destroy"));
        destroyButton.click();

        //     Confirm deleting the address
        driver.switchTo().alert().accept();

        //     Verify if the address was removed
        WebElement notice = driver.findElement(By.cssSelector("div[data-test='notice']"));
        Assert.assertTrue(notice.getText().contains("successfully"));

        //     Close the browser
        driver.quit();
    }
}
