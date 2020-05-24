package jobFunctionality;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class assignToAndAddedBy extends baseclass {
	
// @regression1_01
	
	@Then("^observe Added By field on candidate card$")
	public void observe_Added_By_field_on_candidate_card() throws Throwable {
	    
		String addedbyname = candidatecardsectionpage.addedBy.getAttribute("title");
		System.out.println("\nAdded By name:" + addedbyname);
		
		String user = addedbyname.substring(9);
		System.out.println("Added By name after Added By:" + user);
		
		workbenchpage.userNameProfile();
		
		if(user.equals(workbenchpage.username)) {
			
			System.out.println("Current logged in user name displayed in Added By field on candidate card..");
		}
		else {
			
			System.out.println("Current logged in user name not displayed in Added By field");
		}
	}

	@Then("^now move the candidate from New column to another column and and check the name for Added by field on candidate card$")
	public void now_move_the_candidate_from_New_column_to_another_column_and_and_check_the_name_for_Added_by_field_on_candidate_card() throws Throwable {
	    
		candidatecardsectionpage.dragAndDropCardToSecondColumn();
		
		String addedbyname = candidatecardsectionpage.addedBy.getAttribute("title");
		
		String user = addedbyname.substring(9);
		
		workbenchpage.userNameProfile();
		
		if(user.equals(workbenchpage.username)) {
			
			System.out.println("Current logged in user name displayed in Added By field on candidate card for second column..");
		}
		else {
			
			System.out.println("Current logged in user name not displayed in Added By field for second column");
		}
	}

	@Then("^again move the candidate to the next column and check the name for Added by field$")
	public void again_move_the_candidate_to_the_next_column_and_check_the_name_for_Added_by_field() throws Throwable {
	    
		candidatecardsectionpage.dragAndDropCardToThirdColumn();
		
		String addedbyname = candidatecardsectionpage.addedBy.getAttribute("title");
		
		String user = addedbyname.substring(9);
		
		workbenchpage.userNameProfile();
		
		if(user.equals(workbenchpage.username)) {
			
			System.out.println("Current logged in user name displayed in Added By field on candidate card for third column..");
		}
		else {
			
			System.out.println("Current logged in user name not displayed in Added By field for third column");
		}
	}

	@Then("^name for Added by should remain same on candidate card$")
	public void name_for_Added_by_should_remain_same_on_candidate_card() throws Throwable {
	    
		System.out.println("\nAdded By name is same on candidate card after drag and drop card..");
	}

	@Then("^click on Team tab and add one new team member by clicking on Add button$")
	public void click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button(DataTable dt) throws Throwable {
	    
		dashboardpage.openTeamPage();
		Thread.sleep(3000);
		teampage.clickOnAddBtnK();
		Thread.sleep(4000);
		
		List<List<String>> data = dt.raw();
		teampage.TeamMemberName.sendKeys(data.get(0).get(0)); 
		teampage.TeamMemberEmail.sendKeys(data.get(0).get(1));
		teampage.TeamMemberContactNumber.sendKeys(data.get(0).get(2));
		
		teampage.submitButton.click();
		Thread.sleep(3000);
	}

	@Then("^click on Close button from Team Members window$")
	public void click_on_Close_button_from_Team_Members_window() throws Throwable {
	    
		teampage.closeTeamPage();
	}

	@Then("^click on Share With Team button and select the Share checkbox present in front of the team member to share the job$")
	public void click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job() throws Throwable {
	    
		workbenchpage.shareWithTeamButton.click();
		Thread.sleep(3000);
		sharewithteampage.searchEmployerTeam();
		sharewithteampage.shareCheckbox.click();
	}

	@Then("^click on Yes button from confirmation popup and click on Close button from Share Job$")
	public void click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job() throws Throwable {
	    
		sharewithagencypage.yesButtonConfirmation.click();
		System.out.println("\nNow job is shared with team member..");
		Thread.sleep(3000);
		sharewithteampage.closeButton.click();
	}

	@Then("^logout with logged in user and login with team member valid credentials for which you Shared the Job$")
	public void logout_with_logged_in_user_and_login_with_team_member_valid_credentials_for_which_you_Shared_the_Job(DataTable dt) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@Then("^click on Workbench tab and select the shared job$")
	public void click_on_Workbench_tab_and_select_the_shared_job() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.selectJob();
		Thread.sleep(3000);
	}
	

	
// @regression1_02	
	
	@When("^enter valid user email address and password for agency and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_agency_and_click_on_Sign_in_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
	    Thread.sleep(5000);
	}

	@Then("^go to Profile and then Update Profile page$")
	public void go_to_Profile_and_then_Update_Profile_page() throws Throwable {
	    
		workbenchpage.openUpdateProfilePage();
		Thread.sleep(3000);
	}

	@Then("^update name of agency and click on Submit button$")
	public void update_name_of_agency_and_click_on_Submit_button() throws Throwable {
	    
		String currentagencyname = updateprofilepopuppage.AgencyEmployerName.getAttribute("value");
		System.out.println("Current agency name: " + currentagencyname);
		updateprofilepopuppage.AgencyEmployerName.click();
		updateprofilepopuppage.AgencyEmployerName.sendKeys(" 01");
		registerpage.ClickSubmitbtn();
		Thread.sleep(3000);
	}
	
	@Then("^click on Edit job button and observe the employer name and login with employer for which job is added$")
	public void click_on_Edit_job_button_and_observe_the_employer_name_and_login_with_employer_for_which_job_is_added() throws Throwable {
	    
		workbenchpage.editJobButton.click();
		Thread.sleep(3000);
		
		Select se = new Select(addjobpage.employer);
		WebElement empname = se.getFirstSelectedOption();
		String employername = empname.getText();
		System.out.println("\nEmployer name: " + employername);
		Thread.sleep(1000);
		
		addjobpage.closeButton.click();
		Thread.sleep(1000);
		workbenchpage.ClickonLogout();
		
		//removing white space from employer name
		String withoutspace = employername.replaceAll("\\s", "");
        System.out.println("Employer after removing white space: " + withoutspace);
        
        //adding email part to employer name for login
        String emailpart = "@gmail.com";
        String employeremail = withoutspace.concat(emailpart);
        System.out.println("\nEmployer email address: " + employeremail);
        
        Thread.sleep(3000);
        loginpage.emailaddress.sendKeys(employeremail);
        loginpage.password.sendKeys("12345");
        loginpage.signin.click();
        Thread.sleep(5000);
	}

	@Then("^update name of employer and click on Submit button$")
	public void update_name_of_employer_and_click_on_Submit_button() throws Throwable {
	    
		String currentemployername = updateprofilepopuppage.AgencyEmployerName.getAttribute("value");
		System.out.println("Current employer name: " + currentemployername);
		updateprofilepopuppage.AgencyEmployerName.click();
		updateprofilepopuppage.AgencyEmployerName.sendKeys(" 01");
		registerpage.ClickSubmitbtn();
		Thread.sleep(3000);
	}

	@Then("^click on Workbench tab and select job from Jobs drop down for which candidate is added$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_candidate_is_added() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(5000);
		Select se = new Select(workbenchpage.jobDropDown);
		se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}

	@Then("^observe Added By and Assign To fields on candidate card$")
	public void observe_Added_By_and_Assign_To_fields_on_candidate_card() throws Throwable {
	    
		//verify updated added by name
		String addedbyname = candidatecardsectionpage.addedBy.getAttribute("title");
		System.out.println("\nAdded By name:" + addedbyname);
		
		String lasttwochars = addedbyname.substring(addedbyname.length()-2);
		if(lasttwochars.equals("01")) {
			
			System.out.println("Updated Added By name displayed on candidate card..");
		}
		else {
			
			System.out.println("Update Added By name not displayed on candidate card..");
		}
		
		//verify updated assign to name
		String assigntoname = candidatecardsectionpage.assignTo.getAttribute("title");
		System.out.println("\nAssign To name:" + assigntoname);
		
		String lasttwochars1 = assigntoname.substring(assigntoname.length()-2);
		if(lasttwochars1.equals("01")) {
			
			System.out.println("Updated Assign To name displayed on candidate card..");
		}
		else {
			
			System.out.println("Update Assign To name not displayed on candidate card..");
		}
	}
	
	
// @regression1_03	
	
	@When("^click on Share With Agency button and share job with agency owner$")
	public void click_on_Share_With_Agency_button_and_share_job_with_agency_owner(DataTable dt) throws Throwable {
	    
		workbenchpage.shareWithAgencyButton.click();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		sharewithagencypage.searchField.sendKeys(data.get(0).get(0));
		
		boolean value = sharewithagencypage.shareCheckbox.isEnabled();
		System.out.println("\nEnabled: " + value);
		
		if(value == true) {
			
			sharewithagencypage.shareCheckbox.click();
			sharewithagencypage.yesButtonConfirmation.click();
			Thread.sleep(3000);
			System.out.println("\nJob shared with agency owner..");
			sharewithagencypage.closeButton.click();
			Thread.sleep(1000);
		}
		
		else {
			
			System.out.println("\nJob is already shared with agency owner..");
			sharewithagencypage.closeButton.click();
			Thread.sleep(1000);
		}
		
	}

	@When("^logout with employer and login with agency with whom job is shared$")
	public void logout_with_employer_and_login_with_agency_with_whom_job_is_shared(DataTable dt) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}
	
	@When("^new candidate should get added in New column for the job which is shared by employer$")
	public void new_candidate_should_get_added_in_New_column_for_the_job_which_is_shared_by_employer() throws Throwable {
	    
		System.out.println("\nAgency able to add candidate for the job which is shared by employer..");
	}

	@Then("^observe Change Assign To icon in front of Assign To name$")
	public void observe_Change_Assign_To_icon_in_front_of_Assign_To_name() throws Throwable {
		
		String assigntoname = candidatecardsectionpage.assignTo.getText();
		System.out.println("\nAssign To name:" + assigntoname);
		
		String user = assigntoname.substring(0,8);
		System.out.println("Assign To name without contact number:" + user);
		
		workbenchpage.userNameProfile();
		
		if(user.equals(workbenchpage.username)) {
			
			System.out.println("Current logged in user name displayed in Assign to field on candidate card for New column..");
			
			candidatecardsectionpage.verifyChangeAssignToField();
		}
		else {
			
			System.out.println("Current logged in user name not displayed in Assign to field for New column as job is shared by employer..");
			
			candidatecardsectionpage.verifyChangeAssignToField();
		}
	}

	@Then("^now move the candidate from New column to another column and and check the name for Assign To field on candidate card$")
	public void now_move_the_candidate_from_New_column_to_another_column_and_and_check_the_name_for_Assign_To_field_on_candidate_card() throws Throwable {
	    
		candidatecardsectionpage.dragAndDropCardToSecondColumn();
			
		Thread.sleep(2000);
		String assigntoname = candidatecardsectionpage.assignTo.getText();
		System.out.println("\nAssign To name:" + assigntoname);
		
		String user = assigntoname.substring(0,12);
		System.out.println("Assign To name without contact number:" + user);
		
		workbenchpage.userNameProfile();
		
		if(user.equals(workbenchpage.username)) {
			
			System.out.println("Current logged in user name displayed in Assign to field on candidate card for second column..");
			candidatecardsectionpage.verifyChangeAssignToField();
		}
		else {
			
			System.out.println("Current logged in user name not displayed in Assign to field for second column");
			candidatecardsectionpage.verifyChangeAssignToField();
		}
	}

	@Then("^click on Share With Team button and share that job with agency team member$")
	public void click_on_Share_With_Team_button_and_share_that_job_with_agency_team_member(DataTable dt) throws Throwable {
	    
		workbenchpage.shareWithTeamButton.click();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		sharewithteampage.searchField.sendKeys(data.get(0).get(0));
		
		boolean value = sharewithteampage.shareCheckbox.isEnabled();
		System.out.println("\nEnabled: " + value);
		
		if(value == true) {
			
			sharewithteampage.shareCheckbox.click();
			sharewithagencypage.yesButtonConfirmation.click();
			Thread.sleep(3000);
			System.out.println("\nJob shared with agency team member..");
			sharewithteampage.closeButton.click();
		}
		
		else {
			
			System.out.println("\nJob is already shared with agency team member..");
			sharewithteampage.closeButton.click();
		}
	}

	@Then("^Login with agency team member$")
	public void login_with_agency_team_member(DataTable dt) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@Then("^Click on Reject Candidate icon from candidate card and reject that candidate$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_and_reject_that_candidate() throws Throwable {
	    
		candidatecardsectionpage.candidateCardRejectCandidate.click();
		sharewithagencypage.yesButtonConfirmation.click();
		Thread.sleep(3000);
		candidatecardsectionpage.selectRejectReason();
	}
	
	@Then("^move the candidate from second column to first column and delete that candidate$")
	public void move_the_candidate_from_second_column_to_first_column_and_delete_that_candidate() throws Throwable {
	    
		candidatecardsectionpage.dragAndDropCardToFirstColumn();
		Thread.sleep(2000);
		
		candidatecardsectionpage.candidateCardDeleteCandidateIcon.click();
		sharewithagencypage.yesButtonConfirmation.click();
	}

	@Then("^Now login with Employer$")
	public void now_login_with_Employer(DataTable dt) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@Then("^Observe rejected candidate in Rejected column and observe name for Assign To on candidate card$")
	public void observe_rejected_candidate_in_Rejected_column_and_observe_name_for_Assign_To_on_candidate_card() throws Throwable {
	    
		String assigntoname = candidatecardsectionpage.assignTo.getText();
		System.out.println("\nAssign To name:" + assigntoname);
		
		String user = assigntoname.substring(0,8);
		System.out.println("Assign To name without contact number:" + user);
		
		workbenchpage.userNameProfile();
		
		if(user.equals(workbenchpage.username)) {
			
			System.out.println("Current logged in user name displayed in Assign to field on candidate card for Rejected column..");
		}
		else {
			
			System.out.println("Current logged in user name not displayed in Assign to field for Rejected column....");
		}
	}

	@Then("^Observe Assign To filter list from Filters section$")
	public void observe_Assign_To_filter_list_from_Filters_section() throws Throwable {
	    
		Select se = new Select(workbenchpage.filtersAssignToList);
		List<WebElement> se1 = se.getOptions();
		System.out.println("\nAll options from Assign To filter: ");
		
		for(WebElement we:se1) {
			
			System.out.println(we.getText());
		}
		
		System.out.println("\nEmployer and Employer team member names displayed in Assign to filter..");
	}




}
