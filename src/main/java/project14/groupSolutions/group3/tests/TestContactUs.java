package project14.groupSolutions.group3.tests;

import project14.groupSolutions.group3.pages.ContactUs;
import project14.groupSolutions.group3.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestContactUs extends Driver {

    ContactUs contactUs;

    @Test(dataProvider = "SearchForData")
    public void Test1(String sendMassage){
        contactUs=new ContactUs(driver);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        contactUs.contactUs.click();
        contactUs.subjectHeading.click();
        Select select=new Select(contactUs.subjectHeading);
        select.selectByVisibleText("Customer service");

        js.executeScript("window.scrollBy(0,1000)");

        contactUs.choose.click();
        contactUs.message.sendKeys(sendMassage);
        contactUs.sendButton.click();
    }

    @DataProvider(name = "SearchForData")
    public Object[][] ThereDifferentData() {
        return new Object[][] {
                {"Hello"}, {"Hi"}, {"Hey!"}
        };
    }


}
