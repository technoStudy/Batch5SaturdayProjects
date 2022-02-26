package project12.groupSolutions.group1.Utils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import project12.groupSolutions.group1.POM.AddressBookPageElement;
import project12.groupSolutions.group1.POM.AddressesChangeInfo;


public class VerifyMyInfoMethod {
    AddressBookPageElement addressBookPageElement;
    AddressesChangeInfo addressesChangeInfo;

    public void verifyMessage(WebDriver driver) {

        addressBookPageElement = new AddressBookPageElement(driver);

        String actualMessage = addressBookPageElement.validateFirstName.getText();
        Assert.assertTrue(actualMessage.contains("Fernando"));

        String actualMessage2 = addressBookPageElement.validateLastName.getText();
        Assert.assertTrue(actualMessage2.contains("Torres"));
    }

    public void verifyUpdatedMessage(WebDriver driver) {
        addressBookPageElement = new AddressBookPageElement(driver);

        String actualMessage3 = addressBookPageElement.validateFirstName.getText();
        Assert.assertTrue(actualMessage3.contains("Peter"));
        String actualMessage4 = addressBookPageElement.validateLastName.getText();
        Assert.assertTrue(actualMessage4.contains("Crouch"));
    }

    public void verifyDestroyMessage(WebDriver driver) {
        addressesChangeInfo = new AddressesChangeInfo(driver);

        String actualMessage4 = addressesChangeInfo.addressDestroyMessage.getText();
        Assert.assertTrue(actualMessage4.contains("successfully"));
    }
}
