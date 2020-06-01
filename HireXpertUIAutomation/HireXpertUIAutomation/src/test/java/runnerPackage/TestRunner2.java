package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {//"src/main/java/features/invaliddata.feature"
							//"src/main/java/features/addAndEditJob.feature"
							"src/main/java/features/candidateProfile.feature"
							//"src/main/java/features/scheduledInterview.feature"
							//"src/main/java/features/primaryContact.feature"
							//"src/main/java/features/blockFunctionality.feature"
							//"src/main/java/features/unblockFunctionality.feature"
							//"src/main/java/features/assignToAndAddedBy.feature"
							} 
,glue= {"jobFunctionality"}
,monochrome = true
,plugin = { "html:target/cucumber-reports" }
,tags = {"@regression1_05"}
)
public class TestRunner2 {
	
}


