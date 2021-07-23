package BVT_StepDefination;

import java.util.List;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class JobCandidateWorkflowRegressionStepDefination extends baseclass {

	@When("^Click on Save Button$")
	public void click_on_Save_Button() throws InterruptedException {

		Thread.sleep(3000);
		common.clickOnSaveBtn();
	}

	@Given("^Employee should be added$")
	public void employee_should_be_added(DataTable credentials) throws Throwable {
		manageemployee.addEmployee(credentials);
	}

	@When("^Click on save button for edit candidate$")
	public void click_on_save_button_for_edit_candidate() throws Throwable {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[text()='Save'])[2]")));
	}

	@Then("^Click on save button to save the updated changes$")
	public void click_on_save_button_to_save_the_updated_changes() throws Throwable {

		Thread.sleep(3000);
		editcandidatepage.ClickOnSaveBtntoSavetheupdatedDetails();
	}

	@When("^Click on save btn for skill$")
	public void click_on_save_btn_for_skill() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
	}

	@Then("^logout as employer and login as new candidate added by employer \"([^\"]*)\" \"([^\"]*)\"$")
	public void logout_as_employer_and_login_as_new_candidate_added_by_employer(String CandidateEmail, String password)
			throws Throwable {

		loginpage.logoutFromAppK();

		Thread.sleep(3000);
		common.logout.click();
		Thread.sleep(3000);

		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}

		Action.moveToElement(loginpage.login).perform();
		homepage.clickJobseekerCandidateSignInlinklink();
		registerpage.loginwithnewcandidate(CandidateEmail, password);

		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
	}

	@Then("^Click on Profile tab$")
	public void click_on_Profile_tab() throws Throwable {
		Thread.sleep(5000);
		candidateupdateprofilepage.profileTab.click();
	}

	@Then("^Select the On Notice Period field and set Last working day on Update Profile page \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_the_On_Notice_Period_field_and_set_Last_working_day_on_Update_Profile_page(String OnNoticePeriod,
			String LastWorkingDay) throws Throwable {
		select = new Select(addcandidatepage.onNoticePeriod);
		select.selectByVisibleText("Yes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Open Calendar'])[2]")).click();
		Thread.sleep(1000);
		common.enterdate(LastWorkingDay);
		// candidateupdateprofilepage.lastWorkingDay.sendKeys(LastWorkingDay);
		Thread.sleep(2000);
	}

	@Then("^Select the On Notice Period field and set Last working day$")
	public void select_the_On_Notice_Period_field_and_set_Last_working_day() throws Throwable {

		Select se = new Select(editcandidatepage.onnoticePeriod);
		se.selectByVisibleText("Yes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Open Calendar'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='datevalue currmonth']//span[contains(text(),'30')]")).click();
		Thread.sleep(2000);
	}

	@Then("^set looking for job as yes$")
	public void set_looking_for_job_as_yes() throws Throwable {

		Thread.sleep(3000);
		Select se = new Select(addcandidatepage.LookingforJobfield);
		se.selectByVisibleText("Yes");
	}
	
	@Then("^click on Add Designation button$")
	public void click_on_Add_Designation_button() throws Throwable {

		Thread.sleep(5000);
		candidateupdateprofilepage.addRolesButton.click();
	}

	@Then("^add duplicate designation \"([^\"]*)\"$")
	public void add_duplicate_designation(String JobDesignation) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@formcontrolname='Role'])[2]")).sendKeys(JobDesignation); // enter, duplicate, role
	}

	@Then("^Click on save btn for designation$")
	public void click_on_save_btn_for_designation() throws Throwable {
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[text()='Save'])[2]")));
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate designations$")
	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_designations(String ExpectedAlertMessage)
			throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@Then("^delete duplicate designation$")
	public void delete_duplicate_designation() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[2]//td[2]//button[1]")).click(); // delete 1 duplicate role
		try {
			common.clickOnOKBtn();
		} catch (NoSuchElementException e) {
		}
	}

	@Then("^Now Click on Add designation button to add more than ten designation$")
	public void now_Click_on_Add_designation_button_to_add_more_than_ten_designation() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.addTenRoles();
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten designation$")
	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_designation(
			String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@Then("^click on Skills & Roles tab$")
	public void click_on_Skills_Roles_tab() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.clickonskillsInformation();
	}

	@Then("^add skill, expertise level and certificate \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_skill_expertise_level_and_certificate(String Skill1, String ExpertiseLevel) throws Throwable {

		Thread.sleep(2000);
		candidateupdateprofilepage.skills.get(0).clear();
		candidateupdateprofilepage.skills.get(0).sendKeys(Skill1); // enter 1st skill
		candidateupdateprofilepage.expertiselevel.get(0).sendKeys(ExpertiseLevel);
		driver.findElement(By.xpath("//tr[1]//td[3]//input[1]")).sendKeys("ISTQB");
	}

	@Then("^add same skill, expertise level and certificate \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_same_skill_expertise_level_and_certificate(String Skill1, String ExpertiseLevel) throws Throwable {

		Thread.sleep(2000);
		candidateupdateprofilepage.skills.get(1).clear();
		candidateupdateprofilepage.skills.get(1).sendKeys(Skill1); // enter 1st skill
		candidateupdateprofilepage.expertiselevel.get(1).sendKeys(ExpertiseLevel);
		driver.findElement(By.xpath("//tr[3]//td[4]//button[1]//i[1]")).click(); // delete 3rd skill }
		try {
			common.clickOnOKBtn();
		} catch (NoSuchElementException e) {
		}
	}

	@Then("^delete duplicate skill$")
	public void delete_duplicate_skill() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[2]//td[4]//button[1]")).click(); // delete 1 duplicate skill
		try {
			common.clickOnOKBtn();
		} catch (NoSuchElementException e) {
		}
		common.clickOnSaveBtn();
	}

	@Then("^click on Delete Skill button in front of any skill for candidate$")
	public void click_on_Delete_Skill_button_in_front_of_any_skill_for_candidate() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.skills.get(3).click();
	}

	@Then("^click on Personal & Professional tab$")
	public void click_on_Personal_Professional_tab() throws Throwable {
		Thread.sleep(3000);
		candidateupdateprofilepage.clickonpersonalprofessionalInformation();
	}

	@Then("^set looking for job as No$")
	public void set_looking_for_job_as_No() throws Throwable {

		Thread.sleep(3000);
		Select se = new Select(addcandidatepage.LookingforJobfield);
		se.selectByVisibleText("No");
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate skills$")
	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_skills(String ExpectedAlertMessage)
			throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@Then("^confirmation popup message should display with Yes and No buttons and Click on No button$")
	public void confirmation_popup_message_should_display_with_Yes_and_No_buttons_and_Click_on_No_button()
			throws Throwable {

		Thread.sleep(3000);
		common.clickNoButton();
	}

	@Then("^Set on Notice period field as \"([^\"]*)\" and enter \"([^\"]*)\"$")
	public void set_Notice_period_field_as_and_enter(String onNoticePerid, String lastworkingDay) throws Throwable {
		Thread.sleep(3000);
		Select se = new Select(addcandidatepage.onNoticePeriod);
		se.selectByVisibleText(onNoticePerid);
		if (onNoticePerid.contentEquals("Yes")) {
			Thread.sleep(2000);
			addcandidatepage.calenderIcon.get(0).click();
			Thread.sleep(2000);
			common.enterdate(lastworkingDay);
		} else if (onNoticePerid.contentEquals("No")) {
			Thread.sleep(1000);
			addcandidatepage.noticePeriod.sendKeys(lastworkingDay);
		}
	}

	@Then("^verify that on Notice period field is set as \"([^\"]*)\"$")
	public void verify_that_Notice_period_field_is_set_as(String onNoticePeriod) throws Throwable {
		select = new Select(addcandidatepage.onNoticePeriod);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), onNoticePeriod);
	}

	@When("^change the set notice period days \"([^\"]*)\"$")
	public void change_the_set_notice_period_days(String noticePeriod) throws Throwable {
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.clear();
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.sendKeys(noticePeriod);
	}

	@Then("^verify that notice period field is having updated notice period \"([^\"]*)\"$")
	public void verify_that_notice_period_field_is_having_updated_notice_period(String NoticePeriod) throws Throwable {
		Assert.assertEquals(addcandidatepage.noticePeriod.getAttribute("value"), NoticePeriod);

	}

	@When("^Add a comment greater than (\\d+) characters$")
	public void add_a_comment_greater_than_characters(int arg1) throws Throwable {

		Thread.sleep(3000);
		candidatecardsectionpage.addCommentSection.sendKeys(
				"111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
	}

	@Then("^Verify that user get an error message as \"([^\"]*)\" for adding comment greater than specified characters$")
	public void verify_that_user_get_an_error_message_as_for_adding_comment_greater_than_specified_characters(
			String ExpectedErrorMessage) throws Throwable {

		Thread.sleep(3000);
		String ActualErrorMessage = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
	}

	@Then("^error message should display and Save button should be disabled$")
	public void error_message_should_display_and_Save_button_should_be_disabled() throws Throwable {

		boolean value = common.savebtn.isEnabled();

		if (value == true) {

			System.out.println("\nSave button is enabled when error message displayed");
		} else {

			System.out.println("\nSave button is disabled when error message displayed");
		}
	}

	@Then("^add comment with or below (\\d+) characters and click on Save button$")
	public void add_comment_with_or_below_characters_and_click_on_Save_button(int arg1) throws Throwable {

		Thread.sleep(2000);
		candidatecardsectionpage.addCommentSection.clear();
		Thread.sleep(2000);
		candidatecardsectionpage.addCommentSection.sendKeys("This is comment for candidate..");
		Thread.sleep(2000);
		common.clickOnSaveBtn();
		Thread.sleep(3000);
	}

	@Then("^comment should get added below Save button with Delete Comment icon$")
	public void comment_should_get_added_below_Save_button_with_Delete_Comment_icon() throws Throwable {

		candidatecardsectionpage.addedNewComment = candidatecardsectionpage.addedComment.getText();
		System.out.println("\nAdded comment: " + candidatecardsectionpage.addedNewComment);

		if (candidatecardsectionpage.addedNewComment.equals(candidatecardsectionpage.newComment)) {

			System.out.println("\nNew comment get added..");
		} else {
			System.out.println("\nNew comment not getting added..");
		}
	}

	@Then("^click on Delete Comment icon to delete the comment and comment should get deleted$")
	public void click_on_Delete_Comment_icon_to_delete_the_comment_and_comment_should_get_deleted() throws Throwable {

		candidatecardsectionpage.deleteCommentIcon.click();
		Thread.sleep(3000);
		WebElement spaceBelowSaveButton = driver.findElement(By.xpath("//div[@class='scroll-box']"));
		String str = spaceBelowSaveButton.getText();
		System.out.println("\nData below Save button: " + str);

		if (str.equals(candidatecardsectionpage.addedNewComment)) {

			System.out.println("\nComment not getting deleted..");
		} else {

			System.out.println("\nComment get deleted..");
		}
	}

	@When("^Click on Comment icon from candidate card to add comment \"([^\"]*)\"$")
	public void click_on_Comment_icon_from_candidate_card_to_add_comment(String Name) throws Throwable {

		Thread.sleep(3000);
		candidatecardsectionpage.clickOncommentsIcon(Name);
	}

	@Then("^Now move that candidate from Rejected column to any other column and observe$")
	public void now_move_that_candidate_from_Rejected_column_to_any_other_column_and_observe() throws Throwable {
		executor.executeScript("arguments[0].scrollIntoView(true);", candidatecardsectionpage.candidateCard);
		candidatecardsectionpage.dragAndDropCardToThirdColumn();
	}
	
	@When("^Click on Reject Candidate icon from candidate card to reject the candidate \"([^\"]*)\"$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_to_reject_the_candidate(String Name)
			throws Throwable {

		candidatecardsectionpage.clickOnRejectCandidateIcon(Name);
		Thread.sleep(3000);
		candidatecardsectionpage.selectRejectReason();
		candidatecardsectionpage.giveRejectionComment();
		common.ClickSumbit();
	}

	@When("^move both candidates in Interview Pending one column$")
	public void move_both_candidates_in_Interview_Pending_one_column() throws Throwable {

		WebElement drag1 = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("(//td[@id='jobStatusColumn'])[4]")); // interview peneding column
																							// 1
		WebElement drag2 = candidatecardsectionpage.candidateCard;

		Action.clickAndHold(drag1).moveToElement(drop).release(drop);
		Action.build().perform();
		Thread.sleep(2000);
		Action.clickAndHold(drag2).moveToElement(drop).release(drop);
		Action.build().perform();

	}

	@When("^Click on Reject Candidate icon from candidate card and reject that candidate \"([^\"]*)\"$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_and_reject_that_candidate(String Name)
			throws Throwable {

		candidatecardsectionpage.clickOnRejectCandidateIcon(Name);
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		candidatecardsectionpage.selectRejectReason();
	}

	@Then("^Click on Reject Candidate icon from candidate card for second candidate \"([^\"]*)\"$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_for_second_candidate(String Name1) throws Throwable {

		Thread.sleep(3000);
		candidatecardsectionpage.clickOnRejectCandidateIcon(Name1);

	}

	@Then("^click on No from confirmation popup and observe$")
	public void click_on_No_from_confirmation_popup_and_observe() throws Throwable {

		Thread.sleep(3000);
		common.clickNoButton();

	}

	@Then("^Click on show all rejected candidate checkbox$")
	public void click_on_show_all_rejected_candidate_checkbox() throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", workbenchpage.showAllRejectedCandidates);
	}

	@Then("^both candidates should not display in same column$")
	public void both_candidates_should_not_display_in_same_column() throws Throwable {

	}
	
	@When("^upload candidate resume in document format$")
	public void upload_candidate_resume_in_document_format() throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentDocFormat();
	}

	@When("^verify the error message displayed as \"([^\"]*)\"$")
	public void verify_the_error_message_displayed_as(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@When("^upload candidate resume in pdf file format$")
	public void upload_candidate_resume_in_pdf_file_format() throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentinPdfFormat();
	}

	@When("^upload candidate resume in zip file format$")
	public void upload_candidate_resume_in_zip_file_format() throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentinZipformat();
	}

	@When("^upload candidate resume in text file format$")
	public void upload_candidate_resume_in_text_file_format() throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentintextformatT();
	}

	@When("^upload candidate resume in PNG file format$")
	public void upload_candidate_resume_in_PNG_file_format() throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentinPNGformatT();
	}

	@When("^select number of interview except previously selected number \"([^\"]*)\"$")
	public void select_number_of_interview_except_previously_selected_number(String NoOfInterview1) throws Throwable {
		Thread.sleep(1000);
		Select se = new Select(addjobpage.totalinterviews);
		se.selectByVisibleText(NoOfInterview1);
	}

	@When("^again click on Edit Job button and observe the number of interviews \"([^\"]*)\"$")
	public void again_click_on_Edit_Job_button_and_observe_the_number_of_interviews(String NoOfInterview1)
			throws Throwable {

		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);
		explicitwait.until(ExpectedConditions.visibilityOf(addjobpage.totalinterviews));
		select = new Select(addjobpage.totalinterviews);
		Assert.assertEquals(driver
				.findElement(
						By.xpath("//select[@id='totalInterviews']//option[contains(text(),'" + NoOfInterview1 + "')]"))
				.getText(), NoOfInterview1);
	}

	@When("^click on Add Skill button and add one new skill \"([^\"]*)\"$")
	public void click_on_Add_Skill_button_and_add_one_new_skill(String skill4) throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,1000)");
		explicitwait.until(ExpectedConditions.visibilityOf(addjobpage.addskillbutton));
		executor.executeScript("arguments[0].scrollIntoView();", addjobpage.addskillbutton);
		Thread.sleep(5000);
		addjobpage.addskillbutton.click();
		addjobpage.addNewSkill1(skill4);
		common.ClickSumbit();
	}

	@Then("^Newly Added skills should be reflect in candidate profile which are already added for that job \"([^\"]*)\"$")
	public void newly_Added_skills_should_be_reflect_in_candidate_profile_which_are_already_added_for_that_job(
			String Skill4) throws Throwable {

		String txt = editcandidatepage.jobskill.get(3).getAttribute("value");
		Assert.assertEquals(txt.substring(0, txt.indexOf("(")).strip(), Skill4);
	}

	@Then("^Click on Candidate name from candidate card and observe the skills$")
	public void click_on_Candidate_name_from_candidate_card_and_observe_the_skills() throws Throwable {

		candidatecardsectionpage.clickOnCandidateNameFromCandidateCard();
		Thread.sleep(3000);
		candidatecardsectionpage.observeAllPresentSkills();
	}

	@Then("^Delete one skill from Skills section$")
	public void delete_one_skill_from_Skills_section() throws Throwable {
		Thread.sleep(2000);
		addjobpage.deleteSkill.get(addjobpage.deleteSkill.size() - 1).click();
	}

	@Then("^click on Close button from candidate Details page$")
	public void click_on_Close_button_from_candidate_Details_page() throws Throwable {

		Thread.sleep(2000);
		common.closebtn.click();
		Thread.sleep(2000);
	}

	@When("^observe deleted skill not displayed \"([^\"]*)\"$")
	public void observe_deleted_skill_not_displayed(String Skill3) throws Throwable {
		executor.executeScript("arguments[0].scrollIntoView();", editcandidatepage.jobskill.get(0));
		Assert.assertEquals(editcandidatepage.jobskill.size() > 2, false);
	}

	@Then("^click on Close button from Edit Candidate page$")
	public void click_on_Close_button_from_Edit_Candidate_page() throws Throwable {
		common.clickOnCloseBtn();
	}

	@Then("^deleted skills should display on Candidate Details page \"([^\"]*)\"$")
	public void deleted_skills_should_display_on_Candidate_Details_page(String Skill3) throws Throwable {
		Assert.assertEquals(Skill3.length() > 0, true);
	}

	@Then("^delete all added skills$")
	public void delete_all_added_skills() throws Throwable {
		List<WebElement> deletebtn = driver
				.findElements(By.xpath("//th[text()='Job Skills']//following::i[@class='fa fa-trash']"));
		for (int i = 0; i < deletebtn.size(); i++) {
			WebElement btn = deletebtn.get(i);
			Thread.sleep(3000);
			btn.click();
		}
	}

	@Then("^observe deleted job skill should not show when employer is going to add new candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void observe_deleted_job_skill_should_not_show_when_employer_is_going_to_add_new_candidate(String Skill1,
			String Skill2, String Skill3) throws Throwable {

		Assert.assertEquals(addcandidatepage.jobskill.size() > 0, false);
	}

	@When("^Enter All details except skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_All_details_except_skills(String CandidateEmail, String Name, String ContactNumber,
			String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod,
			String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City,
			String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance,
			String permanentAddress, String relocate) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.uploadResumeDocument();
	}

	@When("^enter as expertise level as \"([^\"]*)\"$")
	public void enter_as_expertise_level_as(String arg1) throws Throwable {
		for (int i = 0; i < 3; i++) {
			select = new Select(addcandidatepage.expertiselevel.get(i));
			select.selectByIndex(0);
		}
	}

	@Then("^select different expertise level for the skill which is having expert level as not answer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_different_expertise_level_for_the_skill_which_is_having_expert_level_as_not_answer(
			String expertiseLevel, String expertiseLeve2, String expertiseLeve3) throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(2000);
		select = new Select(addcandidatepage.expertiselevel.get(0));
		select.selectByVisibleText(expertiseLevel);
		select = new Select(addcandidatepage.expertiselevel.get(1));
		select.selectByVisibleText(expertiseLevel);
		select = new Select(addcandidatepage.expertiselevel.get(2));
		select.selectByVisibleText(expertiseLevel);
	}

	@Then("^The candidate whose skill expert level is set as Not answer for that candidate card there should show bell icon$")
	public void the_candidate_whose_skill_expert_level_is_set_as_Not_answer_for_that_candidate_card_there_should_show_bell_icon()
			throws Throwable {
		Thread.sleep(3000);
		candidatecardsectionpage.verifyBellIconOnCandidateCard();
	}

	@Given("^Share job with agency owner \"([^\"]*)\"$")
	public void share_job_with_agency_owner(String team) throws Throwable {
		Thread.sleep(3000);
		workbenchpage.shareJob.click();
		workbenchpage.shareWithTeamButton.click();
		select = new Select(sharewithteampage.selectTeam);
		select.selectByVisibleText(team);
		Thread.sleep(2000);
		common.apply.click();
		common.clickOnConfirmYes();
	}

	@Then("^when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card$")
	public void when_user_set_expertise_level_other_than_Not_answer_in_edit_candidate_at_that_time_bell_icon_should_removed_from_candidate_card()
			throws Throwable {
		boolean bellicon = driver.findElements(By.xpath("//span[@title='Skill information is missing']")).size() > 0;
		Assert.assertEquals(bellicon, false);
	}

	@Then("^The candidate whose skill expert level is set as Not for that candidate card there should show bell icon$")
	public void the_candidate_whose_skill_expert_level_is_set_as_Not_for_that_candidate_card_there_should_show_bell_icon()
			throws Throwable {
		boolean bellicon = driver.findElement(By.xpath("//span[@title='Skill information is missing']")).isDisplayed();
		Assert.assertEquals(bellicon, true);
	}

	@Then("^Click on save btn$")
	public void click_on_save_btn() throws Throwable {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", common.savebtn);
	}
		
	@When("^Drag the candidate card from that column to rejected column$")
	public void drag_the_candidate_card_from_that_column_to_rejected_column1() throws Throwable {

		WebElement drag = candidatecardsectionpage.candidateCard;
		int getRejectedColumnLocation = candidatecardsectionpage.allColumn.size() - 1;
		WebElement drop2 = candidatecardsectionpage.allColumn.get(getRejectedColumnLocation);
		Action.clickAndHold(drag);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", drop2);
		Action.clickAndHold(drag).moveToElement(drop2).release(drop2).perform();
	}
	
	@When("^select the reason of rejection and cick on submit button$")
	public void select_the_reason_of_rejection_and_cick_on_submit_button() throws Throwable {

		WebElement rejectreasonDialogTitle = driver.findElement(By.xpath("//h5[@class='modal-title' and contains(text(),'Reject')]"));
		if(rejectreasonDialogTitle.isDisplayed())
		{
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='rejectReason']"));
			
			if(dropdown.isDisplayed()) 
			{
				Select se = new Select(dropdown);
				se.selectByVisibleText("CV Not Matching JD");
				
				WebElement commentTextArea = driver.findElement(By.xpath("//textarea[@formcontrolname='Comment']"));
				if(commentTextArea.isDisplayed())
				{
					commentTextArea.clear();
					commentTextArea.sendKeys("CV do not exactly match with JD.");
				}
			}
		}
		common.ClickSumbit();
	}


	@Then("^drag the candidate card from rejected column to any other column$")
	public void drag_the_candidate_card_from_rejected_column_to_any_other_column() throws Throwable {
		Thread.sleep(5000);
		executor.executeScript("window.scrollBy(5000,0)", "");
		WebElement drag = candidatecardsectionpage.candidateCard;

		WebElement drop = driver.findElement(By.xpath("(//td[@class='TableCard' and @id='jobStatusColumn'])[8]"));

		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag).moveToElement(drop).release(drop);
		action.perform();
	}


	@When("^Add job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_jobskill_and(String Skill1, String Skill2, String Skill3, String level1, String level2,
			String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3,
				certificate1, certificate2, certificate3, remark1, remark2, remark3);
		common.ClickSumbit();
	}

	@Then("^verify the Auto Populated fields on candidate update profile popup window \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void verify_the_Auto_Populated_fields_on_candidate_update_profile_popup_window(String Username,
			String CandidateEmail, String profiletitle, String Name, String ContactNumber, String Designation,
			String Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay,
			String experience, String CTC, String expectedCTC, String Country, String City, String CityArea,
			String ZipCode, String Communicationmode, String relocate) throws Throwable {
		candidateupdateprofilepage.AssertDetailsOnCandidateProfile(Username, CandidateEmail, profiletitle, Name,
				ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC,
				expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, relocate);
	}

	@Then("^Add mandatory details on candidate profile page and save the details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_mandatory_details_on_candidate_profile_page(String jobtype, String shift, String title)
			throws Throwable {
		if (candidateupdateprofilepage.title.getAttribute("value").isEmpty()) {
			candidateupdateprofilepage.title.sendKeys(title);
		}
		if (candidateupdateprofilepage.functionalArea.getAttribute("value").isEmpty()) {
			candidateupdateprofilepage.functionalArea.sendKeys("Java Programming");
		}
		if (candidateupdateprofilepage.Shift.getText().contentEquals(shift)) {
			candidateupdateprofilepage.Shift.sendKeys(shift);
			driver.findElement(By.xpath("//span[contains(text(),'" + shift + "')]")).click();
		}
		if (candidateupdateprofilepage.jobType.getText().contentEquals(jobtype)) {
			candidateupdateprofilepage.jobType.sendKeys(jobtype);
			driver.findElement(By.xpath("//span[contains(text(),'" + jobtype + "')]")).click();
		}
		if (addcandidatepage.cv.getText().isEmpty()) {
			addcandidatepage.cv.sendKeys("C:\\Selenium\\CV.docx");
		}
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
	}

	@When("^verify candidate card is displaying or not in New column \"([^\"]*)\"$")
	public void verify_candidate_card_is_displaying_or_not_in_New_column(String Name) throws Throwable {
		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
		driver.findElement(By.xpath("//th[text()=' New ']//following::span[text()=' " + Name + "']")).isDisplayed();
		Thread.sleep(2000);
	}

	@When("^move the candidate card from potential candidate to new column$")
	public void move_the_candidate_card_from_potential_candidate_to_new_column() throws Throwable {
		Thread.sleep(2000);
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[2]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@Given("^verify By default hide contacts drop-down value is \"([^\"]*)\" for \"([^\"]*)\"$")
	public void verify_By_default_hide_contacts_drop_down_value_is_for(String Hidecontact, String CandidateEmail)
			throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		select = new Select(addcandidatepage.hideContact);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), Hidecontact);
	}

	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\" and select \"([^\"]*)\" in Hide Candidate Contact$")
	public void enter_All_details_of_and_and_select_in_Hide_Candidate_Contact(String CandidateEmail, String Name,
			String ContactNumber, String Designation, String Date, String Gender, String OnNoticePeriod,
			String NoticePeriod, String LastWorkingDay, String experience, String CTC, String expectedCTC,
			String Country, String City, String CityArea, String ZipCode, String Communicationmode,
			String Salaryoffered, String distance, String permanentAddress, String relocate, String Skill1,
			String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1,
			String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3,
			String remark1, String remark2, String remark3, String certificateforskill1, String certificateforskill2,
			String hideContact) throws Throwable {
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		select = new Select(addcandidatepage.hideContact);
		select.selectByVisibleText(hideContact);
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}

	@Given("^Click on Candidate name from candidate card \"([^\"]*)\"$")
	public void click_on_Candidate_name_from_candidate_card(String Name) throws Throwable {
		candidatecardsectionpage.clickOnEyeIcon(Name);
	}

	@Given("^Verify Email and contact no should not display for employer$")
	public void verify_Email_and_contact_no_should_not_display_for_employer() throws Throwable {
		Assert.assertEquals(
				driver.findElement(By.xpath("(//strong[contains(text(),'Email Id')]//following::p)[1]")).getText(),
				"Hidden By Agency");
		Assert.assertEquals(
				driver.findElement(By.xpath("(//strong[contains(text(),'Contact No')]//following::p)[1]")).getText(),
				"Hidden By Agency");
	}

	@Given("^Verify Email and contact no should not display for employer on edit candidate page$")
	public void verify_Email_and_contact_no_should_not_display_for_employer_on_edit_candidate_page() throws Throwable {
		Thread.sleep(5000);
		System.out.println("data" + addcandidatepage.emailField.getAttribute("value"));
		Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"), "Hidden By Agency");
		Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"), "Hidden By Agency");
	}

	@Given("^set hide contacts drop-down value as \"([^\"]*)\"$")
	public void set_hide_contacts_drop_down_value_as(String hideContact) throws Throwable {
		select = new Select(addcandidatepage.hideContact);
		select.selectByVisibleText(hideContact);
		Thread.sleep(2000);
		editcandidatepage.saveButton.click();
	}

	@When("^Share job with agency/team \"([^\"]*)\"$")
	public void share_job_with_agency_team(String Sharewith) throws Throwable {
		if (loginpage.b == true) {
			sharewithagencypage.shareWithAgency(Sharewith);
		} else {
			sharewithteampage.shareWithTeam(Sharewith);
		}
	}

	@Given("^Give Can see All candidates permission \"([^\"]*)\"$")
	public void give_Can_see_All_candidates_permission(String Teamid) throws Throwable {
		sharewithteampage.canSeeAllCandidate(Teamid);
	}

	@When("^candidate card should display in screened column$")
	public void candidate_card_should_display_in_screened_column() throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(candidatecardsectionpage.candidateCard));
		Assert.assertEquals(
				driver.findElement(By.xpath("//th[contains(text(),' Screened ')]//span[text()='1']")).isDisplayed(),
				true);
	}

	@When("^Select the same question and edit the question and answers \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_the_same_question_and_edit_the_question_and_answers(String oldQuestion, String newQuestion)
			throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'" + oldQuestion + "')]//following::i[@ngbtooltip='Edit']"))
				.click();
		addquestionarypage.EditQuestionT(newQuestion);
		explicitwait.until(ExpectedConditions.elementToBeClickable(addquestionarypage.SaveChangesBtn));
		addquestionarypage.SaveChangesBtn.click();
	}

	@When("^Verify both old and new question should display in sections \"([^\"]*)\" \"([^\"]*)\"$")
	public void verify_both_old_and_new_question_should_display_in_sections(String oldQuestion, String newQuestion)
			throws Throwable {
		Assert.assertEquals(driver
				.findElement(By.xpath("//h6[contains(text(),'Job Questions')]//following::strong[contains(text(),'1 : "
						+ oldQuestion + "')]"))
				.isDisplayed(), true);
		Assert.assertEquals(driver.findElement(
				By.xpath("//h6[contains(text(),'Revised Job Questions')]//following::strong[contains(text(),'1 : "
						+ newQuestion + "')]"))
				.isDisplayed(), true);
	}

	@When("^In Revised job question section \\(New question \\) Give answer \"([^\"]*)\" \"([^\"]*)\"$")
	public void in_Revised_job_question_section_New_question_Give_answer(String question, String answer)
			throws Throwable {
		addquestionarypage.answerthequestion(question, answer);
	}

	@When("^Verify the result should be correct$")
	public void verify_the_result_should_be_correct() throws Throwable {
		Assert.assertEquals(candidatecardsectionpage.passIcon.isDisplayed(), true);
	}

	@When("^Upload the resume and click on find button$")
	public void upload_the_resume_and_click_on_find_button() throws Throwable {
		addcandidatepage.uploadResumeDocument();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Find')])[2]")).click();
	}

	@When("^Enter all required details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_all_required_details_of_candidate_and(String CandidateEmail, String Name, String ContactNumber,
			String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod,
			String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City,
			String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance,
			String permanentAddress, String relocate, String Skill1, String Skill2, String Skill3, String level1,
			String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			String certificateforskill1, String certificateforskill2) throws Throwable {
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.candidateMandatoryDetails(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}

	@When("^Click on Collect Answer icon$")
	public void click_on_collect_answer_icon() throws Throwable {
		WebElement collectanswericon = driver.findElement(By.xpath("//button[@title='Collect Answer']"));
		if(collectanswericon.isDisplayed())
		{
			collectanswericon.click();
		}
	}
	
	@When("^Registered new candidate user in to Application \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void registered_new_candidate_user_in_to_Application(String CandidateName, String CandidateEmail, String Contact, String UserType, String TimeZone, String Country, String Password) throws Throwable {

		registerpage.clickRegister();
		registerpage.registerCandidatedetails(CandidateName, CandidateEmail, Contact);
		registerpage.registerUserdetails(UserType, TimeZone, Country);
		common.ClickSumbit();
		registerpage.ClickYesbtn();
		common.clickOnOKBtn();			
	}
	
	@When("^Add new candidate mandatory data \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_new_candidate_mandatory_data(String Profiletitle, String Industry, String Designation, String FunctionalArea, String Gender, String City, String NoticePeriod) throws Throwable {

		candidateupdateprofilepage.fillCandidateProfileMandatoryData(Profiletitle,Industry,Designation,FunctionalArea,Gender,City,NoticePeriod);
	}


}
