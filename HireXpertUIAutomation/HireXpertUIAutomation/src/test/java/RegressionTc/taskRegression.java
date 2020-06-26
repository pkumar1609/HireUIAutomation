package RegressionTc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utilPackage.baseclass;

public class taskRegression extends baseclass{
	
	boolean b;
	private boolean emp;

	public taskRegression() throws IOException 
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

	@And("^verify All previously added details of task\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void verify_All_previously_added_details_of_task_and(String task, String team, String Assignto, String note) throws Throwable {
		taskpage.assertDeatailsOfTask(task, team, Assignto, note);
	}

	@And("^edit the task \"([^\"]*)\"and \"([^\"]*)\"$")
	public void edit_the_task_and(String editedtask, String editednote) throws Throwable {
		taskpage.edittaskdetails(editedtask, editednote);
	}

	@Then("^verify all the edited details \"([^\"]*)\"and \"([^\"]*)\"$")
	public void verify_all_the_edited_details_and(String editedtask, String editednote) throws Throwable {
	   taskpage.asserteditedDeatail(editedtask, editednote);
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
	
//	TC268
	
	@And("^Click on add candidate$")
	public void click_on_add_candidate() throws Throwable {
		workbenchpage.clickOnAddCandidate();
	}

	
	
	@And("^Enter All details of \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\", <\"([^\"]*)\">,\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_All_details_of_and(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
		workbenchpage.enterEmailId();
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\CV (1).doc");
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
	}
	
	@And("^verify candidate card is displaying or not in New column$")
	public void verify_candidate_card_is_displaying_or_not_in_New_column() throws Throwable {
	    
	}
}




