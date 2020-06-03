package Stepdefination1Komal;

import java.io.IOException;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC294 extends baseclass {
	
	public TC294() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}


	@And("^Click on My Task$")
	public void click_on_My_Task() throws Throwable {
		taskpage.ClickOnMyTask();
	}

	@Then("^Click on Reload Task button$")
	public void click_on_Reload_Task_button() throws Throwable {
		taskpage.reloadtask();
	}

	@And("^Click on Team Task$")
	public void click_on_Team_Task() throws Throwable {
	   taskpage.ClickOnTeamTask();
	}
	
	@After()
	public void tearDown()
	{
//		driver.quit();
	}
}
