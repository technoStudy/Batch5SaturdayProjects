package project18.groupSolutions.group3.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import project18.groupSolutions.group3.pages.StudentPage;
import project18.groupSolutions.group3.pages.TopMenu;
import java.util.ArrayList;

public class Project18Steps {

    TopMenu topMenu = new TopMenu();
    StudentPage studentPage = new StudentPage();

    @Given("Navigate to Student Function Page")
    public void navigate_to_student_function_page() {
        topMenu.clickOnMoreButton();
        topMenu.hoverOverStudentMenu();
        topMenu.clickOnStudentMenu();
    }
    @And("Navigate to representative adding page")
    public void navigate_to_representative_adding_page() {
        studentPage.clickOnPlusIcon();
        studentPage.scrollToRepresentativeTab();
        studentPage.clickOnRepresentativesTab();
    }
    @When("Create a representative {string} with firstname {string} and lastname {string} and mobile phone {string} and country {string}")
    public void create_a_representative_with_firstname_and_lastname_and_mobile_phone_and_country(String representative, String firstname, String lastname, String mobilePhone, String country) {
        studentPage.clickOnPlusRepresentativesIcon();
        if(!representative.equals("")) {
            studentPage.clickOnRepresentativesText();
            studentPage.clickOnRepresentativeTypeByName(representative);
        }
        studentPage.enterRepresentativeFirstname(firstname);
        studentPage.enterRepresentativeLastname(lastname);
        studentPage.enterRepresentativeMobilePhone(mobilePhone);
        studentPage.enterRepresentativeCountry(country);

    }
    @Then("Verify representative {string} with firstname {string} and lastname {string}")
    public void verify_representative_with_firstname_and_lastname(String representative, String firstname, String lastname) {
        studentPage.clickOnAddButton();
        Assert.assertTrue(studentPage.getRepresentativeFullNameList().contains(firstname + " " + lastname));
        Assert.assertTrue(studentPage.getRepresentativeTypeList().contains(representative));
    }
    @Then("Verify representative {string}")
    public void verify_representative(String buttonStatus) {
        SoftAssert sf = new SoftAssert();
        String addButtonStatus = Boolean.toString(studentPage.getAddButtonStatus());
        sf.assertEquals(addButtonStatus,buttonStatus,"verifying button clickable!");
        studentPage.clickCloseDialogButton();
        sf.assertAll();
    }
    @When("Delete all representatives")
    public void delete_all_representatives() {
        studentPage.clickMatIconButton();
        studentPage.clickDeleteConfirmButton();
        studentPage.clickMatIconButton();
        studentPage.clickDeleteConfirmButton();
    }
    @Then("Verify that delete all representatives")
    public void verify_that_delete_all_representatives() {
        ArrayList<String> respectedResult = new ArrayList<>(){};
        Assert.assertEquals(studentPage.getRepresentativeFullNameList(),respectedResult,"delete all representatives successfully!");

//        Assert.assertTrue(studentPage.getRepresentativeFullNameList().isEmpty(), "Representative Full Name List is not empty!");
    }

}
