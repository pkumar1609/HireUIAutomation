package BVT_StepDefination;

import org.openqa.selenium.support.ui.ExpectedConditions;
import cucumber.api.DataTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
			common.clickOnOKBtn();
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
	
}
