package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature", 
		glue = { "stepDefinitions" }, 
		tags = "@activity5", 
		//plugin = {"pretty" },  /// For Activity 6
		plugin = {"html: test-reports"}, // For Activity 6
		//plugin = {"json: test-reports/json-report.json"}, For Activity 6
		monochrome = true)

public class ActivitiesRunner {

	// empty
}