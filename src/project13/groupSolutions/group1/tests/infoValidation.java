package project13.groupSolutions.group1.tests;

import org.testng.annotations.Test;
import project13.groupSolutions.group1.pages.AddressBookPage;
import project13.groupSolutions.group1.pages.Base;
import project13.groupSolutions.group1.pages.EditAddressPage;
import project13.groupSolutions.group1.pages.SignInPage;
import project13.groupSolutions.group1.utilities.Driver;

public class infoValidation extends Base {
    AddressBookPage addressBookPage;
    SignInPage signInPage;
    Helper helper;
    EditAddressPage editAddressPage;

    @Test
    public void infoValidationTest(){
        signInPage = new SignInPage();
        addressBookPage = new AddressBookPage();
        helper = new Helper();
        editAddressPage = new EditAddressPage();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        signInPage.clickSignInButton();
        signInPage.sendEmail();
        signInPage.sendPassword();
        signInPage.clickSignInButton();
        addressBookPage.clickAddress();
        addressBookPage.clicknewAddressButton();
        addressBookPage.sendFirstName();
        addressBookPage.sendLastName();
        addressBookPage.sendAddress1();
        addressBookPage.sendAddress2();
        addressBookPage.sendCity();
        addressBookPage.ramdomState();
        addressBookPage.sendZipcode();
        addressBookPage.clickCountry();
        addressBookPage.sendDateOfBirth();
        addressBookPage.sendAge();
        addressBookPage.sendWebsite();
        addressBookPage.sendPhoneNumber();
        addressBookPage.clickClimbingOption();
        addressBookPage.clickDancingOption();
        addressBookPage.sendNote();

        addressBookPage.clickCreateAddress();
        helper.verifyFirstName("Fernando");
        helper.verifyLastName("Torres");
        addressBookPage.clickAddress();
        editAddressPage.clickEditButton();
        addressBookPage.changeFirstName();
        addressBookPage.changeLastName();
        editAddressPage.clickUpdateAddress();
        helper.verifyFirstName("peter");
        helper.verifyLastName("Crouch");
        addressBookPage.clickAddress();
        editAddressPage.clickDestroy();
        driver.switchTo().alert().accept();
        helper.verifyAddressRemove("successfully");

        Driver.quitDriver();
    }
}
