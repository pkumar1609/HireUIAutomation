package BVT_StepDefination;

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

public class loginstepdefination extends baseclass {

	public loginstepdefination() throws IOException {
	
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}
	
	DataTable credentials;
	String deleteele;
	String checkelement;
	
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
	
	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws InterruptedException {
		loginpage.loginInAppWithAgyK();
	}

	@And("^Click on Employer tab$")
	public void click_on_Employer_tab() throws InterruptedException  {
	
		dashboardpage.openEmployersPage();
	}



//	@And("^Click on add Button and Fill all the mandatory details for employer$")
//	public void fill_all_the_mandatory_details(DataTable credentials) throws InterruptedException   {
//		Thread.sleep(1000);
//		employerspage.enterValidCredentials(credentials);
//	}

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

	
}




