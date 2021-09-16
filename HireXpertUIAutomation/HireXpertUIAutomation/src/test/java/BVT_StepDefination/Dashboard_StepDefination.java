package BVT_StepDefination;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.scheduleInterview;
import utilPackage.baseclass;

public class Dashboard_StepDefination extends baseclass {

	@Given("^On Dashboard open add dialog and enter all required fields$")
	public void on_Dashboard_open_add_dialog_and_enter_all_required_fields(DataTable credentials) throws Throwable {
		executor.executeScript("arguments[0].click();", dashboardpage.AddJob);
		addjobpage.addjob(credentials);
		Thread.sleep(3000);
	}

	@Then("^Added job should display in the Jobs section$")
	public void added_job_should_display_in_the_Jobs_section() throws Throwable {
		common.searchField.clear();
		Thread.sleep(1000);
		common.searchField.sendKeys(addjobpage.jobname);
		dashboardpage.jobId = dashboardpage.Id.getText();
	}

	@When("^Add Two-Three more jobs$")
	public void add_Two_Three_more_jobs(DataTable credentials) throws Throwable {
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.visibilityOf(dashboardpage.AddJob));
		for (int i = 0; i < 3; i++) {
			executor.executeScript("arguments[0].click();", dashboardpage.AddJob);
			addjobpage.addjob(credentials);
			common.ClickSumbit();
//			common.clickOnOKBtn();
		}
		Thread.sleep(3000);
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		dashboardpage.jobId = dashboardpage.Id.getText();

	}

	@And("^Job related updates should display in Latest Updates section on dashboard$")
	public void job_related_updates_should_display_in_Latest_Updates_section_on_dashboard() throws Throwable {
		Thread.sleep(5000);
		common.searchField.clear();
		Thread.sleep(3000);
		common.ClickReloadAllBtn();
		Thread.sleep(2000);
		dashboardpage.clickOnLatestJobUpdate();
		Thread.sleep(3000);
	}

	@Then("^Search or enter any value/text related to job$")
	public void search_or_enter_any_value_text_related_to_job() throws Throwable {
		Thread.sleep(3000);
		common.searchField.sendKeys(addjobpage.jobname);
		common.searchField.clear();
//		common.searchField.sendKeys(addjobpage.designation);
	}

	@Then("^Data should be display accordingly in “Latest job” section$")
	public void data_should_be_display_accordingly_in_Latest_job_section() throws Throwable {
		Thread.sleep(3000);
		common.searchField.clear();
	}

	@Then("^Now click on the “filters & Summary” icon$")
	public void now_click_on_the_filters_Summary_icon() throws Throwable {
		Thread.sleep(3000);
		common.ClickReloadAllBtn();
		common.clickOnFiltersAndSummary();
	}

	@Then("^Apply some filter criteria and hit the “Apply filter” button$")
	public void apply_some_filter_criteria_and_hit_the_Apply_filter_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		common.clickOnApplayFilter();
		Thread.sleep(3000);
	}

	@Then("^Data should be display according to the filter set criteria$")
	public void data_should_be_display_according_to_the_filter_set_criteria() throws Throwable {
		Thread.sleep(10000);
//		dashboardpage.openDashboardPage();
	}

	@Then("^Now click on the Clear filter icon$")
	public void now_click_on_the_Clear_filter_icon() throws Throwable {
		Thread.sleep(3000);
		common.clickOnClearFilters();
	}

	@Then("^Default Job data should display$")
	public void default_Job_data_should_display() throws Throwable {
		Thread.sleep(2000);
//		dashboardpage.openDashboardPage();
//		common.searchField.clear();	
	}

	@Then("^Now search the job$")
	public void now_search_the_job() throws Throwable {
		Thread.sleep(5000);
		System.out.println(dashboardpage.jobname);
		common.searchField.sendKeys(addjobpage.jobname);
		dashboardpage.jobId = dashboardpage.Id.getText();
	}

	@Then("^Job which is searched should display in Jobs section$")
	public void job_which_is_searched_should_display_in_Jobs_section() throws Throwable {
		Thread.sleep(10000);
		common.searchField.clear();
	}

	// Verify upcomings interviews on dashboard(Employer/agency)

	@Given("^On Applicant Tracking,Open add job dailog and fill all details$")
	public void on_Applicant_Tracking_Open_add_job_dailog_and_fill_all_details(DataTable credentials) throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.AddJob();
		addjobpage.addjob(credentials);
	}

	@When("^User click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		common.ClickSumbit();
	}

	@Then("^Added job should display in Job drop-down$")
	public void added_job_should_display_in_Job_drop_down() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.selectJobK();
//		workbenchpage.selectWorkBenchJobNew(addjobpage.jobname);
	}

	@Then("^Add one candidate for that job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void add_one_candidate_for_that_job_and(String CandidateEmail, String Name, String ContactNumber,
			String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod,
			String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City,
			String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance,
			String permanentAddress, String relocate, String Skill1, String Skill2, String Skill3, String level1,
			String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.clickOnAddCandidate();
		workbenchpage.enterEmailId(CandidateEmail);
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
	}

	@SuppressWarnings("deprecation")
	@Then("^Newly added candidate should display in applicant tracking page as well as in “Upcoming Interviews” section on dashboard\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void newly_added_candidate_should_display_in_applicant_tracking_page_as_well_as_in_Upcoming_Interviews_section_on_dashboard(
			String Title, String Scheduleon, String Hour1, String Minute1, String Durationhour, String DurationMinute,
			String TimeZone, String interviewerName, String interviewerEmail) throws Throwable {
		addcandidatepage.checkCandidateALreadyPresent();
		Thread.sleep(3000);
		workbenchpage.scheduleInterview.click();
		Thread.sleep(3000);
		scheduleinterviewpage.scheduleInterviewOfCandidate(Title, Scheduleon, Hour1, Minute1, Durationhour,
				DurationMinute, TimeZone, interviewerName, interviewerEmail);
		common.clickOnCloseBtn();
		Thread.sleep(3000);
		dashboardpage.openDashboardPage();
		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.reloadInterviewsButton));
		executor.executeScript("arguments[0].click();", interviewspage.reloadInterviewsButton);
	}

	@Then("^User should be able to view all the interview details in read only mode after clicking on “View” link on dashboard$")
	public void user_should_be_able_to_view_all_the_interview_details_in_read_only_mode_after_clicking_on_View_link_on_dashboard()
			throws Throwable {
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.viewInterviews));
		executor.executeScript("arguments[0].click();", interviewspage.viewInterviews);
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.closeButton));
		executor.executeScript("arguments[0].click();", interviewspage.closeButton);
	}

	@Then("^Click on the “More Interviews” link and edit the interview details \"([^\"]*)\" \"([^\"]*)\"$")
	public void click_on_the_More_Interviews_link_and_edit_the_interview_details(String interviewerName,
			String duration) throws Throwable {
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.moreInterviews));
		executor.executeScript("arguments[0].click();", interviewspage.moreInterviews);
		Thread.sleep(3000);
		dashboardpage.openDashboardPage();
		Thread.sleep(2000);
//		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.clickApplicationTracking)); 
		executor.executeScript("arguments[0].click();", interviewspage.clickApplicationTracking);
		Thread.sleep(3000);
		candidatecardsectionpage.candidateCardEditInterview.click();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", scheduleinterviewpage.editInterviewIcon);
		scheduleInterview.calendar.add(Calendar.MINUTE, +2);
		explicitwait.until(ExpectedConditions.visibilityOf(scheduleinterviewpage.time));
		executor.executeScript("arguments[0].click();", scheduleinterviewpage.time);
		explicitwait.until(ExpectedConditions.visibilityOf(scheduleinterviewpage.mm));
		scheduleinterviewpage.hh.clear();
		scheduleinterviewpage.mm.clear();
		scheduleinterviewpage.hh.sendKeys(String.valueOf(scheduleInterview.calendar.getTime().getHours()));
		scheduleinterviewpage.mm.sendKeys(String.valueOf(scheduleInterview.calendar.getTime().getMinutes()));
		System.out.println("mm" + scheduleInterview.calendar.getTime().getMinutes());
		Select se = new Select(scheduleinterviewpage.durationMinute);
		se.selectByVisibleText(duration);
		Thread.sleep(1000);
//		common.submitbtn.click();
		explicitwait.until(ExpectedConditions.visibilityOf(common.submitbtn));
		executor.executeScript("arguments[0].click();", common.submitbtn);
		if (scheduleinterviewpage.alertMessage.size() > 0) {
			common.clickOnConfirmYes();
		}
		Thread.sleep(3000);

	}

	@Then("^Updated interview details should also display on interview tab, applicant tracking and on dashboard page \"([^\"]*)\"$")
	public void updated_interview_details_should_also_display_on_interview_tab_applicant_tracking_and_on_dashboard_page(
			String Name) throws Throwable {
		Thread.sleep(8000);
		String date = scheduleInterview.calendar.getTime().getDate() + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getMonth() + 1) + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getYear() + 1900);
		String minuteFormate = String.format("%02d", scheduleInterview.calendar.getTime().getMinutes());
		String hourFormate = String.format("%02d", scheduleInterview.calendar.getTime().getHours());
		String interviewTimeOnCard = hourFormate + " : " + minuteFormate;
		Assert.assertEquals(
				driver.findElement(By.xpath("//span[contains(text(),' " + Name + "')]//following::p[text()=' "
						+ scheduleInterview.interviewDate + ", " + interviewTimeOnCard + " ']")).isDisplayed(),
				true);
		common.clickOnCloseBtn();
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", interviewspage.clickInterviews);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", interviewspage.clickApplicationTracking);
		Thread.sleep(1000);
		dashboardpage.openDashboardPage();
		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.reloadInterviewsButton));
		executor.executeScript("arguments[0].click();", interviewspage.reloadInterviewsButton);
	}

	@Then("^Now Share job with employer employee \"([^\"]*)\"$")
	public void now_Share_job_with_employer_employee(String teamName) throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", interviewspage.clickApplicationTracking);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", workbenchpage.shareJob);
		Thread.sleep(1000);
		workbenchpage.shareWithTeamButton.click();
		sharewithteampage.shareWithTeam(teamName);
		common.clickOnCloseBtn();
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		Thread.sleep(2000);
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
		Thread.sleep(1000);
	}

	@Then("^Click on Employer-Agency Signin link \"([^\"]*)\", \"([^\"]*)\"$")
	public void click_on_Employer_Agency_Signin_link(String Username, String Password) throws Throwable {
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(Username, Password);
		loginpage.identifyUserK();
		Thread.sleep(500);
		dashboardpage.openWorkbenchPage();
	}

	@Then("^At employee side, Add one candidate into that job which is shared by employer and move the candidate card into new column \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"\"$")
	public void at_employee_side_Add_one_candidate_into_that_job_which_is_shared_by_employer_and_move_the_candidate_card_into_new_column_and(String CandidateEmail, String Name, String ContactNumber,
			String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod,
			String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City,
			String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance,
			String permanentAddress, String relocate, String Skill1, String Skill2, String Skill3, String level1,
			String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.selectWorkBenchJobNew(addjobpage.jobname);
		workbenchpage.clickOnAddCandidate();
//		addcandidatepage.emailField.sendKeys(CandEmailId);
//		executor.executeScript("arguments[0].click();", addcandidatepage.FindButton);
//		common.clickOnSaveBtn();
		workbenchpage.enterEmailId(CandidateEmail);
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
		Thread.sleep(2000);
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[2]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
		Thread.sleep(5000);  
	}


	@Then("^Schedule one interview for that candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void schedule_one_interview_for_that_candidate(String Title, String Scheduleon, String Hour1, String Minute1,
			String Durationhour, String DurationMinute, String TimeZone, String interviewerName,
			String interviewerEmail) throws Throwable {
		workbenchpage.scheduleInterview.click();
		scheduleinterviewpage.scheduleInterviewOfCandidate(Title, Scheduleon, Hour1, Minute1, Durationhour,
				DurationMinute, TimeZone, interviewerName, interviewerEmail);
		Thread.sleep(3000);
		common.clickOnCloseBtn();

	}

	@Then("^At employer side,candidate added by employee member and Scheduled Interview details should be display on applicant tracking, Interviews tab and also on dashboard page$")
	public void at_employer_side_candidate_added_by_employee_member_and_Scheduled_Interview_details_should_be_display_on_applicant_tracking_Interviews_tab_and_also_on_dashboard_page()
			throws Throwable {
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", interviewspage.clickInterviews);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", interviewspage.clickApplicationTracking);
		Thread.sleep(1000);
		dashboardpage.openDashboardPage();
		explicitwait.until(ExpectedConditions.visibilityOf(interviewspage.reloadInterviewsButton));
		executor.executeScript("arguments[0].click();", interviewspage.reloadInterviewsButton);

	}

}
