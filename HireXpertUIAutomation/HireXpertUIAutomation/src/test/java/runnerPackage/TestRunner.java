package runnerPackage;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
features="C:\\Users\\TLP33\\Documents\\GitHub\\HireUIAutomation\\HireXpertUIAutomation\\HireXpertUIAutomation\\src\\main\\java\\features",
glue= {"BVT_StepDefination"},
dryRun= true,
monochrome= true,
//plugin = {"html:target/cucumber-reports", "json:target/cucumber-reports/cucumber-json"},
//plugin = {"pretty",
//        "html:target/cucumber-reports/cucumber.html",
//        "json:target/cucumber-reports/cucumber.json"},

plugin = {"pretty",
        "html:target/cucumber-reports","json:target/cucumber.json","junit:target/cucumber-reports/Cucumber.xml"},
tags=("@login")
)

public class TestRunner
{};
//@block,@unblock,@jobupdate,@interview,@invalid,@JCWF,@market,@primary