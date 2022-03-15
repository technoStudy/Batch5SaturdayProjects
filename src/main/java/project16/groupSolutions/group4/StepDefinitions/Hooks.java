package project16.groupSolutions.group4.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import project16.groupSolutions.group4.pages.BasePOM;
import project16.groupSolutions.group4.utilities.Driver;
import project16.groupSolutions.group4.utilities.ReadFromConfigFile;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePOM {


//    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp() {
        //driver.get(ReadFromConfigFile.getValueFor("config.properties"));
        driver.get(ReadFromConfigFile.getValueFor("homepage"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

   @After
   public void tearDown() { Driver.quitDriver(); }
}

