package TC264_266K;

import java.io.IOException;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC264_266 extends baseclass {
	
	public TC264_266() throws IOException 
	{
		super();
	}
	
//	@Before()
//	public void setup() throws IOException
//	{
//		
//	}
	
	@Given("^User must be registered as Employer profile$")
	public void user_must_be_registered_as_Employer_profile() throws Throwable {
		baseclass.initialization();
	}
	
	

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^Employer enters valid credentials$")
	public void employer_enters_valid_credentials() throws Throwable {
		loginpage.loginInAppWithEmpK();
	}

	@And("^Go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		String url= driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "http://103.68.10.36:8100/#/home");
		
	}


	@And("^Click on Add task button and enter all details employer$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		taskpage.enterAlldetails(credentials);
	}
	
	

	@And("^the task should display for employer$")
	public void the_task_should_display_for_both_employer() throws Throwable {
		System.out.println("task on employer side");
		taskpage.validateTaskDisplayingProperly();
	}

	@And("^Task should also display for employer team member$")
	public void task_should_also_display_for_team_member() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithTeamK();
		System.out.println("task on employer team side");
		taskpage.ValidateTaskDisplayingForTeam();

	}


	@And("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		Thread.sleep(1000);
		loginpage.loginInAppWithEmpK();
		dashboardpage.openWorkbenchPage();
		
	}

	@And("^Select a job$")
	public void select_a_job_and_click_on_add_task_button() throws Throwable {
	
		workbenchpage.selectJob();
		
	}

//	@And("^Click on Add task button and enter all details for employer$")
//	public void in_add_task_popup_Fill_all_the_mandatory_details_and_assign_to_Himeself(DataTable credentials) throws Throwable {
//		
//		taskpage.enterAlldetails(credentials);
//		
//		
//	}

//	@Then("^the task added should display for employer$")
//	public void the_task_added_should_display_on_employer() throws Throwable {
//		Thread.sleep(2000);
//		dashboardpage.openDashboardPage();
//		taskpage.validateTaskDisplayingProperly();
//		
//	}
//	
//	@Then("^the task should also display on employer team member login$")
//	public void the_task_should_also_display_on_team_member_login() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithTeamK();
//		taskpage.ValidateTaskDisplayingForTeam();
//	}
}
