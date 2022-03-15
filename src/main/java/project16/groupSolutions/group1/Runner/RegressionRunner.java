package project16.groupSolutions.group1.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Regression",
        features = {"src/main/java/project16/groupSolutions/group1/FeatureFiles"},
        glue = {"project16.groupSolutions.group1.StepDefinitions"},
        plugin = {"html:target/report/RegressionTest.html"}
)
public class RegressionRunner extends AbstractTestNGCucumberTests {
}
