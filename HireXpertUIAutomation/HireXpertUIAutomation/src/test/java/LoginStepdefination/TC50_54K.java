package LoginStepdefination;

import java.io.IOException;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC50_54K extends baseclass {

	public TC50_54K() throws IOException 
	{
		super();
	}
//	
//	@Before()
//	public void setup() throws IOException
//	{
//		baseclass.initialization();
//	}
	

	@And("^Click on add Button and Fill all the mandatory details for agency team$")
	public void fill_all_the_mandatory_details(DataTable credentials) throws Throwable {
		
		teampage.AddAllDetailsagyK(credentials);

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

	@Then("^deleted employer should not be display in team page$")
	public void deleted_employer_should_not_be_display_in_team_page() throws Throwable {


	}
}
