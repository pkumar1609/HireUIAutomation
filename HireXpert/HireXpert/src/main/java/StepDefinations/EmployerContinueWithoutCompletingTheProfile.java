package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Hirexpert.utils.TestBase;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployerContinueWithoutCompletingTheProfile extends TestBase{
	
public EmployerContinueWithoutCompletingTheProfile() throws IOException {
		super();
	}
@Before
public void setup()
{
	  initizer();
}
	@Given("^User must be registered as employer profile$")
	public void user_must_be_registered_as_employer_profile()  {
	
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^user enters valid credentials$")
	public void user_enters_valid_credentials() {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("abhiemp@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")).click();

	}

	@And("^Click on Close button$")
	public void click_on_Close_button() {
	driver.findElement(By.xpath("//button[text()='Close']")).click();
	}

	@And("^A pop up will appear$")
	public void a_pop_up_will_appear()  {
	   
	}

	@And("^Click on yes button$")
	public void click_on_yes_button() throws Throwable {
	   
	}

	@And("^click on close button$")
	public void click_on_close_button() throws Throwable {
	   
	}

	@Then("^Click on no button$")
	public void click_on_no_button() throws Throwable {
	    
	}

}
