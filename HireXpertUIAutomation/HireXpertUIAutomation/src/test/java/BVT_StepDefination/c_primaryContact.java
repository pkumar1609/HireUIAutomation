package BVT_StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class c_primaryContact extends baseclass {
	
	
	
	@When("^click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void click_on_Share_With_Team_button_and_observe_the_primary_contact_then_add_new_team_member_and_try_to_make_that_team_member_as_primary_contact(String team, String teamid, String contact) throws Throwable {
		workbenchpage.clickonthreedot();
		Thread.sleep(5000);
		workbenchpage.shareWithTeamButton.click();
		String sharewithteam="//td[text()='"+team+"']//following::label[@class='check']";
			if(driver.findElement(By.xpath("//td[text()='"+team+"']//following::span[@class='checkmark CheckBoxM']")).isSelected())
			{
			}
			else
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//td[text()='"+team+"']//following::span[@class='checkmark CheckBoxM']")).click();
				
				try {
					common.clickOnConfirmYes();
				}
				catch(NoSuchElementException e)
				{}
			}	
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[text()='"+team+"']//following::span[@class='checkround'])[1]")).click();
			try {
			common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{}
			System.out.println(team+" is primary contact");
			
			if(driver.findElement(By.xpath(sharewithteam)).isSelected())
			{
				System.out.println("issue");
			}
			else
			{
				System.out.println("Now pemp is not a primary contact");
			}
	}
	
 
	@Then("^user should not able to make multiple team members as primary contact \"([^\"]*)\"$")
	public void user_should_not_able_to_make_multiple_team_members_as_primary_contact(String anotherteam, DataTable credentials) throws Throwable {
		Thread.sleep(2000);
//		WebElement anotherteamPrimary = driver.findElement(By.xpath("//td[text()='"+anotherteam+"']//following::span[@class='checkround']"));
		driver.findElement(By.xpath("//td[text()='"+anotherteam+"']//following::span[@class='checkround']")).click();
	
	}

	@Then("^user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact \"([^\"]*)\"$")
	public void user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact(String anotherteam) throws Throwable {
	    
		
		String sharewithteam="//td[text()='"+anotherteam+"']//following::input[@type='checkbox']";
		if(driver.findElement(By.xpath(sharewithteam)).isSelected())
		{
//			teampage.verifyTeamAdded(credentials);
		}
		else
		{
			Thread.sleep(4000);
			driver.findElement(By.xpath("//td[text()='"+anotherteam+"']//following::span[@class='checkmark CheckBoxM']")).click();
			common.clickOnConfirmYes();
			
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//td[text()='"+anotherteam+"']//following::span[@class='checkround']")).click();
		try
		{
			common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
		{	
		}
		System.out.println("able to make primary contact");
	}

}
