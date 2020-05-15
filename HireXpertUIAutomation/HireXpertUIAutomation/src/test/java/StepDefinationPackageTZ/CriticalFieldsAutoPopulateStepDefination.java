package StepDefinationPackageTZ;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class CriticalFieldsAutoPopulateStepDefination extends baseclass {

	
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
	   
		baseclass.initialization();
	}

	@When("^click on Register link$")
	public void click_on_Register_link() throws Throwable {
	    
		Thread.sleep(4200);
		registerpage.clickRegister();
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

	@When("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.ClickSubmitbtn();
	}

	@When("^User should get confirmation message and click on OK button$")
	public void user_should_get_confirmation_message_and_click_on_OK_button() throws Throwable {

		Thread.sleep(3000);
		registerpage.Clickokbtn();
	}

	@When("^enter candidate email and password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_candidate_email_and_password(String CandidateEmail, String password) throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.enterCandidateEmailandPassword(CandidateEmail, password);
	}

	@When("^click on Signin button$")
	public void click_on_Signin_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.ClickSigninbtn();
	}

	@Then("^verify the Auto Populated fields on Candidate update profile popup window$")
	public void verify_the_Auto_Populated_fields_on_Candidate_update_profile_popup_window() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateCandidateProfile();
	}

}
