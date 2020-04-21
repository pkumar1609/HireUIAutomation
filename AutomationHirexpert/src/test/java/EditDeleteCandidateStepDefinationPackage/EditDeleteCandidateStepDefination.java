package EditDeleteCandidateStepDefinationPackage;

import com.hirexpert.qa.base.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditDeleteCandidateStepDefination extends Testbase {
	
	@Given("^Open the browser$")
	public void open_the_browser()  {
		
		Testbase.initialization();
	   
	}

	@When("^login with Employer credential\\.$")
	public void login_with_Employer_credential()  {
		
		hp.employerlogin();
	   
	}

	@When("^Go to Workbench and select the job from drop down for which candidate is added\\.$")
	public void go_to_Workbench_and_select_the_job_from_drop_down_for_which_candidate_is_added() throws InterruptedException  {
		
		Thread.sleep(3000);
		wp.ClickWorkbenchbtn();
		
		wp.selectjob();
	   
	}


	@When("^Click on Edit Candidate icon on candidate card\\.$")
	public void click_on_Edit_Candidate_icon_on_candidate_card() throws InterruptedException {
		
		Thread.sleep(3000);
	   
		wp.clickEditCandidateIcon();
			
	}

	@When("^Make the changes in \"([^\"]*)\" field$")
	public void make_the_changes_in_field(String ContactNumber)  {
	    
		
		
	}
	
	
	
	@When("^Click on save button$")
	public void click_on_save_button() throws Throwable {
	   
	}


	@Then("^click on Delete Candidate icon on Candidate card$")
	public void click_on_Delete_Candidate_icon_on_Candidate_card() throws Throwable {
	    
	}



}
