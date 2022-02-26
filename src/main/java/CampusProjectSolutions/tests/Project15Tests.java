package CampusProjectSolutions.tests;

import CampusProjectSolutions.pages.TopMenu;
import org.testng.annotations.Test;

public class Project15Tests {

    TopMenu topMenu = new TopMenu();

    @Test(groups = "project15")
    public void createSchoolDepartmentTest() {
        topMenu.clickOnMoreButton();
        topMenu.hoverOverSetupMenu();
        topMenu.hoverOverSchoolSetupMenu();
        topMenu.clickOnDepartmentsMenu();
    }
}
