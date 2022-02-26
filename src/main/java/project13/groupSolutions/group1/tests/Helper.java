package project13.groupSolutions.group1.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import project13.groupSolutions.group1.pages.ValidationPage;

public class Helper {
    public void verifyFirstName(String name) {
        ValidationPage myAddressBookElements = new ValidationPage();

        String actualFirstName = myAddressBookElements.getTextOfFirstNameInput();
        Assert.assertEquals(actualFirstName,name);
    }

    public void verifyLastName(String name) {
        ValidationPage myAddressBookElements = new ValidationPage();

        String actualLastName = myAddressBookElements.getTextOfLastNameInput();
        Assert.assertEquals(actualLastName,name);
    }

    public void verifyAddressRemove(String removeText){
        ValidationPage myEditPageElements = new ValidationPage();

        String actualRemoveMessage = myEditPageElements.getTextOfDestroyMessage();
        Assert.assertEquals(actualRemoveMessage,removeText);
    }
}
