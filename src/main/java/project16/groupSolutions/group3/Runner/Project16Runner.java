package project16.groupSolutions.group3.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Regression",
        features = {"src/main/java/project16/groupSolutions/group3/FeatureFiles"},
        glue = {"project16.groupSolutions.group3.StepDefinitions"},
        plugin = {"html:target/report/RegressionTest.html"}

)

public class Project16Runner extends AbstractTestNGCucumberTests {
}
