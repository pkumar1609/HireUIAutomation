package BVT_StepDefination;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class c_primaryContact extends baseclass {


	@When("^add new team member and try to make that team member as primary contact\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_new_team_member_and_try_to_make_that_team_member_as_primary_contact(String Team, String Teamid, String contact) throws Throwable {
		workbenchpage.clickonthreedot();
		Thread.sleep(3000);
		workbenchpage.shareWithTeamButton.click();

		sharewithteampage.clickOnAddButton();
		Thread.sleep(3000);
		
		dashboardpage.namefield.sendKeys(Team);
		dashboardpage.emailfield.sendKeys(Teamid);
		dashboardpage.contactnumberfield.sendKeys(contact);
		sharewithteampage.selectAddToTeamMember();
		common.ClickSumbit();
		try
		{
			common.clickOnOKBtn();
			common.clickOnAddClosebtn();
		}
		catch(NoSuchElementException e)
		{}
	}
	
	@When("^Click on primary contact$")
	public void click_on_primary_contact() throws Throwable {
		
		Thread.sleep(3000);
	    sharewithteampage.primaryContactRadioButton.click();
	    common.clickOnConfirmYes();
	}
	
	@When("^try to make another team member as primary contact \"([^\"]*)\"$")
	public void try_to_make_that_team_member_as_primary_contact(String team) throws Throwable {
		
		sharewithteampage.searchField.clear();
		sharewithteampage.searchField.sendKeys(team);
		Thread.sleep(3000);
		sharewithteampage.shareCheckbox.click();
		common.clickOnConfirmYes();
		Thread.sleep(3000);
	    sharewithteampage.primaryContactRadioButton.click();
	    common.clickOnConfirmYes(); 
	}
	

	@Then("^user should not able to make multiple team members as primary contact \"([^\"]*)\"$")
	public void user_should_not_able_to_make_multiple_team_members_as_primary_contact(String eamiladdress) throws Throwable {
		sharewithteampage.searchField.clear();
		sharewithteampage.searchField.sendKeys(eamiladdress);
		Assert.assertEquals(sharewithteampage.primaryContactRadioButton.isSelected(), false);
	}
	
	@Then("^user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact \"([^\"]*)\"$")
	public void user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact(String thridteam) throws Throwable {
		Thread.sleep(3000);
		workbenchpage.shareJob.click();		
		workbenchpage.shareWithTeamButton.click();
		sharewithteampage.searchField.clear();
		sharewithteampage.searchField.sendKeys(thridteam);
		Thread.sleep(3000);
		sharewithteampage.primaryContactRadioButton.click();
	}

}
