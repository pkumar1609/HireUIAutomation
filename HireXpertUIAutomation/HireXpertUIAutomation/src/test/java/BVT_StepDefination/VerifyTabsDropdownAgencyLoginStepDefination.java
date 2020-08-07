package BVT_StepDefination;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class VerifyTabsDropdownAgencyLoginStepDefination extends baseclass {
	
	@Given("^Open browser$")
	public void open_browser() throws IOException {
		
		baseclass.initialization(); 
	}

	@When("^login with Agency credential$")
	public void login_with_Agency_credential() throws InterruptedException {
		
		Thread.sleep(3000);
		registerpage.agencylogin();
	}

	@When("^Click on Workbench tab and select job from job drop down$")
	public void click_on_Workbench_tab_and_select_job_from_job_drop_down() throws Throwable {
	    

		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectjobT();
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

	@When("^Click interviewer from Interviewer drop down \"([^\"]*)\"$")
	public void Click_interviewer_from_Interviewer_drop_down(String interviewer) throws Throwable {
	    
		Thread.sleep(3000);
		scheduleinterviewpage.SelectinterviewerT(interviewer);
	}

	@When("^Fill all mandatory details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_mandatory_details(String title, String scheduleon, String hour, String minute, String interviewduration, String timezone) throws Throwable {
		
		Thread.sleep(3000);
		scheduleinterviewpage.EnterInterviewTitleT(title);
		scheduleinterviewpage.ScheduleInterviewOnT(scheduleon);
		scheduleinterviewpage.EnterInterviewTimeT(hour, minute);
		scheduleinterviewpage.EnterInterviewDurationT(interviewduration);
		scheduleinterviewpage.EnterTimezoneT(timezone);
	}

	@When("^Click on submit\\.$")
	public void click_on_submit() throws Throwable {
		
		Thread.sleep(3000);
		common.submitbtn.click();
		
	}
	
	@When("^Add Candidate to that job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_Candidate_to_that_job_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.addCandidateButton.click();
		Thread.sleep(3000);
		addcandidatepage.EntercandidateemailT(CandidateEmail);
		Thread.sleep(3000);
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		Thread.sleep(3000);
//		addcandidatepage.clickUploadResumeField();
//		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentT();
//		common.clickOnSaveBtn();
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
	}
}
