package BVT_StepDefination;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class VerifyTabsDropdownAgencyLoginStepDefination extends baseclass {
	
	@Given("^Open browser$")
	public void open_browser() throws IOException  {
		
		baseclass.initialization(); 
	}

	@When("^login with Agency credential Who already have a Job added$")
	public void login_with_Agency_credential_Who_already_have_a_Job_added() throws InterruptedException {
		
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
	
	@When("^Add Candidate to that job \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_Candidate_to_that_job(String CandidateEmail, String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
	   
		Thread.sleep(2000);
		workbenchpage.addCandidateButton.click();
		Thread.sleep(2000);
		addcandidatepage.EntercandidateemailT(CandidateEmail);
		Thread.sleep(2000);
		addcandidatepage.FindButton.click();
		Thread.sleep(2000);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
		Thread.sleep(2000);
		common.clickOnSaveBtn();
		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}
		
}
