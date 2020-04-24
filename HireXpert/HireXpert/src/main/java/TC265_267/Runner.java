package TC265_267;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\TLP33\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\Features\\Task.feature"},
		glue= {"TC265_267"},
		format= {"pretty","html:test-outout"},
		dryRun = true,
		monochrome= true,
		tags= {"@TC265_267"}
		)
public class Runner {
	
	
}
