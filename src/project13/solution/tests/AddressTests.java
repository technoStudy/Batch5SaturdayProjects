package project13.solution.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import project13.solution.pages.AddressesPage;
import project13.solution.pages.NewAddressPage;
import project13.solution.pages.SignInPage;
import project13.solution.utilities.Driver;

public class AddressTests {

    SignInPage signInPage = new SignInPage();
    AddressesPage addressesPage = new AddressesPage();
    NewAddressPage newAddressPage = new NewAddressPage();

    @BeforeClass
    public void navigateToSignInPage(){
        signInPage.maximizeWindow();
        signInPage.navigateTo(ProjectConstants.SIGN_IN_URL.getText());
    }

    @AfterClass
    public void cleanUp(){
        Driver.quitDriver();
    }

    @Test
    public void signIn(){
        signInPage.enterEmail(ProjectConstants.SIGN_IN_EMAIL.getText());
        signInPage.enterPassword(ProjectConstants.SIGN_IN_PASSWORD.getText());
        signInPage.clickOnSignInButton();
    }

    @Test (dependsOnMethods = "signIn")
    public void createNewAddress(){
        addressesPage.clickOnAddressesTab();
        addressesPage.clickOnNewAddressesButton();
        newAddressPage.enterFirstName("Fernando");
        newAddressPage.enterLastName("Torres");
        newAddressPage.enterAddress1("Anfield Rd");
        newAddressPage.enterAddress2("Anfield");
        newAddressPage.enterCity("Liverpool");
        newAddressPage.selectRandomState();
        newAddressPage.enterZipCode("L4 0TH");
        newAddressPage.selectCountryUS();
        newAddressPage.enterBirthday("03/20/1984");
        newAddressPage.enterAge(36);
        newAddressPage.enterWebsite("https://www.google.com/");
        newAddressPage.enterPhone("8625747878");
        newAddressPage.selectCommonInterestClimbing();
        newAddressPage.selectCommonInterestDancing();
        newAddressPage.enterNote("Never Back Down");
        newAddressPage.clickOnCreateAddressButton();
    }

    @Test(dependsOnMethods = "createNewAddress")
    public void verifyName(){
        String actualFirstName = addressesPage.getFirstName();
        String expectedFirstName = "Fernando";
        Assert.assertEquals(actualFirstName, expectedFirstName, "Verifying first name: ");

        String actualLastName = addressesPage.getFirstName();
        String expectedLastName = "Torres";
        Assert.assertEquals(actualLastName, expectedLastName, "Verifying last name: ");
    }

    @Test(dependsOnMethods = "verifyName")
    public void updateName(){
        addressesPage.clickOnAddressesTab();
        addressesPage.clickOnEditButton();
        newAddressPage.enterFirstName("Peter");
        newAddressPage.enterLastName("Crouch");
        addressesPage.clickOnUpdateButton();
    }

    @Test(dependsOnMethods = "updateName")
    public void verifyUpdatedName(){
        String actualFirstName = addressesPage.getFirstName();
        String expectedFirstName = "Peter";
        Assert.assertEquals(actualFirstName, expectedFirstName, "Verifying updated first name: ");

        String actualLastName = addressesPage.getFirstName();
        String expectedLastName = "Crouch";
        Assert.assertEquals(actualLastName, expectedLastName, "Verifying updated last name: ");
    }

    @Test(dependsOnMethods = "verifyUpdatedName")
    public void destroyAddress(){
        addressesPage.clickOnAddressesTab();
        addressesPage.clickOnDestroyButton();
        addressesPage.acceptAlertBox();
        Assert.assertTrue(addressesPage.getNoticeMessageText().contains("successfully"));
    }
}
