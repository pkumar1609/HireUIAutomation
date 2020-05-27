package KomalStepdefination;

import java.io.IOException;
import java.util.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC275E extends baseclass {
	
	public TC275E() throws IOException 
	{
		super();
	}
	
	 boolean b;
	 

	 @Given("^User should be registered$")
	 public void user_should_be_registered() throws Throwable {
		baseclass.initialization();
		
	 }


	 
	@Given("^team member should be added$")
	public void team_member_should_be_added(DataTable credentials) throws Throwable {
	
		teampage.verifyTeamAdded(credentials);
		
	}

	 @And("^user enters valid credentials$")
		public void user_enters_valid_and_credentials() throws Throwable {
//			loginpage.loginInAppWithAgyK();
			loginpage.loginInAppWithEmpK();
			loginpage.identifyUserK();
			this.b=loginpage.b;

		}
	 
	
	@And("^Click on Add task button and enter all details$")
	public void Click_on_Add_task_button_and_enter_all_details(DataTable credentials) throws InterruptedException  {
		
		
		if(b==true) 
		{
		taskpage.enterAlldetails(credentials);
		}
		else
		{
			taskpage.enterAlldetailsForAgy(credentials);
		}
		
		
	}


	@And("^Logout from App$")
	public void Logout_from_App() throws Throwable {
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
	}

	@And("^Login with team member$")
	public void login_with_emp_team_member() throws Throwable {
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
		if(b==true) 
		{
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

//	@And("^logout as team member$")
//	public void logout_as_team_member() throws Throwable {
//		
//		loginpage.logoutFromAppK();
//	}

	@And("^login as agency/employer$")
			public void login_as_agency_employer() throws Throwable {
		if(b==true) {
		loginpage.loginInAppWithEmpK();
		}
		else {
			
			loginpage.loginInAppWithAgyK();
		}
	
	}

	@Then("^Delete the task$")
	public void delete_the_task() throws Throwable 
	{
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

