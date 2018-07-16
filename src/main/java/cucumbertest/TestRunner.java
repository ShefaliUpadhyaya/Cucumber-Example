package cucumbertest;

import org.junit.runner.RunWith;
/*annotation tells JUnit that tests should run using Cucumber class present in ‘Cucumber.api.junit‘ package.*/
import cucumber.api.CucumberOptions;
/*annotation tells Cucumber where to look for feature files, what reporting system to use.*/
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		)

public class TestRunner {

}
