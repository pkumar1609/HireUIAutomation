package RegressionTc;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CandidateCardSectionPage;
import utilPackage.baseclass;

public class taskRegression extends baseclass{
	
	boolean b;
	private boolean emp;
	int flag=0;
	
	
	
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
	
	@And("^Select a added job$")
	public void select_a_added_job() throws Throwable {
	    workbenchpage.selectJobK();
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


	
	@And("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail, String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	}
	
	@And("^verify candidate card is displaying or not in New column$")
	public void verify_candidate_card_is_displaying_or_not_in_New_column() throws Throwable {
	    driver.findElement(By.xpath("//th[text()='New ']//following::div[@class='item-box cdk-drag']")).isDisplayed();
	}
	
	@And("^drag the candidate from new column to Schedule interview column$")
	public void drag_the_candidate_from_new_column_to_Schedule_interview_column()throws Throwable {
//		action.clickAndHold(driver.findElement(By.cssSelector("div.item-box.cdk-drag"))).moveToElement(driver.findElement(By.xpath("//td[@class='TableCard' and @id='jobStatusColumn'][4]"))).release();
//		action.build().perform();
		WebElement drag=driver.findElement(By.cssSelector("div.item-box.cdk-drag"));
		WebElement drop=driver.findElement(By.xpath("//td[@class='TableCard' and @id='jobStatusColumn'][2]"));
		action.clickAndHold(drag).moveToElement(drop).release(drop);
		action.build().perform();
	}
	
	@And("^the Auto generated task should get created for the schedule interview$")
	public void the_Automatic_task_should_get_created_for_the_schedule_interview() throws Throwable {
		
	 driver.findElement(By.xpath("//strong[text()='Please schedule interview of "+addcandidatepage.nameOfCan+" for job "+addjobpage.jobname+"']")).isDisplayed();
	
			
	 
	}
	
	@And("^again move the card to next column$")
	public void again_move_the_card_to_next_column() throws Throwable {
		Thread.sleep(4000);
		 action.clickAndHold(driver.findElement(By.cssSelector("div.item-box.cdk-drag"))).moveToElement(driver.findElement(By.xpath("//td[@id='jobStatusColumn' and @class='TableCard'] [3]"))).release().build().perform();

	}

	@And("^verify the Auto generated task is getting deleted or not$")
	public void verify_the_Auto_generated_task_is_getting_deleted_or_not() throws Throwable {
	taskpage.reloadtask();
	int size = driver.findElements(By.xpath("//strong[text()='Please schedule interview of Pratik for job candidatejob']")).size();
	System.out.println(size);
	Assert.assertEquals(size, 0);
	}
	
	@And("^click on reject icon on candidate card$")
	public void click_on_reject_icon_on_candidate_card() throws Throwable {
	    candidatecardsectionpage.clickOnrejecticonOfCandidateCard();
	    common.clickOnConfirmYes();
	    candidatecardsectionpage.selectRejectReason();
	    
	}

	@And("^verify the candidate card it should display in reject column$")
	public void verify_the_candidate_card_it_should_display_in_reject_column() throws Throwable {
//		executor.executeScript("arguments[0].scrollLeft();",driver.findElement(By.cssSelector("div.item-box.cdk-drag")) );
		WebElement ele = driver.findElement(By.xpath("//th[text()='Rejected ']//following::div[@class='item-box cdk-drag']"));
		executor.executeScript("window.scrollBy(-500000, 0)");
//		executor.executeScript("arguments[0].scrollRight = arguments[0].offsetWidth",ele );
		ele.isDisplayed();
	}

	
}


