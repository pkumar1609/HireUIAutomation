package BVT_StepDefination;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class JobCandidateWorkflowBVTStepDefination extends baseclass {
	
	@Given("^Open the browser$")
	public void open_the_browser() throws IOException, AWTException, InterruptedException  {
		
		baseclass.initialization();
	}

	
	@When("^Go to Workbench$")
	public void go_to_Workbench() throws Throwable {
		dashboardpage.openWorkbenchPage();
		if(common.okbtnPopup.size()>0)
		{
			common.clickOnOKBtn();
		}
	}

	
	@When("^Click on Add Candidate button$")
	public void click_on_Add_Candidate_button() throws Throwable {

         Thread.sleep(3000);		
		workbenchpage.clickOnAddCandidate();
	}

	
	@When("^Click on Edit Candidate icon on candidate card \"([^\"]*)\"$")
	public void click_on_Edit_Candidate_icon_on_candidate_card(String Name) throws Throwable {
	    
		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
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
									
			Assert.assertEquals(true, jobdisplayed);
			    
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

	@When("^Select the same job from job drop down$")
	public void select_the_same_job_from_job_drop_down() throws Throwable {

           Thread.sleep(3000);
           workbenchpage.selectJobK();
	}

	@When("^Enter valid \"([^\"]*)\"$")
	public void enter_valid(String CandidateEmail) throws Throwable {
		Thread.sleep(3000);		
		addcandidatepage.EntercandidateemailT(CandidateEmail);
	}
	
	@When("^upload candidate resume$")
    public void upload_candidate_resume() throws Throwable {  
	Thread.sleep(3000);
    addcandidatepage.uploadResumeDocument();
  }

	@When("^Click on save button to save the update details$")
	public void click_on_save_button_to_save_the_update_details() throws Throwable {
		
		Thread.sleep(3000);
		editcandidatepage.ClickOnSaveBtntoSavetheupdatedDetails();
	}

	@When("^click on find button$")
	public void click_on_find_button() throws Throwable {

          Thread.sleep(3000);		
		 addcandidatepage.clickonFindbtn();
	}
	
	@When("^fill all the information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_all_the_information_and(String profiletitle,String CandidateEmail, String Name, String ContactNumber, String Designation, String  Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String  CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress, String relocate) throws Throwable {
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocument();
	}

	@When("^if confirmation popup is displayed click on ok button$")
	public void if_confirmation_popup_is_displayed_click_on_ok_button() throws Throwable {

		Thread.sleep(3000); 
		addcandidatepage.probabilitypopupwhileaddingcandidate();
	}

	@When("^Make the changes in \"([^\"]*)\" field$")
	public void make_the_changes_in_field(String contactnumber1) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterContactNumberT(contactnumber1);
	}
	
	@When("^Click on save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
       common.clickOnSaveBtn();		
	}
	
	@When("^Do changes in \"([^\"]*)\" field$")
	public void Do_changes_in_field(String noticeperiod) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterNoticePeriodT(noticeperiod);
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
	
	@When("^click on Save Changes button$")
	public void click_on_Save_Changes_button() throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.clickOnSaveChangesButton();
	}

	@Then("^Collect Answer icon should reflect on candidates card for giving answers$")
	public void collect_Answer_icon_should_reflect_on_candidates_card_for_giving_answers() throws Throwable {

		Thread.sleep(3000);
		WebElement collectanswericon = driver.findElement(By.xpath("//button[@title='Collect Answer']"));
		Assert.assertEquals(collectanswericon.isDisplayed(), true);
	} 
	
	@Then("^Collect Answer icon should not reflect on candidates card for giving answers$")
	public void collect_Answer_icon_should_not_reflect_on_candidates_card_for_giving_answers() throws Throwable {
		Thread.sleep(3000);
		boolean collectanswericon = driver.findElements(By.xpath("//button[@title='Collect Answer']")).size()>0;
		Assert.assertEquals(collectanswericon, false);
	}

	@When("^Login with Employer credential Who already have a Job added and a candidate added to that job$")
	public void login_with_Employer_credential_Who_already_have_a_Job_added_and_a_candidate_added_to_that_job() throws Throwable {
	    
		Thread.sleep(4200);
		registerpage.employerlogin();
	}

	@Then("^Select the same job from job drop down \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_the_same_job_from_job_drop_down(String Title, String OrganizationName) throws Throwable {

//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@title='Reload Job']")).click();
		Thread.sleep(5000);
        workbenchpage.selectjobT(Title, OrganizationName);
	}
	
	@When("^click on ReloadCandidate button$")
	public void click_on_ReloadCandidate_button() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.candidate.click();
		Thread.sleep(2000);
		workbenchpage.ReloadCandidateButton.click();
	}	
	
	@Then("^login as the same candidate \"([^\"]*)\" \"([^\"]*)\" and click on Sign in$")
	public void login_as_the_same_candidate_and_click_on_Sign_in(String arg1, String arg2) throws Throwable {

		Thread.sleep(3000);
		registerpage.loginwithsamecandidate();
	}

	@Then("^verify on candidate dashboard that job is displayed with Questionnaire tab or not$")
	public void verify_on_candidate_dashboard_that_job_is_displayed_with_Questionnaire_tab_or_not() throws Throwable {
	    
		Thread.sleep(3000);
		candidatedashboardpage.verifyQuestionaryicononcandidatedashboard();
	}

	@When("^login with Employer credential$")
	public void login_with_Employer_credential() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.employerlogin();
	}


	@Then("^verify the status of candidate$")
	public void verify_the_status_of_candidate() throws Throwable {
        
			  try   
			  {    
			    if(driver.findElement(By.xpath("//td[contains(text(),'Failed')]")).isDisplayed())
			     
			    {      
			       System.out.println("As Candidate gave wrong answer his status is displayed as Failed on Screening details page.");
			    }    
			  }      
			  catch(NoSuchElementException e)     
			  {       
				  System.out.println("As Candidate gave correct answer his status is displayed as Passed on Screening details page.");
			  }       			
		}

	@Given("^Open browser$")
	public void open_browser() throws IOException, AWTException, InterruptedException {
		Thread.sleep(3000);
		baseclass.initialization();
		driver.navigate().refresh();  
	}

	
	@When("^login with Agency credential$")
	public void login_with_Agency_credential() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.agencylogin();
		
	}

	@When("^Verify that Questionnarie and Screening tab is not displayed when login with Agency$")
	public void verify_that_Questionnarie_and_Screening_tab_is_not_displayed_when_login_with_Agency() throws Throwable {
		
		Thread.sleep(3000);
		workbenchpage.verifyQuestionnarieScreeningTabT();
	}

	@When("^Click on Schedule interview icon$")
	public void click_on_Schedule_interview_icon() throws Throwable {
		
		Thread.sleep(3000);
		workbenchpage.scheduleInterview.click();
	}
	
	@When("^click on close button$")
	public void click_on_close_button() throws Throwable {
		
		Thread.sleep(3000);
		common.clickOnCloseBtn();
	}

//	@When("^Click interviewer from Interviewer drop down \"([^\"]*)\"$")
//	public void Click_interviewer_from_Interviewer_drop_down(String interviewer) throws Throwable {
//	    
//		Thread.sleep(3000);
//		scheduleinterviewpage.SelectInterviewer;
//	}

//	@When("^Fill all mandatory details \\\"([^\\\"]*)\\\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void fill_all_mandatory_details(String title, String scheduleon, String hour, String minute, String interviewduration, String timezone, String interviewer) throws Throwable {
//		
//		Thread.sleep(3000);
//		scheduleinterviewpage.title.sendKeys(title);
//		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
//		common.enterdate(scheduleon);
//		scheduleinterviewpage.hours.sendKeys(hour);
//		scheduleinterviewpage.minutes.sendKeys(minute);
//		Select se = new Select(scheduleinterviewpage.duration);
//		se.selectByVisibleText(interviewduration);
//		se = new Select(scheduleinterviewpage.timezone);
//		se.selectByVisibleText(timezone);
////		scheduleinterviewpage.interviewerDropDown.click();
//		
//		common.ClickSumbit();
//
//	}

	
	@When("^Add Candidate to that job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_Candidate_to_that_job_and(String profiletitle,String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay, String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.addCandidateButton.click();
		Thread.sleep(3000);
		addcandidatepage.EntercandidateemailT(CandidateEmail);
		Thread.sleep(3000);
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		Thread.sleep(3000);
//		addcandidatepage.clickUploadResumeField();
//		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocument();
//		common.clickOnSaveBtn();
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
	}

	
}

