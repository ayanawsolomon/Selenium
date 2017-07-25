package BDDGroupIID.BDDArtifactID;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/features/",
		glue = {"stepDefinitions"},
		dryRun =true
		)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
