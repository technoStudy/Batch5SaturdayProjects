package project17.groupSolutions.group1.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


// can't run from the runner class

@CucumberOptions(
        tags = "@Regression",
        features = {"src/main/java/project17/groupSolutions/group1/features"},
        glue = {"project17.groupSolutions.group1.stepDefinitions"},
        plugin = {"html:target/report/RegressionTest.html"}

)
public class project17TestsRunner extends AbstractTestNGCucumberTests {

}
