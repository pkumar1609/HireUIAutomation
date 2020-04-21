package TC49_53;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\TLP33\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\Features\\login.feature"},
		glue= {"TC49_53"},
		format= {"pretty","html:test-outout"},
		dryRun = false,
		monochrome= true,
		tags= {"@TC49_53"}
		)


public class RunnerTc49_53 {

}
