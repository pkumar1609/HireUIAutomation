package BVT_StepDefination;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import utilPackage.baseclass;

public class loginstepdefination extends baseclass {

	public loginstepdefination() throws IOException {

		super();
	}

	DataTable credentials;
	String deleteele;
	String checkelement;
	public String ele;
	String empname;
	boolean error;
	boolean b;

	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
		Thread.sleep(3000);
		baseclass.initialization();
		driver.navigate().refresh();
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() {
		homepage.getTitle();
	}

	@And("^Click on Employer-Agency Signin link$")
	public void click_on_Employer_Agency_Signin_link() throws Throwable {
		loginpage.ClickOnEmployerAgencySigninLink();
	}

	@And("^Employer enters valid credentials$")
	public void Employer_enters_valid_credentials() throws InterruptedException {
		Thread.sleep(3500);
		loginpage.loginInAppWithEmpK();
	}

	@When("^Click on add Button Fill all the mandatory details for Recruitment Agencies$")
	public void click_on_add_Button_Fill_all_the_mandatory_details_for_Recruitment_Agencies(DataTable credentials)
			throws Throwable {
		managerecruitmentagencies.addRecruiters(credentials);
	}

	@When("^Click on add Button Fill all the mandatory details for Manage Employer$")
	public void click_on_add_Button_Fill_all_the_mandatory_details_for_Manage_Employer(DataTable credentials)
			throws Throwable {
		manageemployer.addEmployer(credentials);
	}

	@Then("^Employer should be able to add Agency$")
	public void employer_should_be_able_to_add_Agency() {
		Assert.assertEquals(
				driver.findElement(By.xpath("//td[text()='" + managerecruitmentagencies.name + "']")).isDisplayed(),
				true);
	}

	@Then("^Newly added agency should be displayed in Agencies page$")
	public void newly_added_agency_should_be_displayed_in_Agencies_page() throws InterruptedException {
		boolean ele = driver.getPageSource().contains(managerecruitmentagencies.name);
		Assert.assertEquals(ele, true);
	}

	@Then("^Newly added team member should be displayed in team page$")
	public void newly_added_team_member_should_be_displayed_in_team_page() throws InterruptedException {
		Assert.assertEquals(
				driver.findElement(By.xpath("//td[contains(text(),'" + manageemployee.name + "')]")).isDisplayed(),
				true);
	}

	@Then("^the employer with which you have logged in should display in team tab by default$")
	public void the_employer_with_which_you_have_logged_in_should_display_in_team_tab_by_default() {
		Assert.assertEquals(driver.getPageSource().contains(prop.getProperty("employer")), true);
	}

	@Then("^delete the added team \"([^\"]*)\"$")
	public void delete_the_added_team(String team) throws Throwable {
		dashboardpage.deleteTeamMembers(team);
	}

	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws InterruptedException {
		loginpage.loginInAppWithAgyK();
	}

	@Then("^Agency should be able to add Employer$")
	public void Agency_should_be_able_to_add_Employer() throws InterruptedException {

		System.out.println(size);
		for (int i = 0; i < size; i++) {
			Assert.assertEquals(driver.getPageSource().contains(ar.get(i)), true);
		}
	}

	@Then("^delete the added employer \"([^\"]*)\"$")
	public void delete_the_added_employer(String team) throws Throwable {
		dashboardpage.deleteUser(team);
	}

	@Then("^delete the added agency \\\"([^\\\"]*)\\\"$")
	public void delete_the_added_agency(String agency) throws Throwable {
		dashboardpage.deleteUser(agency);
	}

	@And("^Click on Search section and enter already existing agency$")
	public void click_on_Search_section_and_enter_already_existing_agency(DataTable credentials) throws Throwable {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			explicitwait.until(ExpectedConditions.elementToBeClickable(dashboardpage.agencySearch));
			dashboardpage.agencySearch.sendKeys(data.get("Name"));
			ele = data.get("Name");
		}
	}

	@And("^User should able to search agency$")
	public void user_should_able_to_search_agency() throws Throwable {

		Assert.assertEquals(true,
				driver.findElement(By.xpath("//td[contains(text(),'" + managerecruitmentagencies.name + "')]"))
						.isDisplayed());
	}

	@And("^Click on Search section and enter already existing employer team$")
	public void click_on_Search_section_and_enter_already_existing_employer_team(DataTable credentials)
			throws Throwable {

		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			explicitwait.until(ExpectedConditions.elementToBeClickable(dashboardpage.teamMemberSearchField));
			dashboardpage.teamMemberSearchField.sendKeys(data.get("Name"));
			ele = data.get("Name");
		}
	}

	@And("^User should able to search employer team$")
	public void user_should_able_to_search_employer_team() throws Throwable {
		Assert.assertEquals(true,
				driver.findElement(By.xpath("//td[contains(text(),'" + this.ele + "')]")).isDisplayed());
	}

	@And("^Click on Search section and enter already existing employer$")
	public void click_on_Search_section_and_enter_already_existing_employer(DataTable credentials) throws Throwable {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			explicitwait.until(ExpectedConditions.elementToBeClickable(dashboardpage.employerSearchfield));
			dashboardpage.employerSearchfield.sendKeys(data.get("Name"));
			ele = data.get("Name");
		}
	}

	@And("^User should able to search employer$")
	public void user_should_able_to_search_employer() throws Throwable {
		Assert.assertEquals(true,
				driver.findElement(By.xpath("//td[contains(text(),'" + this.ele + "')]")).isDisplayed());
	}

	@And("^Click on Search section and enter already existing agency team$")
	public void click_on_Search_section_and_enter_already_existing_agency_team(DataTable credentials) throws Throwable {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			explicitwait.until(ExpectedConditions.visibilityOf(dashboardpage.teamMemberSearchField));
			dashboardpage.teamMemberSearchField.sendKeys(data.get("Name"));
			ele = data.get("Name");
		}
	}

	@And("^User should able to search agency team$")
	public void user_should_able_to_search_agency_team() throws Throwable {
		Assert.assertEquals(true,
				driver.findElement(By.xpath("//td[contains(text(),'" + this.ele + "')]")).isDisplayed());
	}

	@And("^Go to update profile$")
	public void go_to_update_profile() throws Throwable {
		workbenchpage.openUpdateProfilePage();
	}

	@When("^Check the character limit for fields with \"([^\"]*)\"$")
	public void check_the_character_limit_for_fields_with(String Name) throws Throwable {
		Thread.sleep(1000);
		updateprofilepopuppage.AgencyEmployerName.clear();
		updateprofilepopuppage.AgencyEmployerName.sendKeys(Name);
		error = driver.findElements(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).size() > 0;
		Assert.assertEquals(error, false);
		Thread.sleep(1000);
		updateprofilepopuppage.AgencyEmployerName.clear();
		updateprofilepopuppage.AgencyEmployerName.sendKeys(Name + "a");
		Assert.assertEquals(true,
				driver.findElement(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).isDisplayed());
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}

	@When("^Click on Add button and fill \"([^\"]*)\" for \"([^\"]*)\"$")
	public void click_on_Add_button_and_fill(String Name, String profile) throws Throwable {
		dashboardpage.openManageEmployeePage();
		Thread.sleep(2000);
		manageemployee.addEmployee.click();
		common.namefield.clear();
		common.namefield.sendKeys(Name);
		error = driver.findElements(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).size() > 0;
		Assert.assertEquals(error, false);
		common.namefield.clear();
		common.namefield.sendKeys(Name + "a");
	}

	@Then("^Error message should show only after exceeding character limit$")
	public void error_message_should_show_only_after_exceeding_character_limit() throws Throwable {

		WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]"));
		if (errorMsg.isDisplayed()) {
			Assert.assertEquals(errorMsg.isDisplayed(), true);
		}
		common.clickOnCloseBtn();
	}

}