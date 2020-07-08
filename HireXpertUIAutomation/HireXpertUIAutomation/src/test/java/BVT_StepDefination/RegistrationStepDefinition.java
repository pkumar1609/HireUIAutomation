
package BVT_StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class RegistrationStepDefinition extends baseclass  {
		
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^click on Register link$")
	public void click_on_Register_link() throws Throwable {

		Thread.sleep(4200);
		registerpage.clickRegister();

	}
	
	@When("^click on Login link$")
	public void click_on_Login_link() throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.clickLogin();
	}


	
	@Then("^verify the fields and buttons present on the register dialog box$")
	public void verify_the_fields_and_buttons_present_on_the_register_dialog_box() throws Throwable {
		
		Thread.sleep(3000);
		registerpage.verifythefieldsonregisterdialogbox();
	}

	@Then("^click on Close button$")
	public void click_on_Close_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Clickclosebtn();
	}

	
	@When("^Click on Yes button of confirmation popup$")
	public void click_on_Yes_button_of_confirmation_popup() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.ClickYesbtn();
	}


	@Then("^Update employer profile \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_employer_profile(String EmployerAddress, String EmployerOrganizationName, String EmployerWebsite, String EmployerCity) throws Throwable {
		
		Thread.sleep(4200);
		updateprofilepopuppage.UpdateProfileEmployer(EmployerAddress, EmployerOrganizationName, EmployerWebsite, EmployerCity);
	}


	@Then("^Update agency profile\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_agency_profile(String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) throws Throwable {

		Thread.sleep(4200);
		updateprofilepopuppage.UpdateProfileAgency(AgencyAddress, AgencyOrganizationName, AgencyWebsite, AgencyCity);
	}


	
	@When("^Update candidate profile \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_candidate_profile(String title, String designation, String noticeperiod, String CandidateCity, String industry, String gender, String expertiselevel) throws Throwable {
	   
        Thread.sleep(3000);
        updateprofilepopuppage.UpdateProfileCandidate(title, designation, noticeperiod,industry, CandidateCity, gender);
		Thread.sleep(3000);
		updateprofilepopuppage.DeleteCandidateSkillsandRoles();
		Thread.sleep(3000);
		updateprofilepopuppage.AddCandidateSkillandRole(expertiselevel);
	}


	@When("^enter details of already registered user \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_user(String name, String email, String contactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails(name, email, contactnumber);
	}

	@When("^Select value from dropdown of \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_of(String name, String email, String contactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails1(name, email, contactnumber);
	}

	@Then("^User should get a error message with OK button and click on OK button$")
	public void user_should_get_a_error_message_with_OK_button_and_click_on_OK_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Clickokbtn();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(3000);
		driver.close();
	}
	
	@When("^click on Yes button$")
	public void click_on_Yes_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.Savebutton.click();
	}

	@When("^enter candidate email and password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_candidate_email_and_password(String CandidateEmail, String password) throws Throwable {
    
		Thread.sleep(3000);
		registerpage.enterCandidateEmailandPassword(CandidateEmail, password);
	}

	
	@When("^enter all details and email id of a previously registered employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_details_and_email_id_of_a_previously_registered_employer(String EmployerName, String EmployerEmail, String EmployerContactNumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registeremployerdetails(EmployerName, EmployerEmail, EmployerContactNumber);
	}

	@When("^enter user type as the candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_user_type_as_the_candidate(String usertype, String timezone, String country) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails1(usertype, timezone, country);
	}

	@Then("^Verify User should get error message as \"([^\"]*)\" with OK button$")
	public void verify_User_should_get_error_message_as_with_OK_button(String ExpectedErrorMessage) throws Throwable {

     String ActualErrorMessage = driver.findElement(By.cssSelector("#alertlineheight")).getText();
     Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage );
	}

	@Then("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@When("^click on ok button of confirmation popup\\.$")
	public void click_on_ok_button_of_confirmation_popup() throws Throwable {

		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@When("^click on update profile link$")
	public void click_on_update_profile_link() throws Throwable {
	   
		Thread.sleep(3000);
	    workbenchpage.openUpdateProfilePage();
	}


	@When("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.ClickSumbit();
	}

	@When("^User should get confirmation message and click on OK button$")
	public void user_should_get_confirmation_message_and_click_on_OK_button() throws Throwable {

		Thread.sleep(3000);
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@When("^click on Signin button$")
	public void click_on_Signin_button() throws Throwable {

		Thread.sleep(3000);
		registerpage.ClickSigninbtn();
	}

	@When("^enter agency details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_agency_details(String AgencyName, String AgencyEmail, String AgencyContactNumber) throws Throwable {

		Thread.sleep(3000);
		registerpage.registerAgencydetails(AgencyName, AgencyEmail, AgencyContactNumber);

	}

	@When("^Select value from dropdown for agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_for_agency(String AgencyUserType, String timezone, String country) throws Throwable {

		Thread.sleep(3000);
		registerpage.registerAgencydetails1(AgencyUserType, timezone, country);
	}

	@When("^enter candidate details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")	
	public void enter_candidate_details(String CandidateName, String CandidateEmail, String CandidateContactNumber) throws Throwable {

		Thread.sleep(3000);
		registerpage.registerCandidatedetails(CandidateName, CandidateEmail, CandidateContactNumber);
	}

	@When("^Select value from dropdown for candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_for_candidate(String CandidateUserType, String timezone, String country) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerCandidatedetails1(CandidateUserType, timezone, country);
	}

	@When("^click on Employer-Agency SignIn link$")
	public void click_on_Employer_Agency_SignIn_link() throws Throwable {

		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();

	}

	@When("^click on Job Seeker\\(Candidate\\) Sign In link$")
	public void click_on_Job_Seeker_Candidate_Sign_In_link() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.clickJobseekerCandidateSignInlinklink();
	}
	
	@When("^enter details of already registered candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_candidate(String candidatename, String candidateemail, String candidatecontactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerCandidatedetails(candidatename, candidateemail, candidatecontactnumber);
	}

	@Then("^User should get a error message as \"([^\"]*)\"$")
	public void user_should_get_a_error_message_as(String ExpectedErrorMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualErrorMessage = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
	}

	@When("^enter details of already registered agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_agency(String agencyname, String agencyemail, String agencycontactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerAgencydetails(agencyname, agencyemail, agencycontactnumber);
		
	}

	@When("^enter details of already registered employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_employer(String employername, String employeremail, String employercontactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registeremployerdetails(employername, employeremail, employercontactnumber);
		
	}

	@Then("^Verify User should get error message as \"([^\"]*)\"$")
	public void verify_User_should_get_error_message_as(String ExpectedErrorMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualErrorMessage = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
	}

	@When("^Verify that user has redirected to correct page or not after filling the information in update profile$")
	public void verify_that_user_has_redirected_to_correct_page_or_not_after_filling_the_information_in_update_profile() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.VerifyUserIsOnCorrectPage();
		
	}

	@When("^Verify the username by which user is login$")
	public void Verify_the_username_by_which_user_is_login() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.userNameProfile();
		
	}
	}























		