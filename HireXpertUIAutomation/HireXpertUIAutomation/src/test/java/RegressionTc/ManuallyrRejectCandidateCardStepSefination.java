package RegressionTc;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class ManuallyrRejectCandidateCardStepSefination extends baseclass{
	
	@Given("^Open browser$")
	public void open_browser() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^click on Employer-Agency SignIn link$")
	public void click_on_Employer_Agency_SignIn_link() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
	}

	@When("^login with Employer credential\\.$")
	public void login_with_Employer_credential() throws Throwable {
	    
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
		
		addjobpage.fillJobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill2();
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();
		
		Thread.sleep(3000);
		
		common.submitbtn.click();

	}

	@When("^Verify that job is added or not$")
	public void verify_that_job_is_added_or_not() throws Throwable {
	    
Thread.sleep(3000);
		
		driver.findElement(By.id("jobDropdown")).click();
		boolean jobdisplayed = driver.findElement(By.xpath("//option[contains(text(),'Engineer - Active')]")).isDisplayed();
		
		Assert.assertEquals(true, jobdisplayed);
		
		{         
			  try   
			  {    
			    if(driver.findElement(By.xpath("//option[contains(text(),'Engineer - Active')]")).isDisplayed())
			     
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

	@When("^Click on save button$")
	public void click_on_save_button() throws Throwable {
	    
		Thread.sleep(3000);
	       common.clickOnSaveBtn();
			Thread.sleep(3000);
			common.clickOnConfirmYes();
	}

	@When("^Verify candidate is displayed on workbench$")
	public void verify_candidate_is_displayed_on_workbench() throws Throwable {
	   
		Thread.sleep(3000);
		workbenchpage.verifyCandidateAddedDisplayedOnWorkbenchOrNot();
	}

	@Then("^click on close job button and delete the job$")
	public void click_on_close_job_button_and_delete_the_job() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.clickOnCloseJobButton();
		
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}


	@When("^login with Agency credential\\.$")
	public void login_with_Agency_credential() throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.agencylogin();
		
	}

	@When("^Add a new Job as agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_a_new_Job_as_agency(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
	   
		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.fillJobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
		
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
		
		Thread.sleep(1000);
		
		addjobpage.employerDropDown();
		
        Thread.sleep(3000);
		
		common.submitbtn.click();


	}
	
	@When("^Drag the candidate card from that column to rejected column$")
	public void drag_the_candidate_card_from_that_column_to_rejected_column1() throws Throwable {

      Thread.sleep(3000);
      
      workbenchpage.dragCandidateCardtoRejectColumn();
	}

	@When("^confirmation popup should diplay \"([^\"]*)\" with Yes and No button and click on Yes buton$")
	public void confirmation_popup_should_diplay_with_Yes_and_No_button_and_click_on_Yes_buton(String ActualcomfirmationMessage, String ExpectedconfirmationMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualcomfirmationMessage1 = driver.findElement(By.xpath("//div[@id='archiveMessage']")).getText();
		Assert.assertEquals(ExpectedconfirmationMessage, ActualcomfirmationMessage1);
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@When("^select the reason of rejection and cick on submit button$")
	public void select_the_reason_of_rejection_and_cick_on_submit_button() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.selectCandidateRejectionReason();
		
		Thread.sleep(1000);
		common.ClickSumbit();
	}

	@Then("^drag the candidate card from rejected column to any other column$")
	public void drag_the_candidate_card_from_rejected_column_to_any_other_column() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.dragCandidateCardfromRejectColumntoJoinedColumn();
		
	}

	@Then("^add a team member to employer$")
	public void add_a_team_member_to_employer() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.openTeamPage();
		Thread.sleep(3000);
		teampage.clickOnAddBtnK();
		Thread.sleep(3000);
		teampage.fillTeamMemberDetails();
		Thread.sleep(3000);
		common.ClickSumbit();
		
	}

	@Then("^logout with employer and login as employer team member$")
	public void logout_with_employer_and_login_as_employer_team_member() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		registerpage.loginwithEmployerTeamMember();
		
	}


	@Then("^logout as employer team member and login as employer$")
	public void logout_as_employer_team_member_and_login_as_employer() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
        registerpage.employerlogin();
	}

	@Then("^delete the team member$")
	public void delete_the_team_member() throws Throwable {
	   
		Thread.sleep(3000);
		teampage.deleteteamK();
		
	}

	@Then("^add a team member to agency$")
	public void add_a_team_member_to_agency() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.openTeamPage();
		Thread.sleep(3000);
		teampage.clickOnAddBtnK();
		Thread.sleep(3000);
		teampage.fillAgencyTeamMemberDetails();
		Thread.sleep(3000);
		common.ClickSumbit();
		
	}

	@Then("^logout with agency and login as agency team member$")
	public void logout_with_agency_and_login_as_agency_team_member() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		registerpage.loginwithAgencyTeamMember();
	}

	@Then("^logout as agency team member and login as agency$")
	public void logout_as_agency_team_member_and_login_as_agency() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
        registerpage.agencylogin();
	}
	
	
	
	
	
}
