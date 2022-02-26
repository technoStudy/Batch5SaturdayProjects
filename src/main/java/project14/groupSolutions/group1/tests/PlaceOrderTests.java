package project14.groupSolutions.group1.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import project14.groupSolutions.group1.pages.ContactUsPage;
import project14.groupSolutions.group1.pages.HomePage;
import project14.groupSolutions.group1.pages.OrderandHistoryPage;
import project14.groupSolutions.group1.pages.SignInPage;
import project14.groupSolutions.group1.utilities.Driver;

public class PlaceOrderTests {

    SignInPage signInPage = new SignInPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    HomePage homePage = new HomePage();
    OrderandHistoryPage orderandHistoryPage = new OrderandHistoryPage();
    String actualOrderCode;  //  <--- You need to define this as instance variable.

    @BeforeClass(groups = "Regression")
    public void navigateToSignInPage() {
        signInPage.maximizeWindow();
        signInPage.navigateTo(ProjectConstants.SIGN_IN_URL.getText());
    }
    @AfterClass(groups = "Regression")
    public void cleanUp(){
    Driver.quitDriver();
     }

    @Test(groups = "Regression")
    public void signIn() {
        signInPage.clickSignInIcon();
        signInPage.enterEmail(ProjectConstants.SIGN_IN_EMAIL.getText());
        signInPage.enterPassword(ProjectConstants.SIGN_IN_PASSWORD.getText());
        signInPage.clickSignInButton();
    }

    @Test(dependsOnMethods = "signIn", dataProvider = "TestData", groups = "Regression")
    public void contactUs(String data) {
        contactUsPage.clickContactIcon();
        contactUsPage.selectSubjectHeading("Customer service");
        contactUsPage.sendTextInTextBox(data);
        contactUsPage.clickSendIcon();
    }

    @DataProvider(name = "TestData")
    public Object[][] testDataProvider() {
        return new Object[][]{
                {"slow"}, {"less selection"}, {"need improve"}
        };
    }

    @Test(dependsOnMethods = "contactUs", groups = "Regression")
    public void addProductToCart() {
        homePage.clicklogoIcon();
        homePage.clickBlouseItem();
        homePage.clickAddToCartButton();
        homePage.clickProceedToCheckout();
        homePage.clickSummaryPageCheckout();
        homePage.clickAddressPageCheckout();
        homePage.clickCheckBox();
        homePage.clickShippingPageCheckout();
        homePage.clickPayBankWire();
        homePage.clickConfirmOrder();
        Assert.assertTrue(homePage.getCompleteOrderText().contains("complete"));
        actualOrderCode = homePage.getorderReferenceTextInTextarea();  // This is the place where the element is still visible, so get the text here
    }

    @Test(dependsOnMethods = "addProductToCart", groups = "Regression")
    public void navigateToAccount() {
        orderandHistoryPage.clickAccountIcon();
        orderandHistoryPage.clickOrderHistoryAndDetail();
    }

    @Test(dependsOnMethods = "navigateToAccount", groups = "Regression")
    public void verifyReferenceCode() {
//        String actualOrderCode = homePage.getorderReferenceTextInTextarea();  // This does not work because the reference text area is no more present at this point.
        String expectedOrderCode = orderandHistoryPage.getOrderReferenceFromOrderList();
        Assert.assertTrue(actualOrderCode.contains(expectedOrderCode.toLowerCase()));  // For some reason, the text is stored in lowercase. See the screenshot I share with you.
    }
}