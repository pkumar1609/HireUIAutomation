package jobFunctionality;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class assignToAndAddedBy extends baseclass {
	
	@Then("^now move the candidate from New column to another column and and check the name for Added by field on candidate card$")
	public void now_move_the_candidate_from_New_column_to_another_column_and_and_check_the_name_for_Added_by_field_on_candidate_card() throws Throwable {
	    
		
	}

	@Then("^again move the candidate  to the next column and check the name for Added by field$")
	public void again_move_the_candidate_to_the_next_column_and_check_the_name_for_Added_by_field() throws Throwable {
	    
		
	}

	@Then("^name for Added by should remain same on candidate card$")
	public void name_for_Added_by_should_remain_same_on_candidate_card() throws Throwable {
	    
		
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
		String addedbyname = candidatecardpage.addedBy.getAttribute("title");
		System.out.println("\nAdded By name:" + addedbyname);
		
		String lasttwochars = addedbyname.substring(addedbyname.length()-2);
		if(lasttwochars.equals("01")) {
			
			System.out.println("Updated Added By name displayed on candidate card..");
		}
		else {
			
			System.out.println("Update Added By name not displayed on candidate card..");
		}
		
		//verify updated assign to name
		String assigntoname = candidatecardpage.assignTo.getAttribute("title");
		System.out.println("\nAssign To name:" + assigntoname);
		
		String lasttwochars1 = assigntoname.substring(assigntoname.length()-2);
		if(lasttwochars1.equals("01")) {
			
			System.out.println("Updated Assign To name displayed on candidate card..");
		}
		else {
			
			System.out.println("Update Assign To name not displayed on candidate card..");
		}
	}


}
