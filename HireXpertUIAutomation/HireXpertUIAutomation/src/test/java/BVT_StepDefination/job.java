package BVT_StepDefination;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import utilPackage.baseclass;

public class job extends baseclass {

	public static String selectedJobName = "";
	
	@Given("^User logged in to HireXpert \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logged_in_to_HireXpert_and(String username, String password) throws Throwable {

		baseclass.initialization();
		driver.navigate().refresh();
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(username, password);
		loginpage.identifyUserK();
	}

	@When("^Job provider clicks on the Submit button\\.$")
	public void job_provider_clicks_on_the_Submit_button() throws Throwable {
		common.ClickSumbit();
	}

	@Then("^Added jobs must display on the Dashboard in the job panel for logged in users and job employers\\.$")
	public void added_jobs_must_display_on_the_Dashboard_in_the_job_panel_for_logged_in_users_and_job_employers()
			throws Throwable {
		dashboardpage.openDashboardPage();
		common.searchField.sendKeys(addjobpage.jobname);
		Assert.assertEquals(
				driver.findElement(By.xpath("//td[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
	}

	@Then("^User should be able to add job from Dashboard also$")
	public void user_should_be_able_to_add_job_from_Dashboard_also(DataTable credentials) throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.AddJob);
		addjobpage.addjob(credentials);
		common.ClickSumbit();
		common.clickOnOKBtn();
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		dashboardpage.jobId = dashboardpage.Id.getText();
	}

	@Then("^Added job should display on Select Job To Add Candidate Dialog\\.$")
	public void added_job_should_display_on_Select_Job_To_Add_Candidate_Dialog() throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.AddCandidate);
		dashboardpage.selectJob.sendKeys(addjobpage.jobname);
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
		common.clickOnCloseBtn();
	}

	@Then("^Added jobs should display on the Application Tracking page in Jobs dropdown\\.$")
	public void added_jobs_should_display_on_the_Application_Tracking_page_in_Jobs_dropdown() throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectJobK();
		Assert.assertEquals(
				driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
	}

	@Then("^Added job should also display on CV Store and CV parser page in Jobs drop-down list$")
	public void added_job_should_also_display_on_CV_Store_and_CV_parser_page_in_Jobs_drop_down_list() throws Throwable {
		dashboardpage.openCvStorePage();
		Thread.sleep(3000);
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
		dashboardpage.openCvParserPage();
		Thread.sleep(3000);
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
	}

	@Then("^For newly added job audit log should be generated$")
	public void for_newly_added_job_audit_log_should_be_generated() throws Throwable {

		dashboardpage.openWorkbenchPage();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		executor.executeScript("arguments[0].click();", workbenchpage.job);

		WebElement auditBtn = driver
				.findElement(By.xpath("(//button[@class='dropdown-item' and contains(text(),' Audit ')])[1]"));
		explicitwait.until(ExpectedConditions.visibilityOf(auditBtn));

		executor.executeScript("arguments[0].click();", auditBtn);

		Assert.assertEquals(driver.findElement(By.xpath(
				"//td[contains(text(),'Add Job')]//following::td[contains(text(),'" + addjobpage.jobname + "')]"))
				.isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@Then("^For newly added job, Job update entry should be created$")
	public void for_newly_added_job_Job_update_entry_should_be_created() throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.recruitment);
		executor.executeScript("arguments[0].click();", dashboardpage.jobUpdate);
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
		Assert.assertEquals(driver.findElement(By.xpath(
				"//td[contains(text(),\"published a job '" + dashboardpage.jobId + "-" + addjobpage.jobname + "'\")]"))
				.isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@Then("^At least one agency should be added$")
	public void at_least_one_agency_should_be_added(DataTable credentials) throws Throwable {
		managerecruitmentagencies.addRecruiters(credentials);
	}

	@When("^Employer share job with an agency$")
	public void employer_share_job_with_an_agency() throws Throwable {

		if (loginpage.user == "employer") {
			dashboardpage.openWorkbenchPage();
			workbenchpage.selectJobK();
			executor.executeScript("arguments[0].click();", workbenchpage.shareJob);
			executor.executeScript("arguments[0].click();", workbenchpage.shareWithAgencyButton);
			sharewithagencypage.shareWithAgency(managerecruitmentagencies.name);
			common.clickOnCloseBtn();
			loginpage.logoutFromAppK();
			Thread.sleep(2000);
			common.logout.click();
		}
	}

	@Then("^Share job should be display on applicant tracking page at agency side \"([^\"]*)\"$")
	public void share_job_should_be_display_on_applicant_tracking_page_at_agency_side(String agencyName)
			throws Throwable {

		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(agencyName, "12345");
		loginpage.identifyUserK();
		if (loginpage.user == "agency") {
			dashboardpage.openWorkbenchPage();
			workbenchpage.selectJobK();
			Assert.assertEquals(
					driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
					true);
		}
	}

//	----------//----------------------------	

	// Scenario 2

	@When("^Employer edit added job and update job details \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void employer_edit_added_job_and_update_job_details_and_and(String noticePeriod, String city,
			String cityArea) throws Throwable {

		workbenchpage.selectJobK();

		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);

		Thread.sleep(3000);
		addjobpage.noticePeriod.clear();
		addjobpage.noticePeriod.sendKeys(noticePeriod);

		addjobpage.city.clear();
		addjobpage.city.sendKeys(city);

		addjobpage.cityArea.clear();
		addjobpage.cityArea.sendKeys(cityArea);

		common.submitbtn.click();
		Thread.sleep(10000);
	}

	@Then("^Updated details should display in Edit Job on Application Tracking \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void updated_details_should_display_in_Edit_Job_on_Application_Tracking(String jobNoticePeriod, String city,
			String cityArea) throws Throwable {

		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);
		explicitwait.until(ExpectedConditions.visibilityOf(addjobpage.noticePeriod));
		Thread.sleep(2000);
		Assert.assertEquals(addjobpage.noticePeriod.getAttribute("value").strip(), jobNoticePeriod);
		Assert.assertEquals(addjobpage.city.getAttribute("value").strip(), city);
		Assert.assertEquals(addjobpage.cityArea.getAttribute("value").strip(), cityArea);

		common.clickOnCloseBtn();
		Thread.sleep(5000);
		common.clickOnConfirmYes();
		Thread.sleep(7000);
	}

	@Then("^On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void on_Employer_Dashboard_updated_job_details_in_read_only_mode_must_be_displayed_on_clicking_View_Job_Description(
			String jobNoticePeriod, String city, String cityArea) throws Throwable {

		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		DashboardPage.jobId = dashboardpage.Id.getText();
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);

		try {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]"))))
					.click();
		} catch (ElementClickInterceptedException e) {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]"))))
					.click();
		}

		Assert.assertTrue(driver.findElement(By.xpath("(//strong[contains(text(),'Notice Period')]//following::p)[1]"))
				.getText().strip().contains("50"), jobNoticePeriod);
		Assert.assertEquals(
				driver.findElement(By.xpath("(//strong[contains(text(),'City')]//following::p)[1]")).getText().strip(),
				city);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[contains(text(),'City Area')]//following::p)[2]"))
				.getText().strip(), cityArea);

		Thread.sleep(3000);
		common.clickOnCloseBtn();
	}

	@Then("^User should be able to edit the job details from Dashboard also \"([^\"]*)\"$")
	public void user_should_be_able_to_edit_the_job_details_from_Dashboard_also(
			String updatedJobNoticePeriodFromDashboardEditJob) throws Throwable {

		Thread.sleep(3000);
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);

		try {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'Edit Job')][1]"))))
					.click();
		} catch (ElementClickInterceptedException e) {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'Edit Job')][1]"))))
					.click();
		}

		Thread.sleep(3000);
		addcandidatepage.noticePeriod.clear();
		addcandidatepage.noticePeriod.sendKeys(updatedJobNoticePeriodFromDashboardEditJob);

		Thread.sleep(3000);
		common.submitbtn.click();
		Thread.sleep(7000);
	}

	@Then("^On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description \"([^\"]*)\"$")
	public void on_Employer_Dashboard_updated_job_details_in_read_only_mode_must_be_displayed_on_clicking_View_Job_Description(
			String updatedjobDashBrdNoticePeriod) throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);

		explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
				+ addjobpage.jobname
				+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]"))))
				.click();

		Assert.assertTrue(driver.findElement(By.xpath("(//strong[contains(text(),'Notice Period')]//following::p)[1]"))
				.getText().strip().contains("30"), "30");
		common.clickOnCloseBtn();
	}

	@Then("^Verify JobUpdate entry should be created$")
	public void verify_JobUpdate_entry_should_be_created() throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.jobUpdate);
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
		jobupdatepage.selectJob(addjobpage.jobname);
		jobupdatepage.selectUpdateType("Job Update");
		jobupdatepage.btnSearchClick();

		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),\"'" + dashboardpage.jobId + "-"
				+ addjobpage.jobname + "' has been updated.\")]")).isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@Then("^Verify Audit log should be created$")
	public void verify_Audit_log_should_be_created() throws Throwable {

		dashboardpage.openWorkbenchPage();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.jobAudit);
		Assert.assertEquals(driver.findElement(By.xpath(
				"//td[contains(text(),'Add Job')]//following::td[contains(text(),'" + addjobpage.jobname + "')]"))
				.isDisplayed(), true);
		common.clickOnCloseBtn();
	}

//----------//----------------------------

	// jobScenario3

	@Given("^job must be added and share with agency \"([^\"]*)\"$")
	public void job_must_be_added_and_share_with_agency(String agencyname, DataTable credentials) throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.AddJob();
		addjobpage.addjob(credentials);
		common.ClickSumbit();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		executor.executeScript("arguments[0].click();", workbenchpage.shareJob);
		executor.executeScript("arguments[0].click();", workbenchpage.shareWithAgencyButton);
		sharewithagencypage.shareWithAgency(agencyname);
		common.clickOnCloseBtn();
	}

	@Given("^Add candidate to selected job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_candidate_to_selected_job(String CandidateEmail, String Name, String ContactNumber,
			String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod,
			String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City,
			String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance,
			String permanentAddress, String relocate) throws Throwable {
		dashboardpage.openWorkbenchPage();
		executor.executeScript("arguments[0].click();", workbenchpage.candidate);
		executor.executeScript("arguments[0].click();", workbenchpage.addCandidatebtn);
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}

	@Given("^Verify Skill match score of candidate$")
	public void verify_Skill_match_score_of_candidate() throws Throwable {
		executor.executeScript("arguments[0].click();", candidatecardsectionpage.editCandidate);
		// Assert.assertEquals(editcandidatepage.skillMatchScore.getText().strip(),
		// "-");
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}

	@When("^user edit the job and Add new skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_edit_the_job_and_Add_new_skills(String Skill1, String Skill2, String Skill3, String level1,
			String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			String certificateforskill1, String certificateforskill2) throws Throwable {
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);
		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3,
				certificate1, certificate2, certificate3, remark1, remark2, remark3);
		common.ClickSumbit();
	}

	@When("^update the candidate skill \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void update_the_candidate_skill_and(String Skill1, String Skill2, String Skill3, String level1,
			String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			String certificateforskill1, String certificateforskill2) throws Throwable {

		executor.executeScript("arguments[0].click();", candidatecardsectionpage.editCandidate);
		try {
			explicitwait.until(ExpectedConditions.visibilityOf(addcandidatepage.jobskill.get(1)));			
			
		}
		catch(StaleElementReferenceException e)
		{
			explicitwait.until(ExpectedConditions.visibilityOf(addcandidatepage.jobskill.get(1)));
		}
		
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		executor.executeScript("arguments[0].click();", editcandidatepage.saveButton);
	}

	@When("^user navigate to dashbaord page$")
	public void user_navigate_to_dashbaord_page() throws Throwable {
		dashboardpage.openDashboardPage();
	}

	@Then("^Then On Dashboard, in the job panel the job will be updated with newly added skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void then_On_Dashboard_in_the_job_panel_the_job_will_be_updated_with_newly_added_skills(String Skill1,
			String Skill2, String Skill3) throws Throwable {
		common.searchField.sendKeys(addjobpage.jobname);
		DashboardPage.jobId = dashboardpage.Id.getText();
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		try {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]"))))
					.click();
		} catch (ElementClickInterceptedException e) {
			explicitwait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
							+ addjobpage.jobname
							+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]"))))
					.click();
		}

		Assert.assertEquals(driver
				.findElement(
						By.xpath("//strong[contains(text(),'Skill')]//following::p[contains(text(),'" + Skill1 + "')]"))
				.isDisplayed(), true);
		Assert.assertEquals(driver
				.findElement(
						By.xpath("//strong[contains(text(),'Skill')]//following::p[contains(text(),'" + Skill2 + "')]"))
				.isDisplayed(), true);
		Assert.assertEquals(driver
				.findElement(
						By.xpath("//strong[contains(text(),'Skill')]//following::p[contains(text(),'" + Skill3 + "')]"))
				.isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@When("^user login as candidate \"([^\"]*)\"$")
	public void user_login_as_candidate(String candidateEmail) throws Throwable {
		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
		Action.moveToElement(loginpage.login).click().perform();
		executor.executeScript("arguments[0].click();", loginpage.JobseekerCandidateSignInlink);
		loginpage.loginIn(candidateEmail, "12345");
		common.clickOnOKBtn();
	}

//	-----------------------------

	@Then("^New skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" should be added to existing job and should be visible to everyone with whom the job is shared\\.$")
	public void new_skills_should_be_added_to_existing_job_and_should_be_visible_to_everyone_with_whom_the_job_is_shared(
			String Skill1, String Skill2, String Skill3) throws Throwable {
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);

		executor.executeScript("arguments[0].scrollIntoView();", addcandidatepage.jobskill.get(1));
		explicitwait.until(ExpectedConditions.visibilityOf(addcandidatepage.jobskill.get(1)));

		executor.executeScript("arguments[0].scrollIntoView();", addcandidatepage.jobskill.get(1));
		Assert.assertEquals(addcandidatepage.jobskill.get(0).getAttribute("value").strip().contains(Skill1), true);
		Assert.assertEquals(addcandidatepage.jobskill.get(1).getAttribute("value").strip().contains(Skill2), true);
		Assert.assertEquals(addcandidatepage.jobskill.get(2).getAttribute("value").strip().contains(Skill3), true);
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}

	@Then("^On Candidate Dashboard under Job Hiring section click on job link and verify newly added skills should be visible in the job details dialog \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void on_Candidate_Dashboard_under_Job_Hiring_section_click_on_job_link_and_verify_newly_added_skills_should_be_visible_in_the_job_details_dialog(
			String Skill1, String Skill2, String Skill3) throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(candidatedashboardpage.jobHiringStatusRefresh));
		driver.findElement(By.xpath("//h5[contains(text(),'Job - Hiring Status')]//following::p[contains(text(),'"
				+ addjobpage.jobname + "')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'" + Skill1 + "')]")).getText(), Skill1);
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'" + Skill2 + "')]")).getText(), Skill2);
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'" + Skill3 + "')]")).getText(), Skill3);
		common.clickOnCloseBtn();
	}

	//need to fix bug 1341, after that uncomment below code.
	@Then("^Skill match score of the candidate will change according to the added skills \"([^\"]*)\" \"([^\"]*)\"$")
	public void skill_match_score_of_the_candidate_will_change_according_to_the_added_skills(String Username,
			String Password) throws Throwable {
		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(Username, Password);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		explicitwait.until(ExpectedConditions.visibilityOf(candidatecardsectionpage.editCandidate));
		executor.executeScript("arguments[0].click();", candidatecardsectionpage.editCandidate);
//		explicitwait.until(ExpectedConditions.visibilityOf(editcandidatepage.skillMatchScore));
//		 Assert.assertEquals(editcandidatepage.skillMatchScore.getText().strip(),
//		 "71%");
	}

	@Then("^Verify the job city \"([^\"]*)\" and city area \"([^\"]*)\" is present$")
	public void verify_the_job_city_and_city_area_is_present(String city, String cityArea) throws Throwable {
		executor.executeScript("arguments[0].scrollIntoView();", addcandidatepage.city);
		explicitwait.until(ExpectedConditions.visibilityOf(addcandidatepage.city));
		Assert.assertEquals(addcandidatepage.city.getAttribute("value"), city);
		Assert.assertEquals(addcandidatepage.cityArea.getAttribute("value"), cityArea);
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}

	@Then("^On JobUpdates entry should be created for newly added skills$")
	public void on_JobUpdates_entry_should_be_created_for_newly_added_skills() throws Throwable {
		dashboardpage.openJobUpdatesPage();
		jobupdatepage.selectJob(addjobpage.jobname);
		jobupdatepage.selectUpdateType("Job Update");
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),\"'" + DashboardPage.jobId + "-"
				+ addjobpage.jobname + "' has been updated.\")]")).isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@Then("^On Audit log verify for newly added skill is displayed$")
	public void on_Audit_log_verify_for_newly_added_skill_is_displayed() throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.jobAudit);
		Assert.assertEquals(driver
				.findElement(By.xpath("//td[contains(text(),\" pemp updated '" + addjobpage.jobname + "' job.\")]"))
				.isDisplayed(), true);
		common.clickOnCloseBtn();
	}

//---------------------------------------------------------------

//	Scenario4

	@Given("^job must be added with skill and share with agency \"([^\"]*)\" \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void job_must_be_added_with_skill_and_share_with_agency_and(String agencyname, String Skill1, String Skill2,
			String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2,
			String Weightage3, String certificate1, String certificate2, String certificate3, String remark1,
			String remark2, String remark3, String certificateforskill1, String certificateforskill2,
			DataTable credentials) throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.AddJob();
		addjobpage.addjob(credentials);
		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3,
				certificate1, certificate2, certificate3, remark1, remark2, remark3);
		common.ClickSumbit();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		executor.executeScript("arguments[0].click();", workbenchpage.shareJob);
		executor.executeScript("arguments[0].click();", workbenchpage.shareWithAgencyButton);
		sharewithagencypage.shareWithAgency(agencyname);
		common.clickOnCloseBtn();
	}

	@When("^Add candidate to selected job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void add_candidate_to_selected_job_and(String CandidateEmail, String Name, String ContactNumber,
			String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod,
			String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City,
			String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance,
			String permanentAddress, String relocate, String Skill1, String Skill2, String Skill3, String level1,
			String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1,
			String certificate2, String certificate3, String remark1, String remark2, String remark3,
			String certificateforskill1, String certificateforskill2) throws Throwable {
		executor.executeScript("arguments[0].click();", workbenchpage.candidate);
		executor.executeScript("arguments[0].click();", workbenchpage.addCandidatebtn);
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender,
				OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea,
				ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3,
				certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}

	@When("^Employer selects added job to edit the job and removes an existing skill \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void employer_selects_added_job_to_edit_the_job_and_removes_an_existing_skill(String arg1, String arg2,
			String arg3) throws Throwable {
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);
		explicitwait.until(ExpectedConditions.visibilityOf(addjobpage.deleteJobSkill.get(1)));
		executor.executeScript("arguments[0].scrollIntoView();", addjobpage.deleteJobSkill.get(1));
		List<WebElement> deletebtn = driver
				.findElements(By.xpath("//th[text()='Job Skills']//following::i[@class='fa fa-trash']"));
		for (int i = 0; i < deletebtn.size(); i++) {
			WebElement btn = deletebtn.get(i);
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();", btn);
		}
		common.ClickSumbit();
		Thread.sleep(7000);
	}

	@Then("^Agency \"([^\"]*)\" \"([^\"]*)\" logs in to view shared job and checks removed skill is not displayed \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void agency_logs_in_to_view_shared_job_and_checks_removed_skill_is_not_displayed(String Username,
			String Password, String Skill1, String Skill2, String Skill3) throws Throwable {
		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
		common.clickOnOKBtn();
		}
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(Username, "12345");
		common.searchField.sendKeys(addjobpage.jobname);
		DashboardPage.jobId = dashboardpage.Id.getText();
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		try {
			explicitwait.until(ExpectedConditions.elementToBeClickable(
					driver.findElement(By.xpath("//td[contains(text(),'"+addjobpage.jobname+"')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]")))).click();
			}
			catch(ElementClickInterceptedException e)
			{
				explicitwait.until(ExpectedConditions.elementToBeClickable(
						driver.findElement(By.xpath("//td[contains(text(),'"+addjobpage.jobname+"')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'View Job Description')][1]")))).click();			
			}
		Assert.assertEquals(driver.findElements(By.xpath("//strong[contains(text(),'Skill')]")).size() > 0, false);
		common.clickOnCloseBtn();
	}

	@Then("^On Candidate Dashboard under Job Hiring section click on job link and verify removed skill should not be displayed in the job details dialog \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void on_Candidate_Dashboard_under_Job_Hiring_section_click_on_job_link_and_verify_removed_skill_should_not_be_displayed_in_the_job_details_dialog(
			String Skill1, String Skill2, String Skill3) throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(candidatedashboardpage.jobHiringStatusRefresh));
		driver.findElement(By.xpath("//h5[contains(text(),'Job - Hiring Status')]//following::p[contains(text(),'"
				+ addjobpage.jobname + "')]")).click();
		Assert.assertEquals(driver.findElements(By.xpath("//p[contains(text(),'" + Skill1 + "')]")).size() > 0, false);
		Assert.assertEquals(driver.findElements(By.xpath("//p[contains(text(),'" + Skill2 + "')]")).size() > 0, false);
		Assert.assertEquals(driver.findElements(By.xpath("//p[contains(text(),'" + Skill3 + "')]")).size() > 0, false);
		common.clickOnCloseBtn();
	}

	@Then("^Skill match score of the candidate will change according to the removed skills \"([^\"]*)\" \"([^\"]*)\"$")
	public void skill_match_score_of_the_candidate_will_change_according_to_the_removed_skills(String Username,
			String Password) throws Throwable {
		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
		common.clickOnOKBtn();
		}
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(Username, Password);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectJobK();
		workbenchpage.clickReloadCandidateButton();
		explicitwait.until(ExpectedConditions.visibilityOf(candidatecardsectionpage.editCandidate));
		executor.executeScript("arguments[0].click();", candidatecardsectionpage.editCandidate);
		explicitwait.until(ExpectedConditions.visibilityOf(editcandidatepage.skillMatchScore));
//		Assert.assertEquals(editcandidatepage.skillMatchScore.getText().strip(), "-");
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}

	@Then("^On JobUpdates entry should be created for removed skills$")
	public void on_JobUpdates_entry_should_be_created_for_removed_skills() throws Throwable {
		dashboardpage.openJobUpdatesPage();
		jobupdatepage.selectJob(addjobpage.jobname);
		jobupdatepage.selectUpdateType("Job Update");
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),\"'" + DashboardPage.jobId + "-"
				+ addjobpage.jobname + "' has been updated.\")]")).isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@Then("^On Audit log verify for removed skill is displayed$")
	public void on_Audit_log_verify_for_removed_skill_is_displayed() throws Throwable {
		dashboardpage.openJobUpdatesPage();
		jobupdatepage.selectJob(addjobpage.jobname);
		jobupdatepage.selectUpdateType("Job Update");
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),\"'" + DashboardPage.jobId + "-"
				+ addjobpage.jobname + "' has been updated.\")]")).isDisplayed(), true);
		common.clickOnCloseBtn();
	}

//------------------------//------------------------------------------

	// Scenario5

	@Then("^On Application Tracking page Employer clicks Close job option and click No button on confirmation popup$")
	public void on_Application_Tracking_page_Employer_clicks_Close_job_option_and_click_No_button_on_confirmation_popup()
			throws Throwable {

		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		explicitwait.until(ExpectedConditions.elementToBeClickable(workbenchpage.job)).click();
		explicitwait.until(ExpectedConditions.elementToBeClickable(workbenchpage.closejobbtn)).click();
		Thread.sleep(3000);
		common.clickNoButton();
	}

	@Then("^verify job do not get closed$")
	public void verify_job_do_not_get_closed() throws Throwable {

		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		Assert.assertEquals(
				driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
	}

	@Then("^Employer selects Close job option and clicks Yes on popup$")
	public void employer_selects_Close_job_option_and_clicks_Yes_on_popup() throws Throwable {

		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		explicitwait.until(ExpectedConditions.elementToBeClickable(workbenchpage.job)).click();
		explicitwait.until(ExpectedConditions.elementToBeClickable(workbenchpage.closejobbtn)).click();
		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}

	@Then("^Verify job is now not displayed in the Select Job dropdown on Application Tracking page$")
	public void verify_job_is_now_not_displayed_in_the_Select_Job_dropdown_on_Application_Tracking_page()
			throws Throwable {

		Thread.sleep(3000);
		Assert.assertEquals(
				driver.findElements(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).size() > 0,
				false);
	}

	@Then("^On Agency Dashboard the job should be displayed in Jobs section with membership as Open \"([^\"]*)\" and \"([^\"]*)\"$")
	public void on_Agency_Dashboard_the_job_should_be_displayed_in_Jobs_section_with_membership_as_Open_and(
			String agencyUserName, String agencyPwd) throws Throwable {

		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
		executor.executeScript("arguments[0].click();", loginpage.login);
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(agencyUserName, agencyPwd);
		loginpage.identifyUserK();
	}

	@Then("^On Agency side application tracking page job should be display with status as Closed in job dropdown$")
	public void on_Agency_side_application_tracking_page_job_should_be_display_with_status_as_Closed_in_job_dropdown()
			throws Throwable {

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);

		Assert.assertEquals(
				driver.findElements(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).size() > 0,
				true);
	}

	@Then("^Agency try sharing this closed job with its team member verify it shd not get shared and display proper message \"([^\"]*)\"$")
	public void agency_try_sharing_this_closed_job_with_its_team_member_verify_it_shd_not_get_shared_and_display_proper_message(
			String agencyTeamMember) throws Throwable {

		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", workbenchpage.shareJob);
		Thread.sleep(1000);
		workbenchpage.shareWithTeamButton.click();
		sharewithteampage.shareWithTeam(agencyTeamMember);

		Assert.assertEquals(driver
				.findElement(By.xpath(
						"//h6[contains(text(),'You can not share this job as this job has been closed by employer.')]"))
				.isDisplayed(), true);

		common.clickOnOKBtn();
		Thread.sleep(1000);
		common.clickOnCloseBtn();
		loginpage.logoutFromAppK();
		common.logout.click();

		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
	}

	@Then("^Employer should be able closed the job from Dashboard \"([^\"]*)\" and \"([^\"]*)\"$")
	public void employer_should_be_able_closed_the_job_from_Dashboard_and(String employerUserName, String password,
			DataTable credentials) throws Throwable {

		executor.executeScript("arguments[0].click();", loginpage.login);
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(employerUserName, password);
		loginpage.identifyUserK();

		dashboardpage.openDashboardPage();
		dashboardpage.AddJob();
		dashboardpage.addjobFromDashboard(credentials);
		common.ClickSumbit();
		common.clickOnOKBtn();

		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);

		explicitwait.until(ExpectedConditions.elementToBeClickable(dashboardpage.actionDropdown)).click();

		explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
				+ dashboardpage.jobname
				+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'Close Job')][1]"))))
				.click();

		Thread.sleep(2000);
		common.clickOnConfirmYes();

		Assert.assertEquals(
				driver.findElement(By.xpath("//label[contains(text(),'Membership')]//following::td[text()='Closed']"))
						.isDisplayed(),
				true);
	}

// -------------------//------------------------------

	// Scenario 6

	@Then("^Employer add job in dashboard and should be able closed the job from Dashboard$")
	public void employer_add_job_in_dashboard_and_should_be_able_closed_the_job_from_Dashboard(DataTable credentials)
			throws Throwable {

		dashboardpage.AddJob();
		dashboardpage.addjobFromDashboard(credentials);
		common.ClickSumbit();
		common.clickOnOKBtn();

		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);

		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);

		explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
				+ dashboardpage.jobname
				+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'Close Job')][1]"))))
				.click();

		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}

	@Then("^On Employer dashboard in Job section job membership is displayed as closed$")
	public void on_Employer_dashboard_in_Job_section_job_membership_is_displayed_as_closed() throws Throwable {

		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);

		Assert.assertEquals(
				driver.findElement(By.xpath("//label[contains(text(),'Membership')]//following::td[text()='Closed']"))
						.getText(),
				"Closed");
	}

	@Then("^On Employer dashboard in Job section from action dropdown select reOpen job and select yes on confirm popup$")
	public void on_Employer_dashboard_in_Job_section_from_action_dropdown_select_reOpen_job_and_select_yes_on_confirm_popup()
			throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[contains(text(),'"
				+ dashboardpage.jobname
				+ "')]//following::div[@id='jobsActionbtndropdown'][1]//button[contains(text(),'Reopen Job')][1]"))))
				.click();

		common.clickOnConfirmYes();
	}

	@Then("^Verify job status displayed as active and membership as open$")
	public void verify_job_status_displayed_as_active_and_membership_as_open() throws Throwable {

		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);

		Assert.assertEquals(driver
				.findElement(By.xpath("//label[contains(text(),'Job')]//following::td[contains(text(),'Active')]"))
				.isDisplayed(), true);
		Assert.assertEquals(
				driver.findElement(By.xpath("//label[contains(text(),'Membership')]//following::td[text()='Open']"))
						.getText(),
				"Open");
	}

	@Then("^On application tracking job should be displayed with status as active$")
	public void on_application_tracking_job_should_be_displayed_with_status_as_active() throws Throwable {

		addjobpage.jobname = dashboardpage.jobname;
		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));

		workbenchpage.selectWorkBenchJob(addjobpage.jobname);

		Assert.assertEquals(
				driver.findElements(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).size() > 0,
				true);

		String reOpenedActiveStatusJobName = driver
				.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).getText();

		Assert.assertTrue(reOpenedActiveStatusJobName.contains("Active"));
	}

// ------------------------------------------------------------------	
	// Scenario 7

	@Then("^On Application Tracking job status should be displayed as Active$")
	public void on_Application_Tracking_job_staus_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		String activeStatusJobName = driver
				.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(activeStatusJobName.contains("Active"));
	}

	@Then("^On Employer dashboard in Job section job status displayed as active and membership as Open$")
	public void on_Employer_dashboard_in_Job_section_job_status_displayed_as_active_and_membership_as_Open()
			throws Throwable {

		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		Assert.assertEquals(
				driver.findElement(By.xpath("//label[contains(text(),'Membership')]//following::td[text()='Open']"))
						.getText(),
				"Open");
	}

	@Then("^On CVStore in Jobs dropdown job status should be displayed as Active$")
	public void on_CVStore_in_Jobs_dropdown_job_status_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openCvStorePage();
		Thread.sleep(1000);
		String cvStoreActiveStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvStoreActiveStatusJobName.contains("Active"));
	}

	@Then("^On CVParser in Jobs dropdown job status should be displayed as Active$")
	public void on_CVParser_in_Jobs_dropdown_job_status_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openCvParserPage();
		Thread.sleep(1000);
		String cvParserActiveStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvParserActiveStatusJobName.contains("Active"));
	}

//------------------------------------------------------------------------------------------

	// Scenario-8

	@Then("^Employer selects newly created job and clicks Hold Job option on Application Tracking$")
	public void employer_selects_newly_created_job_and_clicks_Hold_Job_option_on_Application_Tracking()
			throws Throwable {

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectJobK();
		executor.executeScript("arguments[0].click();", workbenchpage.holdJob);
		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}

	@Then("^verify job status changed to Hold$")
	public void verify_job_status_changed_to_Hold() throws Throwable {

		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectJobK();
		String holdStatusJobName = driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]"))
				.getText();
		Assert.assertTrue(holdStatusJobName.contains("OnHold"));
	}

	@Then("^On Agency side application tracking page job should be display with status as Hold in job dropdown$")
	public void on_Agency_side_application_tracking_page_job_should_be_display_with_status_as_Hold_in_job_dropdown()
			throws Throwable {
		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectJobK();
		String holdStatusJobName = driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]"))
				.getText();
		Assert.assertTrue(holdStatusJobName.contains("OnHold"));
	}

	@Then("^Agency try sharing this Hold job with its team member verify it should not get shared and display proper message \"([^\"]*)\"$")
	public void agency_try_sharing_this_Hold_job_with_its_team_member_verify_it_should_not_get_shared_and_display_proper_message(
			String agencyTeamMember) throws Throwable {

		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", workbenchpage.shareJob);
		Thread.sleep(1000);
		workbenchpage.shareWithTeamButton.click();
		sharewithteampage.shareWithTeam(agencyTeamMember);

		Assert.assertEquals(driver.findElement(By.xpath(
				"//h6[contains(text(),'You can not share this job as this job has been put on hold by employer.')]"))
				.isDisplayed(), true);
		common.clickOnOKBtn();
		common.clickOnCloseBtn();
	}

	@Then("^On Agency CVStore in jobs dropdown job status should be displayed as OnHold$")
	public void on_Agency_CVStore_in_jobs_dropdown_job_status_should_be_displayed_as_OnHold() throws Throwable {

		dashboardpage.openCvStorePage();
		Thread.sleep(1000);
		String cvStoreHoldStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvStoreHoldStatusJobName.contains("OnHold"));
	}

	@Then("^On Agency CVParser in jobs dropdown job status should be displayed as OnHold$")
	public void on_Agency_CVParser_in_jobs_dropdown_job_status_should_be_displayed_as_OnHold() throws Throwable {

		dashboardpage.openCvParserPage();
		Thread.sleep(1000);
		String cvParserHoldStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvParserHoldStatusJobName.contains("OnHold"));
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		common.logout.click();
	}

	@Then("^On Employer dashboard in job section job status should be displayed as OnHold and membership as Open \"([^\"]*)\" and \"([^\"]*)\"$")
	public void on_Employer_dashboard_in_job_section_job_status_should_be_displayed_as_OnHold_and_membership_as_Open_and(
			String employerUserName, String password) throws Throwable {

		executor.executeScript("arguments[0].click();", loginpage.login);
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(employerUserName, password);
		loginpage.identifyUserK();
		dashboardpage.jobname = addjobpage.jobname;
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);
		Assert.assertEquals(
				driver.findElement(By.xpath("//label[contains(text(),'Membership')]//following::td[text()='Open']"))
						.isDisplayed(),
				true);
	}

	@Then("^On Employer CVStore in jobs dropdown job status should be displayed as OnHold$")
	public void on_Employer_CVStore_in_jobs_dropdown_job_status_should_be_displayed_as_OnHold() throws Throwable {

		dashboardpage.openCvStorePage();
		Thread.sleep(1000);
		String cvStoreHoldStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvStoreHoldStatusJobName.contains("OnHold"));
	}

	@Then("^On Employer CVParser in jobs dropdown job status should be displayed as OnHold$")
	public void on_Employer_CVParser_in_jobs_dropdown_job_status_should_be_displayed_as_OnHold() throws Throwable {

		dashboardpage.openCvParserPage();
		Thread.sleep(1000);
		String cvParserHoldStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvParserHoldStatusJobName.contains("OnHold"));
	}

	@Then("^On Employer dashboard in job section from Action dropdown select UnHold Job and select Yes on confirm popup$")
	public void on_Employer_dashboard_in_job_section_from_Action_dropdown_select_UnHold_Job_and_select_Yes_on_confirm_popup()
			throws Throwable {

		dashboardpage.jobname = addjobpage.jobname;
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);
		executor.executeScript("arguments[0].click();", dashboardpage.UnHoldJob);
		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}

	@Then("^On Employer dashboard in job section job status should be displayed as Active and membership as Open$")
	public void on_Employer_dashboard_in_job_section_job_status_should_be_displayed_as_Active_and_membership_as_Open()
			throws Throwable {

		dashboardpage.jobname = addjobpage.jobname;
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);

		Assert.assertEquals(driver
				.findElement(By.xpath("//label[contains(text(),'Job')]//following::td[contains(text(),'Active')]"))
				.isDisplayed(), true);
		Assert.assertEquals(
				driver.findElement(By.xpath("//label[contains(text(),'Membership')]//following::td[text()='Open']"))
						.getText(),
				"Open");
	}

	@Then("^On Employer Application Tracking status of job is displayed as Active$")
	public void on_Employer_Application_Tracking_status_of_job_is_displayed_as_Active() throws Throwable {

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		String activeStatusJobName = driver
				.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(activeStatusJobName.contains("Active"));
	}

	@Then("^On CVStore in jobs dropdown job status should be displayed as Active$")
	public void on_CVStore_in_jobs_dropdown_job_status_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openCvStorePage();
		Thread.sleep(1000);
		String cvStoreActiveStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvStoreActiveStatusJobName.contains("Active"));
	}

	@Then("^On CVParser in jobs dropdown job status should be displayed as Active$")
	public void on_CVParser_in_jobs_dropdown_job_status_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openCvParserPage();
		Thread.sleep(1000);
		String cvParserActiveStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvParserActiveStatusJobName.contains("Active"));
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		common.logout.click();
	}

	@Then("^On Agency dashboard in job section status of job is displayed as Active \"([^\"]*)\" and \"([^\"]*)\"$")
	public void on_Agency_dashboard_in_job_section_status_of_job_is_displayed_as_Active_and(String agencyUserName,
			String password) throws Throwable {

		executor.executeScript("arguments[0].click();", loginpage.login);
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(agencyUserName, password);
		loginpage.identifyUserK();
		dashboardpage.jobname = addjobpage.jobname;
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);
		Assert.assertEquals(driver
				.findElement(By.xpath("//label[contains(text(),'Job')]//following::td[contains(text(),'Active')]"))
				.isDisplayed(), true);
	}

	@Then("^On Agency Application tracking status of job is displayed as Active$")
	public void on_Agency_Application_tracking_status_of_job_is_displayed_as_Active() throws Throwable {

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		String jobActiveStatusInJobName = driver
				.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(jobActiveStatusInJobName.contains("Active"));
	}

	@Then("^On Agency CVStore in jobs dropdown job status should be displayed as Active$")
	public void on_Agency_CVStore_in_jobs_dropdown_job_status_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openCvStorePage();
		Thread.sleep(1000);
		String cvStoreHoldStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvStoreHoldStatusJobName.contains("Active"));
	}

	@Then("^On Agency CVParser in jobs dropdown job status should be displayed as Active$")
	public void on_Agency_CVParser_in_jobs_dropdown_job_status_should_be_displayed_as_Active() throws Throwable {

		dashboardpage.openCvParserPage();
		Thread.sleep(1000);
		String cvParserHoldStatusJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).getText();
		Assert.assertTrue(cvParserHoldStatusJobName.contains("Active"));
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		common.logout.click();
	}
//---------------------------------------------------------
	// Scenario-9

	@Given("^Logged-In user creates new job$")
	public void logged_In_user_creates_new_job(DataTable credentials) throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.AddJob();
		addjobpage.addjob(credentials);
		common.ClickSumbit();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);
		selectedJobName = addjobpage.jobname.strip();
	}

	@Then("^On Employer dashboard in Job section from Action dropdown select Clone Job and select Yes on confirm popup dialog$")
	public void on_Employer_dashboard_in_Job_section_from_Action_dropdown_select_Clone_Job_and_select_Yes_on_confirm_popup_dialog()
			throws Throwable {

		dashboardpage.jobname = addjobpage.jobname;
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(dashboardpage.jobname);
		Thread.sleep(5000);
		WebElement cloneBtnToClick = driver.findElement(By.xpath("//td[contains(text(),'" + dashboardpage.jobname
				+ "')]//following::div[@id='jobsActionbtndropdown']//button[text()='Clone Job']"));
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", cloneBtnToClick);
		Thread.sleep(2000);
		common.clickOnOKBtn();
	}

	@Then("^On Application Tracking cloned job is displayed$")
	public void on_Application_Tracking_cloned_job_is_displayed() throws Throwable {

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectWorkBenchJob(addjobpage.jobname + "_Clone");

		Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "_Clone')]"))
				.isDisplayed(), true);
	}

	@Then("^On CVStore in Jobs dropdown cloned job is displayed$")
	public void on_CVStore_in_Jobs_dropdown_cloned_job_is_displayed() throws Throwable {

		dashboardpage.openCvStorePage();
		Thread.sleep(1000);
		String cvStoreCloneJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "_Clone')]")).getText();

		Assert.assertTrue(cvStoreCloneJobName.contains(addjobpage.jobname));
		Assert.assertTrue(cvStoreCloneJobName.contains("_Clone"));
	}

	@Then("^On CVParser in Jobs dropdown cloned job is displayed$")
	public void on_CVParser_in_Jobs_dropdown_cloned_job_is_displayed() throws Throwable {

		dashboardpage.openCvParserPage();
		Thread.sleep(1000);
		String cvParserClonedJobName = driver
				.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "_Clone')]")).getText();

		Assert.assertTrue(cvParserClonedJobName.contains(addjobpage.jobname));
		Assert.assertTrue(cvParserClonedJobName.contains("_Clone"));
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
		common.logout.click();
	}

//---------------------------------------------------------

}
