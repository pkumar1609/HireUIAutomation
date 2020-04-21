package TC49_53;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Hirexpert.pages.AgencyPage;
import com.Hirexpert.pages.EmployerPage;
import com.Hirexpert.pages.LoginPage;
import com.Hirexpert.pages.TeamPage;
import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationTC49_53 extends TestBase{
	public StepDefinationTC49_53() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
		initizer();
		loginpage= new LoginPage();
		teampage= new TeamPage();
		employerpage = new EmployerPage();
	}
	
	String deleteele;
	int index;
	

	@Given("^User must be registered as agency profile$")
	public void user_must_be_registered_as_agency_profile() {
		
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home()  {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() {
		loginpage.loginInAppWithAgy();
	}

	@And("^Click on Employer tab$")
	public void click_on_Employer_tab() throws InterruptedException  {
		Thread.sleep(2000);
		employerpage.ClickEmpBtn();
	}

	@And("^Click on add Button to add the employer$")
	public void click_on_add_Button_to_add_the_employer() throws InterruptedException  {
		Thread.sleep(1000);
		employerpage.ClickAddBtn();
	}

	@And("^Fill all the mandatory details$")
	public void fill_all_the_mandatory_details(DataTable credentials) throws InterruptedException   {
		Thread.sleep(1000);
		employerpage.enterValidCredentials(credentials);
	}



	@Then("^Agency should be able to add Employer$")
	public void Agency_should_be_able_to_add_Employer()  {
		
	 
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
	public void delete_the_added_employer() throws InterruptedException 
		{
		for(int i=0; i<size; i++){
			while(ar.get(i).contentEquals("pe2")) {
				Thread.sleep(1000);
				employerpage.deleteemp();
		deleteele=ar.get(i);
		}
		}
        }
	
	@Then("^deleted employer should not be display in employer page$")
	public void deleted_employer_should_not_be_display_in_team_page()  {
		
			ar.contains(deleteele);
		
	
}
}