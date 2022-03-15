package project16.groupSolutions.group1.StepDefinitions;

import project16.groupSolutions.group1.Pages.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CampusSteps {

    LogInPage logInPage = new LogInPage();
    MenuPage menuPage = new MenuPage();
    DepartmentsPage departmentsPage = new DepartmentsPage();
    SectionTabPage sectionTabPage = new SectionTabPage();
    SchoolListPage schoolListPage = new SchoolListPage();
    DeletePage deletePage = new DeletePage();

    @Given("User enter username and password in login page")
    public void user_enter_username_and_password_in_login_page() {
        logInPage.sendUserName(ProjectConstants.SIGN_IN_Username.getText());
        logInPage.sendPassword(ProjectConstants.SIGN_IN_PASSWORD.getText());
        logInPage.clickLogIn();
        logInPage.clickCookiesIcon();
    }

    @And("User click on Departments menu")
    public void user_click_on_departments_menu() {
        menuPage.clickMenu();
        menuPage.clickSetUp();
        menuPage.clickSchoolSetUp();
        menuPage.clickDepartments();
    }
    @When("User create new School Departments")
    public void user_create_new_school_departments() {
        departmentsPage.clickPlusIcon();
        departmentsPage.sendName("High Schoolkk77");
        departmentsPage.sendCode("HS-1kk77");
        sectionTabPage.clickSectionButton();
        sectionTabPage.clickPlusInSection();
        departmentsPage.sendName("Junior classes");
        sectionTabPage.sendshortName("Junior");
        sectionTabPage.clickAddButtonInSection();
        departmentsPage.sendName("Senior Classes");
        sectionTabPage.sendshortName("Senior");
        sectionTabPage.clickAddButtonInSection();
        departmentsPage.clickSchoolDepartmentTab();
        departmentsPage.clickSaveButton();
        departmentsPage.clickExitMessage();
    }
    @And("User verifying new school are created")
    public void user_verifying_new_school_are_created() {
        String actualCreateSchool = schoolListPage.getTextOfHighSchool();
        String expectCreateSchool = "High Schoolkk77";
        Assert.assertEquals(actualCreateSchool, expectCreateSchool, "Verifying School");
        schoolListPage.clickHighScool();
        sectionTabPage.clickSectionButton();
        String actualCreateJuniorClasses = schoolListPage.getTextOfJuniorClasses();
        String expectCreateJuniorClasses = "Junior classes";
        Assert.assertEquals(actualCreateJuniorClasses, expectCreateJuniorClasses, "Verifying Junior classes");
        String actualCreateSeniorClasses = schoolListPage.getTextOfSeniorClasses();
        String expectCreateSeniorClasses = "Senior Classes";
        Assert.assertEquals(actualCreateSeniorClasses, expectCreateSeniorClasses, "Verifying Senior classes");
        departmentsPage.clickExitButton();

    }
    @And("User use the same school name again to verify the message with school already created")
    public void user_use_the_same_school_name_again_to_verify_the_message_with_school_already_created() {
        departmentsPage.clickPlusIcon();
        departmentsPage.sendName("High Schoolkk77");
        departmentsPage.sendCode("HS-1kk77");
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage = "There is already Department with \"High Schoolkk77\" name!";
        Assert.assertEquals(actualExistSchoolMessage, expectExistSchoolMessage, "Verifying ExistSchoolMessage ");
    }

    @And("User use same school name different code to verify")
    public void user_use_same_school_name_different_code_to_verify() {
        departmentsPage.sendName("High Schoolkk77");
        departmentsPage.sendCode("HSC-1bbff");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage2 = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage2 = "There is already Department with \"High Schoolkk77\" name!";
        Assert.assertEquals(actualExistSchoolMessage2, expectExistSchoolMessage2, "Verifying ExistSchoolMessage ");
    }
    @And("User use different school name and same code to verify")
    public void user_use_different_school_name_and_same_code_to_verify() {
        departmentsPage.sendName("High School Classes889900");
        departmentsPage.sendCode("HS-1kk77");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage3 = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage3 = "There is already Department with \"HS-1kk77\" code!";
        Assert.assertEquals(actualExistSchoolMessage3, expectExistSchoolMessage3, "Verifying ExistSchoolMessage ");
        departmentsPage.clickExitButton();
    }

    @And("User edit and verify school name and code")
    public void user_edit_and_verify_school_name_and_code() {
        departmentsPage.clickEditButton();
        departmentsPage.sendName("High School Classes8899002");
        departmentsPage.sendCode("HSC-18899002");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        departmentsPage.clickExitMessage();
        String actualAfterEditSchoolList = schoolListPage.getTextOfEditHighSchool();
        String expectAfterEditSchoolList = "High School Classes8899002";
        Assert.assertEquals(actualAfterEditSchoolList, expectAfterEditSchoolList, "Verifying After Edit School");
        String actualAfterEditSchoolCode = schoolListPage.getTextOfEditSchoolCode();
        String expectAfterEditSchoolCode = "HSC-18899002";
        Assert.assertEquals(actualAfterEditSchoolCode, expectAfterEditSchoolCode, "Verifying After Edit Code");
    }
    @Then("User delete the school departments and verify")
    public void user_delete_the_school_departments_and_verify() {
        deletePage.clickTrashIconOnHighSchoolClasses();
        deletePage.confirmDeleteHighSchoolClasses();
        String actualMessageAfterDeleteSchool = deletePage.getTextOFNodataDisplayMessage();
        String expectMessageAfterDeleteSchool = "There is no data to display";
        Assert.assertEquals(actualMessageAfterDeleteSchool,expectMessageAfterDeleteSchool,"Verifying After Deleted");
    }
    }

