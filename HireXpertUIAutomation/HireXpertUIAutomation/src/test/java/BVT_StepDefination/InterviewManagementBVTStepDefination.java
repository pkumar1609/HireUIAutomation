package BVT_StepDefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class InterviewManagementBVTStepDefination extends baseclass {
	
	WebElement calendar;
	String date;
	

	@When("^observe candidate is getting added in New column$")
	public void observe_candidate_is_getting_added_in_New_column() throws Throwable {
	    
		System.out.println("Candidate get added in New column");
	}

	@When("^click on Schedule Interview icon from candidate card$")
	public void click_on_Schedule_Interview_icon_from_candidate_card() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.scheduleInterview.click();
	}

	@When("^fill all interview details and click on Submit button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_interview_details_and_click_on_Submit_button(String Title, String Scheduleon, String Hour, String Minute, String Duration, String TimeZone) throws Throwable {
	    
		Thread.sleep(1000);
		scheduleinterviewpage.title.sendKeys(Title);
		Thread.sleep(1000);
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		common.enterdate(Scheduleon);
		Thread.sleep(1000);
		scheduleinterviewpage.hours.sendKeys(Hour);
		Thread.sleep(1000);
		scheduleinterviewpage.minutes.sendKeys(Minute);
		Thread.sleep(1000);
		
		Select se = new Select(scheduleinterviewpage.duration);
		se.selectByVisibleText(Duration);
		
		Thread.sleep(1000);
		se = new Select(scheduleinterviewpage.timezone);
		se.selectByVisibleText(TimeZone);
		
		Thread.sleep(1000);
		scheduleinterviewpage.interviewerDropDown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Select All')]")).click();
		Thread.sleep(1000);
		scheduleinterviewpage.interviewerDropDown.click();
		
		Thread.sleep(1000);
		common.ClickSumbit();
	}
	
	@When("^click on close button from Interview details page$")
	public void click_on_close_button_from_Interview_details_page() throws Throwable {
		Thread.sleep(2000);
		common.closebtn.click();
	}
	
//	@When("^observe the interview date and time displayed on candidate card below Assign To field$")
//	public void observe_the_interview_date_and_time_displayed_on_candidate_card_below_Assign_To_field() throws Throwable {
//		Assert.assertEquals(candidatecardsectionpage.candidateCardInterviewDetails.getText(), common.displaydateFormate(date););
//	}
	@Then("^Click on Reload job button$")
	public void click_on_Reload_job_button() throws Throwable {
	   Thread.sleep(3000);
		workbenchpage.ReloadJobButton.click();
	}
	
	@When("^observe the interview date and time displayed on candidate card below Assign To field \"([^\"]*)\"$")
	public void observe_the_interview_date_and_time_displayed_on_candidate_card_below_Assign_To_field(String ScheduleOn) throws Throwable {
		Thread.sleep(1000);
		System.out.println(candidatecardsectionpage.candidateCardInterviewDetails.getText().substring(0, candidatecardsectionpage.candidateCardInterviewDetails.getText().indexOf(',')));
		Assert.assertEquals(candidatecardsectionpage.candidateCardInterviewDetails.getText().substring(0, candidatecardsectionpage.candidateCardInterviewDetails.getText().indexOf(',')), ScheduleOn);
	}
	
	@When("^click on Reload Candidate button and observe$")
	public void click_on_Reload_Candidate_button_and_observe() throws Throwable {
	    
		workbenchpage.clickReloadCandidateButton();
		Thread.sleep(3000);
		String interview = candidatecardsectionpage.candidateCardInterviewDetails.getText();
		System.out.println("Interview Details on candidate card after reloading: " + interview);
	}

	@When("^click on Edit Interview icon in front of interview details like date and time$")
	public void click_on_Edit_Interview_icon_in_front_of_interview_details_like_date_and_time() throws Throwable {
		Thread.sleep(1000);
		candidatecardsectionpage.candidateCardEditInterview.click();
		
	}
	
	@When("^make some changes in interview details and click on Submit button \"([^\"]*)\" \"([^\"]*)\"$")
	public void make_some_changes_in_interview_details_and_click_on_Submit_button(String hour, String duration) throws Throwable {
		Thread.sleep(2000);
		scheduleinterviewpage.editInterviewIcon.click();
		scheduleinterviewpage.hours.clear();
		scheduleinterviewpage.hours.sendKeys(hour);
		Thread.sleep(1000);
		Select se = new Select(scheduleinterviewpage.duration);
		se.selectByVisibleText(duration);
		common.submitbtn.click();
		Thread.sleep(3000);
	}
	
	
	@Then("^User should be able to update scheduled interview details and updated details should display properly$")
	public void user_should_be_able_to_update_scheduled_interview_details_and_updated_details_should_display_properly() throws Throwable {
		
	}

	@Then("^click on Edit Interview icon present on the left corner just beside of Cancel Interview icon$")
	public void click_on_Edit_Interview_icon_present_on_the_left_corner_just_beside_of_Cancel_Interview_icon() throws Throwable {
		Thread.sleep(4000); 
		executor.executeScript("arguments[0].click();", scheduleinterviewpage.editInterviewIcon);
	}
	
	@Then("^make some changes and click on Submit button \"([^\"]*)\"$")
	public void make_some_changes_and_click_on_Submit_button(String scheduleon1) throws Throwable {	    
		Thread.sleep(4000);		
		executor.executeScript("arguments[0].click();", scheduleinterviewpage.ScheduleOnCalendarIcon);
		common.enterdate(scheduleon1);
		common.ClickSumbit();
	}
	
	@Then("^updated details should display properly \"([^\"]*)\"$")
	public void updated_details_should_display_properly(String scheduleon1) throws Throwable {
		Assert.assertEquals(candidatecardsectionpage.candidateCardInterviewDetails.getText().substring(0, candidatecardsectionpage.candidateCardInterviewDetails.getText().indexOf(',')), scheduleon1);
	}
	
	
	@Then("^now click on Schedule interview icon on candiadte card$")
	public void now_click_on_Schedule_interview_icon_on_candiadte_card() throws Throwable {
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", candidatecardsectionpage.scheduleInterview);

	}

	@Then("^click on Interviews tab$")
	public void click_on_Interviews_tab() throws Throwable {	    
		dashboardpage.openInterviewsPage();
		Thread.sleep(3000);
	}
	
	@Then("^Select the filters for which you want candidate interview details and click on Search button \"([^\"]*)\"$")
	public void select_the_filters_for_which_you_want_candidate_interview_details_and_click_on_Search_button(String scheduleon1) throws Throwable {
		Select se = new Select(interviewspage.jobDropdown);
		se.selectByVisibleText(addjobpage.jobname);
		Thread.sleep(2000);
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		common.enterdate(scheduleon1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Open Calendar'])[3]")).click();
		common.enterdate(scheduleon1);
		Thread.sleep(2000);
		interviewspage.searchButton.click();
	}

	
	
	@When("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {

		Thread.sleep(3000);
		addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
		
	}


	@Then("^Interview details should be reflect according to the filter applied$")
	public void interview_details_should_be_reflect_according_to_the_filter_applied() throws Throwable {
	    
		Thread.sleep(1000);
		interviewspage.findInterviewDetails();
		Thread.sleep(1000);
		common.clickOnCloseBtn();
	}
	
//	@When("^fill all the information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
//	public void fill_all_the_information_and(String CandidateEmail, String Name, String ContactNumber, String Designation, String  Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String  CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress, String relocate) throws Throwable {
//
//		Thread.sleep(3000);
//		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//		
//
//	}
	
	@Then("^click on close job button and delete the job$")
	public void click_on_close_job_button_and_delete_the_job() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.clickOnCloseJobButton();
		
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
		
	}

	
//Close All Job
	

	@When("^close all job$")
	public void close_all_job() throws Throwable {
		 Thread.sleep(2000);			 
//	     List<WebElement> allJobs = driver.findElements(By.xpath("//option"));	 	 
	     select = new Select(workbenchpage.jobDropDown);     
	     for(int i=1; i<=select.getOptions().size(); i++)
	     {			 
	    	 select.selectByIndex(i);
	    	 workbenchpage.clickOnCloseJobButton();
	     } 
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
