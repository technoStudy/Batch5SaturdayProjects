package project18.solution.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/project18/solution/features"},
        glue = {"project18.solution.stepDefinitions"},
        plugin = {"pretty",
                "html:target/Project16TestsReport.html",
                "json:target/Project16Tests-report.json"},
        tags = "@Project16",
        dryRun = false
)
public class Project16TestsRunner extends AbstractTestNGCucumberTests {
}
