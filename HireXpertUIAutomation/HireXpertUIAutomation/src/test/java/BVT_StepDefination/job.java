package BVT_StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import pages.JobUpdatesPage;
import utilPackage.baseclass;

public class job extends baseclass {

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
		common.clickOnOKBtn();
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
		executor.executeScript("arguments[0].click();", workbenchpage.addJob);
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
		Assert.assertEquals(
				driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
				true);
	}

	@Then("^For newly added job audit log should be generated$")
	public void for_newly_added_job_audit_log_should_be_generated() throws Throwable {
		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectJobK();
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.jobAudit);
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
		}
	}

	@Then("^Share job should be display on applicant tracking page at agency side \"([^\"]*)\"$")
	public void share_job_should_be_display_on_applicant_tracking_page_at_agency_side(String agencyName)
			throws Throwable {
		loginpage.logoutFromAppK();
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
		Thread.sleep(4000);
	}

	@Then("^Updated details should display in Edit Job on Application Tracking \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void updated_details_should_display_in_Edit_Job_on_Application_Tracking(String jobNoticePeriod, String city,
			String cityArea) throws Throwable {
		
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);
		explicitwait.until(ExpectedConditions.visibilityOf(addjobpage.noticePeriod));
		Assert.assertEquals(addjobpage.noticePeriod.getAttribute("value").strip(), jobNoticePeriod);
		Assert.assertEquals(addjobpage.city.getAttribute("value").strip(), city);
		Assert.assertEquals(addjobpage.cityArea.getAttribute("value").strip(), cityArea);
				
		common.clickOnCloseBtn();
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@Then("^On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void on_Employer_Dashboard_updated_job_details_in_read_only_mode_must_be_displayed_on_clicking_View_Job_Description(
			String jobNoticePeriod, String city, String cityArea) throws Throwable {

		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		DashboardPage.jobId = dashboardpage.Id.getText();
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		executor.executeScript("arguments[0].click();", dashboardpage.viewJobDescription);

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
		dashboardpage.openDashboardPage();
		common.searchField.clear();
		common.searchField.sendKeys(addjobpage.jobname);
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		executor.executeScript("arguments[0].click();", dashboardpage.editJob);

		explicitwait.until(ExpectedConditions.visibilityOf(addcandidatepage.noticePeriod));
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.clear();
		addcandidatepage.noticePeriod.sendKeys(updatedJobNoticePeriodFromDashboardEditJob);

		Thread.sleep(3000);
		common.submitbtn.click();	
	}

	@Then("^On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description \"([^\"]*)\"$")
	public void on_Employer_Dashboard_updated_job_details_in_read_only_mode_must_be_displayed_on_clicking_View_Job_Description(
			String updatedjobDashBrdNoticePeriod) throws Throwable {

		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		executor.executeScript("arguments[0].click();", dashboardpage.viewJobDescription);

		Thread.sleep(2000);
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

		Assert.assertEquals(driver.findElement(By.xpath(
				"//td[contains(text(),\"'"+dashboardpage.jobId+"-"+addjobpage.jobname+"' has been updated.\")]"))
				.isDisplayed(), true);
		
		common.clickOnCloseBtn();
	}

	@Then("^Verify Audit log should be created$")
	public void verify_Audit_log_should_be_created() throws Throwable {

		System.out.println("Audit started");

		dashboardpage.openWorkbenchPage();
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		workbenchpage.selectJobK();
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.jobAudit);
		Assert.assertEquals(driver.findElement(By.xpath(
				"//td[contains(text(),'Add Job')]//following::td[contains(text(),'" + addjobpage.jobname + "')]"))
				.isDisplayed(), true);
			
		common.clickOnCloseBtn();
	}

//	----------//----------------------------

	// jobScenario3

	@Given("^job must be added and share with agency \"([^\"]*)\"$")
	public void job_must_be_added_and_share_with_agency(String agencyname, DataTable credentials) throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.AddJob();
		addjobpage.addjob(credentials);
		common.ClickSumbit();
		common.clickOnOKBtn();
		workbenchpage.selectJobK();
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
		//Assert.assertEquals(editcandidatepage.skillMatchScore.getText().strip(), "-");
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
		addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
		common.ClickSumbit();
	}

	@When("^user navigate to dashbaord page$")
	public void user_navigate_to_dashbaord_page() throws Throwable {
		dashboardpage.openDashboardPage();
	}

	@Then("^Then On Dashboard, in the job panel the job will be updated with newly added skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void then_On_Dashboard_in_the_job_panel_the_job_will_be_updated_with_newly_added_skills(String Skill1,
			String Skill2, String Skill3) throws Throwable {
		common.searchField.sendKeys(addjobpage.jobname);
		executor.executeScript("arguments[0].click();", dashboardpage.actionDropdown);
		executor.executeScript("arguments[0].click();", dashboardpage.viewJobDescription);
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
		executor.executeScript("arguments[0].click();", loginpage.login);
		executor.executeScript("arguments[0].click();", loginpage.JobseekerCandidateSignInlink);
		loginpage.loginIn(candidateEmail, "12345");
		common.clickOnOKBtn();
	}

//	-----------------------------

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

	@Given("^Employer selects the job and edit it to add a new skill$")
	public void employer_selects_the_job_and_edit_it_to_add_a_new_skill() throws Throwable {

	}

	@When("^Employer clicks on the Submit button\\.$")
	public void employer_clicks_on_the_Submit_button() throws Throwable {

	}

	
	@Then("^New skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" should be added to existing job and should be visible to everyone with whom the job is shared\\.$")
	public void new_skills_should_be_added_to_existing_job_and_should_be_visible_to_everyone_with_whom_the_job_is_shared(String Skill1, String Skill2, String Skill3) throws Throwable {
		executor.executeScript("arguments[0].click();", workbenchpage.job);
		executor.executeScript("arguments[0].click();", workbenchpage.editJobButton);
		Assert.assertEquals(addcandidatepage.jobskill.get(1),Skill1);
		Assert.assertEquals(addcandidatepage.jobskill.get(2), Skill2);
		Assert.assertEquals(addcandidatepage.jobskill.get(3), Skill3);

	}

	@Then("^On Candidate Dashboard under Job Hiring section click on job link and verify newly added skills should be visible in the job details dialog$")
	public void on_Candidate_Dashboard_under_Job_Hiring_section_click_on_job_link_and_verify_newly_added_skills_should_be_visible_in_the_job_details_dialog()
			throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(candidatedashboardpage.jobHiringStatusRefresh));
		driver.findElement(By.xpath("//h5[contains(text(),'Job - Hiring Status')]//following::p[contains(text(),'"
				+ addjobpage.jobname + "')]")).click();
	}

	@Then("^Skill match score of the candidate will change according to the added skills$")
	public void skill_match_score_of_the_candidate_will_change_according_to_the_added_skills() throws Throwable {

	}

	@Then("^Verify the job city and city area is present$")
	public void verify_the_job_city_and_city_area_is_present() throws Throwable {

	}

	@Then("^On JobUpdates entry should be created for newly added skills$")
	public void on_JobUpdates_entry_should_be_created_for_newly_added_skills() throws Throwable {

	}

	@Then("^On Audit log verify for newly added skill is displayed$")
	public void on_Audit_log_verify_for_newly_added_skill_is_displayed() throws Throwable {

	}

//------------------------//------------------------------------------


	// Scenario5

		@Then("^On Application Tracking page Employer clicks Close job option$")
		public void on_Application_Tracking_page_Employer_clicks_Close_job_option() throws Throwable {

			workbenchpage.selectJobK();

			Thread.sleep(4000);
			executor.executeScript("arguments[0].click();", workbenchpage.job);
			
	        executor.executeScript("arguments[0].click();", workbenchpage.closejobbtn);
			
	        Thread.sleep(3000);
	        common.clickNoButton();               
		}

		@Then("^On Confirmation message click on the NO button$")//
		public void on_Confirmation_message_click_on_the_NO_button() throws Throwable {
			
			workbenchpage.selectJobK();

			Thread.sleep(4000);
			executor.executeScript("arguments[0].click();", workbenchpage.job);
		}

		@Then("^verify job do not get closed$")//
		public void verify_job_do_not_get_closed() throws Throwable {

		}

		@Then("^Employer selects Close job option and clicks Yes on popup$")
		public void employer_selects_Close_job_option_and_clicks_Yes_on_popup()
				throws Throwable {
			workbenchpage.selectJobK();

			Thread.sleep(4000);
			executor.executeScript("arguments[0].click();", workbenchpage.job);		
	        executor.executeScript("arguments[0].click();", workbenchpage.closejobbtn);
			
	        Thread.sleep(3000);
	        workbenchpage.clickOnCloseJobButton();
		}

		@Then("^Verify job is now not displayed in the Select Job dropdown on Application Tracking page$")
		public void verify_job_is_now_not_displayed_in_the_Select_Job_dropdown_on_Application_Tracking_page()
				throws Throwable {

			System.out.println("***Verify job is now not displayed in the Select Job dropdown in ATS DD***");
			System.out.println(addjobpage.jobname);
			
			Assert.assertEquals(
					driver.findElement(By.xpath("//option[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
					false);
		}

		@Then("^On Agency Dashboard the job should be displayed in Jobs section with membership as Open$")
		public void on_Agency_Dashboard_the_job_should_be_displayed_in_Jobs_section_with_membership_as_Open()
				throws Throwable {

		}

		@Then("^On Agency side application tracking page job should be display with status as Closed in job dropdown$")
		public void on_Agency_side_application_tracking_page_job_should_be_display_with_status_as_Closed_in_job_dropdown()
				throws Throwable {

		}

		@Then("^Agency try sharing this closed job with its team member verify it shd not get shared and display proper message$")
		public void agency_try_sharing_this_closed_job_with_its_team_member_verify_it_shd_not_get_shared_and_display_proper_message()
				throws Throwable {

		}
	//-------------------//------------------------------
	
}
