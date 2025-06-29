package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;

//this file is key component between feature and step defiantion
@CucumberOptions(
        features = "src/test/resources/features",         // path to .feature files
        glue = "stepDefinitions",                         // package where step defs are
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",          // generates HTML report
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests{


}
