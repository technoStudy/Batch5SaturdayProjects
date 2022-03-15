package project16.groupSolutions.group4.StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project16.groupSolutions.group4.pages.DeletePage;
import project16.groupSolutions.group4.pages.SchoolDepartmentPage;
import project16.groupSolutions.group4.pages.TopMenu;

public class SchoolDepartmentSteps {

    TopMenu topMenu;
    SchoolDepartmentPage schoolDepartmentPage;
    DeletePage deletePage;


    @Given("User navigate to top menu")
    public void user_navigate_to_top_menu() {
       topMenu = new TopMenu();
       topMenu.navigateToTopMenu();

    }
    @When("User create school department")
    public void user_create_school_department() {
       schoolDepartmentPage = new SchoolDepartmentPage();
       schoolDepartmentPage.addNewDepartment();
    }
    @Then("Success message displayed")
    public void success_message_displayed() {
         schoolDepartmentPage = new SchoolDepartmentPage();
         schoolDepartmentPage.validateMessageSuccess();
    }

    @When("User create school department again")
    public void user_create_school_department_again() {
         schoolDepartmentPage = new SchoolDepartmentPage();
         schoolDepartmentPage.addDepartmentAgain();
    }
    @Then("Alert message should be displayed")
    public void alert_message_should_be_displayed() {
        schoolDepartmentPage = new SchoolDepartmentPage();
        schoolDepartmentPage.verifyAlertMessage();
    }

    @When("User add same school with different code")
    public void user_add_same_school_with_different_code() {
        schoolDepartmentPage = new SchoolDepartmentPage();
        schoolDepartmentPage.addSameSchoolDiffCode();
    }

    @Then("Second Alert message should be displayed")
    public void second_alert_message_should_be_displayed() {
      schoolDepartmentPage = new SchoolDepartmentPage();
      schoolDepartmentPage.verifySecondAlertMessage();
    }

    @When("User add different school and same code")
    public void user_add_different_school_and_same_code() {
        schoolDepartmentPage = new SchoolDepartmentPage();
        schoolDepartmentPage.addDiffSchoolSameCode();
    }

    @Then("Third Alert message should be displayed")
    public void third_alert_message_should_be_displayed() {
      schoolDepartmentPage = new SchoolDepartmentPage();
      schoolDepartmentPage.verifyThirdAlertMessage();
    }

    @When("User edit school and code in department")
    public void user_edit_school_and_code_in_department() {
       schoolDepartmentPage = new SchoolDepartmentPage();
       schoolDepartmentPage.editSchoolAndCode();
    }
    @Then("Verifying After Edit message should be displayed")
    public void verifying_after_edit_message_should_be_displayed() {
      schoolDepartmentPage = new SchoolDepartmentPage();
      schoolDepartmentPage.verifyAfterEdit();
    }

    @When("User delete departments")
    public void user_delete_departments() {
        deletePage = new DeletePage();
        deletePage.deleteDepartmentAndClasses();

    }
    @Then("User should see success message")
    public void user_should_see_success_message() {
      deletePage = new DeletePage();
      deletePage.validateDeleteSuccessMessage();
    }
}
