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
	
		Thread.sleep(5000);
		workbenchpage.shareWithTeamButton.click();
		String sharewithteam="//td[text()='pe1']//following::label[@class='check']";
			if(driver.findElement(By.xpath("//td[text()='pe1']//following::span[@class='checkmark CheckBoxM']")).isSelected())
			{
				
			}
			else
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//td[text()='pe1']//following::span[@class='checkmark CheckBoxM']")).click();
				try {
					common.clickOnConfirmYes();
				}
				catch(NoSuchElementException e)
				{
					
				}
			
			}	
			driver.findElement(By.xpath("//td[text()='pe1']//following::span[@class='checkround']")).click();
			try {
				common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{
				
			}
			System.out.println(team+" is primary contact");
			
			if(driver.findElement(By.xpath(sharewithteam)).isSelected())
			{
				System.out.println("issue");
			}
			else
			{
				System.out.println("Now pemp is not a primary contact");
			}
		
		
		
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		if(dynamicElement.size() != 0){
//			
//			System.out.println("\nUser logged in as Employer..");
//			Thread.sleep(4000);
//			workbenchpage.shareWithTeamButton.click();
//			Thread.sleep(4000);
//			sharewithteampage.searchEmployerPrimaryContact(team, teamid);
//			Thread.sleep(3000);
//			
//			sharewithteampage.clickOnAddButton();
//			Thread.sleep(3000);
//			teampage.TeamMemberName.sendKeys(team);
//			teampage.TeamMemberEmail.sendKeys(teamid);
//			teampage.TeamMemberContactNumber.sendKeys(contact);
//			sharewithteampage.selectAddToTeamMember();
//			Thread.sleep(2000);
//			common.submitbtn.click();
//			if(common.okbtn.isDisplayed())
//			{common.clickOnOKBtn();
//			common.clickOnAddClosebtn();
//			}
//		}
//		
//		else{
//			
//			System.out.println("\nUser logged in as Agency..");
//			Thread.sleep(4000);
//			workbenchpage.shareWithTeamButton.click();
//			Thread.sleep(4000);
//			sharewithteampage.searchAgencyPrimaryContact(team, teamid);
//			Thread.sleep(3000);
//			
//			sharewithteampage.clickOnAddButton();
//			Thread.sleep(3000);
//			teampage.TeamMemberName.sendKeys(team);
//			teampage.TeamMemberEmail.sendKeys(teamid);
//			teampage.TeamMemberContactNumber.sendKeys(contact);
//			sharewithteampage.selectAddToTeamMember();
//			Thread.sleep(2000);
//			common.submitbtn.click();
//			if(common.okbtn.isDisplayed())
//			{common.clickOnOKBtn();
//			common.clickOnAddClosebtn();
//			}
//		}
//		
//		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	@Then("^user should not able to make multiple team members as primary contact$")
	public void user_should_not_able_to_make_multiple_team_members_as_primary_contact() throws Throwable {
		
//		common.clickOnCloseBtn();
	
	}

	@Then("^user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact \"([^\"]*)\"$")
	public void user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact(String anotherteam) throws Throwable {
	    
		
		String sharewithteam="//td[text()='"+anotherteam+"']//following::input[@type='checkbox']";
		if(driver.findElement(By.xpath(sharewithteam)).isSelected())
		{
			
		}
		else
		{
			driver.findElement(By.xpath("//td[text()='"+anotherteam+"']//following::span[@class='checkround']")).click();
			System.out.println("not able to make primary conatct if job is not shared");
		}
		
		
		
		
		
		
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		if(dynamicElement.size() != 0){
//			
//			workbenchpage.shareWithTeamButton.click();
//			Thread.sleep(3000);
//			
//			System.out.println("\nSearching for employer's team member..");
//			
//			sharewithteampage.findShareCheckboxForEmployerTeam();
//		}
//		
//		else{
//			
//			workbenchpage.shareWithTeamButton.click();
//			Thread.sleep(3000);
//			
//			System.out.println("\nSearching for agency's team member..");
//			
//			sharewithteampage.findShareCheckboxForAgencyTeam();
//		}
//		
//		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

}
