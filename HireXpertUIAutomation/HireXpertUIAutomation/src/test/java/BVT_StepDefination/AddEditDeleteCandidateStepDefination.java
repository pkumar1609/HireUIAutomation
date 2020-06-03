package BVT_StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class AddEditDeleteCandidateStepDefination extends baseclass {
	
	@Given("^Open the browser$")
	public void open_the_browser() throws IOException  {
		
		baseclass.initialization();
	}

	@When("^login with Employer credential\\.$")
	public void login_with_Employer_credential() throws InterruptedException  {
		
		Thread.sleep(3000);
		registerpage.employerlogin();
	}
	
	@When("^Go to Workbench$")
	public void go_to_Workbench() throws Throwable {

		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();

	}
	
	@When("^Add a new Job as employer$")
	public void add_a_new_Job_as_employer() throws Throwable {

		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.fillDetails();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill2();
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();
		
		Thread.sleep(3000);
		
		common.submitbtn.click();

	}
	
	@When("^Add a new Job as agency$")
	public void add_a_new_Job_as_agency() throws Throwable {

		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.fillDetails();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill2();
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();
		
		Thread.sleep(2000);
		
		addjobpage.employerplusicon.click();
		
		Thread.sleep(3000);
		
		addjobpage.fillEmployerDetailsPlusIcon();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")).click();
		
		Thread.sleep(3000);
		
		addjobpage.employerDropDown();
		
        Thread.sleep(3000);
		
		common.submitbtn.click();

	}

	@When("^Select the same job from job drop down$")
	public void select_the_same_job_from_job_drop_down() throws Throwable {

           Thread.sleep(3000);

           workbenchpage.selectJob();
	}

	@When("^Click on Add Candidate button\\.$")
	public void click_on_Add_Candidate_button() throws Throwable {

		Thread.sleep(3000);
		
		workbenchpage.clickOnAddCandidate();

	}

	@When("^Enter valid \"([^\"]*)\"$")
	public void enter_valid(String CandidateEmail) throws Throwable {

		Thread.sleep(3000);
		
		addcandidatepage.EntercandidateemailT(CandidateEmail);

	}

	@When("^click on find button$")
	public void click_on_find_button() throws Throwable {

          Thread.sleep(3000);
		
		 addcandidatepage.clickonFindbtn();
	}

	@When("^fill all the information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_the_information(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	   
	}


	@When("^Click on Edit Candidate icon on candidate card\\.$")
	public void click_on_Edit_Candidate_icon_on_candidate_card() throws InterruptedException {
		
		Thread.sleep(3000);
		candidatecardsectionpage.clickOnEditCandidateIcon();
	}

	@When("^Make the changes in \"([^\"]*)\" field$")
	public void make_the_changes_in_field(String ContactNumber) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterContactNumberT(ContactNumber);
	}
	
	@When("^Click on save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		editcandidatepage.saveButton.click();
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@Then("^click on Delete Candidate icon on Candidate card$")
	public void click_on_Delete_Candidate_icon_on_Candidate_card() throws InterruptedException  {
		
		Thread.sleep(3000);
		candidatecardsectionpage.candidateCardDeleteCandidateIcon.click();
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}
	
	@When("^login with Agency credential\\.$")
	public void login_with_Agency_credential() throws InterruptedException {
		
		Thread.sleep(3000);
		registerpage.agencylogin();
	}
	
	@When("^Do changes in \"([^\"]*)\" field$")
	public void Do_changes_in_field(String NoticePeriod) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterNoticePeriodT(NoticePeriod);
	}


	@Then("^click on close job button and delete the job$")
	public void click_on_close_job_button_and_delete_the_job() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.clickOnCloseJobButton();
		
		Thread.sleep(3000);
		common.clickOnConfirmYes();

	}


	@Then("^click on employer tab and delete the employer$")
	public void click_on_employer_tab_and_delete_the_employer() throws Throwable {

		dashboardpage.openEmployersPage();
		Thread.sleep(3000);
		employerspage.searchEmployer();	
		Thread.sleep(2000);
		employerspage.deleteSearchedEmployer();
		Thread.sleep(2000);
		common.clickOnConfirmYes();
		

	}


}