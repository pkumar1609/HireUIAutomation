package TC50_54K;

import java.io.IOException;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class StepDefination extends baseclass {

	public StepDefination() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
		baseclass.initialization();
	}
	
	@Given("^User must be registered as agency profile$")
	public void user_must_be_registered_as_agency_profile() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");

	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {


	}

	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws Throwable {

		loginpage.loginInAppWithAgyK();
	}

	@And("^Click on team tab$")
	public void click_on_team_tab() throws InterruptedException  {
		Thread.sleep(2000);
		dashboardpage.openTeamPage();
	}

	@And("^Click on add Button to add the team$")
	public void click_on_add_Button_to_add_the_team() throws Throwable {
		Thread.sleep(1000);
//		teampage.clickOnAddBtnK();

	}

	@And("^Fill all the mandatory details$")
	public void fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		
		teampage.AddAllDetailsK(credentials);

	}

	@Then("^Agency should be able to add team$")
	public void agency_should_be_able_to_add_team() throws Throwable {
		

	}

	@Then("^Newly added team should be displayed in team page$")
	public void newly_added_team_should_be_displayed_in_team_page() throws Throwable {
		if(driver.getPageSource().contains(teampage.namevalidate)){
			System.out.println("Team get added sucesfully");
			}else{
			System.out.println("Team not get added");
			}	 

	}

	@And("^delete the added team$")
	public void delete_the_added_team() throws Throwable {
		teampage.deleteteamK();

	}

	@Then("^deleted employer should not be display in team page$")
	public void deleted_employer_should_not_be_display_in_team_page() throws Throwable {


	}
}
