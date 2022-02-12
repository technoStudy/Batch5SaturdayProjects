package project13.solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class NewAddressPage extends Base {
    public NewAddressPage() {
        PageFactory.initElements(driver, this);
    }

    // List the web elements. Make sure that the web elements are private
    @FindBy(id = "address_first_name")
    private WebElement firstNameTextBox;

    @FindBy(id = "address_last_name")
    private WebElement lastNameTextBox;

    @FindBy(id = "address_street_address")
    private WebElement address1TextBox;

    @FindBy(id = "address_secondary_address")
    private WebElement address2TextBox;

    @FindBy(id = "address_city")
    private WebElement cityTextBox;

    @FindBy(id = "address_state")
    private WebElement stateDropDownMenu;

    @FindBy(id = "address_zip_code")
    private WebElement zipCodeTextBox;

    @FindBy(id = "address_country_us")
    private WebElement countryUsRadioButton;

    @FindBy(id = "address_birthday")
    private WebElement birthdayDateBox;

    @FindBy(id = "address_age")
    private WebElement ageTextBox;

    @FindBy(id = "address_website")
    private WebElement websiteTextBox;

    @FindBy(id = "address_phone")
    private WebElement phoneTextBox;

    @FindBy(id = "address_interest_climb")
    private WebElement commonInterestsClimbingCheckBox;

    @FindBy(id = "address_interest_dance")
    private WebElement commonInterestDancingCheckBox;

    @FindBy(id = "address_note")
    private WebElement noteTextBox;

    @FindBy(css = "input[value='Create Address']")
    private WebElement createAddressButton;

    // List the actions of the web elements. Use the generic web elelment action methods inherited from Base class.
    public void enterFirstName(String firstName) {
        sendKeysToElement(firstNameTextBox, firstName);
    }
    public void enterLastName(String lastName) {
        sendKeysToElement(lastNameTextBox, lastName);
    }
    public void enterAddress1(String address1) {
        sendKeysToElement(address1TextBox, address1);
    }
    public void enterAddress2(String address2) {
        sendKeysToElement(address2TextBox, address2);
    }
    public void enterCity(String city) {
        sendKeysToElement(cityTextBox, city);
    }
    public void selectRandomState() {
        int randomIndex = new Random().nextInt(52);
        selectFromDropDownMenuByIndex(stateDropDownMenu, randomIndex);
    }
    public void enterZipCode(String zipCode) {
        sendKeysToElement(zipCodeTextBox, zipCode);
    }
    public void selectCountryUS() {
        clickOnElement(countryUsRadioButton);
    }
    public void enterBirthday(String birthdate) {
        sendKeysToElement(birthdayDateBox, birthdate);
    }
    public void enterAge(Integer age) {
        sendKeysToElement(ageTextBox, String.valueOf(age));
    }
    public void enterWebsite(String website) {
        sendKeysToElement(websiteTextBox, website);
    }
    public void enterPhone(String phone) {
        sendKeysToElement(phoneTextBox, phone);
    }
    public void selectCommonInterestClimbing() {
        clickOnElement(commonInterestsClimbingCheckBox);
    }
    public void selectCommonInterestDancing() {
        clickOnElement(commonInterestDancingCheckBox);
    }
    public void enterNote(String note) {
        sendKeysToElement(noteTextBox, note);
    }
    public void clickOnCreateAddressButton() {
        clickOnElement(createAddressButton);
    }
}
