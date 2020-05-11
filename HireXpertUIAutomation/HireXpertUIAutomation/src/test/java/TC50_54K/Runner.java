package TC50_54K;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\TLP33\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\Features\\login.feature"},
		glue= {"TC50_54"},
		format= {"pretty","html:test-outout"},
		dryRun = false,
		monochrome= true,
		tags= {"@TC50_54"}
		)


public class Runner {

}
