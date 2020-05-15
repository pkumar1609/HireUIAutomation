package TC282K;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC282 extends baseclass {
	
	public TC282() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
		
		baseclass.initialization();
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
		loginpage.loginInAppWithEmpK();
//		loginpage.loginInAppWithAgy();
		loginpage.identifyUserK();
		this.b=loginpage.b;
	
	}
	@And("^team member should be added$")
	public void team_member_should_be_added(DataTable credentials) throws InterruptedException  {
		
		if(b==true)
		{
		teampage.isTeamPresentForEmp(credentials);
		
		}
		else
		{
		teampage.isTeamPresentForAgy(credentials);
		}
	}

	@And("^go to workbench$")
	public void go_to_workbench() throws InterruptedException  {
		
		dashboardpage.openWorkbenchPage();
	}
 
	@And("^select job$")
	public void select_job() throws Throwable {
		workbenchpage.selectJobK();
	}

	@And("^Add a task and assign that task to the team member$")
	public void add_a_task_and_assign_that_task_to_the_team_member(DataTable credentials) throws Throwable {
		
		if (b==true)
		{
		taskpage.enterAlldetails(credentials);
		}
		else
		{
			taskpage.enterAlldetailsForAgy(credentials);
		}
		
	}
	
	@And("^Logout as emp/agency$")
	public void logout_as_emp_agency() throws Throwable {
		
		loginpage.logoutFromAppK();
	}

	@And("^login as the team member$")
	public void login_as_the_team_member() throws Throwable {
		if(b==true)
		{
		loginpage.loginInAppWithTeamK();
		}
		else {
			loginpage.loginInAppWithAgyTeamK();
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
		loginpage.logoutFromAppK();
	}

	@And("^login as Employer/Agency$")
	public void login_as_Employer_Agency() throws Throwable {
		loginpage.loginInAppWithEmpK();
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



