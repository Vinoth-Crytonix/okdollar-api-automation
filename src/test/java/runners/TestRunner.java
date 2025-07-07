package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  plugin = {
		    "pretty",
		    "json:target/cucumber.json",
		    "html:target/cucumber-reports/cucumber-html-reports.html"
		  }
		)

public class TestRunner extends AbstractTestNGCucumberTests {
}
