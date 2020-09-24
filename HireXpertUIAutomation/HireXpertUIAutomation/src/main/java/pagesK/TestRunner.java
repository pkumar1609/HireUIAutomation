package pagesK;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


import org.testng.annotations.Test;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="C:\\Users\\TLP33\\Documents\\GitHub\\HireUIAutomation\\HireXpertUIAutomation\\HireXpertUIAutomation\\src\\main\\java\\features",
glue= {"DataValidationTC_Stepdefination"},
dryRun= false,
monochrome = true,
plugin = {"html:target/cucumber-reports"},
tags=("@candidatedetails")
)
public class TestRunner
{}