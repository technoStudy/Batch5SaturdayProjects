package project14.groupSolutions.group3.tests;

import project14.groupSolutions.group3.pages.PlaceAnOrder;
import project14.groupSolutions.group3.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;


public class PlaceOrderTest extends Driver {
    PlaceAnOrder placeAnOrder;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void TestPlaceOrder() throws InterruptedException {

        placeAnOrder = new PlaceAnOrder(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);


        placeAnOrder.homePage.click();
        js.executeScript("window.scrollBy(0,800)");
        actions.moveToElement(placeAnOrder.hoverOver).perform();
        placeAnOrder.addCart.click();
        wait.until(ExpectedConditions.visibilityOf(placeAnOrder.proceedCheckOut));
        placeAnOrder.proceedCheckOut.click();
        wait.until(ExpectedConditions.visibilityOf(placeAnOrder.ProceedCheckOut2));
        placeAnOrder.ProceedCheckOut2.click();
        wait.until(ExpectedConditions.visibilityOf(placeAnOrder.ProceedCheckOut3));
        placeAnOrder.ProceedCheckOut3.click();
        placeAnOrder.checkbox.click();
        placeAnOrder.ProceedCheckOut4.click();
        placeAnOrder.bankWire.click();
        placeAnOrder.submit.click();
        js.executeScript("window.scrollBy(0,300)");


        String firstText = placeAnOrder.validate.getText();
        String secondText = "Your order on My Store is complete.";

        Assert.assertEquals(firstText, secondText);


        String completedTextWithCode = placeAnOrder.completed.getText();

        js.executeScript("window.scrollBy(0,300)");

        placeAnOrder.myOrders.click();

        String codeText = placeAnOrder.code.getText();

        Assert.assertTrue(completedTextWithCode.toLowerCase(Locale.ROOT).contains(codeText.toLowerCase(Locale.ROOT)));

    }
}