package project12.groupSolutions.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewAddressPage {

    public NewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "address_first_name")
    public WebElement firsNameInput;

    @FindBy(id = "address_last_name")
    public WebElement lastNameInput;

    @FindBy(id = "address_street_address")
    public WebElement addressInput;

    @FindBy(id = "address_secondary_address")
    public WebElement secondAddressInput;

    @FindBy(id = "address_city")
    public WebElement cityInput;

    @FindBy (css = "select[name='address[state]']>option")
    public List<WebElement> statesElementListInput;

    @FindBy(id = "address_state")
    public WebElement stateElementInput;

    @FindBy(id = "address_zip_code")
    public WebElement zipCodeInput;

    @FindBy(id = "address_country_us")
    public WebElement countryInput;

    @FindBy(id = "address_birthday")
    public WebElement birthdayInput;

    @FindBy(id = "address_age")
    public WebElement ageInput;

    @FindBy(id = "address_website")
    public WebElement webSiteInput;

    @FindBy(id = "address_phone")
    public WebElement phoneNumberInput;

    @FindBy(id = "address_interest_climb")
    public WebElement climbInterestInput;

    @FindBy(id = "address_interest_dance")
    public WebElement danceInterestInput;

    @FindBy(id = "address_note")
    public WebElement noteInput;

    @FindBy(css = "input[name='commit']")
    public WebElement createAddress;

}
