package StepDefinationPackageTZ;

import cucumber.api.java.en.Given;
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

}
