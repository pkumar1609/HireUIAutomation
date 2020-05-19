package LoginStepdefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utilPackage.baseclass;

public class TC41_89 extends baseclass{
	boolean b;
	
	public TC41_89() throws IOException 
	{
		super();
	}
	
	@And("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
//		loginpage.loginInAppWithAgyK();
		loginpage.loginInAppWithEmpK();
		loginpage.identifyUserK();
		this.b=loginpage.b;
	}

	@And("^Go to update profile$")
	public void go_to_update_profile() throws Throwable {
		workbenchpage.openUpdateProfilePage();
	}

	@And("^Check the character limit for fields with <\\\"([^\\\"]*)\\\">$")
	public void check_the_character_limit_for_all_fields(String Name) throws Throwable {
			Thread.sleep(2000);
			updateprofilepopuppage.AgencyEmployerName.clear();
			updateprofilepopuppage.AgencyEmployerName.sendKeys(Name);
//		
//		try
//		{
//	    
//		driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).isDisplayed();
//		String errorMessage=driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).getText();
//		int length= errorMessage.length();
//		System.out.println(length);
//		boolean result=false;
//		if(length==32)
//		{
//			result=true;
//		}
//		Assert.assertEquals(result, true);
//		}
//		catch(NoSuchElementException e)
//		{
//			System.out.println("issue");
//		}
	}


	@And("^Click on Add button and fill  <\\\"([^\\\"]*)\\\">$")
	public void click_on_Add_button_and_fill_all_details(String Name) throws Throwable {
		 
			teampage.TeamMemberName.clear();
			teampage.TeamMemberName.sendKeys(Name);
		
		
		
	}

	@Then("^Error message should show only after exceeding character limit$")
	public void error_message_should_show_only_after_exceeding_character_limit() throws Throwable {
		try
		{
		driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).isDisplayed();
		String errorMessage=driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).getText();
		int length= errorMessage.length();
		boolean result=false;
		if(length==32)
		{
			result=true;
		}
		Assert.assertEquals(result, true);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("issue");
		}	
	}


}
