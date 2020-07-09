package RegressionTc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC77_79_95 extends baseclass{
	
	String empname;
	int length;
	boolean b;
	
	public TC77_79_95() throws IOException 
	{
		super();
	}
	
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {    
		baseclass.initialization();
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
		Thread.sleep(1000);
		agenciespage.Clickagencybtn();
	}
	
	@When("^Click on add Button Fill all the mandatory details for agency$")
	public void click_on_add_Button_Fill_all_the_mandatory_details_for_agency(DataTable credentials) throws Throwable {
		agenciespage.enterAllDetails(credentials);
	}

	@When("^Click on team tab$")
	public void click_on_team_tab() throws Throwable {
		dashboardpage.openTeamPage();
	}
	
	@When("^Click on add Button and Fill all the mandatory details for team$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_team(DataTable credentials) throws Throwable {
		teampage.AddAllDetailsK(credentials);
	}
	
	@And("^Click on Search section and enter already existing agency$")
	public void click_on_Search_section_and_enter_already_existing_agency(DataTable credentials) throws Throwable {
	  agenciespage.enterAgyNameInSearchSection(credentials);
	}
	
	@And("^User should able to search agency$")
	public void user_should_able_to_search_agency() throws Throwable {
		
	  try
	  {
		  driver.findElement(By.xpath("//td[contains(text(),'"+ agenciespage.ele +"')]")).isDisplayed();
		  System.out.println("searched element is displaying on agencies page");
		  common.clickOnCloseBtn();
	  }
	  catch(NoSuchElementException e)
	  {
		  System.out.println("issue");
	  }
	}

	@And("^Click on Search section and enter already existing employer team$")
	public void click_on_Search_section_and_enter_already_existing_employer_team(DataTable credentials) throws Throwable {
		teampage.searchExistingTeam(credentials);
	}

	@And("^User should able to search employer team$")
	public void user_should_able_to_search_employer_team() throws Throwable {
	
		 try
		  {
			  driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed();
			  System.out.println("searched team is displaying on team page");
		  }
		  catch(NoSuchElementException e)
		  {
			  System.out.println("issue");
		  }
	}
	
	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws Throwable {
	   loginpage.loginInAppWithAgyK();
	}

	@And("^Click on Employer tab$")
	public void click_on_Employer_tab() throws Throwable {
	   dashboardpage.openEmployersPage();
	}

	@And("^Click on add Button and Fill all the mandatory details for employer$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_employer(DataTable credentials) throws Throwable {
		employerspage.enterValidCredentials(credentials);
	}

	@And("^Click on Search section and enter already existing employer$")
	public void click_on_Search_section_and_enter_already_existing_employer(DataTable credentials) throws Throwable {
		employerspage.searchExistingEmp(credentials);
	}

	@And("^User should able to search employer$")
	public void user_should_able_to_search_employer() throws Throwable {
		
		driver.findElement(By.xpath("//td[contains(text(),'"+ employerspage.ele +"')]")).isDisplayed();
		System.out.println("searched team is displaying on team page");
	}

//	@And("^Click on add Button and Fill all the mandatory details for agency team$")
//	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_agency_team(DataTable credentials) throws Throwable {
//		teampage.AddAllDetailsagyK(credentials);
//	}

	@And("^Click on Search section and enter already existing agency team$")
	public void click_on_Search_section_and_enter_already_existing_agency_team(DataTable credentials) throws Throwable {
		teampage.searchExistingTeam(credentials);
	}

	@And("^User should able to search agency team$")
	public void user_should_able_to_search_agency_team() throws Throwable {
		
	driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed();
	System.out.println("searched team is displaying on team page");
		
	}
	@And("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		loginpage.loginInAppWithAgyK();
//		loginpage.loginInAppWithEmpK();
		loginpage.identifyUserK();
		this.b=loginpage.b;
	}

	@And("^Go to update profile$")
	public void go_to_update_profile() throws Throwable {
		workbenchpage.openUpdateProfilePage();
	}
	
	@And("^Check the character limit for fields with <\\\"([^\\\"]*)\\\">$")
	public void check_the_character_limit_for_all_fields(String Name) throws Throwable {
			empname="jfdjkvfhniduvnufdfjnvjkugfbigufn";
			Thread.sleep(2000);
			updateprofilepopuppage.AgencyEmployerName.clear();
			updateprofilepopuppage.AgencyEmployerName.sendKeys(empname);
//			empname= updateprofilepopuppage.AgencyEmployerName.getAttribute("value");
			length= empname.length();
			System.out.println(length);
			
			if(length==32)
			{
				try
				{
				driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).isDisplayed();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("no error message is displaying as lenght is below 33");
					String empname1=empname+"e";
					updateprofilepopuppage.AgencyEmployerName.clear();
					updateprofilepopuppage.AgencyEmployerName.sendKeys(empname1);
					if(length==33)
					{
					try
					{
					driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).isDisplayed();
					System.out.println("error message is displaying as lenght is above 32");
					}
					catch(NoSuchElementException e1)
					{
						System.out.println("issue");
					}
				
				}
			}
		}
			common.clickOnCloseBtn();
			common.clickOnConfirmYes();

	}


	@And("^Click on Add button and fill  <\\\"([^\\\"]*)\\\">$")
	public void click_on_Add_button_and_fill_all_details(String Name) throws Throwable {
			
			teampage.clickOnAddBtnK();
			teampage.TeamMemberName.clear();
			teampage.TeamMemberName.sendKeys(empname);
			
	}

	@Then("^Error message should show only after exceeding character limit$")
	public void error_message_should_show_only_after_exceeding_character_limit() throws Throwable {

		if(length==32)
		{
			try
			{
			driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).isDisplayed();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("no error message is displaying as lenght is below 33");
				String empname1=empname+"e";
				teampage.TeamMemberName.clear();
				teampage.TeamMemberName.sendKeys(empname1);
				if(length==33)
				{
					try
					{
					System.out.println("yyyyyyyyy");
					driver.findElement(By.xpath("//div[contains(text(),' Name must be 3 - 32 alphabets. ')]")).isDisplayed();
					System.out.println("error message is displaying as lenght is above 32");
					}
					catch(NoSuchElementException e1)
					{
						System.out.println("issue");
					}
			   }
		}
	}
		common.clickOnAddClosebtn();
		
	}
}
