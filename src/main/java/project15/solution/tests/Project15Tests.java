package project15.solution.tests;

import project15.solution.pages.SchoolDepartmentsPage;
import project15.solution.pages.TopMenu;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Project15Tests {

    TopMenu topMenu = new TopMenu();
    SchoolDepartmentsPage schoolDepartmentsPage = new SchoolDepartmentsPage();
    SoftAssert softAssert = new SoftAssert();

    @Test(groups = "project15")
    public void createSchoolDepartmentHappyPathTest() {
        topMenu.clickOnMoreButton();
        topMenu.hoverOverSetupMenu();
        topMenu.hoverOverSchoolSetupMenu();
        topMenu.clickOnDepartmentsMenu();

        schoolDepartmentsPage.clickOnPlusIcon();
        schoolDepartmentsPage.enterSchoolDepartmentName("High School");
        schoolDepartmentsPage.enterCode("HS-1");

        schoolDepartmentsPage.clickOnSectionTab();
        schoolDepartmentsPage.enterSectionName("Junior Classes");
        schoolDepartmentsPage.enterShortName("Juniors");
        schoolDepartmentsPage.clickOnAddButtonInSection();

        schoolDepartmentsPage.enterSectionName("Senior Classes");
        schoolDepartmentsPage.enterShortName("Seniors");
        schoolDepartmentsPage.clickOnAddButtonInSection();
        schoolDepartmentsPage.clickOnSaveButton();
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains("High School"));
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsCodeList().contains("HS-1"));

        schoolDepartmentsPage.clickOnSchoolDepartmentRowWithName("High School");
        schoolDepartmentsPage.clickOnSectionTab();

        softAssert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionNameList().contains("Junior Classes"));
        softAssert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionShortNameList().contains("Juniors"));
        softAssert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionNameList().contains("Senior Classes"));
        softAssert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionShortNameList().contains("Seniors"));
        softAssert.assertAll();

        schoolDepartmentsPage.closeModalWindow();
        schoolDepartmentsPage.clickOnPlusIcon();
    }

    @DataProvider
    public Object[][] schoolDepartmentProvider() {
        return new Object[][]{
                {"High School", "HS-1", "There is already Department with \"High School\" name!"},
                {"High School", "HSC-1", "There is already Department with \"High School\" name!"},
                {"High School Classes", "HS-1", "There is already Department with \"HS-1\" code!"}
        };
    }

    @Test(groups = "project15", dependsOnMethods = "createSchoolDepartmentHappyPathTest", dataProvider = "schoolDepartmentProvider")
    public void createSchoolDepartmentNegativeTests(String name, String code, String expectedErrorMessage) {
        schoolDepartmentsPage.enterSchoolDepartmentName(name);
        schoolDepartmentsPage.enterCode(code);
        schoolDepartmentsPage.clickOnSaveButton();
        String actualErrorMessage = schoolDepartmentsPage.getDialogBoxMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        schoolDepartmentsPage.waitUntilDialogBoxDisappears();
    }

    @Test(groups = "project15", dependsOnMethods = "createSchoolDepartmentNegativeTests")
    public void editSchoolDepartmentTest() {
        schoolDepartmentsPage.closeModalWindow();
        schoolDepartmentsPage.clickOnSchoolDepartmentRowWithName("High School");
        schoolDepartmentsPage.enterSchoolDepartmentName("High School Classes");
        schoolDepartmentsPage.enterCode("HSC-1");
        schoolDepartmentsPage.clickOnSaveButton();

        softAssert.assertFalse(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains("High School"));
        softAssert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains("High School Classes"));
        softAssert.assertFalse(schoolDepartmentsPage.getSchoolDepartmentsCodeList().contains("HS-1"));
        softAssert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsCodeList().contains("HSC-1"));
        softAssert.assertAll();

        schoolDepartmentsPage.clickOnSchoolDepartmentRowWithName("High School Classes");
        schoolDepartmentsPage.clickOnSectionTab();
    }

    @DataProvider
    public Object[][] sectionProvider() {
        return new Object[][]{
                {"Freshman Classes", "Freshmen"},
                {"Sophomore Classes", "Sophomores"},
                {"College Credit Plus Students", "CC+ Students"}
        };
    }

    @Test(groups = "project15", dependsOnMethods = "editSchoolDepartmentTest", dataProvider = "sectionProvider")
    public void createSectionTests(String name, String shortname) {
        schoolDepartmentsPage.enterSectionName(name);
        schoolDepartmentsPage.enterShortName(shortname);
        schoolDepartmentsPage.clickOnAddButtonInSection();
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionNameList().contains(name));
        Assert.assertTrue(schoolDepartmentsPage.getSchoolDepartmentsSectionShortNameList().contains(shortname));
    }

    @Test(groups = "project15", dependsOnMethods = "createSectionTests")
    public void deleteSchoolDepartmentTest() {
        schoolDepartmentsPage.closeModalWindow();
        schoolDepartmentsPage.clickOnSchoolDepartmentDeleteButton();
        schoolDepartmentsPage.clickOnDeleteButton();
        Assert.assertFalse(schoolDepartmentsPage.getSchoolDepartmentsNameList().contains("High School Classes"));
    }
}
