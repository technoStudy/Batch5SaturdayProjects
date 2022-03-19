package project18.solution.runners;

import project18.solution.enums.Browser;
import project18.solution.utilities.Driver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = {"src/main/java/project18/solution/features"},
        glue = "project18.solution.stepDefinitions",
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
