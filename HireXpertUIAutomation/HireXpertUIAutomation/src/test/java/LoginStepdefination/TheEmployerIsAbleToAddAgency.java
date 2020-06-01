package LoginStepdefination;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TheEmployerIsAbleToAddAgency extends baseclass {

	public TheEmployerIsAbleToAddAgency() throws IOException {
	
		super();
	}
	
//	@Before()
//	public void setup() throws IOException
//	{
//		baseclass.initialization();
//	}
	
	DataTable credentials;
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

	
	

	@And("^Click on add Button Fill all the mandatory details for agency$")
		public void fill_all_the_mandatory_detail(DataTable credentials) throws InterruptedException  {
		agenciespage.enterAllDetails(credentials);
	}
	


	@Then("^Employer should be able to add Agency$")
	public void employer_should_be_able_to_add_Agency() {
	boolean b=  driver.findElement(By.xpath("//h5[@class='modal-title w-100']")).isDisplayed();
	Assert.assertEquals(b, true);
	}

	@Then("^Newly added agency should be displayed in Agencies page$")
	public void newly_added_agency_should_be_displayed_in_Agencies_page() throws InterruptedException {
		agenciespage.AddedAgyencyDisplaying();
	
	}
	
	@And("^delete the added agency$")
	public void delete_the_added_agency() throws InterruptedException  {
		agenciespage.deleteagy();
	}
	
//	@After()
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
	
	
}




