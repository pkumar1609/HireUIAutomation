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

public class unblockFunctionalitySteps extends baseclass {

//scenario 1:
//	@Given("^User is on Home page of application$")
//	public void user_is_on_Home_page_of_application() throws Throwable {
//	    
//		baseclass.initialization();
//	}

//	@When("^title of page is HireXpert$")
//	public void title_of_page_is_HireXpert() throws Throwable {
//	    
//		String title = loginpage.validateTitle();
//		System.out.println("Title of page: " + title);
//	}

//	@When("^click on Workbench tab and select job from Jobs drop down$")
//	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down() throws Throwable {
//	    
//		dashboardpage.openWorkbenchPage();
//		Thread.sleep(3000);
//		workbenchpage.selectJob();
//		Thread.sleep(3000);
//	}

	@When("^click on Share With Agency button and select the Share checkbox present in front of agency to share the job$")
	public void click_on_Share_With_Agency_button_and_select_the_Share_checkbox_present_in_front_of_agency_to_share_the_job() throws Throwable {
	    
		workbenchpage.shareWithAgencyButton.click();
		Thread.sleep(3000);
		sharewithagencypage.searchAgencyOwner();
		Thread.sleep(1000);
		sharewithagencypage.shareCheckbox.click();
		Thread.sleep(1000);
	}

	@When("^click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the agency with whom you shared the job$")
	public void click_on_Yes_button_from_confirmation_popup_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job() throws Throwable {
	    
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		sharewithagencypage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}

	@When("^click on Yes button from confirmation popup$")
	public void click_on_Yes_button_from_confirmation_popup() throws Throwable {
	    
		common.clickOnConfirmYes();
		Thread.sleep(3000);
	}

	@When("^now again click on Block/Unblock checkbox present in front of the agency which is blocked previously to unblock that agency$")
	public void now_again_click_on_Block_Unblock_checkbox_present_in_front_of_the_agency_which_is_blocked_previously_to_unblock_that_agency() throws Throwable {
	    
		sharewithagencypage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}

	@Then("^Employer should be able to unblock the agency$")
	public void employer_should_be_able_to_unblock_the_agency() throws Throwable {
	    
		System.out.println("Employer able to unblock the agency..");
		common.closebtn.click();
		Thread.sleep(1000);
	}

	@Then("^logout with employer and login with Agency valid credentials which you unblocked$")
	public void logout_with_employer_and_login_with_Agency_valid_credentials_which_you_unblocked() throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		loginpage.signInAgency2();
		Thread.sleep(5000);
	}

	@Then("^click on Workbench tab and select job from Jobs drop down for which agency is unblocked$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_agency_is_unblocked() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.se = new Select(workbenchpage.jobDropDown);
		workbenchpage.se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}

//	@Then("^click on Add Candidate button$")
//	public void click_on_Add_Candidate_button() throws Throwable {
//	    
//		workbenchpage.addCandidateButton.click();
//		Thread.sleep(3000);
//	}

	@When("^enter email id of candidate and click on Find button$")
	public void enter_email_id_of_candidate_and_click_on_Find_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addcandidatepage.validatePageTitle();
		addcandidatepage.emailField.click();
		addcandidatepage.emailField.sendKeys(data.get(0).get(0));
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
	}

	@Then("^click on OK button from success popup window if you entered email id of registered candidate$")
	public void click_on_OK_button_from_success_popup_window_if_you_entered_email_id_of_registered_candidate() throws Throwable {
	    
		driver.findElement(By.id("alertModalCloseBtn")).click();
	}

	@Then("^Fill all details and click on Save button$")
	public void fill_all_details_and_click_on_Save_button() throws Throwable {
	    
		addcandidatepage.salaryOffered.sendKeys("300000");
		common.clickOnSaveBtn();
	}

//	@Then("^click on Yes button if probability related fields are not filled and observe$")
//	public void click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe() throws Throwable {
//	    
//		driver.findElement(By.id("confirmModalBtn")).click();
//		Thread.sleep(2000);
//	}

	@Then("^Unblocked agency should be able to add candidate$")
	public void unblocked_agency_should_be_able_to_add_candidate() throws Throwable {
	    
		System.out.println("Unblocked agency able to add candidate for the job and added candidate displayed in New column");
	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	    
//		Thread.sleep(5000);
//		driver.close();
//	}
	

//scenario 2:
//	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
//	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
//	    
//		loginpage.emailaddress.sendKeys(arg1);
//		loginpage.password.sendKeys(arg2);
//		loginpage.signin.click();
//		Thread.sleep(5000);
//	}

	@When("^click on Share With Team button and select Share checkbox present in front of the team member to share the job$")
	public void click_on_Share_With_Team_button_and_select_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job() throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
			System.out.println("\nSearching team member with Employer..");
			
			workbenchpage.shareWithTeamButton.click();
			Thread.sleep(3000);
			sharewithteampage.searchEmployerTeam3();
			sharewithteampage.shareCheckbox.click();
			Thread.sleep(2000);
		}
		
		else{
			
			System.out.println("\nSearching team member with Agency..");
			
			workbenchpage.shareWithTeamButton.click();
			Thread.sleep(3000);
			sharewithteampage.searchAgencyTeam3();
			sharewithteampage.shareCheckbox.click();
			Thread.sleep(2000);
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}

	@When("^click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the team member with whom you shared the job$")
	public void click_on_Yes_button_from_confirmation_popup_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member_with_whom_you_shared_the_job() throws Throwable {
	    
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		sharewithteampage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}

	@When("^now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member$")
	public void now_again_click_on_Block_Unblock_checkbox_present_in_front_of_the_team_member_which_is_blocked_previously_to_unblock_that_team_member() throws Throwable {
	    
		sharewithteampage.blockUnblockCheckbox.click();
		Thread.sleep(2000);
	}

	@Then("^User should be able to unblock the team member$")
	public void User_should_be_able_to_unblock_the_team_member() throws Throwable {
	    
		System.out.println("User able to unblock team member");
	}

	@Then("^logout with logged in user and login with team member valid credentials which you unblocked$")
	public void logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_unblocked() throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){

			System.out.println("\nLogout with Employer and login with Employer team member..");
			
			workbenchpage.ClickonLogout();
			Thread.sleep(3000);
			loginpage.signInTeam3();
			Thread.sleep(5000);
		}
		
		else{

			System.out.println("\nLogout with Agency and login with Agency team member..");
			
			workbenchpage.ClickonLogout();
			Thread.sleep(3000);
			loginpage.signInAgencyTeam3();
			Thread.sleep(5000);
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}

	@Then("^click on Workbench tab and select job from Jobs drop down for which team member is unblocked$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_team_member_is_unblocked() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.se = new Select(workbenchpage.jobDropDown);
		workbenchpage.se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}
	
	@Then("^click on Add Candidate button and enter email id of candidate and click on the Find button$")
	public void click_on_Add_Candidate_button_and_enter_email_id_of_candidate_and_click_on_the_Find_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw(); 
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
			workbenchpage.addCandidateButton.click();
			Thread.sleep(3000);
			addcandidatepage.validatePageTitle();
			addcandidatepage.emailField.click();
			addcandidatepage.emailField.sendKeys(data.get(0).get(0));
			addcandidatepage.FindButton.click();
			Thread.sleep(3000);
		}
		
		else{

			workbenchpage.addCandidateButton.click();
			Thread.sleep(3000);
			addcandidatepage.validatePageTitle();
			addcandidatepage.emailField.click();
			addcandidatepage.emailField.sendKeys(data.get(0).get(1));
			addcandidatepage.FindButton.click();
			Thread.sleep(3000);
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@Then("^Unblocked team member should be able add candidate$")
	public void unblocked_team_member_should_be_able_add_candidate() throws Throwable {
	    
		System.out.println("Unblocked team member able to add candidate..");
	}

}
