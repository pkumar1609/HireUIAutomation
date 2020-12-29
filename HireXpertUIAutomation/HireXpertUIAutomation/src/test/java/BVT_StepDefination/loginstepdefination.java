package BVT_StepDefination;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class loginstepdefination extends baseclass {

	public loginstepdefination() throws IOException {
	
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}
	
	DataTable credentials;
	String deleteele;
	String checkelement;
	boolean ele;
	String empname;
	boolean error;
	boolean b;
	
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {    
		initialization();
	} 
 
	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home()  {
		agenciespage.getTitle();
	}
	
	@And("^Click on Employer-Agency Signin link$")
	public void click_on_Employer_Agency_Signin_link() throws Throwable {
	    loginpage.ClickOnEmployerAgencySigninLink();
	} 
	
	@And("^Employer enters valid credentials$")
	public void Employer_enters_valid_credentials() throws InterruptedException{
		loginpage.loginInAppWithEmpK();
	}

	@And("^Click on Agencies tab$")
	public void click_on_Agencies_tab() throws InterruptedException  {
		agenciespage.Clickagencybtn();
	}
 
	@And("^Click on add Button Fill all the mandatory details for agency$")
		public void fill_all_the_mandatory_detail(DataTable credentials) throws InterruptedException  {
		agenciespage.enterAllDetails(credentials);
	}
	
	@Then("^Employer should be able to add Agency$")
	public void employer_should_be_able_to_add_Agency() {
	ele=  driver.findElement(By.xpath("//td[text()='"+agenciespage.empname+"']")).isDisplayed();
	Assert.assertEquals(ele, true);
	}

	@Then("^Newly added agency should be displayed in Agencies page$")
	public void newly_added_agency_should_be_displayed_in_Agencies_page() throws InterruptedException {
		boolean ele=driver.getPageSource().contains(agenciespage.empname);
		Assert.assertEquals(ele, true);
	}
	
	@And("^Click on team tab$")
	public void click_on_team_tab() throws InterruptedException  {
		dashboardpage.openTeamPage();
	}

	@When("^Click on add Button and Fill all the mandatory details for team$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_team(DataTable credentials) throws Throwable {
		teampage.AddAllDetailsK(credentials);
	} 

	@Then("^Newly added team member should be displayed in team page$")
	public void newly_added_team_member_should_be_displayed_in_team_page() throws InterruptedException  {
		ele = driver.getPageSource().contains(teampage.namevalidate);
		Assert.assertEquals(ele, true);
	} 

	@Then("^the employer with which you have logged in should display in team tab by default$")
	public void the_employer_with_which_you_have_logged_in_should_display_in_team_tab_by_default()  
	{
		ele = driver.getPageSource().contains(prop.getProperty("loginid"));
		Assert.assertEquals(ele, true);
	}
	

	
	@Then("^delete the added team \"([^\"]*)\"$")
	public void delete_the_added_team(String team) throws Throwable {
		teampage.deleteteamK(team);
	}
	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws InterruptedException {
		loginpage.loginInAppWithAgyK();
	}

	@And("^Click on Employer tab$")
	public void click_on_Employer_tab() throws InterruptedException  {
	
		dashboardpage.openEmployersPage();
	}
	
	@When("^Click on add Button and Fill all the mandatory details for employer$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_employer(DataTable credentials) throws Throwable {
		employerspage.enterValidCredentials(credentials);
	}

	@Then("^Agency should be able to add Employer$")
	public void Agency_should_be_able_to_add_Employer() throws InterruptedException  {
	
		System.out.println(size);
		for(int i=0; i<size; i++) 
		{
			ele = driver.getPageSource().contains(ar.get(i));
			Assert.assertEquals(ele, true);	
		}
	}


	


	@Then("^delete the added employer \"([^\"]*)\"$")
	public void delete_the_added_employer(String team) throws Throwable {
		Thread.sleep(1000);	
		employerspage.deleteUser(team);
	}

	@Then("^deleted employer should not be display on page$")
	public void deleted_employer_should_not_be_display_on_page() throws Throwable {
//		boolean isEmployerPresent =driver.findElement(By.xpath("//td[text()='"+employerspage.namevalidate+"@gmail.com']")) != null;
//		Assert.assertEquals(isEmployerPresent, false);
	}
	
	@Then("^delete the added agency \\\"([^\\\"]*)\\\"$")
	public void delete_the_added_agency(String agency) throws Throwable {
		Thread.sleep(1000);	
		employerspage.deleteUser(agency);
	}
	
	@Then("^Agency should be able to add team$")
	public void agency_should_be_able_to_add_team() throws Throwable {
		
	}

	@Then("^deleted user should not be display on page$")
	public void deleted_user_should_not_be_display_on_page() throws Throwable {
		
//		boolean ele1 = driver.findElement(By.xpath("//td[text()='"+teampage.namevalidate+"']")) != null;
//		System.out.println(teampage.namevalidate);
		
//		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+teampage.namevalidate+"']")) != null, false);
	
		
//		Assert.assertFalse(driver.findElement(By.xpath("//td[text()='"+teampage.namevalidate+"']")) != null);
	}
	
	
	
	
//	----------------------------------------------------------------------------
//	
//	
////	@Given("^User must be registered$")
////	public void user_must_be_registered() throws Throwable {    
////		baseclass.initialization();
////	}
////
////	@When("^title of login page is Home$")
////	public void title_of_login_page_is_Home()  {
////		agenciespage.getTitle();
////	}
////
////	@And("^Click on Employer-Agency Signin link$")
////	public void click_on_Employer_Agency_Signin_link() throws Throwable {
////	    loginpage.ClickOnEmployerAgencySigninLink();
////	}
////	
////	@And("^Employer enters valid credentials$")
////	public void Employer_enters_valid_credentials() throws InterruptedException{
////		loginpage.loginInAppWithEmpK();
////	}
////
////	@And("^Click on Agencies tab$")
////	public void click_on_Agencies_tab() throws InterruptedException  {
////		Thread.sleep(1000);
////		agenciespage.Clickagencybtn();
////	}
//	
//	@When("^Click on add Button Fill all the mandatory details for agency$")
//	public void click_on_add_Button_Fill_all_the_mandatory_details_for_agency(DataTable credentials) throws Throwable {
//		agenciespage.enterAllDetails(credentials);
//	}
//
////	@When("^Click on team tab$")
////	public void click_on_team_tab() throws Throwable {
////		dashboardpage.openTeamPage();
////	}
////	
////	@When("^Click on add Button and Fill all the mandatory details for team$")
////	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_team(DataTable credentials) throws Throwable {
////		teampage.AddAllDetailsK(credentials);
////	}
//	
	@And("^Click on Search section and enter already existing agency$")
	public void click_on_Search_section_and_enter_already_existing_agency(DataTable credentials) throws Throwable {
	  agenciespage.enterAgyNameInSearchSection(credentials);
	}

	@And("^User should able to search agency$")
	public void user_should_able_to_search_agency() throws Throwable {
		
	Assert.assertEquals(true, driver.findElement(By.xpath("//td[contains(text(),'"+ agenciespage.ele +"')]")).isDisplayed());
	}

	@And("^Click on Search section and enter already existing employer team$")
	public void click_on_Search_section_and_enter_already_existing_employer_team(DataTable credentials) throws Throwable {
		teampage.searchExistingTeam(credentials);
	}

	@And("^User should able to search employer team$")
	public void user_should_able_to_search_employer_team() throws Throwable {
		Assert.assertEquals(true, driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed());
	}
//	
////	@And("^agency enters valid credentials$")
////	public void agency_enters_valid_credentials() throws Throwable {
////	   loginpage.loginInAppWithAgyK();
////	}
//
////	@And("^Click on Employer tab$")
////	public void click_on_Employer_tab() throws Throwable {
////	   dashboardpage.openEmployersPage();
////	}
//
////	@And("^Click on add Button and Fill all the mandatory details for employer$")
////	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_employer(DataTable credentials) throws Throwable {
////		employerspage.enterValidCredentials(credentials);
////	}

	@And("^Click on Search section and enter already existing employer$")
	public void click_on_Search_section_and_enter_already_existing_employer(DataTable credentials) throws Throwable {
		employerspage.searchExistingEmp(credentials);
	}

	@And("^User should able to search employer$")
	public void user_should_able_to_search_employer() throws Throwable {
		Assert.assertEquals(true, driver.findElement(By.xpath("//td[contains(text(),'"+ employerspage.ele +"')]")).isDisplayed());

	}
//
//	@And("^Click on add Button and Fill all the mandatory details for agency team$")
//	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_agency_team(DataTable credentials) throws Throwable {
//		teampage.AddAllDetailsagyK(credentials);
//	}
//
	@And("^Click on Search section and enter already existing agency team$")
	public void click_on_Search_section_and_enter_already_existing_agency_team(DataTable credentials) throws Throwable {
		teampage.searchExistingTeam(credentials);
	}

	@And("^User should able to search agency team$")
	public void user_should_able_to_search_agency_team() throws Throwable {
	Assert.assertEquals(true, driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed());

	}
//	@And("^user enters valid credentials$")
//	public void user_enters_valid_credentials() throws Throwable {
//		loginpage.loginInAppWithAgyK();
////		loginpage.loginInAppWithEmpK();
//		loginpage.identifyUserK();
//		this.b=loginpage.b;
//	}
//
	@And("^Go to update profile$")
	public void go_to_update_profile() throws Throwable {
		workbenchpage.openUpdateProfilePage();
	}
	@When("^Check the character limit for fields with \"([^\"]*)\"$")
	public void check_the_character_limit_for_fields_with(String Name) throws Throwable {
		updateprofilepopuppage.AgencyEmployerName.clear();
		updateprofilepopuppage.AgencyEmployerName.sendKeys(Name);
		System.out.println(Name);
		try {
		error=driver.findElement(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).isDisplayed();}
		catch(NoSuchElementException e)
		{}
		Assert.assertEquals(error, false);
		updateprofilepopuppage.AgencyEmployerName.clear();
		updateprofilepopuppage.AgencyEmployerName.sendKeys(Name+"a");
		Assert.assertEquals(true, driver.findElement(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).isDisplayed());
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}
	
	@When("^Click on Add button and fill \"([^\"]*)\"$")
	public void click_on_Add_button_and_fill(String Name) throws Throwable {
		teampage.clickOnAddBtnK();
		teampage.TeamMemberName.clear();
		teampage.TeamMemberName.sendKeys(Name);
		try {
		error=driver.findElement(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).isDisplayed();}
		catch(NoSuchElementException e)
		{}
		Assert.assertEquals(error, false);
		teampage.TeamMemberName.clear();
		teampage.TeamMemberName.sendKeys(Name+"a");
	}
	
	
	@Then("^Error message should show only after exceeding character limit$")
	public void error_message_should_show_only_after_exceeding_character_limit() throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Name must be 3 - 64 alphabets.')]")).isDisplayed(),true);
	}
	
////	@When("^Click on close button$")
////	public void click_on_close_button() throws Throwable {
////	   Thread.sleep(4000);
////	   common.clickOnCloseBtn();
////	}
}