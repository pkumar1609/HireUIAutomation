package Stepdefination1;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Hirexpert.pages.AgencyPage;
import com.Hirexpert.pages.LoginPage;
import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TheEmployerIsAbleToAddAgency extends TestBase {

public TheEmployerIsAbleToAddAgency() throws IOException {
		super();
	}
	@Before()
	public void setup() throws IOException
	{
		initizer();
		Agencypage = new AgencyPage();
		loginpage= new LoginPage();
	
	}
	
	DataTable credentials;
	@Given("^User must be registered as employer profile abc$")
	public void user_must_be_registered_as_employer_profile() throws Throwable {    
		
	}

	@When("^title of login page is Home abc$")
	public void title_of_login_page_is_Home()  {
		Agencypage.getTitle();
	}

	@And("^user enters valid credentials abc$")
	public void user_enters_valid_credentials(){
		loginpage.loginInApp();
	}

	@And("^Click on Agencies tab$")
	public void click_on_Agencies_tab() throws InterruptedException  {
		Thread.sleep(1000);
		Agencypage.Clickagencybtn();
	}

	@And("^Click on add Button to add the agency$")
	public void click_on_Add_Button_to_add_the_agency() throws InterruptedException {
		Thread.sleep(1000);
		Agencypage.ClickAddbtn();
	}
	

	@And("^Fill all the mandatory details$")
		public void fill_all_the_mandatory_detail(DataTable credentials) throws InterruptedException  {
		Thread.sleep(1000);
		
		AgencyPage.enterAllDetails(credentials);
		this.credentials= credentials; 
	}
	
	@And("^Click on Submit button$")
	public void click_on_Submit_button() throws InterruptedException   
	{
		Thread.sleep(1000);
		Agencypage.Submitbtn();
	}

	@Then("^Employer should be able to add Agency$")
	public void employer_should_be_able_to_add_Agency() {
	boolean b=  driver.findElement(By.xpath("//h5[@class='modal-title w-100']")).isDisplayed();
	Assert.assertEquals(b, true);
	//sucessful message
	}

	@Then("^Newly added agency should be displayed in Agencies page$")
	public void newly_added_agency_should_be_displayed_in_Agencies_page() throws InterruptedException {
	Thread.sleep(1000);
	if(driver.getPageSource().contains(AgencyPage.namevalidate)){
		System.out.println("Text is present");
		}else{
		System.out.println("Text is absent");
		}
	}
	
	@And("^delete the added agency$")
	public void delete_the_added_agency() throws InterruptedException  {
		Agencypage.deleteagy();
	}
	
	
	
	}




