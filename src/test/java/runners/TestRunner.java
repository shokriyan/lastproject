package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features= {"src/test/resources/features"}
					, glue= {"src/test/java/com/syntax/stepDefinitions"}
					, plugin= {"pretty" 
					, "html:src/target/cucumber-defualt-reports"
					,"json:target/cucumber.json"}
					,dryRun= false
//					,tags= {""}

)

public class TestRunner {
	
	

}
