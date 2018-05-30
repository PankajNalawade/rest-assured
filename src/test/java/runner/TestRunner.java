package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = "pretty",
        glue = "steps",
        features = "src/test/resources/features",
        tags = "@TestSuite")

public class TestRunner {
}
