package CampusProjectSolutions.stepdefinitions;

import CampusProjectSolutions.pages.SchoolDepartmentsPage;
import CampusProjectSolutions.pages.TopMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Project16Steps {
    TopMenu topMenu = new TopMenu();
    SchoolDepartmentsPage schoolDepartmentsPage = new SchoolDepartmentsPage();

    @Given("Navigate to School Departments Menu")
    public void navigate_to_school_departments_menu() {
        topMenu.clickOnMoreButton();
        topMenu.hoverOverSetupMenu();
        topMenu.hoverOverSchoolSetupMenu();
        topMenu.clickOnDepartmentsMenu();
    }

    @And("Click on Plus Icon")
    public void click_on_plus_icon() {
        schoolDepartmentsPage.clickOnPlusIcon();
    }

    @And("Enter School Department with name {string} and code {string}")
    public void enter_school_department_name_and_code(String name, String code) {
        schoolDepartmentsPage.enterSchoolDepartmentName(name);
        schoolDepartmentsPage.enterCode(code);
    }

    @And("Open Section Tab")
    public void open_section_tab() {
        schoolDepartmentsPage.clickOnSectionTab();
    }

    @And("Create section with name {string} and short name {string}")
    public void create_section_with_name_and_short_name(String name, String shortName) {
        schoolDepartmentsPage.enterSectionName(name);
        schoolDepartmentsPage.enterShortName(shortName);
        schoolDepartmentsPage.clickOnAddButtonInSection();
    }

    @When("Save the School Department")
    public void save_the_school_department() {
        schoolDepartmentsPage.clickOnSaveButton();
    }

    @Then("Verify School Department with name {string} and code {string}")
    public void verify_school_department_with_name_and_code(String name, String code) {
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains(name));
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsCodeList().contains(code));
    }

    @And("Verify School Department with name {string} and code {string} does not exist")
    public void verify_school_department_with_name_and_code_does_not_exist(String name, String code) {
        Assert.assertFalse(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains(name));
        Assert.assertFalse(schoolDepartmentsPage.getSchoolDepartmentsCodeList().contains(code));
    }

    @And("Click on School Department row with name {string}")
    public void click_on_school_department_row_with_name(String name) {
        schoolDepartmentsPage.clickOnSchoolDepartmentRowWithName(name);
    }

    @And("Verify Section with name {string} and short name {string}")
    public void verify_section_with_name_and_short_name(String name, String shortName) {
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionNameList().contains("Junior Classes"));
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionShortNameList().contains("Juniors"));
    }

    @And("Close modal window")
    public void close_modal_window() {
        schoolDepartmentsPage.closeModalWindow();
    }

    @Then("Verify dialog box message {string}")
    public void verify_dialog_box_message(String expectedMessage) {
        String actualMessage = schoolDepartmentsPage.getDialogBoxMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
        schoolDepartmentsPage.waitUntilDialogBoxDisappears();
    }

    @When("Delete School Department")
    public void delete_school_department(){
        schoolDepartmentsPage.clickOnSchoolDepartmentDeleteButton();
        schoolDepartmentsPage.clickOnDeleteButton();
    }

    @Then("Verify School Department with name {string} deleted")
    public void verify_school_department_deleted(String name){
        Assert.assertFalse(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains(name));
    }
}
