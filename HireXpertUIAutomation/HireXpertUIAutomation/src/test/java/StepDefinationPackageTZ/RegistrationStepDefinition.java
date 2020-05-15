
package StepDefinationPackageTZ;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class RegistrationStepDefinition extends baseclass  {
		
	
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
		
		Thread.sleep(3000);
		updateprofilepopuppage.UpdateProfileEmployer(EmployerAddress, EmployerOrganizationName, EmployerWebsite, EmployerCity);
	}


	@Then("^Verify the login user$")
	public void verify_the_login_user() throws Throwable {
	   
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
		driver.quit();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.Savebutton.click();
	}

}
		