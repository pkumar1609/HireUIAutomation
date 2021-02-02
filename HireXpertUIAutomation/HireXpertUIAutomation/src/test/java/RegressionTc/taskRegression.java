package RegressionTc;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
		common.ClickSumbit();

	}

	@And("^Select a job$")
	public void select_a_job() throws Throwable {
		workbenchpage.selectJobK();
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
	
	@And("^\"([^\"]*)\" should be added$")
	public void team_member_should_be_added(String profile, DataTable credentials) throws Throwable {
		dashboardpage.enterAllDetails(profile, credentials);
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

	@And("^Click on hamburger menu$")
	public void click_on_hamburger_menu() throws Throwable {
		Thread.sleep(4000);
	    workbenchpage.threeDot.click();
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

//	@And("^login as third employer team \"([^\"]*)\"$")
//	public void login_as_third_employer_team(String teamid2) throws Throwable {
//		loginpage.loginInAppWithTeam2(teamid2);
//	}

	@And("^third user should not able to put task in progress$")
	public void third_user_should_not_able_to_put_task_in_progress() throws Throwable {
//		taskpage.errordisplayed();'
		Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'You can not change status of this task as you are neither assignee, creator or team owner for this task.')]")).isDisplayed(), true);
		common.clickOnOKBtn();
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
	
	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_All_details_of(String CandidateEmail,String Name,String profiletitle,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		try 
		{
		common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)	
		{}
		addcandidatepage.checkCandidateALreadyPresent();
	}
	
	
	@When("^verify candidate card is displaying or not in New column \"([^\"]*)\"$")
	public void verify_candidate_card_is_displaying_or_not_in_New_column(String Name) throws Throwable {
		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
		driver.findElement(By.xpath("//th[text()=' New ']//following::span[text()=' "+Name+"']")).isDisplayed();
	}
	
	@And("^drag the candidate from new column to Schedule interview column$")
	public void drag_the_candidate_from_new_column_to_Schedule_interview_column()throws Throwable {
//		action.clickAndHold(driver.findElement(By.cssSelector("div.item-box.cdk-drag"))).moveToElement(driver.findElement(By.xpath("//td[@class='TableCard' and @id='jobStatusColumn'][4]"))).release();
//		action.build().perform();
		WebElement drag=driver.findElement(By.cssSelector("div.item-box.cdk-drag"));
		WebElement drop=driver.findElement(By.xpath("//td[@class='TableCard' and @id='jobStatusColumn'][3]"));
		Action.clickAndHold(drag).moveToElement(drop).release(drop);
		Action.build().perform();
	}
	
	@And("^the Auto generated task should get created for the schedule interview$")
	public void the_Automatic_task_should_get_created_for_the_schedule_interview() throws Throwable {
		
	Assert.assertEquals(true, driver.findElement(By.xpath("//strong[text()='Please schedule interview of "+addcandidatepage.nameOfCan+" for job "+addjobpage.jobname+"']")).isDisplayed());	
	 
	}
	
	@And("^again move the card to next column$")
	public void again_move_the_card_to_next_column() throws Throwable {
		Thread.sleep(4000);
		Action.clickAndHold(driver.findElement(By.cssSelector("div.item-box.cdk-drag"))).moveToElement(driver.findElement(By.xpath("//td[@id='jobStatusColumn' and @class='TableCard'] [3]"))).release().build().perform();
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
//		executor.executeScript("arguments[0].scrollLeft();", Scroll);
		Thread.sleep(4000);
		executor.executeScript("scroll(50000,0)");
		WebElement Scroll = driver.findElement(By.xpath("//th[text()=' Rejected ']//following::div[@class='item-box cdk-drag']"));
		Scroll.isDisplayed();
	}

	@After("@regtask")
	public void Endtest() throws InterruptedException
	{
		dashboardpage.openDashboardPage();
		taskpage.ClickOnMyTask();
//		taskpage.reloadtask();
		Thread.sleep(2000);
		List<WebElement> markCompleteButton = driver.findElements(By.xpath("//a[@title='Complete']"));
		int size= markCompleteButton.size();
		for(int i=0;i<size;i++)
		{
			Thread.sleep(3000);
			markCompleteButton.get(i).click();
		}
		taskpage.ClickOnTeamTask();
		Thread.sleep(2000);
		taskpage.reloadtask();
		Thread.sleep(2000);
		List<WebElement> markCompleteButton1 = driver.findElements(By.xpath("//a[@title='Complete']"));
		int size1= markCompleteButton1.size();
		System.out.println(size1);
		for(int i=0;i<size1;i++)
		{
			Thread.sleep(3000);
			markCompleteButton1.get(i).click();
		}
	}


}


