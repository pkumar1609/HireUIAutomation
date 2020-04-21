package StepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.hire.qa.util.TestUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class UserAccountStepDefination {
 WebDriver driver;
	@Given("^User is registered as employer in an application$")
	public void user_is_registered_as_employer_in_an_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://103.68.10.36:8100/");
		driver.manage().deleteAllCookies();
		
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
	}

	@And("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("abhiemp@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("12345");
	}

	@And("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")).click();
    
	}
	
	
	

	@And ("^user is on update profile page$")
	public void user_is_on_update_profile_page() throws InterruptedException  {
		Thread.sleep(10000);
		WebElement title= driver.findElement(By.xpath("//h5[text()= 'Update Profile']"));
				boolean b= title.isDisplayed();
		Assert.assertEquals(b,true);
	
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//img[@class='profile']"))).click().perform();
//		action.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-item CustomPointer']"))).click().perform();
			
		

	}
	

	@When("^enter all neccessory detalis$")
	public void enter_all_neccessory_detalis() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@id='agencyaddress']")).sendKeys("hvckuhsvdksjgb");
		driver.findElement(By.xpath("//input[@placeholder='Enter Organization']")).sendKeys("hvckyusvd");
		driver.findElement(By.xpath("//input[@placeholder='Enter WebSite']")).sendKeys("hdhs.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Wardha");		
		
	
	}

	@When("^Click on submit button$")
	public void click_on_submit_button() throws InterruptedException  {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Then("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	String url= driver.getCurrentUrl();
	System.out.println(url);
//	Assert.assertEquals(url, "http://103.68.10.36:8100/jobdashboard");
//	http://103.68.10.36:8100/home

	}

	@Then("^user close the browser$")
	public void user_close_the_browser()  {
	    driver.close();
	}
	
	

}
