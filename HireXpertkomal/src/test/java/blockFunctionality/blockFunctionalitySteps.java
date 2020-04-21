package blockFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class blockFunctionalitySteps extends baseclass {

//scenario 1:
	
	@Given("^User is on Home page of application$")
	public void User_is_on_Home_page_of_application() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^title of page is \"([^\"]*)\"$")
	public void title_of_page_is(String arg1) throws Throwable {
	    
		String title = loginpage.validateTitle();
		System.out.println("Title of application: " + title);
	}

	@When("^enter valid user email address and password for registered employer and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_registered_employer_and_click_on_Sign_in_button() throws Throwable {
	    
		loginpage.signInEmployer();
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@When("^click on Agencies tab and add one new agency by clicking on Add button if agencies are not present$")
	public void click_on_Agencies_tab_and_add_one_new_agency_by_clicking_on_Add_button_if_agencies_are_not_present() throws Throwable {
	    
//		dashboardpage.openAgenciesPage();
//		Thread.sleep(3000);
//		agenciespage.clickOnAddButton();
//		Thread.sleep(3000);
//		agenciespage.fillAgencyDetailsAddButton();
//		agenciespage.submitButton.click();
//		Thread.sleep(2000);
	}

	@When("^click on Close button from Agencies window$")
	public void click_on_Close_button_from_Agencies_window() throws Throwable {
	    
//		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[3]/button")).click();
//		Thread.sleep(2000);
	}

	@When("^click on Workbench tab and select job from Jobs drop down$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.selectJob();
		Thread.sleep(3000);
	}

	@When("^click on Share With Agency button and select the Share checkbox present in front of the agency to share the job$")
	public void click_on_Share_With_Agency_button_and_select_the_Share_checkbox_present_in_front_of_the_agency_to_share_the_job() throws Throwable {
	    
		workbenchpage.shareWithAgencyButton.click();
		Thread.sleep(3000);
		sharewithagencypage.searchAgency();
		Thread.sleep(1000);
		sharewithagencypage.shareCheckbox.click();
		Thread.sleep(1000);
	}

	@When("^click on Yes button from confirmation popup and click on Close button from Share Job window$")
	public void click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job_window() throws Throwable {
	    
		driver.findElement(By.id("confirmModalBtn")).click();
		Thread.sleep(3000);
		sharewithagencypage.closeButton.click();
		Thread.sleep(1000);
	}

	@When("^again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency with whom you shared the job$")
	public void again_click_on_Share_With_Agency_button_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job() throws Throwable {
	    
		workbenchpage.shareWithAgencyButton.click();
		Thread.sleep(3000);
		sharewithagencypage.searchAgency();
		Thread.sleep(1000);
		sharewithagencypage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}
	
	@When("^logout with employer and login with Agency valid credentials which you blocked on Share Job page$")
	public void logout_with_employer_and_login_with_Agency_valid_credentials_which_you_blocked_on_Share_Job_page() throws Throwable {
	    
		WebElement we = driver.findElement(By.xpath("//img[@class='profile']"));
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		Thread.sleep(3000);
		loginpage.signInAgency1();
		Thread.sleep(5000);
	}
	
	@When("^update profile window get opened if new agency added for job$")
	public void update_profile_window_get_opened_if_new_agency_added_for_job() throws Throwable {
	    
//		String title = driver.findElement(By.xpath("//h5[@class='modal-title']")).getText();
//		System.out.println("Page title: "+title);
//		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-profile/div[2]/form/div/div[8]/input")).sendKeys("Pune");  //city	
//		driver.findElement(By.xpath("//*[@id=\"typeahead-config\"]")).sendKeys("abcd");  //organization
//		driver.findElement(By.id("agencyaddress")).sendKeys("ahsbfsfbhs hsbj");  //agency address
//		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-profile/div[3]")).click();  //blank space
//		driver.findElement(By.xpath("//div[contains(@class,'checkmark')]")).click();  //is agency owner checkbox
//		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-profile/div[3]/button[2]")).click();
//		Thread.sleep(5000);
	}

	@When("^click on Workbench tab and select the job for which agency is blocked$")
	public void click_on_Workbench_tab_and_select_the_job_for_which_agency_is_blocked() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.se = new Select(workbenchpage.jobDropDown);
		workbenchpage.se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}

	@When("^click on Add Candidate button$")
	public void click_on_Add_Candidate_button() throws Throwable {
	    
		workbenchpage.addCandidateButton.click();
		Thread.sleep(3000);
	}

	@When("^enter email id of candidate and click on Find button$")
	public void enter_email_id_of_candidate_and_click_on_Find_button() throws Throwable {
	    
		addcandidatepage.validatePageTitle();
		addcandidatepage.searchCandidateEmail();
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
	}

	@When("^click on OK button from success popup window if you entered email id of registered candidate$")
	public void click_on_OK_button_from_success_popup_window_if_you_entered_email_id_of_registered_candidate() throws Throwable {
	    
		driver.findElement(By.id("alertModalCloseBtn")).click();
	}

	@When("^Fill all details and click on Save button$")
	public void fill_all_details_and_click_on_Save_button() throws Throwable {
	    
		addcandidatepage.salaryOffered.sendKeys("400000");
		addcandidatepage.saveButton.click();
	}

	@When("^click on Yes button if probability related fields are not filled and observe$")
	public void click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe() throws Throwable {
	    
		driver.findElement(By.id("confirmModalBtn")).click();
		Thread.sleep(3000);
	}

	@Then("^Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job$")
	public void blocked_agency_should_not_be_able_to_add_candidate_for_the_job_and_error_message_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_for_that_job() throws Throwable {
	    
		System.out.println("\nBlocked agency should not be able to add candidate for the job");
		System.out.println("Error message should display like - This User is blocked for this job. So cannot add candidate for this job");
	}

	@Then("^click on OK button from error message popup$")
	public void click_on_OK_button_from_error_message_popup() throws Throwable {
	    
		driver.findElement(By.id("alertModalCloseBtn")).click();
	}

	@Then("^click on Close button from Add Candidate page and click on Yes button from confirmation popup$")
	public void click_on_Close_button_from_Add_Candidate_page_and_click_on_Yes_button_from_confirmation_popup() throws Throwable {
	    
		addcandidatepage.closeButton.click();
		driver.findElement(By.id("confirmModalBtn")).click();
	}

	@Then("^click on Share With Team button and observe team is added and if not then add new team by clicking on Add button on Share Job page$")
	public void click_on_Share_With_Team_button_and_observe_team_is_added_and_if_not_then_add_new_team_by_clicking_on_Add_button_on_Share_Job_page() throws Throwable {
	    
//		workbenchpage.shareWithTeamButton.click();
//		Thread.sleep(3000);
//		sharewithteampage.clickOnAddButton();
//		Thread.sleep(3000);
//		sharewithteampage.fillAgencyTeamDetails();
//		sharewithteampage.selectAddToTeamMember();
//		sharewithteampage.submitButton.click();
//		Thread.sleep(3000);
	}

	@Then("^search for team member and select the Share checkbox present in front of the agency team member to share the job with team member$")
	public void search_for_team_member_and_select_the_Share_checkbox_present_in_front_of_the_agency_team_member_to_share_the_job_with_team_member() throws Throwable {
	    
//		sharewithteampage.searchAgencyTeam();

	}

	@Then("^click on Yes button from confirmation popup and observe$")
	public void click_on_Yes_button_from_confirmation_popup_and_observe() throws Throwable {
	    
		
	}

	@Then("^user should able to search team member and blocked agency should not able to share job with any team members and error message should display$")
	public void user_should_able_to_search_team_member_and_blocked_agency_should_not_able_to_share_job_with_any_team_members_and_error_message_should_display() throws Throwable {
	    
		System.out.println("\nUser able to search the team member..");
		System.out.println("Blocked agency not able to share job with team member");
		System.out.println("Error message displayed like - You are blocked by employer so you can not share this job anymore");
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(5000);
		driver.quit();
	}

//scenario 2:
	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
	    
		loginpage.emailaddress.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@When("^click on Team tab and add one new team member by clicking on Add button$")
	public void click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button() throws Throwable {
	    
		dashboardpage.openTeamPage();
		teampage.validatePageTitle();
		teampage.AddTeamButton.click();
		Thread.sleep(3000);
		teampage.fillTeamMemberDetails();
		teampage.submitButton.click();
		Thread.sleep(3000);
	}

	@When("^click on Close button from Team Members window$")
	public void click_on_Close_button_from_Team_Members_window() throws Throwable {
	    
		teampage.closeButton.click();
	}

	@When("^click on Share With Team button and select the Share checkbox present in front of the team member to share the job$")
	public void click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job() throws Throwable {
	    
		workbenchpage.shareWithTeamButton.click();
		Thread.sleep(3000);
		teampage.searchTeamMember();
		
	}

	@When("^again click on Share With Team button and select the Block/Unblock checkbox present in front of the team member with whom you shared the job$")
	public void again_click_on_Share_With_Team_button_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member_with_whom_you_shared_the_job() throws Throwable {
	    
	}

	@When("^logout with employer and login with team member valid credentials which you blocked on Share Job page$")
	public void logout_with_employer_and_login_with_team_member_valid_credentials_which_you_blocked_on_Share_Job_page() throws Throwable {
	    
		WebElement we = driver.findElement(By.xpath("//img[@class='profile']"));
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		Thread.sleep(3000);
		loginpage.signInTeam();
		Thread.sleep(5000);
	}

	@When("^click on Workbench tab and select the job for which team member is blocked$")
	public void click_on_Workbench_tab_and_select_the_job_for_which_team_member_is_blocked() throws Throwable {
	    
		
	}

	@Then("^Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job$")
	public void blocked_team_member_should_not_be_able_to_add_candidate_for_the_job_and_error_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_by_himself_into_that_job() throws Throwable {
	    
	}



}
