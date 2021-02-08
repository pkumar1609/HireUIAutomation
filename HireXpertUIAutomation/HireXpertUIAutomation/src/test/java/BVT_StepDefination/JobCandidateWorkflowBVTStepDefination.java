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

//	@When("^Add a new Job as employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void add_a_new_Job_as_employer(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
//
//		Thread.sleep(3000);
//		addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
//	}
	
//	@When("^Add a new Job as agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void add_a_new_Job_as_agency(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
//
//		Thread.sleep(3000);
//		addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
//
//	}

	
	@When("^Click on Add Candidate button$")
	public void click_on_Add_Candidate_button() throws Throwable {

         Thread.sleep(3000);		
		workbenchpage.clickOnAddCandidate();
	}

//	@Then("^click on employer tab and delete the employer if login as agency$")
//	public void click_on_employer_tab_and_delete_the_employer_if_login_as_agency() throws Throwable {
//	   
//		Thread.sleep(3000);
//		workbenchpage.deleteEmployerfromEmployerTabasAgency();
//	}

	
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
    addcandidatepage.uploadResumeDocumentT();
  }

	@When("^Click on save button to save the update details$")
	public void click_on_save_button_to_save_the_update_details() throws Throwable {
		
		Thread.sleep(3000);
		editcandidatepage.ClickOnSaveBtntoSavetheupdatedDetails();
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
	}


	@When("^click on find button$")
	public void click_on_find_button() throws Throwable {

          Thread.sleep(3000);
		
		 addcandidatepage.clickonFindbtn();
	}

//	@When("^fill all the information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
//	public void fill_all_the_information_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod, String LastWorkingDay, String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
//	    
//		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//		
//		
//	}
	
	
	@When("^fill all the information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_all_the_information_and(String profiletitle,String CandidateEmail, String Name, String ContactNumber, String Designation, String  Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String  CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress, String relocate) throws Throwable {
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentT();
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
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
		
	}
	
	@When("^Do changes in \"([^\"]*)\" field$")
	public void Do_changes_in_field(String noticeperiod) throws InterruptedException  {
	    
		Thread.sleep(3000);
		editcandidatepage.EnterNoticePeriodT(noticeperiod);
	}


//	@Then("^click on close job button and delete the job$")
//	public void click_on_close_job_button_and_delete_the_job() throws Throwable {
//
//		Thread.sleep(3000);
//		workbenchpage.clickOnCloseJobButton();
//		
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
//
//	}
	
	
//	@Then("^click on employer tab and delete the employer$")
//	public void click_on_employer_tab_and_delete_the_employer() throws Throwable {
//
//		dashboardpage.openEmployersPage();
//		Thread.sleep(5000);
//		employerspage.searchEmployer();	
//		Thread.sleep(3000);
//		employerspage.deleteSearchedEmployer();
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
//		
//
//	}

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

//	@When("^Go to Workbench tab and select one job from job drop down$")
//	public void go_to_Workbench_tab_and_select_one_job_from_job_drop_down() throws InterruptedException {
//		
//		Thread.sleep(4200);
//		dashboardpage.openWorkbenchPage();
//		workbenchpage.selectjobT();
//	}
	
	@Then("^Select the same job from job drop down \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_the_same_job_from_job_drop_down(String Title, String OrganizationName) throws Throwable {

//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@title='Reload Job']")).click();
		Thread.sleep(5000);
        workbenchpage.selectjobT(Title, OrganizationName);

	}


	@When("^Click on Questionnaire tab$")
	public void click_on_Questionnaire_tab() throws InterruptedException {
		
		Thread.sleep(3000);
		workbenchpage.clickonAddQuestionarybtn();
	}
	
	@When("^Enter a \"([^\"]*)\" and enter \"([^\"]*)\" accordingly to that question$")
	public void enter_a_and_enter_accordingly_to_that_question(String Question, String Marks) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddQuestionT(Question);
		addquestionarypage.AddTotalMarksT(Marks);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\" accordingly to the answer$")
	public void enter_the_answer_and_enter_Marks_accordingly_to_the_answer(String answer1, String answer2, String marks1, String marks2) throws Throwable {
	    
		Thread.sleep(3000);
		addquestionarypage.AddAnswersT(answer1, answer2);
		addquestionarypage.AddMarksT(marks1, marks2);
	}
	
	@When("^Enter the cutoff & rejection percentage \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_the_cutoff_rejection_percentage(String cuttoffpercentage, String rejectionpercentage) throws InterruptedException {
	    
		Thread.sleep(3000);
        addquestionarypage.EntercuttoffPercentageT(cuttoffpercentage);
        Thread.sleep(3000);
        addquestionarypage.EnterRejectionPercentageT(rejectionpercentage);
	}
	   
	@When("^Click on edit button of question to edit the following question \"([^\"]*)\" and save the changes by clicking on Save Changes button$")
	public void click_on_edit_button_of_question_to_edit_the_following_question_and_save_the_changes_by_clicking_on_Save_Changes_button(String question) throws InterruptedException  {
	   
        Thread.sleep(3000);
        addquestionarypage.questionaryEditIcon.click();
        addquestionarypage.EditQuestionT(question);
        addquestionarypage.SaveChangesBtn.click();
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
	    
		Thread.sleep(3000);
		addquestionarypage.SubmitBtn.click();
	}
	
	@When("^Enter first question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_first_question_and_marks(String QUESTION1, String QMARKS1) throws InterruptedException  {
		
		Thread.sleep(3000);
        addquestionarypage.AddQUESTION1(QUESTION1);
        addquestionarypage.AddMARKS1(QMARKS1);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for first question$")
	public void enter_the_answer_and_enter_Marks_for_first_question(String ANSWER1, String ANSWER2, String MARKS1, String MARKS2) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
	}


	@When("^Enter second question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_second_question_and_marks(String QUESTION2, String QMARKS2) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddQUESTION2(QUESTION2);
		addquestionarypage.AddMARKS2(QMARKS2);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for second question$")
	public void enter_the_answer_and_enter_Marks_for_second_question(String ANSWER3, String ANSWER4, String MARKS3, String MARKS4) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddANSWERS2(ANSWER3, ANSWER4);
		addquestionarypage.AddMARKS2(MARKS3, MARKS4);
	}

	@When("^Enter thrid question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_thrid_question_and_marks(String QUESTION3, String QMARKS3) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddQUESTION3(QUESTION3);
		addquestionarypage.AddMARKS3(QMARKS3);;
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\"  for thrid question$")
	public void enter_the_answer_and_enter_Marks_for_thrid_question(String ANSWER5, String ANSWER6, String MARKS5, String MARKS6) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddANSWERS3(ANSWER5, ANSWER6);
		addquestionarypage.AddMARKS3(MARKS5, MARKS6);
	}

	
	@When("^click on delete icon to delete any one of question$")
	public void click_on_delete_icon_to_delete_any_one_of_question() throws InterruptedException  {
		
		Thread.sleep(3000);
		common.deletebtn.get(1).click();
	}
	
	
	@When("^Click on Delete Questionnarie button$")
	public void click_on_Delete_Questionnarie_button() throws InterruptedException {
	   
		Thread.sleep(3000);
		addquestionarypage.DeleteQuestionnarie.click();
		common.clickOnConfirmYes();
		}
		
	@When("^click on ReloadCandidate button$")
	public void click_on_ReloadCandidate_button() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.candidate.click();
		workbenchpage.ReloadCandidateButton.click();
	}
	
	@When("^Verify Collect Answer icon when no questionary is added for that job$")
	public void verify_Collect_Answer_icon_when_no_questionary_is_added_for_that_job() throws Throwable {
	    
		List<WebElement> collectanswericon = driver.findElements(By.xpath("//button[@title='Collect Answer']"));
		Assert.assertEquals(collectanswericon.size()>0, false);	}
	

	@Then("^Click on  Collect Answers icon on candidate card$")
	public void Click_on_Collect_Answers_icon_on__candidate_card() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.candidateCardCollectAnswericon.click();
		
	}

	@Then("^answer the question by selecting the provided options$")
	public void answer_the_question_by_selecting_the_provided_options() throws Throwable {

		Thread.sleep(4200);
		addquestionarypage.answerthequestion();
		common.ClickSumbit();
	}

	@Then("^verify if the answer is correct it should display pass icon on candidate card or it should display fail icon if the asnswer is wrong with the candidate card in screened column$")
	public void verify_if_the_answer_is_correct_it_should_display_pass_icon_on_candidate_card_or_it_should_display_fail_icon_if_the_asnswer_is_wrong_with_the_candidate_card_in_screened_column() throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.verifypassfailicon();
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

	@Then("^click on that Questionnaire tab and verify the answers given by employer$")
	public void click_on_that_Questionnaire_tab_and_verify_the_answers_given_by_employer() throws Throwable {


		Thread.sleep(3000);
		candidatedashboardpage.ClickonQuestionnairetab();
	}
	
	
	@When("^login with Employer credential$")
	public void login_with_Employer_credential() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.employerlogin();
	}



//	@When("^Go to Workbench tab and select the job from job drop down$")
//	public void go_to_Workbench_tab_and_select_the_job_from_job_drop_down() throws InterruptedException {
//		
//		Thread.sleep(3000);
//		dashboardpage.openWorkbenchPage();
//		workbenchpage.selectjobT();
//	}
	


	@When("^Click on Add Questionnaire$")
	public void click_on_Add_Questionnaire() throws InterruptedException {
		
		Thread.sleep(3000);
		workbenchpage.job.click();
		workbenchpage.AddQuestionarybtn.click();
	}
	
	@When("^Add question and click on save changes button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_question_and_click_on_save_changes_button(String QUESTION1 , String QMARKS1, String ANSWER1, String ANSWER2, String MARKS1, String MARKS2) throws Throwable {
	    
		Thread.sleep(3000);
		addquestionarypage.AddQUESTION1(QUESTION1);
		addquestionarypage.AddMARKS1(QMARKS1);
		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
		addquestionarypage.SaveChangesBtn.click();
	}


	@When("^Click on  Collect Answers icon on candidate card\\.$")
	public void click_on_Collect_Answers_icon_on_candidate_card() throws Throwable {
		
		Thread.sleep(3000);
		workbenchpage.candidateCardCollectAnswericon.click();
	}

	
	@When("^Fill all the Questions answers \"([^\"]*)\"$")
	public void fill_all_the_Questions_answers(String answer) throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='"+answer+"']//following::span")).click();
	}

	@When("^Click on screening tab$")
	public void click_on_screening_tab() throws Throwable {

		Thread.sleep(2000);
		workbenchpage.job.click();
        workbenchpage.ClickonScreeningBtn();
	}

	@Then("^verify the status of candidate$")
	public void verify_the_status_of_candidate() throws Throwable {
	    
		
		{         
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
		}

	@Given("^Open browser$")
	public void open_browser() throws IOException, AWTException, InterruptedException {
		
		baseclass.initialization(); 
		driver.navigate().refresh();
	}

	
	@When("^login with Agency credential$")
	public void login_with_Agency_credential() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.agencylogin();
		
	}

//	@When("^Click on Workbench tab and select job from job drop down$")
//	public void click_on_Workbench_tab_and_select_job_from_job_drop_down() throws Throwable {
//	    
//
//		Thread.sleep(3000);
//		dashboardpage.openWorkbenchPage();
//		workbenchpage.selectjobT();
//	}


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

	@When("^Fill all mandatory details \\\"([^\\\"]*)\\\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_mandatory_details(String title, String scheduleon, String hour, String minute, String interviewduration, String timezone, String interviewer) throws Throwable {
		
		Thread.sleep(3000);
		scheduleinterviewpage.title.sendKeys(title);
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		common.enterdate(scheduleon);
		scheduleinterviewpage.hours.sendKeys(hour);
		scheduleinterviewpage.minutes.sendKeys(minute);
		Select se = new Select(scheduleinterviewpage.duration);
		se.selectByVisibleText(interviewduration);
		se = new Select(scheduleinterviewpage.timezone);
		se.selectByVisibleText(timezone);
//		scheduleinterviewpage.interviewerDropDown.click();
		
		common.ClickSumbit();

	}

	
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
		addcandidatepage.uploadResumeDocumentT();
//		common.clickOnSaveBtn();
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
	}

	

}

