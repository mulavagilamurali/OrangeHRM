package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication", glue="stepDefinition", monochrome=true, tags="@Regression",  plugin = { "pretty",
		"html:target/OrangeHRMApplicationReports",
		"json:target/OrangeHRMApplicationJsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
		}, dryRun=true)


public class TestRunner {
	
	

}
