
package BVT_StepDefination;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class InterviewManagementBVTStepDefination extends baseclass {
	
	boolean information=false;
	String date;
	public static String interviewDate;
	Calendar calendar;
	
	@When("^observe candidate is getting added in New column$")
	public void observe_candidate_is_getting_added_in_New_column() throws Throwable {	    
		System.out.println("Candidate get added in New column");
	}

	@When("^click on Schedule Interview icon from candidate card$")
	public void click_on_Schedule_Interview_icon_from_candidate_card() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.scheduleInterview.click();
	}

	@SuppressWarnings("deprecation")
	@When("^fill all interview details and click on Submit button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_interview_details_and_click_on_Submit_button(String Title, String Scheduleon, String Hour1, String Minute1, String Duration, String TimeZone, String interviewerName, String interviewerEmail) throws Throwable {
	    
		Thread.sleep(4000);
		scheduleinterviewpage.title.sendKeys(Title);
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		
		calendar = Calendar.getInstance();
//		calendar.add(Calendar.HOUR_OF_DAY, +1);
		calendar.add(Calendar.MINUTE, +20);

		interviewDate = calendar.getTime().getDate()+"/"+Integer.valueOf(calendar.getTime().getMonth()+1)+"/"+Integer.valueOf(calendar.getTime().getYear()+1900);
		
		common.enterdate(interviewDate);
			    
		Thread.sleep(2000);
		scheduleinterviewpage.hours.sendKeys(String.valueOf(calendar.getTime().getHours()));
		
		Thread.sleep(2000);
		scheduleinterviewpage.minutes.sendKeys(String.valueOf(calendar.getTime().getMinutes()));		
		Select se = new Select(scheduleinterviewpage.duration);
		se.selectByVisibleText(Duration);	
		Thread.sleep(1000);
		se = new Select(scheduleinterviewpage.timezone);
		se.selectByVisibleText(TimeZone);
		Thread.sleep(1000);
		scheduleinterviewpage.interviewerName.get(0).sendKeys(interviewerName);
		scheduleinterviewpage.interviewerEmail.get(0).sendKeys(interviewerEmail);			
		common.ClickSumbit();	
		information = driver.findElements(By.xpath("//span[text()='Information']//following::h6[contains(text(),'"+interviewerName+" has another interview at this time. Please check interviewer calendar to get available slot.')]")).size()>0;
		while(information==true)
		{
			common.clickOnOKBtn();
			scheduleinterviewpage.minutes.clear();
			calendar.add(Calendar.MINUTE, +20);
//			System.out.println(calendar.add(Calendar.MINUTE, +20));
			scheduleinterviewpage.minutes.sendKeys(String.valueOf(calendar.getTime().getMinutes()));		
			common.ClickSumbit();
		}	
		Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='"+Title+"']")).isDisplayed(), true);
	}
	
	@When("^click on close button from Interview details page$")
	public void click_on_close_button_from_Interview_details_page() throws Throwable {
		Thread.sleep(3000);
		common.closebtn.click();
	}

	@Then("^Click on Reload job button$")
	public void click_on_Reload_job_button() throws Throwable {
	   Thread.sleep(3000);
	   workbenchpage.ReloadJobButton.click();
	}
	
	@When("^observe the interview date and time displayed on candidate card below Assign To field \"([^\"]*)\"$")
	public void observe_the_interview_date_and_time_displayed_on_candidate_card_below_Assign_To_field(String Schedule) throws Throwable {
		Thread.sleep(8000);
		explicitwait.until(ExpectedConditions.visibilityOf(candidatecardsectionpage.candidateCardInterviewDetails));
		Assert.assertEquals(candidatecardsectionpage.candidateCardInterviewDetails.getText().substring(0, candidatecardsectionpage.candidateCardInterviewDetails.getText().indexOf(',')), interviewDate);
	}
	
	@When("^click on Reload Candidate button and observe$")
	public void click_on_Reload_Candidate_button_and_observe() throws Throwable {    
		Thread.sleep(3000);
		workbenchpage.clickReloadCandidateButton();
	}

	@When("^click on Edit Interview icon in front of interview details like date and time$")
	public void click_on_Edit_Interview_icon_in_front_of_interview_details_like_date_and_time() throws Throwable {
		Thread.sleep(3000);
		candidatecardsectionpage.candidateCardEditInterview.click();
		
	}
	
	@When("^make some changes in interview details and click on Submit button \"([^\"]*)\" \"([^\"]*)\"$")
	public void make_some_changes_in_interview_details_and_click_on_Submit_button(String interviewerName, String duration) throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",scheduleinterviewpage.editInterviewIcon);
//		scheduleinterviewpage.editInterviewIcon.click();
		scheduleinterviewpage.minutes.clear();
		calendar.add(Calendar.MINUTE, +20);		
		scheduleinterviewpage.minutes.sendKeys(String.valueOf(calendar.getTime().getMinutes()));		
		Select se = new Select(scheduleinterviewpage.duration);
		se.selectByVisibleText(duration);
		Thread.sleep(1000);
		common.submitbtn.click();
		information = driver.findElements(By.xpath("//span[text()='Information']//following::h6[contains(text(),'"+interviewerName+" has another interview at this time. Please check interviewer calendar to get available slot.')]")).size()>0;
		while(information==true)
		{
			common.clickOnOKBtn();
			scheduleinterviewpage.minutes.clear();
			calendar.add(Calendar.MINUTE, +20);
			scheduleinterviewpage.minutes.sendKeys(String.valueOf(calendar.getTime().getMinutes()));		
			common.ClickSumbit();
		}	
	}
	
	
	@Then("^User should be able to update scheduled interview details and updated details should display properly$")
	public void user_should_be_able_to_update_scheduled_interview_details_and_updated_details_should_display_properly() throws Throwable {
		
	}

	@Then("^click on Edit Interview icon present on the left corner just beside of Cancel Interview icon \"([^\"]*)\"$")
	public void click_on_Edit_Interview_icon_present_on_the_left_corner_just_beside_of_Cancel_Interview_icon(String title) throws Throwable {
		Thread.sleep(5000); 	
		driver.findElement(By.xpath("//h6[text()='"+title+"']//following::button[@title='Edit Interview']")).click();
	}
	
	@Then("^make some changes and click on Submit button \"([^\"]*)\"$")
	public void make_some_changes_and_click_on_Submit_button(String scheduleon1) throws Throwable {	    
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//button[@aria-label='Clear Date']")).click();
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();

		calendar.add(Calendar.DAY_OF_MONTH, +1);
		interviewDate = calendar.getTime().getDate()+"/"+Integer.valueOf(calendar.getTime().getMonth()+1)+"/"+Integer.valueOf(calendar.getTime().getYear()+1900);
//	    System.out.println();
		common.enterdate(interviewDate);
		common.ClickSumbit();
	}
	
	@Then("^updated details should display properly \"([^\"]*)\"$")
	public void updated_details_should_display_properly(String scheduleon1) throws Throwable {
		Assert.assertEquals(candidatecardsectionpage.candidateCardInterviewDetails.getText().substring(0, candidatecardsectionpage.candidateCardInterviewDetails.getText().indexOf(',')), interviewDate);
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
//		Thread.sleep(5000);
		explicitwait.until(ExpectedConditions.visibilityOf(scheduleinterviewpage.clearDate));
		Thread.sleep(20000);
		scheduleinterviewpage.clearDate.click();
		Thread.sleep(5000);
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		common.enterdate(interviewDate);
		executor.executeScript("arguments[0].click();", interviewspage.searchButton);
	}
	
	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn(); 
		addcandidatepage.checkCandidateALreadyPresent();
	}
	
	@Then("^Interview details should be reflect according to the filter applied \"([^\"]*)\" \"([^\"]*)\"$")
	public void interview_details_should_be_reflect_according_to_the_filter_applied(String scheduleOn, String Name) throws Throwable {
		Thread.sleep(2000);
		String date=common.displayDate(interviewDate);
		Assert.assertEquals(driver.findElement(By.xpath("//th[text()=' "+date+" ']//following::h6[contains(text(),' hirecan15')]//following::p[text()=' "+interviewDate+", "+calendar.getTime().getHours()+" : "+calendar.getTime().getMinutes()+"']")).isDisplayed(), true);

	}
	
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
