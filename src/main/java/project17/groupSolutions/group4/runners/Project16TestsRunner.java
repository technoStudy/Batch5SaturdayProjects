package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/CampusProjectSolutions/features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty",
                "html:target/Project16TestsReport.html",
                "json:target/Project16Tests-report.json"},
        tags = "@Project16",
        dryRun = false
)
public class Project16TestsRunner extends AbstractTestNGCucumberTests {
}
