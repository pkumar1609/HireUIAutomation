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
}
