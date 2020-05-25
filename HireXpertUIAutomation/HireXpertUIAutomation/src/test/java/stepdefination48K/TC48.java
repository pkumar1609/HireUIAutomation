package stepdefination48K;


import java.io.IOException;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.table.TableConverter;
import gherkin.formatter.model.DataTableRow;
import utilPackage.baseclass;

public class TC48 extends baseclass {
	public TC48() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
		baseclass.initialization();
	}
	
	@Given("^User must be registered as employer profile$")
	public void user_must_be_registered_as_employer_profile() throws Throwable {
		//create one registration method and apply logic
	}

//	@When("^title of login page is Home$")
//	public void title_of_login_page_is_Home()  {
//		String Title = driver.getTitle();
//		Assert.assertEquals(Title, "HireXpert");
//	}

	@And("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws InterruptedException {
		loginpage.loginInAppWithEmpK();
	}

	@And("^Click on team tab$")
	public void click_on_team_tab() throws InterruptedException  {
		
		dashboardpage.openTeamPage();
	}

	@And("^Click on add Button to add the team member$")
	public void click_on_add_Button_to_add_the_team_member() throws Throwable {
//		Thread.sleep(1000);
//		teampage.clickOnAddBtn();
	}

	@And("^Fill all the mandatory details$")
	public void fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		Thread.sleep(1000);
		teampage.AddAllDetailsK(credentials);
	}

	@And("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
		Thread.sleep(1000);
//		teampage.ClickSumbit();
		
	}
//Expected result
	@Then("^Employer should be able to add team member$")
	public void employer_should_be_able_to_add_team_member()  {
	   //Successful message 
	}
	

	@Then("^Newly added team member should be displayed in team page$")
	public void newly_added_team_member_should_be_displayed_in_team_page()  {
		if(driver.getPageSource().contains(teampage.namevalidate)){
			System.out.println("Team get added sucesfully");
			}else{
			System.out.println("Team not get added");
			}	 
	}

	@Then("^the employer with which you have logged in should display in team tab by default$")
	public void the_employer_with_which_you_have_logged_in_should_display_in_team_tab_by_default()  
	{
		if(driver.getPageSource().contains(prop.getProperty("name"))){
			System.out.println("the employer with which you have logged is displaying");
			}else{
			System.out.println("the employer with which you have logged is displaying");
			}	 
		
	
	}
	
	@And("^delete the added agency$")
	public void delete_the_added_agency() throws InterruptedException  {
		teampage.deleteteamK();
	}
}
