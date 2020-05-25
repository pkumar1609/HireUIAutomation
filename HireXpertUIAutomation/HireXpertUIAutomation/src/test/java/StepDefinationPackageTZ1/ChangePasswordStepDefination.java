package StepDefinationPackageTZ1;

import org.junit.Assert;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class ChangePasswordStepDefination extends baseclass{

	@When("^enter employer details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_employer_details(String EmployerName, String EmployerEmail, String EmployerContactNumber) throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.registeremployerdetails(EmployerName, EmployerEmail, EmployerContactNumber);
	}

	@When("^Select value from dropdown for employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_for_employer(String usertype, String timezone, String country) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails1(usertype, timezone, country);
	}

	@When("^enter employer email and password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_employer_email_and_password(String EmployerEmail, String password) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.enterEmployerEmailandPassword(EmployerEmail, password);
	}

	@When("^Update Employer Profile  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_Employer_Profile(String EmployerAddress, String EmployerOrganizationName, String EmployerWebsite, String EmployerCity) throws Throwable {

		Thread.sleep(3000);
		updateprofilepopuppage.UpdateProfileEmployer(EmployerAddress, EmployerOrganizationName, EmployerWebsite, EmployerCity);
	}

	@When("^Click on Change Password tab$")
	public void click_on_Change_Password_tab() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.openChangePasswordPage();
	}

	@When("^Enter the Current Password and New Password \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_the_Current_Password_and_New_Password(String password, String newpassword, String confirmpassword) throws Throwable {

		Thread.sleep(3000);
		changepasswordpage.EnterCurrentPassword(password);
		changepasswordpage.EnterNewPassword(newpassword);
		changepasswordpage.EnterConfirmPassword(confirmpassword);
	}

	@When("^Successful pop-up message display as \"([^\"]*)\" with Ok button$")
	public void successful_pop_up_message_display_as_with_Ok_button(String ExpectedSuccessfulMessage) throws Throwable {
		
		String ActualSuccessfulMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedSuccessfulMessage, ActualSuccessfulMessage);
	}

	@When("^Click on Ok button$")
	public void click_on_Ok_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Clickokbtn();
	}

	@When("^click on logout tab$")
	public void click_on_logout_tab() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
	}

	@When("^login as employer with new password \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_as_employer_with_new_password(String EmployerEmail, String newpassword) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Loginwithemployernewpassword(EmployerEmail, newpassword);
		registerpage.ClickSigninbtn();
	}

	@When("^login as employer with the old password \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_as_employer_with_the_old_password(String EmployerEmail, String password) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Loginwithemployeroldpassword(EmployerEmail, password);
		registerpage.ClickSigninbtn();
	}
	
	@When("^enter Agency details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_Agency_details(String AgencyName, String AgencyEmail, String AgencyContactNumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerAgencydetails(AgencyName, AgencyEmail, AgencyContactNumber);
	}

	@When("^Select value from dropdown for Agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_for_Agency(String AgencyUserType, String timezone, String country) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerAgencydetails1(AgencyUserType, timezone, country);
	}

	@When("^enter agency email and password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_agency_email_and_password(String AgencyEmail, String password) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.enterAgencyEmailandPassword(AgencyEmail, password);
	}

	@When("^Update Agency Profile  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_Agency_Profile(String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.UpdateProfileAgency(AgencyAddress, AgencyOrganizationName, AgencyWebsite, AgencyCity);
	}

	
	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    
		Thread.sleep(3000);
		driver.close();
	}

	@When("^login as agency with new password \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_as_agency_with_new_password(String AgencyEmail, String newpassword) throws Throwable {
	  
		Thread.sleep(3000);
		registerpage.Loginwithagencynewpassword(AgencyEmail, newpassword);
		registerpage.ClickSigninbtn();
	}

	@When("^login as agency with old password \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_as_agency_with_old_password(String AgencyEmail, String password) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Loginwithemployeroldpassword(AgencyEmail, password);
		registerpage.ClickSigninbtn();
	}
	
	@Then("^User should get error message as \"([^\"]*)\" when he try to login with old password$")
	public void user_should_get_error_message_as_when_he_try_to_login_with_old_password(String ExpectedErrorMessage) throws Throwable {
		
		String ActualErrorMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);	
	}

}