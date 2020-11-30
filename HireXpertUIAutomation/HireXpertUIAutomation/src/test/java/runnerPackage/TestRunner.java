package runnerPackage;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
features="C:\\Users\\TLP33\\Documents\\GitHub\\HireUIAutomation\\HireXpertUIAutomation\\HireXpertUIAutomation\\src\\main\\java\\features",
glue= {"BVT_StepDefination"},
dryRun= false,
monochrome= true,
plugin = {"html:target/cucumber-reports", "json:target/cucumber-reports/cucumber-json"},
tags=("@JCWF")
)
public class TestRunner
{};
//@block,@unblock,@jobupdate,@interview,@invalid,@JCWF,@market,@primary