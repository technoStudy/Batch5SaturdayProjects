package project14.solution.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project14.solution.pages.*;

public class PlaceOrderTest {

    ShoppingCartPages shoppingCartPages = new ShoppingCartPages();
    String orderReferenceCodeMessage;

    @Test(groups = "Regression")
    public void addToCart(){
        HomePage homePage = new HomePage();
        homePage.navigateTo("http://automationpractice.com/");
        homePage.clickOnFirstProduct();
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        productDetailsPage.clickOnAddToCartButton();
        productDetailsPage.clickOnProceedToCheckout();
        shoppingCartPages.clickOnProceedToCheckoutButton();
    }

    @Test(dependsOnMethods = "addToCart", groups = "Regression")
    public void signIn() {
        AuthenticationPage authenticationPage = new AuthenticationPage();
        authenticationPage.enterEmail("emailfake@gmail.com");
        authenticationPage.enterPassword("PASSWORD123");
        authenticationPage.clickOnSignInButton();
    }

    @Test(dependsOnMethods = "signIn", groups = "Regression")
    public void proceedToCheckout(){
        shoppingCartPages.clickOnProceedToCheckoutButton();
        shoppingCartPages.clickOnTermsOfServiceCheckbox();
        shoppingCartPages.clickOnProceedToCheckoutButton();
        shoppingCartPages.clickOnPayByBankWire();
        shoppingCartPages.clickOnConfirmOrderButton();
        String expectedOrderCompletedMessage = "Your order on My Store is complete.";
        String actualOrderCompletedMessage = shoppingCartPages.getOrderCompletedMessage();
        Assert.assertEquals(actualOrderCompletedMessage, expectedOrderCompletedMessage);
        orderReferenceCodeMessage = shoppingCartPages.getOrderReferenceCodeMessage();
        shoppingCartPages.clickOnBackToOrdersLink();
    }

    @Test(dependsOnMethods = "proceedToCheckout", groups = "Regression")
    public void verifyOrderReferenceCode(){
        AccountPages accountPages = new AccountPages();
        String orderReferenceCode = accountPages.getOrderReferenceCode();
        Assert.assertTrue(orderReferenceCodeMessage.contains(orderReferenceCode));
    }
}
