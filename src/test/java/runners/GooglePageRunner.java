package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src/test/resources/sampleFeatures/GooglePage.feature",
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {"pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		}
		)


public class GooglePageRunner {


}
