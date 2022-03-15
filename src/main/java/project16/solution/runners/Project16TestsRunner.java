package project16.solution.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/project16/solution/features"},
        glue = {"project16.solution.stepdefinitions"},
        plugin = {"pretty",
                "html:target/Project16TestsReport.html",
                "json:target/Project16Tests-report.json"},
        tags = "@Project16",
        dryRun = false
)
public class Project16TestsRunner extends AbstractTestNGCucumberTests {
}
