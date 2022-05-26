package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src/test/resources/taggedFeatures/",
		glue = {"stepDefs"},
		monochrome = true,
//		tags = "@RegressionTest"		
//		tags = "@RegressionTest or @SmokeTest"
//		tags = "@RegressionTest and @SmokeTest"	
//		tags = "not @RegressionTest and not @SmokeTest"
//		tags = "not @RegressionTest or not @SmokeTest"
		tags = "@Phase1"
//		tags = "@Phase1 and @RegressionTest"
//		tags = "@Phase1 and @RegressionTest or @Phase2 and @SmokeTest"
//		tags = "@Phase1 and @RegressionTest and @Phase2 and not @SmokeTest or not @RegressionTest"
//		tags = "@Phase2 and @RegressionTest or @Phase2 and @SmokeTest"
		)


public class CRMRunner {


}
