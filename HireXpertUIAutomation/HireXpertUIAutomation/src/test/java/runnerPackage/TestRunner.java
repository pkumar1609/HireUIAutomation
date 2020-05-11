package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Admin/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/loginK.feature"
,glue= {"stepdefination48K"}
,monochrome = true
,plugin = { "html:target/cucumber-reports" }
,tags = {"@TC48_52"}
)
public class TestRunner {
	
}
