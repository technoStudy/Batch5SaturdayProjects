package project16.groupSolutions.group3.StepDefinitions;

import project16.groupSolutions.group3.POM.HomePage;
import project16.groupSolutions.group3.POM.SchoolDepartmentsPage;
import project16.groupSolutions.group3.POM.TopManuBar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepartmentSteps {

    TopManuBar topManuBar;
    HomePage homePage;
    SchoolDepartmentsPage schoolDepartmentsPage;

    @Given("User is on home page")
    public void user_is_on_home_page() {
        homePage = new HomePage();
        homePage.validateUserOnHomePage();
    }
    @When("User navigate to Department page")
    public void user_navigate_to_department_page() {
        topManuBar = new TopManuBar();
        topManuBar.navigateToDepartmentPage();
    }
    @Then("User is on Department page")
    public void user_is_on_department_page() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.ValidateUserOnDepartmentPage();
    }
    @When("User create school department")
    public void user_create_school_department() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.createSchoolDepartment();
    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.validateSuccessMessage();
    }
    @When("User verify the data of created school department")
    public void user_verify_the_data_of_created_school_department() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.verifyCreatedSchoolDepartment();
    }
    @Then("Existed school name message should be display")
    public void existed_school_name_message_should_be_display() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.validateExistedSchoolNameMessage();
    }
    @When("User create school department with same name and different code")
    public void user_create_school_department_with_same_name_and_different_code() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.createSchoolDepartmentWithSameNameAndDifferentCode();
    }
    @When("User create school department with different name and same code")
    public void user_create_school_department_with_different_name_and_same_code() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.createSchoolDepartmentWithDifferentNameAndSameCode();
    }
    @Then("Existed school code message should be display")
    public void existed_school_code_message_should_be_display() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.validateExistedSchoolCodeMessage();
    }
    @When("User edit the existed department with different name and code")
    public void user_edit_the_existed_department_with_different_name_and_code() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.editExistedDepartmentWithDifferentNameAndCode();
    }
    @When("User verify the data of created school department after editing")
    public void user_verify_the_data_of_created_school_department_after_editing() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.verifySchoolDepartmentAfterEditing();
    }
    @When("User add three sections in the high school class")
    public void user_add_three_sections_in_the_high_school_class() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.addThreeSectionsInHighSchoolClass();
    }
    @When("User delete the high school class department")
    public void user_delete_the_high_school_class_department() {
        schoolDepartmentsPage = new SchoolDepartmentsPage();
        schoolDepartmentsPage.deleteHighSchoolClassDepartment();
    }

}
