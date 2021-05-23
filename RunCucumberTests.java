package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features/Duplicate.feature"},
		glue = {"stepDef2"},
		monochrome= true
		)

public class RunCucumberTests extends AbstractTestNGCucumberTests {

	
		

	}


