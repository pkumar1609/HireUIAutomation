package Runner;

import cucumber.api.CucumberOptions;  
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\TLP32\\eclipse-workspace\\AutomationHirexpert\\src\\main\\java\\Features\\Edit&DeleteCandidate.feature"
		,glue= {"EditDeleteCandidateStepDefinationPackage"}
		//format= ("pretty","html:test-outout")
		)

public class TestRunner {

}
