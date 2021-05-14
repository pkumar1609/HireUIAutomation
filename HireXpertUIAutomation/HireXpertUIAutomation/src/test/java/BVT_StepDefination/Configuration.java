package BVT_StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class Configuration extends baseclass {

	@Given("^A user with organization admin permission exists$")
	public void a_user_with_organization_admin_permission_exists() throws Throwable {
		registerpage.clickRegister();
		registerpage.FillAllregisterdeatils("pagy", "pagy@gmail.com", "789652222", "Agency", "", "India");
	}

	@When("^An agency organization admin logged in to HireXpert$")
	public void an_agency_organization_admin_logged_in_to_HireXpert() throws Throwable {
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn("agency1@gmail.com", "12345");
		if(driver.findElements(By.xpath("//h5[text()='Update Profile']")).size()>0)
		{
			updateprofilepopuppage.UpdateProfile("viman nagar", "abc organization", "www.abc.com", "Pune");
			common.ClickSumbit();
		}	
		loginpage.identifyUserK();
	}

	@Then("^Login user should see configuration tab$")
	public void login_user_should_see_configuration_tab() throws Throwable {
	    Assert.assertEquals(driver.findElement(By.linkText("Configuration")).isDisplayed(), true);
	}

	@Then("^Login users should see the Manage Employee tab\\.$")
	public void login_users_should_see_the_Manage_Employee_tab() throws Throwable {
	   Action.moveToElement(dashboardpage.configuration).perform();
	   Assert.assertEquals(dashboardpage.manageEmployees.isDisplayed(), true);
	}

	@Then("^Login user should see Manage Vendor tab$")
	public void login_user_should_see_Manage_Vendor_tab() throws Throwable {
		Action.moveToElement(dashboardpage.configuration).perform();
		Assert.assertEquals(dashboardpage.manageVendors.isDisplayed(), true);
	}

	@Then("^Login users should see the “Manage Employer” tab\\.$")
	public void login_users_should_see_the_Manage_Employer_tab() throws Throwable {
		 Action.moveToElement(dashboardpage.configuration).perform();
		 Assert.assertEquals(dashboardpage.manageEmployers.isDisplayed(), true);
	}
	
	@Given("^agency with different organization exist$")
	public void two_agency_with_different_organization_exist(DataTable credentials) throws Throwable {
		registerpage.clickRegister();
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{		registerpage.FillAllregisterdeatils(data.get("Name"), data.get("Email"), data.get("contactnumber"), data.get("UserType"), data.get("timezone"), data.get("country"));		
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(data.get("Email"), "12345");
			try {
			loginpage.updateProfile.isDisplayed();
			updateprofilepopuppage.UpdateProfile(data.get("Address"), data.get("organization"),"www."+data.get("organization")+".com" , "pune");
			}
			catch(NoSuchElementException e){
				loginpage.logoutFromAppK();	
			}
		}	
	}

	@Given("^An agency logged in to HireXpert$")
	public void an_agency_logged_in_to_HireXpert() throws Throwable {
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(prop.getProperty("agency"), "12345");
		loginpage.identifyUserK();
	}

	@When("^Org admin and Org status is active only this user can see configuration tab$")
	public void org_admin_and_Org_status_is_active_only_this_user_can_see_configuration_tab() throws Throwable {
	    Assert.assertEquals(driver.findElement(By.linkText("Configuration")).isDisplayed(), true);
	}

	@When("^go to the configuration tab  & click on the add manage Employee\\.$")
	public void go_to_the_configuration_tab_click_on_the_add_manage_Employee() throws Throwable {
		executor.executeScript("arguments[0].click();",dashboardpage.configuration );
//		executor.executeScript("arguments[0].click();",dashboardpage.manageEmployees );	
	}
	
	@When("^Click on add Button Fill all the mandatory details for Manage Employee$")
	public void click_on_add_Button_Fill_all_the_mandatory_details_for_Manage_Employee(DataTable credentials) throws Throwable {
		manageemployee.addEmployee(credentials);
	}
	
	@Then("^Agency should be able to add employee$")
	public void agency_should_be_able_to_add_employee() throws Throwable {
		
	}

	@Then("^Newly added employees should be displayed in Manage Employees\\.$")
	public void newly_added_employees_should_be_displayed_in_Manage_Employees() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'"+manageemployee.name+"')]")).isDisplayed(), true);	
	}

	@Then("^Employee status should be Active and admin value should be “No”\\.$")
	public void employee_status_should_be_Active_and_admin_value_should_be_No() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Admin']//following::td[contains(text(),'"+manageemployee.name+"')]//following::td[4]")).getText(), "No");
		Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Status']//following::td[contains(text(),'"+manageemployee.name+"')]//following::td[5]")).getText(), "Active");
	}

	@Then("^Agency should not be able to add another organization employee\\. It's showing an error message “This user already registered with another organization\\. So you can not add it as an employee in your organization ”$")
	public void agency_should_not_be_able_to_add_another_organization_employee_It_s_showing_an_error_message_This_user_already_registered_with_another_organization_So_you_can_not_add_it_as_an_employee_in_your_organization(DataTable credentials) throws Throwable {
		manageemployee.addEmployee(credentials);
	}

	@Then("^Agency should not be able to add duplicate employees\\. It’s showing an error message “Employee with email id… already exists\\.”$")
	public void agency_should_not_be_able_to_add_duplicate_employees_It_s_showing_an_error_message_Employee_with_email_id_already_exists() throws Throwable {
		Assert.assertEquals(driver.findElements(By.xpath("//td[contains(text(),'"+manageemployee.name+"')]")).size()>0, false);	
	}
}
