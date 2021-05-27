package BVT_StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilPackage.baseclass;

public class job extends baseclass {

	//Scenario 1 step Def's
	
	@Given("^User logged in to HireXpert \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logged_in_to_HireXpert_and(String username, String password) throws Throwable {

		baseclass.initialization();
		driver.navigate().refresh();
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
		dashboardpage.jobId=dashboardpage.Id.getText();
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
		Assert.assertEquals(
				driver.findElement(By.xpath("//td[contains(text(),\"published a job '"+dashboardpage.jobId+"-"+addjobpage.jobname+"'\")]"))
						.isDisplayed(),
				true);
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
	public void share_job_should_be_display_on_applicant_tracking_page_at_agency_side(String agencyName) throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginIn(agencyName,"12345");
		loginpage.identifyUserK();
		if (loginpage.user == "agency") {			
			dashboardpage.openWorkbenchPage();
			workbenchpage.selectJobK();
			Assert.assertEquals(
					driver.findElement(By.xpath("//span[contains(text(),'" + addjobpage.jobname + "')]")).isDisplayed(),
					true);
		}
	}
	
	
	//Scenario 2 step Def's
	
	@Given("^Employer must login and goto Application Tracking and open hamburger menu icon to edit job and update job details$")
	public void employer_must_login_and_goto_Application_Tracking_and_open_hamburger_menu_icon_to_edit_job_and_update_job_details() throws Throwable {

	}

	@Given("^Go to Recruitment Applicant Tracking$")
	public void go_to_Recruitment_Applicant_Tracking() throws Throwable {

	}

	@Given("^Open the hamburger menu button and click on the edit job$")
	public void open_the_hamburger_menu_button_and_click_on_the_edit_job() throws Throwable {

	}

	@Given("^Update some of the job details$")
	public void update_some_of_the_job_details() throws Throwable {

	}

//	@When("^Job provider clicks on the Submit button$")
//	public void job_provider_clicks_on_the_Submit_button_() throws Throwable {
//
//	}

	@Then("^Updated jobs details must display on the Dashboard in the job panel for logged in users and job employers$")
	public void updated_jobs_details_must_display_on_the_Dashboard_in_the_job_panel_for_logged_in_users_and_job_employers() throws Throwable {

	}

	@Then("^Updated job details should display on the Application Tracking page in Jobs dropdown$")
	public void updated_job_details_should_display_on_the_Application_Tracking_page_in_Jobs_dropdown() throws Throwable {

	}

	@Then("^User should be able to edit the job details from Dashboard also$")
	public void user_should_be_able_to_edit_the_job_details_from_Dashboard_also() throws Throwable {

	}

	@Then("^On the Dashboard in the job panel, User should be able to view the Job Description dialog along with all the updated job details in read only mode$")
	public void on_the_Dashboard_in_the_job_panel_User_should_be_able_to_view_the_Job_Description_dialog_along_with_all_the_updated_job_details_in_read_only_mode() throws Throwable {

	}

	@Then("^Verify updated job city and city area is present$")
	public void verify_updated_job_city_and_city_area_is_present() throws Throwable {

	}

	@Then("^Verify updated jobs JobUpdate entry should be created$")
	public void verify_updated_jobs_JobUpdate_entry_should_be_created() throws Throwable {

	}

	@Then("^Verify edited jobs Audit log should be created$")
	public void verify_edited_jobs_Audit_log_should_be_created() throws Throwable {

	}
	
	//Scenario 3:
	
	@Given("^An employer logged in creates a job and shares with agency to HireXpert$")
	public void an_employer_logged_in_creates_a_job_and_shares_with_agency_to_HireXpert() throws Throwable {

	}

	@Given("^Employer selects the job and edit it to add a new skill$")
	public void employer_selects_the_job_and_edit_it_to_add_a_new_skill() throws Throwable {
	
	}

	@When("^Employer clicks on the Submit button\\.$")
	public void employer_clicks_on_the_Submit_button() throws Throwable {
	   
	}

	@Then("^New skills should be added to existing job and should be visible to everyone with whom the job is shared\\.$")
	public void new_skills_should_be_added_to_existing_job_and_should_be_visible_to_everyone_with_whom_the_job_is_shared() throws Throwable {
	
	}

	@Then("^On the Dashboard in the job panel user should be able to view the new added skill in the View Job Description dialog in read only mode\\.$")
	public void on_the_Dashboard_in_the_job_panel_user_should_be_able_to_view_the_new_added_skill_in_the_View_Job_Description_dialog_in_read_only_mode() throws Throwable {
	  
	}

	@Then("^On Candidate Dashboard, newly added skills should be visible in the job panel$")
	public void on_Candidate_Dashboard_newly_added_skills_should_be_visible_in_the_job_panel() throws Throwable {
	
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

}
