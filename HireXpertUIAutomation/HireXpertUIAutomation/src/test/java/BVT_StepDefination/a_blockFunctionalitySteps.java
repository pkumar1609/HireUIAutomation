package BVT_StepDefination;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilPackage.baseclass;

public class a_blockFunctionalitySteps extends baseclass {
@Before( "@bvt_agencyblock,@bvt_teamblock,@bvt_agencyunblock,@bvt_teamunblock")
public void setup()
{ 
}

//@bvt_agencyblock:
boolean emp;
	
	@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\" for registered employer and click on Sign in button$")
	public void enter_valid_and_for_registered_employer_and_click_on_Sign_in_button(String username, String password) throws Throwable {
		loginpage.loginIn(username, password);
	} 
	

	@When("^Agency should be added previously$")
	public void agency_should_be_added_previously(DataTable credentials) throws Throwable {

		agenciespage.enterAllDetails(credentials);
	 
	}
	
	@When("^click on Share With Agency button and select the Share checkbox present in front of the \"([^\"]*)\" to share the job$")
	public void click_on_Share_With_Agency_button_and_select_the_Share_checkbox_present_in_front_of_the_to_share_the_job(String agyEmailId) throws Throwable {	
	
		sharewithagencypage.shareWithAgency(agyEmailId);	 
	}
	
	@When("^click on Yes button from confirmation popup and click on Close button from Share Job window$")
	public void click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job_window() throws Throwable {

		
//		Thread.sleep(4000);
//		common.closebtn.click();
}

	@When("^again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency \"([^\"]*)\" with whom you shared the job$")
	public void again_click_on_Share_With_Agency_button_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job(String agyEmailId) throws Throwable {
		
		Thread.sleep(1000);
		sharewithteampage.searchField.clear();
		sharewithteampage.searchField.sendKeys(agyEmailId);
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		System.out.println(isBlockUnblockSelected);
		if(isBlockUnblockSelected==false)
		{
			Thread.sleep(1000);
			sharewithagencypage.blockUnblockCheckbox.click();
			common.clickOnConfirmYes();
		}
		common.clickOnCloseBtn();
		
	}
	
	@And("^logout with employer and login with Agency \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\" valid credentials which you blocked on Share Job page$")
	public void logout_with_employer_and_login_with_Agency_valid_credentials_which_you_blocked_on_Share_Job_page(String agyEmailId, String Password) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		common.logout.click();
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		loginpage.emailaddress.sendKeys(agyEmailId);
		loginpage.password.sendKeys("12345");
		Thread.sleep(5000);
		loginpage.signin.click();		
	}

	@When("^click on Workbench tab and select the job for which agency is blocked$")
	public void click_on_Workbench_tab_and_select_the_job_for_which_agency_is_blocked() throws Throwable {
	    this.emp=loginpage.b;
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectJobK();
	}
	
	@When("^enter \"([^\"]*)\"of candidate and click on Find button and observe$")
	public void enter_of_candidate_and_click_on_Find_button_and_observe(String CandEmailId) throws Throwable {
		Thread.sleep(2000);
		addcandidatepage.emailField.click();
		addcandidatepage.emailField.sendKeys(CandEmailId);
		addcandidatepage.FindButton.click();
	}
	 
	@Then("^Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job$")
	public void blocked_agency_should_not_be_able_to_add_candidate_for_the_job_and_error_message_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_for_that_job() throws Throwable {
		
		boolean ele = driver.findElement(By.xpath("//h6[contains(text(),'You are blocked by employer so you can not add more candidate now.')]")) != null;
		Assert.assertEquals(ele, true);
		common.clickOnOKBtn();
	}

	@Then("^click on Close button from Add Candidate page and click on Yes button from confirmation popup$")
	public void click_on_Close_button_from_Add_Candidate_page_and_click_on_Yes_button_from_confirmation_popup() throws Throwable {
	  
		common.clickOnCloseBtn();
		common.clickOnConfirmYes(); 
	}

	
	@Then("^click on Share With Team button and add new team by clicking on Add button on Share Job page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void click_on_Share_With_Team_button_and_add_new_team_by_clicking_on_Add_button_on_Share_Job_page(String team,String teamId,String ContactNumber) throws Throwable {
				Thread.sleep(3000);
				workbenchpage.shareJob.click();		
				workbenchpage.shareWithTeamButton.click();
		
				sharewithteampage.clickOnAddButton();
				Thread.sleep(3000);
				
				teampage.TeamMemberName.sendKeys(team);
				teampage.TeamMemberEmail.sendKeys(teamId);
				teampage.TeamMemberContactNumber.sendKeys(ContactNumber);
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
	

	@Then("^search for \\\"([^\\\"]*)\\\" team member and select the Share checkbox present in front of the agency team member to share the job with team member$")
	public void search_for_team_member_and_select_the_Share_checkbox_present_in_front_of_the_agency_team_member_to_share_the_job_with_team_member(String teamId) throws Throwable {
	    
	
		Thread.sleep(4000);
		sharewithteampage.searchField.click();
		sharewithteampage.searchField.sendKeys(teamId);
		Thread.sleep(1000);
		sharewithagencypage.shareCheckbox.click();
	}

	@Then("^click on Yes button from confirmation popup and observe$")
	public void click_on_Yes_button_from_confirmation_popup_and_observe() throws Throwable {
	    try
	    {
	    	common.clickOnConfirmYes();
	    	}
	    catch(NoSuchElementException e)
	    {}
		
	}

	@Then("^user should able to search team member and blocked agency should not able to share job with any team members and error message should display$")
	public void user_should_able_to_search_team_member_and_blocked_agency_should_not_able_to_share_job_with_any_team_members_and_error_message_should_display() throws Throwable {
	    
			Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'You are blocked by employer so you can not share this job anymore.')]")).isDisplayed(), true);
			common.clickOnOKBtn();
	}

	
	
//@bvt_teamblock:
	
	@When("^Team member should be added previously \"([^\"]*)\" and \"([^\"]*)\"$")
	public void team_member_should_be_added_previously_and(String arg1, String arg2) throws Throwable {
	    
	}
	


	@Given("^click on Share With Team button and select the Share checkbox present in front of the team member \"([^\"]*)\"$")
	public void click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member(String team) throws Throwable {
		Thread.sleep(3000);
		workbenchpage.shareJob.click();		
		workbenchpage.shareWithTeamButton.click();
		sharewithteampage.searchField.sendKeys(team);
		Thread.sleep(2000);
		sharewithteampage.shareCheckbox.click();
		try 
		{
		common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
	    {}
		common.shareFlag=1;
	}
	
	@When("^click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member$")
	public void click_on_Yes_button_from_confirmation_popup_and_now_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member() throws Throwable {
	  boolean isBlockUnblockSelcted=sharewithteampage.isBlockUnblockSelected.isSelected();
	    if(isBlockUnblockSelcted==false)
		{
			Thread.sleep(3000);
			sharewithteampage.blockUnblockCheckboxTeam.click();
			common.clickOnConfirmYes();
		}
	}
	
	@When("^logout with logged in user and login with team member \\\"([^\\\"]*)\\\",\\\"([^\\\"]*)\\\"valid credentials which you blocked on Share Job page$")
	public void logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_blocked_on_Share_Job_page(String teamId, String password) throws Throwable {
	    
			
			workbenchpage.ClickonLogout();
			registerpage.clickEmployerAgencySignInlink();
			Thread.sleep(3000);
			loginpage.emailaddress.sendKeys(teamId);
			loginpage.password.sendKeys(password);
			loginpage.signin.click();
		
	}

	@Then("^Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job$")
	public void blocked_team_member_should_not_be_able_to_add_candidate_for_the_job_and_error_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_by_himself_into_that_job() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),' You are blocked by your team owner for this job so you can not add more candidate now.')]")).isDisplayed(), true);
	}
	
	@Then("^Blocked team member should not be able to add candidate$")
	public void blocked_team_member_should_not_be_able_to_add_candidate() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'You are blocked by your team owner for this job so you can not add more candidate now.')]")).isDisplayed(), true);   
		common.clickOnOKBtn();
	}
	
	@Then("^Click on close button and confirm Yes button$")
	public void click_on_close_button_and_confirm_Yes_button() throws Throwable {
	  common.clickOnCloseBtn();
	  common.clickOnConfirmYes();
	}
	
//	@After("@interview")
//	public void Endtest() throws InterruptedException
//	{
//		if(addjobpage.addJobFlag==1)
//		{
//			workbenchpage.deleteJob();
//			if((loginpage.logedinuser=="pemp" || loginpage.logedinuser=="pa1") && common.shareFlag==1)
//			{
//				loginpage.logoutFromAppK();
//				loginpage.ClickOnEmployerAgencySigninLink();
//				loginpage.loginIn("pagy@gmail.com", "12345");
//				workbenchpage.deleteJob();
//			}
//			else if((loginpage.logedinuser=="pagy" || loginpage.logedinuser=="pe1" ) && common.shareFlag==1)
//			{
//				loginpage.logoutFromAppK();
//				loginpage.ClickOnEmployerAgencySigninLink();
//				loginpage.loginIn("pemp@gmail.com", "12345");
//				workbenchpage.deleteJob();
//			}		
//			if (addjobpage.jobAddedByEmp==false)
//			{
//				loginpage.logoutFromAppK();
//				loginpage.ClickOnEmployerAgencySigninLink();
//				loginpage.loginIn("pemp@gmail.com", "12345");
//				workbenchpage.deleteJob();
//			}	
//		}
//	Thread.sleep(1000);
//	driver.quit();	
//	}	
}
