package TC282;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

public class TC282 extends TestBase{
	public TC282() throws IOException 
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

boolean b;
boolean ispresent;
	
	@Given("^User should be registered$")
	public void user_should_be_registered() throws Throwable {
	    
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws InterruptedException  {
//		loginpage.loginInAppWithEmp();
		loginpage.loginInAppWithAgy();
		loginpage.identifyUser();
		loginpage.b=this.b;
	
	}
	@And("^team member should be added$")
	public void team_member_should_be_added(DataTable credentials) throws InterruptedException  {
		if(b==true)
		{
		teampage.clickOnTeamBtn();
		try {
		ispresent= teampage.teammemberpresent.isDisplayed();
		teampage.closeTeamPage();
		
		}
		catch(NoSuchElementException e)
		{
			teampage.clickOnAddBtn();
			teampage.AddAllDetails(credentials);
		}
	}
		else
	{
		teampage.clickOnTeamBtn();
		try {
		ispresent= teampage.teammemberpresent.isDisplayed();
		teampage.closeTeamPage();
		}
		catch(NoSuchElementException e)
		{
			teampage.clickOnAddBtn();
			teampage.AddAllDetailsagy(credentials);
		}
	}
	
	}

	@And("^go to workbench$")
	public void go_to_workbench() throws Throwable {
		workbenchpage.clickOnWorkbenchTab();
	}

	@And("^select job$")
	public void select_job() throws Throwable {
		workbenchpage.selectJob();
	}

	@And("^Add a task and assign that task to the team member$")
	public void add_a_task_and_assign_that_task_to_the_team_member(DataTable credentials) throws Throwable {
		taskpage.clickOnAddTaskBtn();
		if (b==true)
		{
		taskpage.enterAlldetails(credentials);
		Thread.sleep(1000);
		employerpage.ClickCloseBtn();
		}
		else
		{
			taskpage.enterAlldetailsForAgy(credentials);
			Thread.sleep(1000);
			employerpage.ClickCloseBtn();

		}
		
	}
	
	@And("^Logout as emp/agency$")
	public void logout_as_emp_agency() throws Throwable {
		
		loginpage.logoutFromApp();
	}

	@And("^login as the team member$")
	public void login_as_the_team_member() throws Throwable {
		if(b==true)
		{
		loginpage.loginInAppWithTeam();
		}
		else {
			loginpage.loginInAppWithAgyTeam();
		}
	}

	@And("^try to delete$")
	public void try_to_delete() throws Throwable {
			if(b==true) {
			if(taskpage.assignto.contains("employer"))
			{
				taskpage.teamtask.click();
				taskpage.clickondeletetask();
			}
			else
			{
				taskpage.clickondeletetask();
				taskpage.clickOKBtn();
			}}
			else {
				if(taskpage.assignto.contains("agency"))
				{
					taskpage.teamtask.click();
					taskpage.clickondeletetask();
				}
				else
				{
					taskpage.clickondeletetask();
					taskpage.clickOKBtn();
				}
			}
			
	}

	@And("^logout as a team member$")
	public void logout_as_a_team_member() throws Throwable {
		loginpage.logoutFromApp();
	}

	@And("^login as Employer/Agency$")
	public void login_as_Employer_Agency() throws Throwable {
		loginpage.loginInAppWithEmp();
	}

	@Then("^click on delete task$")
	public void click_on_delete_task() throws Throwable {
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
			

	    
	}



