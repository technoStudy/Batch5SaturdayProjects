package project15.groupSolutions.group1.Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import project15.groupSolutions.group1.Pages.*;
import project15.groupSolutions.group1.Utilites.Driver;

public class CampusTests {
    LogInPage logInPage = new LogInPage();
    MenuPage menuPage = new MenuPage();
    DepartmentsPage departmentsPage = new DepartmentsPage();
    SectionTabPage sectionTabPage = new SectionTabPage();
    SchoolListPage schoolListPage = new SchoolListPage();
    DeletePage deletePage = new DeletePage();

    @BeforeClass
    public void navigateToLogInPage() {
        logInPage.maximizeWindow();
        logInPage.navigateTo(ProjectConstants.SIGN_IN_URL.getText());
    }

    @AfterClass
    public void tearDown() {
        Driver.quitDriver();
     }

    @Test
    public void logIn() {
        logInPage.sendUserName(ProjectConstants.SIGN_IN_Username.getText());
        logInPage.sendPassword(ProjectConstants.SIGN_IN_PASSWORD.getText());
        logInPage.clickCookiesIcon();
        logInPage.clickLogIn();
    }

    @Test(dependsOnMethods = "logIn")
    public void clickMenuIconToFindTheDepartments() {
        menuPage.clickMenu();
        menuPage.clickSetUp();
        menuPage.clickSchoolSetUp();
        menuPage.clickDepartments();
    }

    @Test(dependsOnMethods = "clickMenuIconToFindTheDepartments")
    public void addingItemToDepartments() {
        departmentsPage.clickPlusIcon();
        departmentsPage.sendName("High School889900");
        departmentsPage.sendCode("HS-188990");
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
        departmentsPage.clickExitButton();
    }

    @Test(dependsOnMethods = "addingItemToDepartments")
    public void verifyCreatedSchool() {
        String actualCreateSchool = schoolListPage.getTextOfHighSchool();
        String expectCreateSchool = "High School889900";
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

    @Test(dependsOnMethods = "verifyCreatedSchool")
    public void addSchoolDepartmentAgain() {
        departmentsPage.clickPlusIcon();
        departmentsPage.sendName("High School889900");
        departmentsPage.sendCode("HS-188990");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage = "There is already Department with \"High School889900\" name!";
        Assert.assertEquals(actualExistSchoolMessage, expectExistSchoolMessage, "Verifying ExistSchoolMessage ");
    }

    @Test(dependsOnMethods = "addSchoolDepartmentAgain")
    public void addSameSchoolDifferentCode() {
        departmentsPage.sendName("High School889900");
        departmentsPage.sendCode("HSC-188991");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage2 = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage2 = "There is already Department with \"High School889900\" name!";
        Assert.assertEquals(actualExistSchoolMessage2, expectExistSchoolMessage2, "Verifying ExistSchoolMessage ");
    }

    @Test(dependsOnMethods = "addSameSchoolDifferentCode")
    public void addDifferentSchoolSameCode() {
        departmentsPage.sendName("High School Classes889900");
        departmentsPage.sendCode("HS-188990");
        departmentsPage.clickExitMessage();
        departmentsPage.clickSaveButton();
        String actualExistSchoolMessage3 = departmentsPage.getTextOfExistMessage();
        String expectExistSchoolMessage3 = "There is already Department with \"HS-188990\" code!";
        Assert.assertEquals(actualExistSchoolMessage3, expectExistSchoolMessage3, "Verifying ExistSchoolMessage ");
        departmentsPage.clickExitButton();
    }

    @Test(dependsOnMethods = "addDifferentSchoolSameCode")
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
    @Test(dependsOnMethods = "editSchoolAndCode")
    public void deleteDepartmentAndClasses() {
        deletePage.clickTrashIconOnHighSchoolClasses();
        deletePage.confirmDeleteHighSchoolClasses();
        deletePage.clickTrashIconOnSchoolDepartment();
        deletePage.confirmDeleteSchoolDepartment();
    }
}
