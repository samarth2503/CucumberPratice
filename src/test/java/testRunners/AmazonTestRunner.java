package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/resources/AppFeature/Search.feature"},
			glue = {"stepdefinations","AmazonHooks"},
			plugin = {"pretty"}
		)
public class AmazonTestRunner {

}
