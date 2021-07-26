package runnerPackage;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
features= "C:\\Users\\admin\\AppData\\Local\\Jenkins.jenkins\\workspace\\UI Automation\\HireXpertUIAutomation\\HireXpertUIAutomation\\src\\main\\java\\features",
glue= {"BVT_StepDefination"},
dryRun= false,
monochrome= true,
plugin = {"pretty",
        "html:target/cucumber-reports","json:target/cucumber.json", 
        "junit:C:/Users/admin/AppData/Local/Jenkins.jenkins/workspace/UI Automation/HireXpertUIAutomation/HireXpertUIAutomation/target/cucumber-reports/Cucumber.xml"
        },
tags=("@login,@register,@forgetPassword,@resetPassword,@JobWorkflow,@jobupdate,@interview,@JobCandidateManagement,@JCWF,@Job,@JobCandidteOffered,@Dashboard,@candidatePool")

)

public class TestRunner
{};
