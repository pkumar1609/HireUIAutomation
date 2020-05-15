package Stepdefination1Komal;

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
	
	@Before()
	public void setup() throws IOException
	{
		baseclass.initialization();
	}
	
	DataTable credentials;
	@Given("^User must be registered as employer profile abc$")
	public void user_must_be_registered_as_employer_profile() throws Throwable {    
		
	}

	@When("^title of login page is Home abc$")
	public void title_of_login_page_is_Home()  {
		agenciespage.getTitle();
	}

	@And("^user enters valid credentials abc$")
	public void user_enters_valid_credentials() throws InterruptedException{
		loginpage.loginInAppWithEmpK();
	}

	@And("^Click on Agencies tab$")
	public void click_on_Agencies_tab() throws InterruptedException  {
		Thread.sleep(1000);
		agenciespage.Clickagencybtn();
	}

	@And("^Click on add Button to add the agency$")
	public void click_on_Add_Button_to_add_the_agency() throws InterruptedException {
	
		agenciespage.clickOnAddButton();
	}
	

	@And("^Fill all the mandatory details$")
		public void fill_all_the_mandatory_detail(DataTable credentials) throws InterruptedException  {
		Thread.sleep(1000);
		
		agenciespage.enterAllDetails(credentials);
		this.credentials= credentials; 
	}
	
	@And("^Click on Submit button$")
	public void click_on_Submit_button() throws InterruptedException   
	{
		Thread.sleep(1000);
		agenciespage.Submitbtn();
	}

	@Then("^Employer should be able to add Agency$")
	public void employer_should_be_able_to_add_Agency() {
	boolean b=  driver.findElement(By.xpath("//h5[@class='modal-title w-100']")).isDisplayed();
	Assert.assertEquals(b, true);
	}

	@Then("^Newly added agency should be displayed in Agencies page$")
	public void newly_added_agency_should_be_displayed_in_Agencies_page() throws InterruptedException {
	Thread.sleep(1000);
	if(driver.getPageSource().contains(agenciespage.namevalidate)){
		System.out.println("Text is present");
		}else{
		System.out.println("Text is absent");
		}
	}
	
	@And("^delete the added agency$")
	public void delete_the_added_agency() throws InterruptedException  {
		agenciespage.deleteagy();
	}
	
	@After()
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}




