package project12.groupSolutions.group4.Version1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project12 {


    @Test
    public void test1(){
//        System.setProperty("webdriver.chrome.driver", "/Users/dzurejdzcrnkic/Documents/Selenium/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebDriverWait wait = new WebDriverWait(driver, 10);


        WebElement emailInput = driver.findElement(By.id("session_email"));
        emailInput.sendKeys("dzdzdz@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("session_password"));
        passwordInput.sendKeys("dzdzdz");

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        WebElement addressesButton = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addressesButton.click();

        WebElement newAddressesButton = driver.findElement(By.cssSelector("a[data-test='create']"));
        newAddressesButton.click();

        WebElement firstNameInput = driver.findElement(By.name("address[first_name]"));
        firstNameInput.sendKeys("Fernando");

        WebElement lastNameInput = driver.findElement(By.name("address[last_name]"));
        lastNameInput.sendKeys("Torres");

        WebElement address1Input = driver.findElement(By.name("address[address1]"));
        address1Input.sendKeys("Anfield Rd");

        WebElement address2Input = driver.findElement(By.name("address[address2]"));
        address2Input.sendKeys("Anfield");

        WebElement cityInput = driver.findElement(By.name("address[city]"));
        cityInput.sendKeys("Liverpool");

        List<WebElement> statesDropdown = driver.findElements(By.cssSelector("select[name='address[state]']>option"));
        int statesDropdownSize = statesDropdown.size();
        int randomNumber = (int) (Math.random() * statesDropdownSize);
        statesDropdown.get(randomNumber).click();

        WebElement zipCodeInput = driver.findElement(By.name("address[zip_code]"));
        zipCodeInput.sendKeys("L4 0TH");

        WebElement radioUSInput = driver.findElement(By.id("address_country_us"));
        radioUSInput.click();

        WebElement birthdayInput = driver.findElement(By.name("address[birthday]"));
        birthdayInput.sendKeys("20031984"); //eu format -> dd. mm. yyyy.
        //birthdayInput.sendKeys("03201984"); //us

        WebElement ageInput = driver.findElement(By.name("address[age]"));
        ageInput.sendKeys("36");

        WebElement websiteInput = driver.findElement(By.name("address[website]"));
        websiteInput.sendKeys("https://www.google.com/");

        WebElement phoneInput = driver.findElement(By.name("address[phone]"));
        phoneInput.sendKeys("8625747878");

        WebElement climbingCheckbox = driver.findElement(By.id("address_interest_climb"));
        climbingCheckbox.click();

        WebElement dancingCheckbox = driver.findElement(By.id("address_interest_dance"));
        dancingCheckbox.click();

        WebElement noteInput = driver.findElement(By.name("address[note]"));
        noteInput.sendKeys("Never Back Down");

        WebElement createAddressInput = driver.findElement(By.name("commit"));
        createAddressInput.click();

        String expectedFirstName = "Fernando";
        String expectedLastName = "Torres";

        WebElement actualFirstName = driver.findElement(By.cssSelector("span[data-test='first_name']"));
        Assert.assertEquals(actualFirstName.getText(),expectedFirstName);

        WebElement actualLastName = driver.findElement(By.cssSelector("span[data-test='last_name']"));
        Assert.assertEquals(actualLastName.getText(),expectedLastName);

        WebElement addressesButton2 = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addressesButton2.click();

        WebElement editButton = driver.findElement(By.xpath("//table[@class='table']//a[text()='Edit']"));
        editButton.click();

        WebElement firstNameInput2 = driver.findElement(By.name("address[first_name]"));
        firstNameInput2.clear();
        firstNameInput2.sendKeys("Peter");

        WebElement lastNameInput2 = driver.findElement(By.name("address[last_name]"));
        lastNameInput2.clear();
        lastNameInput2.sendKeys("Crouch");

        WebElement updateAddressInput = driver.findElement(By.name("commit"));
        updateAddressInput.click();

        String expectedFirstName2 = "Peter";
        String expectedLastName2 = "Crouch";

        WebElement actualFirstName2 = driver.findElement(By.cssSelector("span[data-test='first_name']"));
        Assert.assertEquals(actualFirstName2.getText(),expectedFirstName2);

        WebElement actualLastName2 = driver.findElement(By.cssSelector("span[data-test='last_name']"));
        Assert.assertEquals(actualLastName2.getText(),expectedLastName2);

        WebElement addressesButton3 = driver.findElement(By.cssSelector("a[data-test='addresses']"));
        addressesButton3.click();

        WebElement destroyButton = driver.findElement(By.xpath("//a[text()='Destroy']"));
        destroyButton.click();

        driver.switchTo().alert().accept();

        String expectedDestroyConfirmationMessage = "Address was successfully destroyed.";
        WebElement destroyConfirmationMessage = driver.findElement(By.cssSelector("div[data-test='notice']"));
        Assert.assertEquals(destroyConfirmationMessage.getText(),expectedDestroyConfirmationMessage);

        driver.quit();


    }



}
//username: dzdzdz@gmail.com
//pass: dzdzdz

    /*
    NOTE: Create your own account in the website http://a.testaddressbook.com/sign_in manually
          before you start your automation. I suggest you to use a fake email address. This is just for testing.
     */

   //     Navigate to http://a.testaddressbook.com/sign_in
   //     Enter the username and password
   //     Click on sign in button

   //     Click on Addresses
   //     Click on new address button

   //     Enter the first name "Fernando"
   //     Enter the last name  "Torres"
   //     Enter the address 1 "Anfield Rd"
   //     Enter the address 2 "Anfield"
   //     Enter the city "Liverpool"
   //     Choose a RANDOM option from the state dropdown
   //     Enter the Zipcode "L4 0TH"
   //     Click on United States
   //     Enter the birthday "03/20/1984"
   //     Enter the age "36"
   //     Enter the WebSite "https://www.google.com/"
   //     Enter the phone "8625747878"
   //     Click on Climbing and Dancing
   //     Enter the Note "Never Back Down"
   //     Click on Create Address button
   //     Verify if the first name is "Fernando"
   //     Verify if the last name is "Torres"

   //     Click on Addresses
   //     Click on Edit button
   //     Change the first name as "Peter"
   //     Change the last name as "Crouch"
   //     Click on Update address
   //     Verify if the first name is "Peter"
   //     Verify if the last name is "Crouch"

   //     Click on Addresses
   //     Click on Destroy
   //     Confirm deleting the address
   //     Verify if the address was removed
   //     Close the browser


