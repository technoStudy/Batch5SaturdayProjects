package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/project17/groupSolutions/group4/features"},
        glue = {"project17.groupSolutions.group4.stepdefinitions"},
        plugin = {"pretty",
                "html:target/Project17TestsReport.html",
                "json:target/Project17Tests-report.json"},
        tags = "@Project17",
        dryRun = false
)
public class Project17TestsRunner extends AbstractTestNGCucumberTests {
}
