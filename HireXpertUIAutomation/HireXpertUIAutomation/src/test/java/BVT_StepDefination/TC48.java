package BVT_StepDefination;


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
	
//	@Before()
//	public void setup() throws IOException
//	{
//		baseclass.initialization();
//	}
	

	@And("^Click on team tab$")
	public void click_on_team_tab() throws InterruptedException  {
		
		dashboardpage.openTeamPage();
	}

	@And("^Click on add Button and Fill all the mandatory details for employer team$")
	public void fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		teampage.AddAllDetailsK(credentials);
	}

	@Then("^Employer should be able to add team member$")
	public void employer_should_be_able_to_add_team_member()  {
		
	}
	

	@Then("^Newly added team member should be displayed in team page$")
	public void newly_added_team_member_should_be_displayed_in_team_page()  {
		
		if(driver.getPageSource().contains(teampage.namevalidate))
		{
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
	
	@And("^delete the added team$")
	public void delete_the_added_agency() throws InterruptedException  {
		teampage.deleteteamK();
	}
}
