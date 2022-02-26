package project12.groupSolutions.group4.Test;

import project12.groupSolutions.group4.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addressValidation extends Base {

    @Test
    public void addressValidationTest() {

        AddressPage addressPage = new AddressPage();
        ReusableMethods reusableMethods = new ReusableMethods();

        addressPage.clickOnAddressButton();
        addressPage.newAddressButton.click();

        NewAddressPage newAddressPage = new NewAddressPage(driver);

        newAddressPage.firsNameInput.sendKeys("Fernando");
        newAddressPage.lastNameInput.sendKeys("Torres");
        newAddressPage.addressInput.sendKeys("Anfield Rd");
        newAddressPage.secondAddressInput.sendKeys("Anfield");
        newAddressPage.cityInput.sendKeys("Liverpool");

        //way 1 - choosing RANDOM
        int statesDropdownSize = newAddressPage.statesElementListInput.size();
        int randomNumber = (int) (Math.random() * statesDropdownSize);
        newAddressPage.statesElementListInput.get(randomNumber).click();

        //way2 - choosing manually
        //        Select select = new Select(newAddressPage.stateElementInput);
        //        select.selectByVisibleText("Arizona");

        newAddressPage.zipCodeInput.sendKeys("L4 0TH");
        newAddressPage.countryInput.click();
        newAddressPage.birthdayInput.sendKeys("03/20/1984");
        newAddressPage.ageInput.sendKeys("36");
        newAddressPage.webSiteInput.sendKeys("https://www.google.com/");
        newAddressPage.phoneNumberInput.sendKeys("8625747878");
        newAddressPage.climbInterestInput.click();
        newAddressPage.danceInterestInput.click();
        newAddressPage.noteInput.sendKeys("Never Back Down");
        newAddressPage.createAddress.click();

        String expectedNameInput = "Fernando";
        reusableMethods.verifyFirstName(driver, expectedNameInput);

        String expectedLastNameInput = "Torres";
        reusableMethods.verifyLastName(driver,expectedLastNameInput);

        addressPage.clickOnAddressButton();

        EditPage editPage = new EditPage(driver);
        editPage.editButton.click();

        newAddressPage.firsNameInput.clear();
        newAddressPage.firsNameInput.sendKeys("Peter");
        newAddressPage.lastNameInput.clear();
        newAddressPage.lastNameInput.sendKeys("Crouch");

        editPage.updateAddressButton.click();

        String expectedNameAfterEdit = "Peter";
        reusableMethods.verifyFirstName(driver, expectedNameAfterEdit);

        String expectedLastNameAfterEdit ="Crouch";
        reusableMethods.verifyLastName(driver, expectedLastNameAfterEdit);

        addressPage.clickOnAddressButton();

        DestroyPage destroyPage = new DestroyPage(driver);
        destroyPage.destroyButton.click();
        driver.switchTo().alert().accept();

        String expectedDestroyConfirmationMessage = "Address was successfully destroyed.";
        Assert.assertEquals(destroyPage.destroyConfirmMessage.getText(),expectedDestroyConfirmationMessage);

    }
}
