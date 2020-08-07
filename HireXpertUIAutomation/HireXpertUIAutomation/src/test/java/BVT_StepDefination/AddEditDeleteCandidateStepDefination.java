package BVT_StepDefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

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
	
	@When("^Add a new Job as employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_a_new_Job_as_employer(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
	    
		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.filljobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill2();
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();
		
		Thread.sleep(3000);
		
		common.submitbtn.click();

	}
	
	@When("^Add a new Job as agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_a_new_Job_as_agency(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
	    
		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.filljobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill2();
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();
		
		Thread.sleep(2000);
		
		addjobpage.clickaddemployericon();
		
		Thread.sleep(3000);
		
		addjobpage.fillEmployerDetailsPlusIcon();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn Cbtn-primary w-20'][contains(text(),'Submit')]")).click();
		
		Thread.sleep(1000);
		
		addjobpage.employerDropDown();
		
        Thread.sleep(3000);
        
        addjobpage.enteremployerorganizationname();
		
		Thread.sleep(3000);
		
		common.submitbtn.click();


	}
	
	@When("^Click on Edit Candidate icon on candidate card \"([^\"]*)\"$")
	public void click_on_Edit_Candidate_icon_on_candidate_card(String Name) throws Throwable {
	    
		Thread.sleep(3000);
		candidatecardsectionpage.clickOnEditCandidateIcon(Name);
	}

	@Then("^click on Delete Candidate icon on Candidate card \"([^\"]*)\"$")
	public void click_on_Delete_Candidate_icon_on_Candidate_card(String Name) throws Throwable {
	    
		Thread.sleep(3000);
		candidatecardsectionpage.clickOnDeleteCandidateIcon(Name);
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@When("^Verify that job is added or not \"([^\"]*)\"$")
		public void verify_that_job_is_added_or_not(String JobName) throws Throwable {

			Thread.sleep(3000);
			
			driver.findElement(By.id("jobDropdown")).click();
			boolean jobdisplayed = driver.findElement(By.xpath("//select[@id='jobDropdown']//following::option[text()='"+JobName+"')]")).isDisplayed();
			
			
			
//			"//option[contains(text(),'Engineer - EmpOrg - Active')]"
			Assert.assertEquals(true, jobdisplayed);
			
			{         
				  try   
				  {    
				    if(driver.findElement(By.xpath("//select[@id='jobDropdown']//following::option[text()='"+JobName+"')]")).isDisplayed())
				     
				    {      
				       System.out.println("Job got added Successfully");
				    }    
				  }      
				  catch(NoSuchElementException e)     
				  {       
					  System.out.println("Job not got added");
				  }       
				}
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
	
	@When("^upload candidate resume$")
    public void upload_candidate_resume() throws Throwable {
  
	Thread.sleep(3000);
   addcandidatepage.uploadResumeDocumentT();
  }

	@When("^Click on save button to save the update details$")
	public void click_on_save_button_to_save_the_update_details() throws Throwable {
		
		Thread.sleep(3000);
		editcandidatepage.ClickOnSaveBtntoSavetheupdatedDetails();
		Thread.sleep(3000);
		common.clickOnConfirmYes();
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

	@When("^Make the changes in \"([^\"]*)\" field$")
	public void make_the_changes_in_field(String contactnumber) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterContactNumberT(contactnumber);
	}
	
	@When("^Click on save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
       common.clickOnSaveBtn();
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}
	
	@When("^login with Agency credential\\.$")
	public void login_with_Agency_credential() throws InterruptedException {
		
		Thread.sleep(3000);
		registerpage.agencylogin();
	}
	
	@When("^Do changes in \"([^\"]*)\" field$")
	public void Do_changes_in_field(String noticeperiod) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterNoticePeriodT(noticeperiod);
	}


	@Then("^click on close job button and delete the job$")
	public void click_on_close_job_button_and_delete_the_job() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.clickOnCloseJobButton();
		
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();

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

	@When("^Verify candidate is displayed on workbench$")
	public void verify_candidate_is_displayed_on_workbench() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.verifyCandidateAddedDisplayedOnWorkbenchOrNot();
		
	}

	@Then("^Verify candidate is displayed on workbench after deleting$")
	public void verify_candidate_is_displayed_on_workbench_after_deleting() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.verifyDeletedCandidateNotDisplayedOnWorkbench();
	}

}
