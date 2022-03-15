package project16.groupSolutions.group1.StepDefinitions;

import project16.groupSolutions.group1.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CampusTests {
    MenuPage menuPage = new MenuPage();
    DepartmentsPage departmentsPage = new DepartmentsPage();
    SectionTabPage sectionTabPage = new SectionTabPage();
    SchoolListPage schoolListPage = new SchoolListPage();
    DeletePage deletePage = new DeletePage();


    @Test(groups = "Regression")
    public void clickMenuIconToFindTheDepartments() {
        menuPage.clickMenu();
        menuPage.clickSetUp();
        menuPage.clickSchoolSetUp();
        menuPage.clickDepartments();
    }

    @Test(dependsOnMethods = "clickMenuIconToFindTheDepartments",groups = "Regression")
    public void addingItemToDepartments() {
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

    @Test(dependsOnMethods = "addingItemToDepartments",groups = "Regression")
    public void verifyCreatedSchool() {
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

    @Test(dependsOnMethods = "verifyCreatedSchool",groups = "Regression")
    public void addSchoolDepartmentAgain() {
        departmentsPage.clickPlusIcon();
        departmentsPage.sendName("High Schoolkk77");
        departmentsPage.sendCode("HS-1kk77");
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage = "There is already Department with \"High Schoolkk77\" name!";
        Assert.assertEquals(actualExistSchoolMessage, expectExistSchoolMessage, "Verifying ExistSchoolMessage ");
    }

    @Test(dependsOnMethods = "addSchoolDepartmentAgain",groups = "Regression")
    public void addSameSchoolDifferentCode() {
        departmentsPage.sendName("High Schoolkk77");
        departmentsPage.sendCode("HSC-1bbff");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage2 = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage2 = "There is already Department with \"High Schoolkk77\" name!";
        Assert.assertEquals(actualExistSchoolMessage2, expectExistSchoolMessage2, "Verifying ExistSchoolMessage ");
    }

    @Test(dependsOnMethods = "addSameSchoolDifferentCode",groups = "Regression")
    public void addDifferentSchoolSameCode() {
        departmentsPage.sendName("High School Classes889900");
        departmentsPage.sendCode("HS-1kk77");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage3 = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage3 = "There is already Department with \"HS-1kk77\" code!";
        Assert.assertEquals(actualExistSchoolMessage3, expectExistSchoolMessage3, "Verifying ExistSchoolMessage ");
        departmentsPage.clickExitButton();
    }

    @Test(dependsOnMethods = "addDifferentSchoolSameCode",groups = "Regression")
    public void editSchoolAndCode() {
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
   @Test(dependsOnMethods = "editSchoolAndCode",groups = "Regression")
    public void deleteDepartmentAndClasses() {
        deletePage.clickTrashIconOnHighSchoolClasses();
        deletePage.confirmDeleteHighSchoolClasses();
        String actualMessageAfterDeleteSchool = deletePage.getTextOFNodataDisplayMessage();
        String expectMessageAfterDeleteSchool = "There is no data to display";
        Assert.assertEquals(actualMessageAfterDeleteSchool,expectMessageAfterDeleteSchool,"Verifying After Deleted");
}
}
