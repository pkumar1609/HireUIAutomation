package BVT_StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class UserRegistrationAfterDBCleanUpStepDefination extends baseclass {

	Boolean userAlreadyRegistered = false;

	@When("^New HireXpert application user employer registration \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void new_HireXpert_application_user_employer_registration(String EmployerName, String EmployerEmail,
			String ContactNumber, String UserType, String Country, String TimeZone, String Password, String Address,
			String EmpOrgName, String EmpOrgWebsite, String City) throws Throwable {

		try {
			String errorMessageForAlreadyRegisteredUser = "";
			registerpage.registeremployerdetails(EmployerName, EmployerEmail, ContactNumber);
			registerpage.registerUserdetails(UserType, TimeZone, Country);
			common.ClickSumbit();
			common.clickOnConfirmYes();

			errorMessageForAlreadyRegisteredUser = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();

			if (errorMessageForAlreadyRegisteredUser.length() > 0
					&& errorMessageForAlreadyRegisteredUser.contains("already register with")) {
				userAlreadyRegistered = true;

				common.clickOnCloseBtn();
				common.clickOnConfirmYes();
			}
		} catch (NoSuchElementException ex) {
			userAlreadyRegistered = false;
			common.clickOnOKBtn();
			loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.loginInNew(EmployerEmail, Password);
			updateprofilepopuppage.UpdateProfile(Address, EmpOrgName, EmpOrgWebsite, City);
			common.ClickSumbit();
			loginpage.identifyUserK();
		}
	}

	@When("^User adds new job$")
	public void user_adds_new_job(DataTable credentials) throws Throwable {

		if (!userAlreadyRegistered) {
			dashboardpage.openDashboardPage();
			dashboardpage.AddJob();
			addjobpage.filljobDetails(credentials);
			common.ClickSumbit();
			common.clickOnOKBtn();
			dashboardpage.openWorkbenchPage();
		}
	}

	@Given("^Add Manage Recruiters for loggedIn employee$")
	public void add_Manage_Recruiters_for_loggedIn_employee(DataTable credentials) throws Throwable {

		if (!userAlreadyRegistered) {
			managerecruitmentagencies.addRecruiters(credentials);
		}
	}

	@When("^Add Manage Employee for loggedIn employer$")
	public void add_Manage_Employee_for_loggedIn_employer(DataTable credentials) throws Throwable {

		if (!userAlreadyRegistered) {
			manageemployee.addEmployee(credentials);
			// logout
			loginpage.logoutFromAppK();
			common.logout.click();
			if (common.okbtnPopup.size() > 0) {
				common.clickOnOKBtn();
			}
		}
	}

	// Agency
	@When("^New HireXpert application user agency registration \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void new_HireXpert_application_user_agency_registration(String AgencyName, String AgencyEmail,
			String ContactNumber, String UserType, String Country, String TimeZone, String Password, String Address,
			String AgcyOrgName, String AgcyOrgWebsite, String City) throws Throwable {

		try {
			String errorMessageForAlreadyRegisteredUser = "";
			registerpage.registeremployerdetails(AgencyName, AgencyEmail, ContactNumber);
			registerpage.registerUserdetails(UserType, TimeZone, Country);
			common.ClickSumbit();
			common.clickOnConfirmYes();

			errorMessageForAlreadyRegisteredUser = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();

			if (errorMessageForAlreadyRegisteredUser.length() > 0
					&& errorMessageForAlreadyRegisteredUser.contains("already register with")) {

				userAlreadyRegistered = true;
				common.clickOnCloseBtn();
				common.clickOnConfirmYes();
			}
		} catch (NoSuchElementException ex) {
			userAlreadyRegistered = false;
			common.clickOnOKBtn();
			loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.loginInNew(AgencyEmail, Password);
			updateprofilepopuppage.UpdateProfile(Address, AgcyOrgName, AgcyOrgWebsite, City);
			common.ClickSumbit();
			loginpage.identifyUserK();
		}
	}

	@When("^Add Manage Employee for loggedIn agency$")
	public void add_Manage_Employee_for_loggedIn_agency(DataTable credentials) throws Throwable {

		if (!userAlreadyRegistered) {
			manageemployee.addEmployee(credentials);
		}
	}

	@When("^Add Manage Vendors for loggedIn agency$")
	public void add_Manage_Vendors_for_loggedIn_agency(DataTable credentials) throws Throwable {

		if (!userAlreadyRegistered) {
			managevendor.addVendor(credentials);
			// logout
			loginpage.logoutFromAppK();		
			common.logout.click();
			if (common.okbtnPopup.size() > 0) {
				common.clickOnOKBtn();
			}
		}
	}

}
