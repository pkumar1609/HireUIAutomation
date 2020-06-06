package BVT_StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class a_blockFunctionalitySteps extends baseclass {

//@bvt_agencyblock:

	@When("^enter valid user email address and password for registered employer and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_registered_employer_and_click_on_Sign_in_button(DataTable dt) throws Throwable {
	    
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@When("^Agency should be added previously \"([^\"]*)\"$")
	public void agency_should_be_added_previously(String arg1) throws Throwable {
	    
	}

	@When("^click on Share With Agency button and select the Share checkbox present in front of the agency to share the job$")
	public void click_on_Share_With_Agency_button_and_select_the_Share_checkbox_present_in_front_of_the_agency_to_share_the_job(DataTable dt) throws Throwable {
	    
		workbenchpage.shareWithAgencyButton.click();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		sharewithteampage.searchField.click();
		sharewithteampage.searchField.sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
		
		sharewithagencypage.shareCheckbox.click();
		Thread.sleep(1000);
	}

	@When("^click on Yes button from confirmation popup and click on Close button from Share Job window$")
	public void click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job_window() throws Throwable {
	    
		common.clickOnConfirmYes();
		Thread.sleep(4000);
		common.closebtn.click();
		Thread.sleep(1000);
	}

	@When("^again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency with whom you shared the job$")
	public void again_click_on_Share_With_Agency_button_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job(DataTable dt) throws Throwable {
	    
		workbenchpage.shareWithAgencyButton.click();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		sharewithteampage.searchField.click();
		sharewithteampage.searchField.sendKeys(data.get(0).get(0));

		Thread.sleep(2000);
		sharewithagencypage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}
	
	@When("^logout with employer and login with Agency valid credentials which you blocked on Share Job page$")
	public void logout_with_employer_and_login_with_Agency_valid_credentials_which_you_blocked_on_Share_Job_page(DataTable dt) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@When("^click on Workbench tab and select the job for which agency is blocked$")
	public void click_on_Workbench_tab_and_select_the_job_for_which_agency_is_blocked() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.se = new Select(workbenchpage.jobDropDown);
		workbenchpage.se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}

	@When("^enter email id of candidate and click on Find button and observe$")
	public void enter_email_id_of_candidate_and_click_on_Find_button_and_observe(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addcandidatepage.validatePageTitle();
		addcandidatepage.emailField.click();
		addcandidatepage.emailField.sendKeys(data.get(0).get(0));
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
	}

	@Then("^Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job$")
	public void blocked_agency_should_not_be_able_to_add_candidate_for_the_job_and_error_message_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_for_that_job() throws Throwable {
	    
		System.out.println("\nBlocked agency not able to add candidate for the job");
		System.out.println("Error message should display like - You are blocked by employer so you can not add more candidate now");
	}

	@Then("^click on OK button from error message popup$")
	public void click_on_OK_button_from_error_message_popup() throws Throwable {
	    
		common.clickOnOKBtn();
		Thread.sleep(1000);
	}

	@Then("^click on Close button from Add Candidate page and click on Yes button from confirmation popup$")
	public void click_on_Close_button_from_Add_Candidate_page_and_click_on_Yes_button_from_confirmation_popup() throws Throwable {
	    
		common.closebtn.click();
		common.clickOnConfirmYes();
		Thread.sleep(2000);
	}

	@Then("^click on Share With Team button and add new team by clicking on Add button on Share Job page$")
	public void click_on_Share_With_Team_button_add_new_team_by_clicking_on_Add_button_on_Share_Job_page(DataTable dt) throws Throwable {
	    
		workbenchpage.shareWithTeamButton.click();
		Thread.sleep(3000);
		sharewithteampage.clickOnAddButton();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		sharewithteampage.TeamName.sendKeys(data.get(0).get(0));
		sharewithteampage.TeamEmail.sendKeys(data.get(0).get(1));
		sharewithteampage.TeamContactNumber.sendKeys(data.get(0).get(2));
		
		sharewithteampage.selectAddToTeamMember();
		common.submitbtn.click();
		Thread.sleep(3000);
	}

	@Then("^search for team member and select the Share checkbox present in front of the agency team member to share the job with team member$")
	public void search_for_team_member_and_select_the_Share_checkbox_present_in_front_of_the_agency_team_member_to_share_the_job_with_team_member(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		sharewithteampage.searchField.click();
		sharewithteampage.searchField.sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		sharewithagencypage.shareCheckbox.click();
	}

	@Then("^click on Yes button from confirmation popup and observe$")
	public void click_on_Yes_button_from_confirmation_popup_and_observe() throws Throwable {
	    
		common.clickOnConfirmYes();
	}

	@Then("^user should able to search team member and blocked agency should not able to share job with any team members and error message should display$")
	public void user_should_able_to_search_team_member_and_blocked_agency_should_not_able_to_share_job_with_any_team_members_and_error_message_should_display() throws Throwable {
	    
		System.out.println("\nUser able to search the team member..");
		System.out.println("Blocked agency not able to share job with team member");
		System.out.println("Error message displayed like - You are blocked by employer so you can not share this job anymore");
	}

	
	
//@bvt_teamblock:
	
	@When("^Team member should be added previously \"([^\"]*)\" and \"([^\"]*)\"$")
	public void team_member_should_be_added_previously_and(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^click on Share With Team button and select the Share checkbox present in front of the team member$")
	public void click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
			System.out.println("\nSearching team member with Employer..");
			
			workbenchpage.shareWithTeamButton.click();
			Thread.sleep(3000);
			
			sharewithteampage.searchField.click();
			sharewithteampage.searchField.sendKeys(data.get(0).get(0));
			
			sharewithteampage.shareCheckbox.click();
			Thread.sleep(2000);
		}
		
		else{
			
			System.out.println("\nSearching team member with Agency..");
			
			workbenchpage.shareWithTeamButton.click();
			Thread.sleep(3000);
			
			sharewithteampage.searchField.click();
			sharewithteampage.searchField.sendKeys(data.get(0).get(1));
			
			sharewithteampage.shareCheckbox.click();
			Thread.sleep(2000);
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}
	
	@When("^click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member$")
	public void click_on_Yes_button_from_confirmation_popup_and_now_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member() throws Throwable {
	    
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		sharewithteampage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}
	
//	@When("^click on Yes button from confirmation popup and click on Close button from Share Job$")
//	public void click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job() throws Throwable {
//	    
//		common.clickOnConfirmYes();
//		Thread.sleep(4000);
//		common.addClosebtn.click();
//		Thread.sleep(1000);
//	}
	
	@When("^logout with logged in user and login with team member valid credentials which you blocked on Share Job page$")
	public void logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_blocked_on_Share_Job_page(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
			System.out.println("\nLogout with Employer and login with Employer team member..");
			
			workbenchpage.ClickonLogout();
			Thread.sleep(3000);
			
			registerpage.clickEmployerAgencySignInlink();
			Thread.sleep(3000);
			
			loginpage.emailaddress.sendKeys(data.get(0).get(0));
			loginpage.password.sendKeys(data.get(0).get(1));
			loginpage.signin.click();
			Thread.sleep(5000);
		}
		
		else{
			
			System.out.println("\nLogout with Agency and login with Agency team member..");
			
			workbenchpage.ClickonLogout();
			Thread.sleep(3000);
			
			registerpage.clickEmployerAgencySignInlink();
			Thread.sleep(3000);
			
			loginpage.emailaddress.sendKeys(data.get(0).get(2));
			loginpage.password.sendKeys(data.get(0).get(3));
			loginpage.signin.click();
			Thread.sleep(5000);
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}

	@When("^click on Workbench tab and select the job for which team member is blocked$")
	public void click_on_Workbench_tab_and_select_the_job_for_which_team_member_is_blocked() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.se = new Select(workbenchpage.jobDropDown);
		workbenchpage.se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}

	@Then("^Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job$")
	public void blocked_team_member_should_not_be_able_to_add_candidate_for_the_job_and_error_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_by_himself_into_that_job() throws Throwable {
	    
		System.out.println("\nBlocked team member should not be able to add candidate for the job");
		System.out.println("Error message should display like - You are blocked by your team owner for this job so you can not add more candidate now");
	}


}
