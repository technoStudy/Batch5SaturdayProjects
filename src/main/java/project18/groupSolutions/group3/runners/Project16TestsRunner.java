package project18.groupSolutions.group3.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/project18/groupSolutions/group3/features"},
        glue = {"project18.groupSolutions.group3.stepDefinitions"},
        plugin = {"pretty",
                "html:target/report/Project16TestsReport.html",
                "json:target/report/Project16Tests-report.json"},
        tags = "@Project16",
        dryRun = false
)
public class Project16TestsRunner extends AbstractTestNGCucumberTests {
}
