package BVT_StepDefination;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class UpdateProfileStepDefination extends baseclass {

//	@Given("^User open browser$")
//	public void user_open_browser() throws Throwable {
//	    
//		baseclass.initialization();
//	}

//	@When("^click on Register link$")
//	public void click_on_Register_link() throws Throwable {
//		
//		Thread.sleep(3000);
//		registerpage.clickRegister();
//	}
	
//	@When("^enter agency details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_agency_details(String AgencyName, String AgencyEmail, String AgencyContactNumber) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.registerAgencydetails(AgencyName, AgencyEmail, AgencyContactNumber);
//	}

//	@When("^Select value from dropdown for agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void select_value_from_dropdown_for_agency(String AgencyUserType, String timezone, String country) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.registerAgencydetails1(AgencyUserType, timezone, country);
//	}

//	@When("^click on Submit button$")
//	public void click_on_Submit_button() throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.ClickSubmitbtn();
//	}
	
	@When("^Login with that agency \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_with_that_agency(String AgencyEmail, String password) throws Throwable {
	    
        Thread.sleep(3000);
        registerpage.enterAgencyEmailandPassword(AgencyEmail, password);
	}
	
//	@When("^click on Signin button$")
//	public void click_on_Signin_button() throws Throwable {
//
//		Thread.sleep(3000);
//		registerpage.ClickSigninbtn();
//	}

	@When("^Click on Close button on Agency Update Profile popup$")
	public void click_on_Close_button_on_Agency_Update_Profile_popup() throws Throwable {
		
		Thread.sleep(3000);
		updateprofilepopuppage.CloseButton.click();
	}

	@When("^Click on Yes button on the confirmation message$")
	public void click_on_Yes_button_on_the_confirmation_message() throws Throwable {
		
		Thread.sleep(3000);
		registerpage.ClickYesbtn();
	}

	@When("^Click on No button on the confirmation message$")
	public void click_on_No_button_on_the_confirmation_message() throws Throwable {
		
		Thread.sleep(3000);
		updateprofilepopuppage.NoButton.click();
	}
	
//	@When("^Update Agency Profile  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void update_Agency_Profile(String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) throws Throwable {
//	    
//		Thread.sleep(3000);
//		updateprofilepopuppage.UpdateProfileAgency(AgencyAddress, AgencyOrganizationName, AgencyWebsite, AgencyCity);
//	}

	@When("^Click on Update Profile tab$")
	public void click_on_Update_Profile_tab() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.openUpdateProfilePage();
	}
	
	@When("^Make changes in Agency profile \"([^\"]*)\"$")
	public void make_changes_in_Agency_profile(String organizationname) throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.MakeChangesinAgencyUpdateProfile(organizationname);
	}
	
//	@When("^User should get confirmation message and click on OK button$")
//	public void user_should_get_confirmation_message_and_click_on_OK_button() throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.Clickokbtn();
//	}

//	@When("^enter agency email and password \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_agency_email_and_password(String AgencyEmail, String password) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.enterAgencyEmailandPassword(AgencyEmail, password);
//	}
//	
//	@When("^enter employer details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_employer_details(String EmployerName, String EmployerEmail, String EmployerContactNumber) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.registeremployerdetails(EmployerName, EmployerEmail, EmployerContactNumber);
//	}

//	@When("^Select value from dropdown for employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void select_value_from_dropdown_for_employer(String EmployerUserType, String timezone, String country) throws Throwable {
//
//		Thread.sleep(3000);
//		registerpage.registeremployerdetails1(EmployerUserType, timezone, country);
//	}

//	@When("^enter employer email and password \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_employer_email_and_password(String EmployerEmail, String password) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.enterEmployerEmailandPassword(EmployerEmail, password);
//	}

	@When("^Click on Close button on Employer Update Profile popup$")
	public void click_on_Close_button_on_Employer_Update_Profile_popup() throws Throwable {
		
		Thread.sleep(3000);
		updateprofilepopuppage.CloseButton.click();
	}

	@When("^Login with that employer \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_with_that_employer(String EmployerEmail, String password) throws Throwable {

		Thread.sleep(3000);
		registerpage.enterEmployerEmailandPassword(EmployerEmail, password);
	}

//	@When("^Update Employer Profile  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void update_Employer_Profile(String EmployerAddress , String EmployerOrganizationName, String EmployerWebsite, String EmployerCity) throws Throwable {
//	    
//		Thread.sleep(3000);
//		updateprofilepopuppage.UpdateProfileEmployer(EmployerAddress, EmployerOrganizationName, EmployerWebsite, EmployerCity);
//	}

	@When("^Make changes in Employer profile \"([^\"]*)\"$")
	public void make_changes_in_Employer_profile(String organizationname) throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.MakeChangesinEmployerUpdateProfile(organizationname);
	}
	
	@Then("^verify the Auto Populated fields on agency update profile popup window$")
	public void verify_the_Auto_Populated_fields_on_agency_update_profile_popup_window() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateAgencyProfile();
	}
	
	@Then("^verify the Auto Populated fields on employer update profile popup window$")
	public void verify_the_Auto_Populated_fields_on_employer_update_profile_popup_window() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateEmployerProfile();
	}
	
	@When("^Login with that candidate \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_with_that_candidate(String CandidateEmail, String password) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.enterCandidateEmailandPassword(CandidateEmail, password);

	}

	@Then("^verify the Auto Populated fields on candidate update profile popup window$")
	public void verify_the_Auto_Populated_fields_on_candidate_update_profile_popup_window() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateCandidateProfile();
	}

	@Then("^Update Candidate Profile \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_Candidate_Profile(String title, String designation, String noticeperiod, String CandidateCity, String industry, String gender, String expertiselevel) throws Throwable {
	    
        Thread.sleep(3000);
        updateprofilepopuppage.UpdateProfileCandidate(title, designation, noticeperiod, industry, CandidateCity, gender);
//        Thread.sleep(3000);
//        addcandidatepage.clickUploadResumeField();
        Thread.sleep(3000);
        addcandidatepage.uploadResumeDocumentT();
	}
	
	@Then("^click on ok button of confirmation popup$")
	public void click_on_ok_button_of_confirmation_popup() throws Throwable {

		Thread.sleep(3000);
		common.clickOnOKBtn();

	}

	@Then("^Make changes in candidate profile \"([^\"]*)\"$")
	public void make_changes_in_candidate_profile(String noticeperiod) throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.MakeChangesinCandidateUpdateProfile(noticeperiod);
	}

//	@When("^enter candidate details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_candidate_details(String CandidateName, String CandidateEmail, String CandidateContactNumber) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.registerCandidatedetails(CandidateName, CandidateEmail, CandidateContactNumber);
//	}
	
//	@When("^Select value from dropdown for candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void select_value_from_dropdown_for_candidate(String CandidateUserType, String timezone, String country) throws Throwable {
//	    
//		Thread.sleep(3000);
//		registerpage.registerCandidatedetails1(CandidateUserType, timezone, country);
//	}
	
	
	@When("^enter candidate email and password  \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_candidate_email_and_password(String CandidateEmail, String password) throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.enterCandidateEmailandPassword(CandidateEmail, password);
	}

	@When("^verify user login as Agency has redirect on correct agency update profile or not$")
	public void verify_user_login_as_Agency_has_redirect_on_correct_agency_update_profile_or_not() throws Throwable {
	    
		updateprofilepopuppage.ToVerifyAgencyisonAgencyUpdateProfilePopupOrNot();
	}

	@Then("^Verify that the critical fields on Update Agency Profile popup are not editable$")
	public void verify_that_the_critical_fields_on_Update_Agency_Profile_popup_are_not_editable() throws Throwable {
	    
		updateprofilepopuppage.verifyEmail();
		
		Thread.sleep(1000);
		
		updateprofilepopuppage.verifylanguage();
	}


	@Then("^Verify that the critical fields on Update Employer Profile popup are not editable$")
	public void verify_that_the_critical_fields_on_Update_Employer_Profile_popup_are_not_editable() throws Throwable {
	    
        updateprofilepopuppage.verifyEmail();
		
		Thread.sleep(1000);
		
		updateprofilepopuppage.verifylanguage();
	}

	@When("^verify user login as Employer has redirect on correct employer update profile or not$")
	public void verify_user_login_as_Employer_has_redirect_on_correct_employer_update_profile_or_not() throws Throwable {
	    
		updateprofilepopuppage.ToVerifyEmployerisonEmployerUpdateProfilePopupOrNot();
	}

	@When("^verify user login as Candidate has redirect on correct candidate update profile or not$")
	public void verify_user_login_as_Candidate_has_redirect_on_correct_candidate_update_profile_or_not() throws Throwable {
	    
		updateprofilepopuppage.ToVerifyCandidateisonCandidateUpdateProfilePopupOrNot();
	}


}












