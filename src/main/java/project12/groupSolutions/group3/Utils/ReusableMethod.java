package project12.groupSolutions.group3.Utils;

import project12.groupSolutions.group3.POM._01_HomePage;
import project12.groupSolutions.group3.POM._03_ValuesAfterCreatingAddress;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReusableMethod {

   public void verifyAddressText(WebDriver driver){

       _01_HomePage home =new _01_HomePage(driver);

       String actualText = home.addressesText.getText();

       Assert.assertTrue(actualText.equals("Addresses"));


   }

   public void verifyNameAndLastName(WebDriver driver){

       _03_ValuesAfterCreatingAddress values = new _03_ValuesAfterCreatingAddress(driver);

       String actualName = values.validateFName.getText();
       Assert.assertTrue(actualName.equals("Fernando"));

       String actualLastName = values.validateLastName.getText();
       Assert.assertTrue(actualLastName.equals("Torres"));


   }

    public void verifyNameAndLastName2(WebDriver driver) {
        _03_ValuesAfterCreatingAddress values = new _03_ValuesAfterCreatingAddress(driver);

        String actualExpectedFirstName2 = values.validateFName.getText();
        Assert.assertTrue(actualExpectedFirstName2.equals("Peter"));

        String actualExpectedLastName2 = values.validateLastName.getText();
        Assert.assertTrue(actualExpectedLastName2.equals("Crouch"));

    }
    public void verifyAddressIsRemoved(WebDriver driver) {
        _01_HomePage homePage = new _01_HomePage(driver);

        String actualDestroyedText = homePage.destroyedMessage.getText();
        Assert.assertTrue(actualDestroyedText.equals("Address was successfully destroyed."));
    }

}
