package runner;
import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-reports/results.json", "junit:target/cucumber-reports/results.xml", "html:target/cucumber-reports", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        glue = "steps",
        features = "src/test/resources/features",
        tags = "@TestSuite")

public class TestRunner {
    @AfterClass
    public static void writeExtendReport() {
        Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
    }
}
