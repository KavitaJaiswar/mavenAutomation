package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\resources\\Features",
			glue = "stepDefinitions",
			strict = true,
			dryRun = false
		)





public class TestRunner1 {

}
