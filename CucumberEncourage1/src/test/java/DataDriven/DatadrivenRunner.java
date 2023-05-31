package DataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
		features="src/test/resources/Features",
		glue = "DataDriven"
		
		)

@RunWith(Cucumber.class)
public class DatadrivenRunner {

}
