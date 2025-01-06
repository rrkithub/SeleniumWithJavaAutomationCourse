package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdef"},
        tags = "@LoginwithTest",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "json: target/CucumberTestReport.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
