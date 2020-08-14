package BVT_StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class InterviewManagementBVTStepDefination extends baseclass {
	

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
	public void fill_all_interview_details_and_click_on_Submit_button(String Title, String ScheduleOn, String Hour, String Minute, String Duration, String TimeZone) throws Throwable {
	    
		Thread.sleep(1000);
		scheduleinterviewpage.title.sendKeys(Title);
		Thread.sleep(1000);
		scheduleinterviewpage.calendar.sendKeys(ScheduleOn);
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
	
	@When("^observe the interview date and time displayed on candidate card below Assign To field$")
	public void observe_the_interview_date_and_time_displayed_on_candidate_card_below_Assign_To_field() throws Throwable {
	    
		Thread.sleep(3000);
		String interview = candidatecardsectionpage.candidateCardInterviewDetails.getText();
		System.out.println("Interview Details on candidate card: " + interview);
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
	    
		candidatecardsectionpage.candidateCardEditInterview.click();
		Thread.sleep(3000);
	}
	
	@When("^make some changes in interview details and click on Submit button \"([^\"]*)\" \"([^\"]*)\"$")
	public void make_some_changes_in_interview_details_and_click_on_Submit_button(String hour, String duration) throws Throwable {

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
		
		System.out.println("\nUser able to update the scheduled interview details from Edit Interview icon of candidate card..");
	}

	@Then("^click on Edit Interview icon present on the left corner just beside of Cancel Interview icon$")
	public void click_on_Edit_Interview_icon_present_on_the_left_corner_just_beside_of_Cancel_Interview_icon() throws Throwable {
	    
		scheduleinterviewpage.editInterviewIcon.click();
		Thread.sleep(2000);
	}
	
	@Then("^make some changes and click on Submit button \"([^\"]*)\"$")
	public void make_some_changes_and_click_on_Submit_button(String scheduleon) throws Throwable {
	    
		scheduleinterviewpage.calendar.clear();
		Thread.sleep(1000);
		scheduleinterviewpage.calendar.sendKeys(scheduleon);
		Thread.sleep(1000);
		common.submitbtn.click();
		Thread.sleep(3000);
	}
	

	@Then("^updated details should display properly$")
	public void updated_details_should_display_properly() throws Throwable {
	    
		System.out.println("\nUser able to update interview details from Interview Details page..");
	}

	@Then("^click on Interviews tab$")
	public void click_on_Interviews_tab() throws Throwable {
	    
		dashboardpage.openInterviewsPage();
		Thread.sleep(3000);
	}

	@Then("^Select the filters for which you want candidate interview details and click on Search button$")
	public void select_the_filters_for_which_you_want_candidate_interview_details_and_click_on_Search_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		Select se = new Select(interviewspage.jobDropdown);
		se.selectByVisibleText(data.get(0).get(0));
		Thread.sleep(2000);
		interviewspage.fromdate.clear();
		interviewspage.fromdate.sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
		interviewspage.todate.clear();
		interviewspage.todate.sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
		interviewspage.searchButton.click();
	}

	@Then("^Interview details should be reflect according to the filter applied$")
	public void interview_details_should_be_reflect_according_to_the_filter_applied() throws Throwable {
	    
		Thread.sleep(1000);
		interviewspage.findInterviewDetails();
		Thread.sleep(1000);
		common.clickOnCloseBtn();
	}
	
	@Then("^click on close job button and delete the job$")
	public void click_on_close_job_button_and_delete_the_job() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.clickOnCloseJobButton();
		
//		Thread.sleep(3000);
//		common.clickOnConfirmYes();
		
	}

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
