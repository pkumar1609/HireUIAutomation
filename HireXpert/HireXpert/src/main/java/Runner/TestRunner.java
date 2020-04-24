package Runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\TLP33\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\Features\\login.feature"},
		glue= {"stepdefination48"},
		format= {"pretty","html:test-outout"},
		dryRun = false,
		monochrome= true,
		tags= {"@TC48_52"}
		)

public class TestRunner {
	
	
}
	