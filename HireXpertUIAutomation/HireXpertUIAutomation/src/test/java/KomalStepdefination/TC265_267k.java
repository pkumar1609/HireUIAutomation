package KomalStepdefination;

import java.io.IOException;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC265_267k extends baseclass {
	
	public TC265_267k() throws IOException 
	{
		super();
	}
	
//	@Before()
//	public void setup() throws IOException
//	{
//		baseclass.initialization();
//	}
	
	@Given("^User must be registered as agency profile$")
	public void user_must_be_registered_as_agency_profile() throws Throwable {
		baseclass.initialization();
	}

	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws Throwable {
		loginpage.loginInAppWithAgyK();
	}
	
	@And("^Click on Add task button and enter all details for agency$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		taskpage.enterAlldetailsForAgy(credentials); 
	}
	
	@Then("^the task should display for agency$")
	public void the_task_should_display_for_both_agency() throws Throwable {
		dashboardpage.openDashboardPage();
		taskpage.validateTaskDisplayingProperlyForAgy();
	}

	@Then("^Task should also display for agency team member$")
	public void task_should_also_display_for_team_member() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithAgyTeamK();
		taskpage.TaskDisplayingForAgyTeam();
		Thread.sleep(1000);
		loginpage.logoutFromAppK();
		
	}

	@And("^Go to agency workbench$")
	public void go_to_agency_workbench() throws Throwable {
		loginpage.loginInAppWithAgyK();
		dashboardpage.openWorkbenchPage();
	}


//	@Then("^the task added should display on agency login$")
//	public void the_task_added_should_display_on_agency() throws Throwable {
//		Thread.sleep(2000);
//		dashboardpage.openDashboardPage();
//		taskpage.validateTaskDisplayingProperlyForAgy();
//	}
//
//	@Then("^the task should also display on agency team member login$")
//	public void the_task_should_also_display_on_team_member_login() throws Throwable {
//		Thread.sleep(2000);
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithAgyTeamK();
//		taskpage.TaskDisplayingForAgyTeam();
//	}
}
