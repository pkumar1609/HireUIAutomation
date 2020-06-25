package RegressionTc;

import java.io.IOException;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utilPackage.baseclass;

public class TC269_271_273 extends baseclass{
	
	boolean b;
	private boolean emp;

	public TC269_271_273() throws IOException 
	{
		super();
	}
	@And("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		dashboardpage.openWorkbenchPage();
	}
	
	@And("^Add job$")
	public void add_job(DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
	}

	@And("^Select a job$")
	public void select_a_job() throws Throwable {
		workbenchpage.selectJob();
	}
	
	@And("^Share job with team member$")
	public void share_job_with_team_member(DataTable credentials) throws Throwable {
	taskpage.shareWithTeam(credentials);
	} 
	
	@And("^Click on Add task button and enter all details$")
	public void click_on_Add_task_button_and_enter_all_details(DataTable credentials) throws Throwable {
		this.emp=loginpage.b;
		if(emp==true) 
		{
		taskpage.enterAlldetails(credentials);
		}
		else
		{
		taskpage.enterAlldetailsForAgy(credentials);
		}
	}
	
	@And("^Employer enters valid credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void employer_enters_valid_credentials(String Username, String Password) throws Throwable {
	  loginpage.loginIn(Username, Password);
	}
	
	@And("^team member should be added$")
	public void team_member_should_be_added(DataTable credentials) throws Throwable {
		teampage.verifyTeamAdded(credentials);
	}
	
	@And("^Click on mark in progress$")
	public void click_on_mark_in_progress() throws Throwable 
	{
	   taskpage.ClickOnMarkInProgress();
	}
	
	@And("^Click on Add task button and enter all details employer$")
	public void click_on_Add_task_button_and_enter_all_details_employer(DataTable credentials) throws Throwable {
		this.emp=loginpage.b;
		if(emp==true)
		{
		taskpage.enterAlldetails(credentials);
		}
		else
		{
		taskpage.enterAlldetailsForAgy(credentials);
		}
	}
	
	@And("^Go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		dashboardpage.openDashboardPage();
	}
	
	@And("^the task should display for loggedinuser$")
	public void the_task_should_display_for_employer() throws Throwable
	{
		taskpage.validateTaskDisplayingProperly();
	}

//	@And("^Task should also display for employer team member$")
//	public void task_should_also_display_for_employer_team_member() throws Throwable
//	{
//		taskpage.validateTaskDisplayingProperly();
//	}
	
	@And("^the task should display for loggedinuser with Status \"([^\"]*)\"$")
	public void the_task_should_display_for_loggedinuser_with_Status(String status) throws Throwable {
	   taskpage.StatusOfTask(status);
	}

	@And("^Logout from App$")
	public void logout_from_App() throws Throwable
	{
		loginpage.logoutFromAppK();
	}

	

	@And("^Login with team member$")
	public void login_with_team_member() throws Throwable {
		this.emp=loginpage.b;
		if(emp==true)
		{ 
		loginpage.loginInAppWithTeamK();
		}
		else 
		{
			loginpage.loginInAppWithAgyTeamK();
		}
	}
	
	@And("^Click on Mark Complete$")
	public void click_on_Mark_Complete() throws Throwable {
	   taskpage.MarkCompleted();
	}

	@And("^the task should not display on employer side$")
	public void the_task_should_not_display_on_employer_side() throws Throwable {
		taskpage.validateTaskAfterMarkCompletedEmp();
	}

	@And("^login as third employer team \"([^\"]*)\"$")
	public void login_as_third_employer_team(String teamid2) throws Throwable {
		loginpage.loginInAppWithTeam2(teamid2);
	}

	@And("^third user should not able to put task in progress$")
	public void third_user_should_not_able_to_put_task_in_progress() throws Throwable {
		taskpage.errordisplayed();
	}

	@And("^Click on edit task$")
	public void click_on_edit_task() throws Throwable {
	   taskpage.ClickOnEditTask();
	}

	@And("^verify All previously added details of task$")
	public void verify_All_previously_added_details_of_task(DataTable credentials) throws Throwable {
		taskpage.assertDeatailsOfTask(credentials);
	}

	@And("^edit the task$")
	public void edit_the_task(DataTable credentials) throws Throwable {
		taskpage.edittask(credentials);
		
	}
	
	@And("^verify all the edited details$")
	public void verify_all_the_edited_details(DataTable credentials) throws Throwable {
	
		taskpage.assertDeatailsOfTask(credentials);
	}
	
	@And("^Click on Add task button and enter all details for agency$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		taskpage.enterAlldetailsForAgy(credentials); 
	}
	
	@And("^verify the options present in teamfeild$")
	public void verify_the_options_present_in_teamfeild() throws Throwable {
	    int optionListsize=taskpage.list.size();
	    Assert.assertEquals(optionListsize, (taskpage.sizeOfShareWithTeam)+2 );
	}
	
	
}




