package TC264_266K;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\TLP33\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\Features\\Task.feature"},
		glue= {"TC264_266"},
		format= {"pretty","html:test-outout"},
		dryRun = false,
		monochrome= true,
		tags= {"@TC264_266"}
		)
public class Runner {
	
	
}
