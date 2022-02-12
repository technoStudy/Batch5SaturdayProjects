package project13.groupSolutions.group1.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage extends Base{
    public AddressBookPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Addresses']")
    private WebElement addressButton;

    @FindBy(xpath = "//a[text()='New Address']")
    private WebElement newAddressButton;

    @FindBy(id = "address_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "address_last_name")
    private  WebElement lastNameInput;

    @FindBy(id = "address_street_address")
    private   WebElement address1Input;

    @FindBy(id = "address_secondary_address")
    private WebElement address2Input;

    @FindBy(id = "address_city")
    private   WebElement cityInput;

    @FindAll({@FindBy(id = "address_state")})
    private WebElement stateDropDownInput;

    @FindBy(id = "address_zip_code")
    private   WebElement zipcodeInput;

    @FindBy(id = "address_country_us")
    private   WebElement countryInput;

    @FindBy(id = "address_birthday")
    private   WebElement dateOfBirth;

    @FindBy(id = "address_age")
    private WebElement ageInput;

    @FindBy(id = "address_website")
    private WebElement website;

    @FindBy(id = "address_phone")
    private WebElement phoneNumber;

    @FindBy(id = "address_interest_climb")
    private WebElement clickClimbing;

    @FindBy(id = "address_interest_dance")
    private WebElement clickDancing;

    @FindBy(id = "address_note")
    private WebElement noteInput;

    @FindBy(xpath = "//input[@value='Create Address']")
    private WebElement createAddressButton;

    public void clickAddress(){
        clickOnElement(addressButton);}
    public void clicknewAddressButton(){
        clickOnElement(newAddressButton);
    }
    public void sendFirstName(){
        sendKeysToElement(firstNameInput,"Fernando");
    }
    public  void sendLastName(){
        sendKeysToElement(lastNameInput,"Torres");
    }
    public void sendAddress1(){
        sendKeysToElement(address1Input,"Anfield Rd");
    }
    public void sendAddress2(){
        sendKeysToElement(address2Input,"Anfield");
    }
    public void sendCity(){
        sendKeysToElement(cityInput,"Liverpool");
    }
    public void ramdomState(){
        chooseStateRamdom(stateDropDownInput);
    }
    public void sendZipcode(){
        sendKeysToElement(zipcodeInput,"L4 0TH");
    }
    public void clickCountry(){
        clickOnElement(countryInput);
    }
    public void sendDateOfBirth(){
        sendKeysToElement(dateOfBirth,"03/20/1984");
    }
    public void sendAge() {
        sendKeysToElement(ageInput, "36");
    }
    public void sendWebsite(){
        sendKeysToElement(website,"https://www.google.com/");
    }
    public void sendPhoneNumber(){
        sendKeysToElement(phoneNumber,"8625747878");
    }
    public void clickClimbingOption(){
        clickOnElement(clickClimbing);
    }
    public void clickDancingOption(){
        clickOnElement(clickDancing);
    }
    public void sendNote(){
        sendKeysToElement(noteInput,"Never Back Down");
    }
    public void clickCreateAddress(){
        clickOnElement(createAddressButton);
    }
    public void changeFirstName(){
        sendKeysToElement(firstNameInput,"Peter");
    }
    public void changeLastName(){
        sendKeysToElement(lastNameInput,"Crouch");
    }
}
