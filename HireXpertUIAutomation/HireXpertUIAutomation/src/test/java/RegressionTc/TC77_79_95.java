package RegressionTc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC77_79_95 extends baseclass{
	
	
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
		teampage.AddAllDetailsagyK(credentials);
	}

	@When("^Click on team tab$")
	public void click_on_team_tab() throws Throwable {
		dashboardpage.openTeamPage();
	}

	@When("^Click on add Button and Fill all the mandatory details for employer team$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_employer_team(DataTable credentials) throws Throwable {
		employerspage.enterValidCredentials(credentials);
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

}
