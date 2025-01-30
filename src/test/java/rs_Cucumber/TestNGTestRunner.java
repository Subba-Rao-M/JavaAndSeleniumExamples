package rs_Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(
		features="src/test/java/rs_Cucumber",
		glue="rs_StepDefinitions",
		monochrome=true, 
		tags = "@Regression", 
		plugin= {"html:target/cucumber.html"}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	
}
