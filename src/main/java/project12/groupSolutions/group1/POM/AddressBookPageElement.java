package project12.groupSolutions.group1.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPageElement {

    public AddressBookPageElement(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement addressIcon;

    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement addNewAddressIcon;

    @FindBy(id = "address_first_name")
    public  WebElement firstNameInput;

    @FindBy(id = "address_last_name")
    public  WebElement lastNameInput;

    @FindBy(id = "address_street_address")
    public  WebElement address1Input;

    @FindBy(id = "address_secondary_address")
    public  WebElement address2Input;

    @FindBy(id = "address_city")
    public  WebElement cityInput;

    @FindAll({@FindBy(id = "address_state")})
    public WebElement stateDropDownInput;

    @FindBy(id = "address_zip_code")
    public  WebElement zipcodeInput;

    @FindBy(id = "address_country_us")
    public  WebElement countryInput;

    @FindBy(id = "address_birthday")
    public  WebElement dateOfBirth;

    @FindBy(id = "address_age")
    public WebElement ageInput;

    @FindBy(id = "address_website")
    public WebElement website;

    @FindBy(id = "address_phone")
    public  WebElement phoneNumber;

    @FindBy(id = "address_interest_climb")
    public WebElement clickClimbing;

    @FindBy(id = "address_interest_dance")
    public  WebElement clickDancing;

    @FindBy(id = "address_note")
    public WebElement noteInput;

    @FindBy(xpath = "//input[@value='Create Address']")
    public  WebElement createAddressButton;

    @FindBy(xpath = "(//p[@class='row no-gutters'])[1]")
    public WebElement validateFirstName;

    @FindBy(xpath = "(//p[@class='row no-gutters'])[2]")
    public  WebElement validateLastName;









}
