package StepDefinationPackageTZ;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class EditDeleteCandidateStepDefination extends baseclass {
	
	@Given("^Open the browser$")
	public void open_the_browser() throws IOException  {
		
		baseclass.initialization();
	}

	@When("^login with Employer credential\\.$")
	public void login_with_Employer_credential() throws InterruptedException  {
		
		Thread.sleep(3000);
		registerpage.employerlogin();
	}

	@When("^Go to Workbench and select the job from drop down for which candidate is added\\.$")
	public void go_to_Workbench_and_select_the_job_from_drop_down_for_which_candidate_is_added() throws InterruptedException  {
		
		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectjobT();
	}


	@When("^Click on Edit Candidate icon on candidate card\\.$")
	public void click_on_Edit_Candidate_icon_on_candidate_card() throws InterruptedException {
		
		Thread.sleep(3000);
		candidatecardsectionpage.clickOnEditCandidateIcon();
	}

	@When("^Make the changes in \"([^\"]*)\" field$")
	public void make_the_changes_in_field(String ContactNumber)  {
	    
		editcandidatepage.EnterContactNumberT(ContactNumber);
	}
	
	@When("^Click on save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		editcandidatepage.saveButton.click();
		common.clickOnConfirmYes();
	}

	@Then("^click on Delete Candidate icon on Candidate card$")
	public void click_on_Delete_Candidate_icon_on_Candidate_card() throws InterruptedException  {
		
		Thread.sleep(3000);
		candidatecardsectionpage.candidateCardDeleteCandidateIcon.click();
		common.clickOnConfirmYes();
	}
	
	@When("^login with Agency credential\\.$")
	public void login_with_Agency_credential() throws InterruptedException {
		
		Thread.sleep(3000);
		registerpage.agencylogin();
	}
	
	@When("^Do changes in \"([^\"]*)\" field$")
	public void Do_changes_in_field(String NoticePeriod)  {
	    
		editcandidatepage.EnterNoticePeriodT(NoticePeriod);
	}

}
