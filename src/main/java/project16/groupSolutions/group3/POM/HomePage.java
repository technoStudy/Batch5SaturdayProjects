package project16.groupSolutions.group3.POM;

import project16.groupSolutions.group3.Utilities.ReadFromConfigFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePOM{

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),' Welcome, Ильяс Муратов ! ')]")
    private WebElement welcomeStatement;

    private String getHomePageURL(){
        return driver.getCurrentUrl();
    }

    public void validateUserOnHomePage(){
        wait.until(ExpectedConditions.visibilityOf(welcomeStatement));
        Assert.assertEquals(getHomePageURL(), ReadFromConfigFile.getValueFor("homepage"),"User is on Home Page Now");
    }

}
