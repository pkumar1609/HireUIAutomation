package JobTask;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

public class TC275E extends TestBase{
	
	public TC275E() throws IOException 
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
	 int flag=0;

	@Given("^User should be registered$")
	public void user_should_be_registered() throws Throwable {
	    
	}

	@Given("^team member should be added$")
	public void team_member_should_be_added() throws Throwable {
	    
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^user enters valid credentials$")
	public void user_enters_valid_and_credentials() throws Throwable {
		
		loginpage.loginInAppWithAgy();
		Action.moveToElement(loginpage.profilebtn).click().perform();
//	boolean b= driver.findElement(By.xpath("//a[@title='Employer']")).isDisplayed();
		if(loginpage.profilebtn.isSelected())
		{
			flag++;
		}
		else 
		{
			flag=0;
		}
		
		System.out.println(b);
	}

	@And("^Add task and assign it to team member$")
	public void add_task_and_assign_it_to_team_member(DataTable credentials) throws InterruptedException  {
		
		taskpage.clickOnAddTaskBtn();
		if(flag==1) {
		taskpage.enterAlldetails(credentials);
		}
		else
		{
			taskpage.enterAlldetailsForAgy(credentials);
		}
		employerpage.ClickSubmitBtn();
		
	}


	@And("^Logout as emp/agency$")
	public void logout_as_emp_agency() throws Throwable {
		Thread.sleep(2000);
		loginpage.logoutFromApp();
	}

	@And("^Login with team member$")
	public void login_with_emp_team_member() throws Throwable {
		if(flag==1)
		{
		loginpage.loginInAppWithTeam();
		}
		else {
			loginpage.loginInAppWithAgyTeam();
		}
		
	}

	@And("^Click on Delete task$")
	public void click_on_Delete_task() throws InterruptedException  {
		if(flag==1) {
		if(taskpage.assignto.contains("employer"))
		{
			taskpage.teamtask.click();
			Thread.sleep(1000);
			taskpage.clickondeletetask();
		}
		else
		{
			
			taskpage.clickondeletetask();
			Thread.sleep(1000);
			taskpage.okbtn.click();
		}}
		else {
			if(taskpage.assignto.contains("agency"))
			{
				taskpage.teamtask.click();
				Thread.sleep(1000);
				taskpage.clickondeletetask();
			}
			else
			{
				
				taskpage.clickondeletetask();
				Thread.sleep(1000);
				taskpage.okbtn.click();
			}
		}
		
		}
		
		
	

	@And("^observe the message$")
	public void observe_the_message() throws Throwable {
		
//		boolean b= driver.getWindowHandle().contentEquals("You are not creator of this task. You are not authorised to delete it.");
//		boolean b= driver.getPageSource().contains("You are not creator of this task. You are not authorised to delete it.");
//				Assert.assertEquals(b, true);
	}

	@And("^logout as team member$")
	public void logout_as_team_member() throws Throwable {
		
		loginpage.logoutFromApp();
	}

	@And("^login as agency/employer$")
			public void login_as_agency_employer() throws Throwable {
		if(flag==1) {
		loginpage.loginInAppWithEmp();
		}
		else {
			
			loginpage.loginInAppWithAgy();
		}
	
	}

	@Then("^Delete the task$")
	public void delete_the_task() throws Throwable {
		if(flag==1) {
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



