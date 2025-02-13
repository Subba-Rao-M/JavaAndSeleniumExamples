package cucumberframework.cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					features="src/main/java/cucumberframework/features",
					glue="cucumberframework.stepDefinitions",
					monochrome=true,
					tags="@SmokeTest or @RegressionTest",
					plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}
				)

public class TestNGRunner extends AbstractTestNGCucumberTests {

	
	
}
