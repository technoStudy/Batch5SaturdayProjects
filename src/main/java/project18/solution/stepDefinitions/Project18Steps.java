package project18.solution.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import project18.solution.pages.AddRepresentativeModalPage;
import project18.solution.pages.StudentsPage;
import project18.solution.pages.TopMenu;

public class Project18Steps {

    AddRepresentativeModalPage addRepresentativeModalPage = new AddRepresentativeModalPage();
    StudentsPage studentsPage = new StudentsPage();

    @When("Navigate to Students page")
    public void navigate_to_students_page() {
        TopMenu topMenu = new TopMenu();
        topMenu.clickOnMoreButton();
        topMenu.clickOnStudentMenu();
        topMenu.clickOnStudentsMenu();
    }

    @Then("Go to Representatives Tab")
    public void go_to_representatives_tab() {
        studentsPage.clickOnAddStudentPlusButton();
        studentsPage.clickOnRepresentativeTab();
    }

    @Given("Open Add Representative Modal Page")
    public void open_add_representative_modal_page() {
        studentsPage.clickOnAddRepresentativePlusButton();
    }

    @When("Enter representative {string}")
    public void enter_representative(String representativeType) {
        if (!representativeType.isBlank()) {
            addRepresentativeModalPage.clickOnRepresentativeFormControlOption();
            addRepresentativeModalPage.clickOnRepresentativeOptionOf(representativeType);
        }
    }

    @And("Enter representative's first name {string}")
    public void enter_representative_first_name(String firstName) {
        addRepresentativeModalPage.enterFirstName(firstName);
    }

    @And("Enter representative's last name {string}")
    public void enter_representative_last_name(String lastName) {
        addRepresentativeModalPage.enterLastName(lastName);
    }

    @And("Enter representative's mobile phone {string}")
    public void enter_representative_mobile_phone(String mobilePhone) {
        addRepresentativeModalPage.enterMobilePhone(mobilePhone);
    }

    @And("Enter representative's country {string}")
    public void enter_representative_country(String country) {
        addRepresentativeModalPage.enterCountry(country);
    }

    @Then("Verify add button is not active")
    public void verify_add_button_is_not_active() {
        Assert.assertFalse(addRepresentativeModalPage.isAddButtonEnabled());
        addRepresentativeModalPage.clickOnCloseButton();
    }

    @When("Click on Add button")
    public void click_on_add_button() {
        addRepresentativeModalPage.clickOnAddButton();
    }

    @Then("Verify creation of {string} with name {string} {string}")
    public void verify_that_representative_is_created_in_order(String representativeType, String firstName, String lastname) {
        Assert.assertEquals(studentsPage.getRepresentativeFullName(), firstName + " " + lastname);
        Assert.assertEquals(studentsPage.getRepresentativeType(), representativeType);
    }

    @When("Delete the representative")
    public void delete_the_representative() {
        studentsPage.clickOnDeleteRepresentativeButton();
        studentsPage.clickOnDeleteButton();
    }

    @Then("Verify representative is deleted")
    public void verify_representative_is_deleted() {
        Assert.assertEquals(studentsPage.getNoRepresentativeText(), "There is no data to display");
    }

    @And("Fail the scenario")
    public void fail_the_scenario(){
        Assert.fail();
    }
}
