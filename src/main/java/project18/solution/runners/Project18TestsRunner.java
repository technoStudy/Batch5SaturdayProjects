package project18.solution.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/project18/solution/features"},
        glue = "project18.solution.stepDefinitions",
        plugin = {"pretty",
                "html:target/Project18TestsReport.html",
                "json:target/Project18Tests-report.json"},
        tags = "@Project18",
        dryRun = false
)
public class Project18TestsRunner extends AbstractTestNGCucumberTests {
}
