package project18.groupSolutions.group3.runners;

import project18.groupSolutions.group3.enums.Browser;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import project18.groupSolutions.group3.utilities.Driver;

@CucumberOptions(
        features = {"src/main/java/project18/groupSolutions/group3/features"},
        glue = "project18.groupSolutions.group3.stepDefinitions",
        plugin = {"pretty",
                "html:target/report/Project18TestsReport_Chrome.html",
                "json:target/report/Project18Tests-report-chrome.json"},
        tags = "@Project18",
        dryRun = false
)

public class Project18TestsChromeRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void setBrowser(){
        Driver.setBrowser(Browser.CHROME);
    }
}
