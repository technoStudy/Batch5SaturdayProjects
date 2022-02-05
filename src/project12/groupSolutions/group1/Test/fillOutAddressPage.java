package project12.groupSolutions.group1.Test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import project12.groupSolutions.group1.POM.AddressBookPageElement;
import project12.groupSolutions.group1.POM.AddressesChangeInfo;
import project12.groupSolutions.group1.Utils.Base;
import project12.groupSolutions.group1.Utils.VerifyMyInfoMethod;

import java.util.List;
import java.util.Random;

public class fillOutAddressPage extends Base {
    AddressBookPageElement addressBookPageElement;
    AddressesChangeInfo addressesChangeInfo;
    VerifyMyInfoMethod verifyMyInfoMethod = new VerifyMyInfoMethod();

    @Test()
    public void filloutInfoTest() {
        addressBookPageElement = new AddressBookPageElement(driver);

        addressBookPageElement.addressIcon.click();
        addressBookPageElement.addNewAddressIcon.click();

        addressBookPageElement.firstNameInput.sendKeys("Fernando");
        addressBookPageElement.lastNameInput.sendKeys("Torres");

        addressBookPageElement.address1Input.sendKeys("Anfield Rd");
        addressBookPageElement.address2Input.sendKeys("Anfield");

        addressBookPageElement.cityInput.sendKeys("Liverpool");

        Random rand = new Random();
        Select selectState = new Select(addressBookPageElement.stateDropDownInput);
        List<WebElement> dropdowns = selectState.getOptions();
            int stateList = rand.nextInt(dropdowns.size());
            dropdowns.get(stateList).click();

        addressBookPageElement.zipcodeInput.sendKeys("L4 0TH");
        addressBookPageElement.countryInput.click();

        addressBookPageElement.dateOfBirth.click();
        addressBookPageElement.dateOfBirth.sendKeys("1984", Keys.ARROW_LEFT, "20", Keys.ARROW_LEFT, Keys.LEFT, "03");

        addressBookPageElement.ageInput.sendKeys("36");
        addressBookPageElement.website.sendKeys("https://www.google.com/");

        addressBookPageElement.phoneNumber.sendKeys("8625747878");
        addressBookPageElement.clickClimbing.click();
        addressBookPageElement.clickDancing.click();
        addressBookPageElement.noteInput.sendKeys("Never Back Down");
        addressBookPageElement.createAddressButton.click();

        verifyMyInfoMethod.verifyMessage(driver);
    }
      @Test(dependsOnMethods = "filloutInfoTest" )
       public void changeInfo(){
        addressBookPageElement = new AddressBookPageElement(driver);
        addressesChangeInfo = new AddressesChangeInfo(driver);

        addressBookPageElement.addressIcon.click();
        addressesChangeInfo.clickEditButton.click();
        addressBookPageElement.firstNameInput.clear();
        addressBookPageElement.firstNameInput.sendKeys("Peter");
        addressBookPageElement.lastNameInput.clear();
        addressBookPageElement.lastNameInput.sendKeys("Crouch");
        addressesChangeInfo.updateAddress.click();

        verifyMyInfoMethod.verifyUpdatedMessage(driver);

        addressBookPageElement.addressIcon.click();
        addressesChangeInfo.clickDestroyButton.click();

        driver.switchTo().alert().accept();

        verifyMyInfoMethod.verifyDestroyMessage(driver);
    }
}