package project12.groupSolutions.group4.Test;

import project12.groupSolutions.group4.pages.ValidationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReusableMethods {
    public void verifyFirstName(WebDriver driver, String name) {
        ValidationPage myAccountPageElements = new ValidationPage();

        String actualFirstName = myAccountPageElements.getTextOfFirstNameInput();
        Assert.assertEquals(actualFirstName,name);
    }
    public void verifyLastName(WebDriver driver, String surname) {
        ValidationPage myAccountPageElements = new ValidationPage();

        String actualLastName = myAccountPageElements.lastNameInputValidation.getText();
        Assert.assertEquals(actualLastName,surname);

    }
}


