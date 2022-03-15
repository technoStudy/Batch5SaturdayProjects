package project17.solution.runners;

import project17.solution.enums.Browser;
import project17.solution.utilities.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = {"src/main/java/project17/solution/features"},
        glue = "project17.solution.stepDefinitions",
        plugin = {"pretty",
                "html:target/Project17TestsReport_Edge.html",
                "json:target/Project17Tests-report.json"},
        tags = "@Project17",
        dryRun = false
)
public class Project17TestsEdgeRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void setBrowser(){
        Driver.setBrowser(Browser.EDGE);
    }
}
