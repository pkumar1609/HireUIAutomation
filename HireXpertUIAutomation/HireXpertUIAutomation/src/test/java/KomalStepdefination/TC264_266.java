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

public class TC264_266 extends baseclass {
	
	public TC264_266() throws IOException 
	{
		super();
	}
	
//	@Before()
//	public void setup() throws IOException
//	{
//		baseclass.initialization();
//	}
	
	@Given("^User must be registered as Employer profile$")
	public void user_must_be_registered_as_Employer_profile() throws Throwable {
		baseclass.initialization();
	     //enter email id should exist in sysytem
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
		dashboardpage.openDashboardPage();
	}

	@And("^In task section click on add task \\(\\+\\) icon$")
	public void in_task_section_click_on_add_task_icon() throws Throwable {
		Thread.sleep(2000);
//		taskpage.clickOnAddTaskBtn();
	}

	@And("^Click on Add task button and enter all details for employer$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		
		taskpage.enterAlldetails(credentials);
	}

	@And("^Click on submit$")
	public void click_on_submit() throws Throwable {
//		Thread.sleep(1000);
//		employerspage.ClickSubmitBtn();

	}

	@And("^the task should display for both employer$")
	public void the_task_should_display_for_both_employer() throws Throwable {
		taskpage.validateTaskDisplayingProperly();
	}

	@And("^Task should also display for employer team member$")
	public void task_should_also_display_for_team_member() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithTeamK();
		taskpage.ValidateTaskDisplayingForTeam();
		Thread.sleep(1000);
		loginpage.logoutFromAppK();
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

	

	@Then("^the task added should display on employer$")
	public void the_task_added_should_display_on_employer() throws Throwable {
		Thread.sleep(2000);
		dashboardpage.openDashboardPage();
		taskpage.validateTaskDisplayingProperly();
		
	}
	
	@Then("^the task should also display on employer team member login$")
	public void the_task_should_also_display_on_team_member_login() throws InterruptedException
	{
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithTeamK();
		taskpage.ValidateTaskDisplayingForTeam();
	}
}
