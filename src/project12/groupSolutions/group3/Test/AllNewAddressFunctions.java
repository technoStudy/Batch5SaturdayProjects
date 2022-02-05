package project12.groupSolutions.group3.Test;

import project12.groupSolutions.group3.POM._01_HomePage;
import project12.groupSolutions.group3.POM._02_NewAddressPage;
import project12.groupSolutions.group3.POM._03_ValuesAfterCreatingAddress;
import project12.groupSolutions.group3.POM._04_EditingAddressPage;
import project12.groupSolutions.group3.Utils.BaseDriver;
import project12.groupSolutions.group3.Utils.ReusableMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class AllNewAddressFunctions extends BaseDriver {

    _01_HomePage homePage;
    _02_NewAddressPage newAddressPage;
    _03_ValuesAfterCreatingAddress values;
    _04_EditingAddressPage editingAddressPage;
    ReusableMethod reuse;

    @Test
    public void addNewAddress(){

        homePage = new _01_HomePage(driver);
        reuse = new ReusableMethod();

        homePage.addresses.click();

        reuse.verifyAddressText(driver);

    }

    @Test(dependsOnMethods = "addNewAddress")
    public void addNewAddressInput(){

        newAddressPage = new _02_NewAddressPage(driver);
        homePage = new _01_HomePage(driver);
        reuse = new ReusableMethod();

        homePage.addresses.click();
        homePage.addNewAddress.click();

        newAddressPage.firstNameInput.sendKeys("Fernando");
        newAddressPage.lastNameInput.sendKeys("Torres");
        newAddressPage.address1Input.sendKeys("Anfield Rd");
        newAddressPage.address2Input.sendKeys("Anfield");
        newAddressPage.cityInput.sendKeys("Liverpool");

        Select select = new Select(newAddressPage.stateInput);
        List<WebElement> stateOptions = select.getOptions();

        int size = stateOptions.size();
        int randomState = ThreadLocalRandom.current().nextInt(0,size);

        for (int i =0; i< stateOptions.size(); i++){
            stateOptions.get(randomState).click();
        }

        newAddressPage.zipCodeInput.sendKeys("L4 0TH");
        newAddressPage.countryInput.click();
        newAddressPage.birthdayInput.sendKeys("03/20/1984");
        newAddressPage.ageInput.sendKeys("36");
        newAddressPage.websiteInput.sendKeys("https://www.google.com/");
        newAddressPage.phoneInput.sendKeys("8625747878");
        newAddressPage.climbing.click();
        newAddressPage.dancing.click();
        newAddressPage.noteInput.sendKeys("Never Back Down");
        newAddressPage.createAddressButton.click();

        reuse.verifyNameAndLastName(driver);

    }

    @Test(dependsOnMethods = "addNewAddressInput")
    public void editingAddressTest(){

        homePage = new _01_HomePage(driver);
        values = new _03_ValuesAfterCreatingAddress(driver);
        editingAddressPage = new _04_EditingAddressPage(driver);
        reuse = new ReusableMethod();

        homePage.addresses.click();

        values.editButton.click();

        editingAddressPage.firstName.clear();
        editingAddressPage.firstName.sendKeys("Peter");


        editingAddressPage.lastName.clear();
        editingAddressPage.lastName.sendKeys("Crouch");

        editingAddressPage.updateButton.click();

        reuse.verifyNameAndLastName2(driver);

    }

    @Test(dependsOnMethods = "editingAddressTest")
    public void destroyAddressTest() {

        homePage = new _01_HomePage(driver);
        reuse = new ReusableMethod();

        homePage.addresses.click();
        homePage.destroyButton.click();

        driver.switchTo().alert().accept();

        reuse.verifyAddressIsRemoved(driver);

    }



}
