package TC265_267K;

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
	
	@Before()
	public void setup() throws IOException
	{
		baseclass.initialization();
	}
	@Given("^User must be registered as agency profile$")
	public void user_must_be_registered_as_agency_profile() throws Throwable {
	    
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws Throwable {
		loginpage.loginInAppWithAgyK();
	}

	@And("^Go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		String url= driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "http://103.68.10.36:8100/#/home");
	}


	@And("^In add task popup, Fill all the mandatory details$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		Thread.sleep(1000);
		taskpage.enterAlldetailsForAgy(credentials); 
	}

	@Then("^the task should display both agency$")
	public void the_task_should_display_for_both_agency() throws Throwable {
		taskpage.validateTaskDisplayingProperlyForAgy();
	}

	@Then("^Task should also display for team member$")
	public void task_should_also_display_for_team_member() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithAgyTeamK();
		taskpage.TaskDisplayingForAgyTeam();
		Thread.sleep(1000);
		loginpage.logoutFromAppK();
		
	}

	@And("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		Thread.sleep(1000);
		loginpage.loginInAppWithAgyK();
		dashboardpage.openWorkbenchPage();
	}

	@And("^Select a job and click on add task button$")
	public void select_a_job_and_click_on_add_task_button() throws Throwable {
		Thread.sleep(2000);
		workbenchpage.selectJob();

	}

	@And("^In add task popup, Fill all the mandatory details and assign to Himeself$")
	public void in_add_task_popup_Fill_all_the_mandatory_details_and_assign_to_Himeself(DataTable credentials) throws Throwable {
		Thread.sleep(2000);
		taskpage.enterAlldetailsForAgy(credentials);
	}

	@Then("^the task added should display on agency$")
	public void the_task_added_should_display_on_agency() throws Throwable {
		Thread.sleep(2000);
		dashboardpage.openDashboardPage();
		taskpage.validateTaskDisplayingProperlyForAgy();
	}

	@Then("^the task should also display on team member login$")
	public void the_task_should_also_display_on_team_member_login() throws Throwable {
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithAgyTeamK();
		taskpage.TaskDisplayingForAgyTeam();
	}
}
