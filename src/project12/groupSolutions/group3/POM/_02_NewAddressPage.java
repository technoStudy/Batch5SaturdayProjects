package project12.groupSolutions.group3.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_NewAddressPage {

    public _02_NewAddressPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "address_first_name")
    public WebElement firstNameInput;

    @FindBy(id = "address_last_name")
    public WebElement lastNameInput;

    @FindBy(id = "address_street_address")
    public WebElement address1Input;

    @FindBy(id = "address_secondary_address")
    public WebElement address2Input;

    @FindBy(id = "address_city")
    public WebElement cityInput;

    @FindBy(id = "address_state")
    public WebElement stateInput;

    @FindBy(id = "address_zip_code")
    public WebElement zipCodeInput;

    @FindBy(id = "address_country_us")
    public WebElement countryInput;

    @FindBy(id = "address_birthday")
    public WebElement birthdayInput;

    @FindBy(id = "address_age")
    public WebElement ageInput;

    @FindBy(id = "address_website")
    public WebElement websiteInput;

    @FindBy(id = "address_phone")
    public WebElement phoneInput;

    @FindBy(id = "address_interest_climb")
    public WebElement climbing;

    @FindBy(id = "address_interest_dance")
    public WebElement dancing;

    @FindBy(id = "address_note")
    public WebElement noteInput;

    @FindBy(css = "input[value='Create Address']")
    public WebElement createAddressButton;





}
