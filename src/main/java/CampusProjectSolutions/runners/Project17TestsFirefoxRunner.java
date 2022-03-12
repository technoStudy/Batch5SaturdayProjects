package CampusProjectSolutions.runners;

import CampusProjectSolutions.enums.Browser;
import CampusProjectSolutions.utilities.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = {"src/main/java/CampusProjectSolutions/features"},
        glue = "CampusProjectSolutions.stepDefinitions",
        plugin = {"pretty",
                "html:target/Project17TestsReport_Firefox.html",
                "json:target/Project17Tests-report.json"},
        tags = "@Project17",
        dryRun = false
)
public class Project17TestsFirefoxRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void setBrowser(){
        Driver.setBrowser(Browser.FIREFOX);
    }
}
