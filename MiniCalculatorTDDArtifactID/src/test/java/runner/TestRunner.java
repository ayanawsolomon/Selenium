package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.TestCase;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",
		glue = {"src/test/java/stepDefinitions"},
		dryRun =true
		)
public class TestRunner extends TestCase {

}
