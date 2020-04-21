package addAndDeleteEmployer;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class addAndDeleteEmployerSteps extends baseclass {
	
	
	
	@Given("^User is on Home page of application$")
	public void user_is_on_Home_page_of_application() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^title of page is \"([^\"]*)\"$")
	public void title_of_page_is(String arg1) throws Throwable {
	    
		String title = loginpage.validateTitle();
		System.out.println("Title of page: " + title);
	}

	@When("^enter valid user email address and password for registered agency and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_registered_agency_and_click_on_Sign_in_button() throws Throwable {
	    
		loginpage.signInAgency();
		Thread.sleep(6000);
	}

	@When("^click on Workbench tab$")
	public void click_on_Workbench_tab() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
	}

	@When("^click on Add Job button and fill mandatory details$")
	public void click_on_Add_Job_button_and_fill_mandatory_details() throws Throwable {
	    
		workbenchpage.AddJob();
		Thread.sleep(2000);
		addjobpage.validateJobPageTitle();
		addjobpage.fillDetails();
		addjobpage.addNewSkill1();
		addjobpage.addNewSkill2();
		addjobpage.deleteSkills();
	}

	@When("^Click on plus button in front of employer field$")
	public void click_on_plus_button_in_front_of_employer_field() throws Throwable {
	    
		Thread.sleep(2000);
		addjobpage.employerplusicon.click();
		Thread.sleep(3000);
	}

	@When("^Fill the employer details & click on submit button$")
	public void fill_the_employer_details_click_on_submit_button() throws Throwable {
	    
		addjobpage.fillEmployerDetailsPlusIcon();
		addjobpage.fillEmployerEmailPlusIcon();
		
		
		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")).click();
		System.out.println("Agency added new employer for the job..");
	}

	@When("^Now click on employer field drop down and select added employer name$")
	public void now_click_on_employer_field_drop_down_and_select_added_employer_name() throws Throwable {
	    
		addjobpage.employerDropDown();
	}

	@When("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    
		Thread.sleep(2000);
		addjobpage.clickOnSubmitButton();
		Thread.sleep(3000);
	}

	@When("^click on Employers tab at the top$")
	public void click_on_Employers_tab_at_the_top() throws Throwable {
	    
		dashboardpage.openEmployersPage();
		Thread.sleep(3000);
	}

	@Then("^agency should able to add employer and added employer should reflect in Employer drop down on Add Job page and Employer tab$")
	public void agency_should_able_to_add_employer_and_added_employer_should_reflect_in_Employer_drop_down_on_Add_Job_page_and_Employer_tab() throws Throwable {
	    
		employerspage.searchEmployer();	
	}

	@Then("^Click on Delete icon in front of employer for which job is added$")
	public void click_on_Delete_icon_in_front_of_employer_for_which_job_is_added() throws Throwable {
	    
		employerspage.deleteSearchedEmployer();
	}

	@Then("^agency should not able to delete employer which is link to job and error message should display$")
	public void agency_should_not_able_to_delete_employer_which_is_link_to_job_and_error_message_should_display() throws Throwable {
	    
		System.out.println("Error message should display like: Job is added for this employer. to delete it first you need to close the jos for this employer and then delete.");
		driver.findElement(By.id("alertModalCloseBtn"));
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(5000);
		driver.quit();
	}


}
