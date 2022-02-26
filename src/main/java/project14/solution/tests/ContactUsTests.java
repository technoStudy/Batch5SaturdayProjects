package project14.solution.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import project14.solution.pages.ContactUsPage;
import project14.solution.pages.HomePage;

public class ContactUsTests {

    ContactUsPage contactUsPage = new ContactUsPage();

    @DataProvider
    public Object[][] contactUsDataProvider() {
        return new Object[][]{
                {1, "studyTest1@test.com", "ABC123", "This is testing message."},
                {2, "studyTest2@test.com", "WYZ000", "My testing message"},
                {2, "studyTest3@test.com", "11111", "Testing! Testing!"}
        };
    }

    @Test(dataProvider = "contactUsDataProvider", groups = "Regression")
    public void contactUsPositiveTests(int index, String email, String orderReference, String message) {
        HomePage homePage = new HomePage();
        homePage.clickOnContactUsLink();
        contactUsPage.selectFromSubjectHeadingMenu(index);
        contactUsPage.enterEmailAddress(email);
        contactUsPage.enterOrderReference(orderReference);
        contactUsPage.enterMessage(message);
        contactUsPage.clickOnSendButton();
        String actualAlertSuccessMessage = "Your message has been successfully sent to our team.";
        Assert.assertEquals(actualAlertSuccessMessage, contactUsPage.getAlertSuccessMessage(), "Alert Success Message:");
    }
}
