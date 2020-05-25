package KomalStepdefination;

import java.io.IOException;

import org.openqa.selenium.By;
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

	@When("^Click on Employer-Agency Signin link$")
	public void click_on_Employer_Agency_Signin_link() throws Throwable {
	    loginpage.ClickOnEmployerAgencySigninLink();
	}
	
	@And("^Employer enters valid credentials$")
	public void employer_enters_valid_credentials() throws Throwable {
		loginpage.loginInAppWithEmpK();

	}

	@And("^Go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		dashboardpage.openDashboardPage();
	}

	@And("^Click on Add task button and enter all details employer$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		taskpage.enterAlldetails(credentials);
	}

	@And("^the task should display for employer$")
	public void the_task_should_display_for_both_employer() throws Throwable {
		taskpage.validateTaskDisplayingProperly();
	}
	
//	@And("^Logout from App$")
//	public void Logout_from_App() throws Throwable {
//		Thread.sleep(2000);
//		loginpage.logoutFromAppK();
//	}
	
	@And("^Login with employer team$")
	public void login_as_employer_team() throws Throwable {
	   loginpage.loginInAppWithTeamK();
	}

	@And("^Task should also display for employer team member$")
	public void task_should_also_display_for_team_member() throws Throwable {
		taskpage.ValidateTaskDisplayingForTeam();
	}
	

	@And("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		
		dashboardpage.openWorkbenchPage();
		
	}

	@And("^Select a job$")
	public void select_a_job_and_click_on_add_task_button() throws Throwable {
	
		workbenchpage.selectJob();
		
		
	}

	

}
