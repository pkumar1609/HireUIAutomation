package TC264_266;

import java.io.IOException;

import org.testng.Assert;

import com.Hirexpert.pages.EmployerPage;
import com.Hirexpert.pages.LoginPage;
import com.Hirexpert.pages.TaskPage;
import com.Hirexpert.pages.TeamPage;
import com.Hirexpert.pages.WorkbenchPage;
import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC264_266 extends TestBase{
	public TC264_266() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
		initizer();
		loginpage= new LoginPage();
		teampage= new TeamPage();
		employerpage = new EmployerPage();
		taskpage =new TaskPage();
		workbenchpage= new WorkbenchPage();
	}

	
	
	@Given("^User must be registered as Employer profile$")
	public void user_must_be_registered_as_Employer_profile() throws Throwable {
	     //enter email id should exist in sysytem
	}
	
	

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^Employer enters valid credentials$")
	public void employer_enters_valid_credentials() throws Throwable {
		loginpage.loginInAppWithEmp();

	}

	@And("^Go to dashboard$")
	public void go_to_dashboard() throws Throwable {
		String url= driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "http://103.68.10.36:8100/#/home");
		
	}

	@And("^In task section click on add task \\(\\+\\) icon$")
	public void in_task_section_click_on_add_task_icon() throws Throwable {
		Thread.sleep(2000);
		taskpage.clickOnAddTaskBtn();
	}

	@And("^In add task popup, Fill all the mandatory details$")
	public void in_add_task_popup_Fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		Thread.sleep(1000);
		taskpage.enterAlldetails(credentials);
	}

	@And("^Click on submit$")
	public void click_on_submit() throws Throwable {
		Thread.sleep(1000);
		employerpage.ClickSubmitBtn();

	}

	@And("^the task should display for both employer$")
	public void the_task_should_display_for_both_employer() throws Throwable {
		taskpage.validateTaskDisplayingProperly();
	}

	@And("^Task should also display for team member$")
	public void task_should_also_display_for_team_member() throws Throwable {
		loginpage.logoutFromApp();
		loginpage.loginInAppWithTeam();
		taskpage.ValidateTaskDisplayingForTeam();
		Thread.sleep(1000);
		loginpage.logoutFromApp();
	}


	@And("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		Thread.sleep(1000);
		loginpage.loginInAppWithEmp();
		Thread.sleep(1000);
		workbenchpage.workbenchbtn.click();

	}

	@And("^Select a job and click on add task button$")
	public void select_a_job_and_click_on_add_task_button() throws Throwable {
		Thread.sleep(2000);
		workbenchpage.selectJob();
		Thread.sleep(2000);
		workbenchpage.addtask.click();
		
	}

	@And("^In add task popup, Fill all the mandatory details and assign to Himeself$")
	public void in_add_task_popup_Fill_all_the_mandatory_details_and_assign_to_Himeself(DataTable credentials) throws Throwable {
		
		Thread.sleep(2000);
		taskpage.enterAlldetails(credentials);
		
		
	}

	@Then("^the task added should display on employer$")
	public void the_task_added_should_display_on_employer() throws Throwable {
		Thread.sleep(2000);
		loginpage.dashboardbtn.click();
		taskpage.validateTaskDisplayingProperly();
		
	}
	
	@Then("^the task should also display on team member login$")
	public void the_task_should_also_display_on_team_member_login() throws InterruptedException
	{
		Thread.sleep(2000);
		loginpage.logoutFromApp();
		loginpage.loginInAppWithTeam();
		taskpage.ValidateTaskDisplayingForTeam();
	}
}
