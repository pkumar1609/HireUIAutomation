
package BVT_StepDefination;

import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import pages.scheduleInterview;
import utilPackage.baseclass;

public class InterviewManagementBVTStepDefination extends baseclass {

	public String interviewDate;

	private String userInterviewScheduleComment = common.getRandomAlphabeticString();

	@When("^Click on add job button$")
	public void click_on_add_job_button() throws Throwable {
		workbenchpage.AddJob();
	}

	@When("^observe candidate is getting added in New column$")
	public void observe_candidate_is_getting_added_in_New_column() throws Throwable {

	}

	@When("^click on Schedule Interview icon from candidate card$")
	public void click_on_Schedule_Interview_icon_from_candidate_card() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.scheduleInterview.click();
	}

	@SuppressWarnings("deprecation")
	@When("^fill all interview details and click on Submit button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_interview_details_and_click_on_Submit_button(String Title, String Scheduleon, String Hour1,
			String Minute1, String Durationhour, String DurationMinute, String TimeZone, String interviewerName,
			String interviewerEmail) throws Throwable {
		scheduleinterviewpage.scheduleInterviewOfCandidate(Title, Scheduleon, Hour1, Minute1, Durationhour,
				DurationMinute, TimeZone, interviewerName, interviewerEmail);
	}

	@When("^click on close button from Interview details page$")
	public void click_on_close_button_from_Interview_details_page() throws Throwable {
		Thread.sleep(3000);
		common.clickOnCloseBtn();
	}

	@Then("^Click on Reload job button$")
	public void click_on_Reload_job_button() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.ReloadJobButton.click();
	}

	@When("^observe the interview date and time displayed on candidate card below Assign To field \"([^\"]*)\"$")
	public void observe_the_interview_date_and_time_displayed_on_candidate_card_below_Assign_To_field(String Name)
			throws Throwable {
		Thread.sleep(8000);
		this.interviewDate = scheduleInterview.calendar.getTime().getDate() + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getMonth() + 1) + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getYear() + 1900);
		String minuteFormate = String.format("%02d", scheduleInterview.calendar.getTime().getMinutes());
		String hourFormate = String.format("%02d", scheduleInterview.calendar.getTime().getHours());
		String interviewTimeOnCard = hourFormate + " : " + minuteFormate;
		Assert.assertEquals(
				driver.findElement(By.xpath("//span[contains(text(),' " + Name + "')]//following::p[text()=' "
						+ this.interviewDate + ", " + interviewTimeOnCard + " ']")).isDisplayed(),
				true);
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
	public void make_some_changes_in_interview_details_and_click_on_Submit_button(String interviewerName,
			String duration) throws Throwable {
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
		common.submitbtn.click();
		if (scheduleinterviewpage.alertMessage.size() > 0) {
			common.clickOnConfirmYes();
		}
	}

	@Then("^User should be able to update scheduled interview details and updated details should display properly \"([^\"]*)\"$")
	public void user_should_be_able_to_update_scheduled_interview_details_and_updated_details_should_display_properly(
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
	}

	@Then("^click on Edit Interview icon present on the left corner just beside of Cancel Interview icon \"([^\"]*)\"$")
	public void click_on_Edit_Interview_icon_present_on_the_left_corner_just_beside_of_Cancel_Interview_icon(
			String title) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h6[text()='" + title + "']//following::button[@title='Edit Interview']"))
				.click();
	}

	@Then("^make some changes and click on Submit button \"([^\"]*)\"$")
	public void make_some_changes_and_click_on_Submit_button(String scheduleon1) throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Clear Date']")).click();
		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		scheduleInterview.calendar.add(Calendar.DAY_OF_MONTH, +1);
		interviewDate = scheduleInterview.calendar.getTime().getDate() + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getMonth() + 1) + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getYear() + 1900);
		System.out.println("mm" + scheduleInterview.calendar.getTime().getMinutes());
		common.enterdate(interviewDate);
		common.ClickSumbit();
		if (scheduleinterviewpage.alertMessage.size() > 0) {
			common.clickOnConfirmYes();
		}
	}

	@Then("^updated details should display properly \"([^\"]*)\"$")
	public void updated_details_should_display_properly(String scheduleon1) throws Throwable {
		Assert.assertEquals(candidatecardsectionpage.candidateCardInterviewDetails.getText().substring(0,
				candidatecardsectionpage.candidateCardInterviewDetails.getText().indexOf(',')), interviewDate);
	}

	@Then("^now click on Schedule interview icon on candiadte card$")
	public void now_click_on_Schedule_interview_icon_on_candiadte_card() throws Throwable {
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", candidatecardsectionpage.scheduleInterview);
	}

	@Then("^click on Interviews tab$")
	public void click_on_Interviews_tab() throws Throwable {
		dashboardpage.openInterviewsPage();
	}

	@Then("^Select the filters for which you want candidate interview details and click on Search button \"([^\"]*)\"$")
	public void select_the_filters_for_which_you_want_candidate_interview_details_and_click_on_Search_button(
			String scheduleon1) throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(scheduleinterviewpage.clearDate));
		executor.executeScript("arguments[0].click();", scheduleinterviewpage.clearDate);
//		Thread.sleep(5000);
		explicitwait.until(ExpectedConditions.visibilityOf(scheduleinterviewpage.ScheduleOnCalendarIcon));
		executor.executeScript("arguments[0].click();", scheduleinterviewpage.ScheduleOnCalendarIcon);
//		scheduleinterviewpage.ScheduleOnCalendarIcon.click();
		common.enterdate(interviewDate);
		executor.executeScript("arguments[0].click();", interviewspage.reloadInterviewsButton);
	}

	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail, String Name, String ContactNumber, String Designation,
			String Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay,
			String experience, String CTC, String expectedCTC, String Country, String City, String CityArea,
			String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress,
			String relocate, String Skill1, String Skill2, String Skill3, String level1, String level2, String level3,
			String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2,
			String certificate3, String remark1, String remark2, String remark3, String certificateforskill1,
			String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnAddToJobBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}

	@Then("^Interview details should be reflect according to the filter applied \"([^\"]*)\" \"([^\"]*)\"$")
	public void interview_details_should_be_reflect_according_to_the_filter_applied(String scheduleOn, String Name)
			throws Throwable {
		Thread.sleep(2000);
		String date = scheduleInterview.calendar.getTime().getDate() + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getMonth() + 1) + "/"
				+ Integer.valueOf(scheduleInterview.calendar.getTime().getYear() + 1900);
		String minuteFormate = String.format("%02d", scheduleInterview.calendar.getTime().getMinutes());
		String hourFormate = String.format("%02d", scheduleInterview.calendar.getTime().getHours());
		String interviewTimeOnCard = hourFormate + " : " + minuteFormate;
		executor.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//h6[contains(text(),'" + Name + "')]//following::p[contains(text(),'"
						+ this.interviewDate + ", " + interviewTimeOnCard + "')]")));
		Assert.assertEquals(
				driver.findElement(By.xpath("//h6[contains(text(),'" + Name + "')]//following::p[contains(text(),'"
						+ this.interviewDate + ", " + interviewTimeOnCard + "')]")).isDisplayed(),
				true);
	}

	@Then("^click on close job button and delete the job$")
	public void click_on_close_job_button_and_delete_the_job() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.clickOnCloseJobButton();
	}

	@Then("^Interview updated entry should be created in Job update menu \"([^\"]*)\",\"([^\"]*)\"$")
	public void interview_updated_entry_should_be_created_in_Job_update_menu(String loggedInUser, String candidateName)
			throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.dashboard);
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		dashboardpage.jobId = dashboardpage.Id.getText();

		// executor.executeScript("arguments[0].click();", dashboardpage.recruitment);
		executor.executeScript("arguments[0].click();", dashboardpage.jobUpdate);
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);

		Assert.assertEquals(driver.findElement(By.xpath(
				"(//strong[contains(text(),'Interview Update')]//following::th[contains(text(),'Job')]//following-sibling::th[contains(text(),'Updated Details')]//following::td[contains(text(),'"
						+ dashboardpage.jobId + "-" + addjobpage.jobname
						+ "')]//following::td[contains(text(),'Interview Update')])[1]"))
				.isDisplayed(), true);

		common.clickOnCloseBtn();
	}

	@When("^User is able to add comments \"([^\"]*)\"$")
	public void user_is_able_to_add_comments(String comment) throws Throwable {

		String commentt = common.getRandomAlphabeticString();
		scheduleinterviewpage.addcommentTextArea.sendKeys(commentt);
		scheduleinterviewpage.saveCommentButton.click();
		Assert.assertEquals(scheduleinterviewpage.getAddedInterviewCommentWebElement(commentt) == true, true);
	}

	@When("^User is able to add comments$")
	public void user_is_able_to_add_comments() throws Throwable {

		scheduleinterviewpage.addcommentTextArea.sendKeys(userInterviewScheduleComment);
		scheduleinterviewpage.saveCommentButton.click();
		Assert.assertEquals(
				scheduleinterviewpage.getAddedInterviewCommentWebElement(userInterviewScheduleComment) == true, true);
	}

	@When("^User is able to delete the addded comment$")
	public void user_is_able_to_delete_the_addded_comment() throws Throwable {

		if (scheduleinterviewpage.getAddedInterviewCommentWebElement(userInterviewScheduleComment)) {

			try {
				explicitwait.until(
						ExpectedConditions.elementToBeClickable(scheduleinterviewpage.deleteInterviewCommentButton))
						.click();
			} catch (ElementClickInterceptedException ex) {
				explicitwait.until(
						ExpectedConditions.elementToBeClickable(scheduleinterviewpage.deleteInterviewCommentButton))
						.click();
			}
		}
	}

	@When("^User is able to delete the interviewer \"([^\"]*)\"$")
	public void user_is_able_to_delete_the_interviewer(String interviewerEmail) throws Throwable {

		String newInterviewer = scheduleinterviewpage.addInterviewer();

		System.out.println("****newInterviewer=> " + newInterviewer);

		for (WebElement interviewer : scheduleinterviewpage.interviewerEmail) {

			String myText = interviewer.getText();

			if (scheduleinterviewpage.interviewerEmail.contains(newInterviewer)) {
				scheduleinterviewpage.deleteInterviewCommentButton.click();
			}
		}
	}

	@Given("^Agency selects the shared job from dashboard \"([^\"]*)\" and \"([^\"]*)\"$")
	public void agency_selects_the_shared_job_from_dashboard_and(String AgencyUsername, String password)
			throws Throwable {

		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(AgencyUsername, password);

		System.out.println("**Job Name in Agency Dashboard=> " + addjobpage.jobname);

		common.searchField.sendKeys(addjobpage.jobname);
		DashboardPage.jobId = dashboardpage.Id.getText();

		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		try {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Applicants')][1]"))))
					.click();
		} catch (ElementClickInterceptedException e) {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Applicants')][1]"))))
					.click();
		}
	}

	@Given("^Employer schedules interview for candidate added by agency \"([^\"]*)\" and \"([^\"]*)\"$")
	public void employer_schedules_interview_for_candidate_added_by_agency_and(String employerUserName, String password)
			throws Throwable {

		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(employerUserName, password);

		System.out.println("**Job Name in Employer to schedule interview => " + addjobpage.jobname);

		common.searchField.sendKeys(addjobpage.jobname);
		DashboardPage.jobId = dashboardpage.Id.getText();

		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		try {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Applicants')][1]"))))
					.click();
		} catch (ElementClickInterceptedException e) {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Applicants')][1]"))))
					.click();
		}
	}

	@When("^close all job$")
	public void close_all_job() throws Throwable {
		Thread.sleep(2000);
//	     List<WebElement> allJobs = driver.findElements(By.xpath("//option"));	 	 
		select = new Select(workbenchpage.jobDropDown);
		for (int i = 1; i <= select.getOptions().size(); i++) {
			select.selectByIndex(i);
			workbenchpage.clickOnCloseJobButton();
		}
	}

}
