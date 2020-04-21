package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Admin/eclipse-workspace/HireXpert/HireXpert/src/main/java/features/addAndDeleteEmployer.feature"
,glue= {"addAndDeleteEmployer"}
,monochrome = true
,plugin = { "html:target/cucumber-reports" }
//,tags = {"@loginTest"}
)
public class TestRunner {
	
}
