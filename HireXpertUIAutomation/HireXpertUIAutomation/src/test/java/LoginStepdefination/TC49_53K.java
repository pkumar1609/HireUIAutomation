package LoginStepdefination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC49_53K extends baseclass {
	
	public TC49_53K() throws IOException 
	{
		super();
	}
	
//	@Before()
//	public void setup() throws IOException
//	{
//		baseclass.initialization();
//	}
	
	String deleteele;
	String checkelement;
	

	
	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws InterruptedException {
		loginpage.loginInAppWithAgyK();
	}

	@And("^Click on Employer tab$")
	public void click_on_Employer_tab() throws InterruptedException  {
	
		dashboardpage.openEmployersPage();
	}



	@And("^Click on add Button and Fill all the mandatory details for Agency$")
	public void fill_all_the_mandatory_details(DataTable credentials) throws InterruptedException   {
		Thread.sleep(1000);
		employerspage.enterValidCredentials(credentials);
	}

	@Then("^Agency should be able to add Employer$")
	public void Agency_should_be_able_to_add_Employer()  {
		//Sucessful message
	 
	}

	@Then("^Newly added employer should be displayed in employer page$")
	public void newly_added_employer_should_be_displayed_in_Employer_page() {
		System.out.println(size);
	for(int i=0; i<size; i++) 
		{
			if(driver.getPageSource().contains(ar.get(i)))
			{
			     System.out.println(ar.get(i)+" is present");
			}
		    else{
			     System.out.println("some element is absent");
			} 
		}
}
	
	
	@And("^delete the added employer$")
	public void delete_the_added_employer() throws InterruptedException {
		Thread.sleep(1000);	
		employerspage.deleteemp();

        }
	
	@Then("^deleted employer should not be display in employer page$")
	public void deleted_employer_should_not_be_display_in_team_page()  {
		
			System.out.println("element got deleted");
	
}
}