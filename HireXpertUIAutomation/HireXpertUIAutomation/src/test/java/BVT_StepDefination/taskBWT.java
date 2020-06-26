package BVT_StepDefination;

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

public class taskBWT extends baseclass {
	
	public taskBWT() throws IOException 
	{
		super();
	}
	
	boolean emp;
	boolean b;
	
	@Before()
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}

	@And("^Employer enters valid credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void employer_enters_valid_credentials(String Username, String Password) throws Throwable {
	  loginpage.loginIn(Username, Password);
	}
	
	@And("^Go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		dashboardpage.openDashboardPage();
	}

	@And("^Click on Add task button and enter all details employer$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
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

	@And("^the task should display for employer$")
	public void the_task_should_display_for_both_employer() throws Throwable {
		taskpage.validateTaskDisplayingProperly();
	}
	
	@And("^Logout from App$")
	public void Logout_from_App() throws Throwable {
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
	}

	@And("^Login with employer team$")
	public void login_as_employer_team() throws Throwable {
	   loginpage.loginInAppWithTeamK();
	}

	@And("^Task should also display for employer team member$")
	public void task_should_also_display_for_team_member() throws Throwable {

		taskpage.validateTaskDisplayingProperly();
	}

	@And("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		
		dashboardpage.openWorkbenchPage();
		
	}

	@And("^Add job$")
	public void add_job(DataTable credentials) throws Throwable 
	{
		addjobpage.addjob(credentials);
	}

	@And("^Select a job$")
	public void select_a_job_and_click_on_add_task_button() throws Throwable {
		workbenchpage.selectJob();
	}
	
	
//tc 265 and 267
	

	@Given("^Click on Add task button and enter all details for agency$")
	public void click_on_Add_task_button_and_enter_all_details_for_agency(DataTable credentials) throws Throwable {
		taskpage.enterAlldetailsForAgy(credentials);
	}
	
	@Then("^the task should display for agency$")
	public void the_task_should_display_for_both_agency() throws Throwable {

		taskpage.validateTaskDisplayingProperlyForAgy();
	}
	
	@Then("^Login with agency team$")
	public void login_with_agency_team() throws Throwable {
		
        loginpage.loginInAppWithAgyTeamK();
  
	}
	
	@Then("^Task should also display for agency team member$")
	public void task_should_also_display_for_agency_team_member() throws Throwable {
		taskpage.validateTaskDisplayingProperlyForAgy();
	}
	
	
//tc 302
	@And("^Click on edit task$")
	public void click_on_edit_task() throws Throwable {
	   taskpage.ClickOnEditTask();
	}

	@And("^verify All previously added details of task\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void verify_All_previously_added_details_of_task_and(String task, String team, String Assignto, String note) throws Throwable {
		taskpage.assertDeatailsOfTask(task, team, Assignto, note);
	}

	@And("^edit the task \"([^\"]*)\"and \"([^\"]*)\"$")
	public void edit_the_task_and(String task, String note) throws Throwable {
		taskpage.edittaskdetails(task, note);
	}

	@Then("^verify all the edited details \"([^\"]*)\"and \"([^\"]*)\"$")
	public void verify_all_the_edited_details_and(String task, String note) throws Throwable {
	   taskpage.asserteditedDeatail(task, note);
	}
	
	
	
//tc 294
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
	
////tc 275

 
	
@Given("^team member should be added$")
public void team_member_should_be_added(DataTable credentials) throws Throwable {
	teampage.verifyTeamAdded(credentials);
}

@And("^Share job with team member$")
public void share_job_with_team_member(DataTable credentials) throws Throwable {
taskpage.shareWithTeam(credentials);
}

@And("^Click on Add task button and enter all details$")
public void Click_on_Add_task_button_and_enter_all_details(DataTable credentials) throws InterruptedException  {
	
	this.b=loginpage.b;
	if(b==true) 
	{
	taskpage.enterAlldetails(credentials);
	}
	else
	{
	taskpage.enterAlldetailsForAgy(credentials);
	}
}

@And("^Login with team member$")
public void login_with_emp_team_member() throws Throwable {
	this.b=loginpage.b;
	if(b==true)
	{
	loginpage.loginInAppWithTeamK();
	}
	else 
	{
		loginpage.loginInAppWithAgyTeamK();
	}
} 

@And("^Click on Delete task$")
public void click_on_Delete_task() throws InterruptedException  {
	this.b=loginpage.b;
	if(taskpage.assignto.contentEquals(loginpage.logedinuser)) 
	{
		taskpage.clickondeletetask();
		Thread.sleep(1000);
		taskpage.okbtn.click();
	}
	else
		{
			taskpage.teamtask.click();
			Thread.sleep(1000);
			taskpage.clickondeletetask();
		}
	
	}
	
	


@And("^observe the message$")
public void observe_the_message() throws Throwable {
	
//	boolean b= driver.getWindowHandle().contentEquals("You are not creator of this task. You are not authorised to delete it.");
//	boolean b= driver.getPageSource().contains("You are not creator of this task. You are not authorised to delete it.");
//			Assert.assertEquals(b, true);
}




@Then("^Delete the task$")
public void delete_the_task() throws Throwable 
{
	this.b=loginpage.b;
	if(b==true) {
	if(taskpage.assignto.contains("employer"))
	{
		taskpage.clickondeletetask();
	}
	else
	{
		taskpage.ClickOnTeamTask();
		taskpage.clickondeletetask();
	}
	}

else 
{
	if(taskpage.assignto.contains("agency"))
	{
		taskpage.clickondeletetask();
	}
	else
	{
		taskpage.ClickOnTeamTask();
		taskpage.clickondeletetask();
	}
}
}
	
//@And("^Select a added job$")
//public void select_a_added_job() throws Throwable {
//	
//	workbenchpage.selectJobK();	}

//@And("^Click on share job with market place$")
//public void click_on_share_job_with_market_place() throws InterruptedException   {
//
//	marketplacepage.ClickOnShareWithMarketPlace();
//}
//
//@And("^change information and click on submit$")
//public void change_information_and_click_on_submit(DataTable credentials) throws InterruptedException   {
//    
//	marketplacepage.EnterdeatilsOfMarketplace(credentials);
//}
//
//@And("^Click on Employer marketplace tab$")
//public void Click_on_Employer_marketplace_tab() throws Throwable {
//	marketplacepage.ClickOnMarketPlaceTab();
//}
//
////@Then("^Job should be list out in market place page on employer side\\.$")
////public void job_should_be_list_out_in_market_place_page_on_employer_side() throws Throwable {
////	String s= addjobpage.jobname1;
////	if(driver.getPageSource().contains(s))
////    {
////    	System.out.println("selected job is displaying on employer side");
////    }
////}
//
//@And("^Go to agency marketplace tab$")
//public void go_to_agency_marketplace_tab() throws Throwable {
//	marketplacepage.ClickOnAgyMarketPlaceTab();
//	
//}
//
//@And("^login as a support user$")
//public void login_as_a_support_user() throws Throwable {
//  loginpage.loginInAppWithSupport();
//}
//
//@And("^verify shared job is displaying on support login$")
//	public void verify_shared_job_is_displaying_on_support_login(DataTable credentials) throws Throwable {
//	jobreviewpage.verifyJobDisplay(credentials);
//}
//
//@And("^Click on approve$")
//public void click_on_approve() throws Throwable {
//	jobreviewpage.clickOnApproveButton();
//}
//
////@Then("^All shared job by any employer should be show for all register agencies$")
////public void all_shared_job_by_any_employer_should_be_show_for_all_register_agencies() throws Throwable {
////	marketplacepage.marketPlaceJobAtAgy();
////}
//

}
