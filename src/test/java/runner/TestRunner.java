package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

        @RunWith(Cucumber.class)
        @CucumberOptions(
                 plugin = { "json:target/cucumber-reports/cucumber.json",
        "pretty", "html:target/html-report/cucumber-html-reports.html",
        "junit:target/cucumber-reports/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@wip",
        dryRun = false
)
public class TestRunner {
}

