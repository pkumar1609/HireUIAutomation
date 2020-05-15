package primaryContact;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class primaryContact extends baseclass {
	
	@Given("^User is on Home page of application$")
	public void user_is_on_Home_page_of_application() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^title of page is HireXpert$")
	public void title_of_page_is_HireXpert() throws Throwable {
	    
		String title = loginpage.validateTitle();
		System.out.println("Title of application: " + title);
	}

	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
	    
		loginpage.emailaddress.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@When("^click on Workbench tab and select job from Jobs drop down$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.selectJob();
		Thread.sleep(3000);
	}

	@When("^click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact$")
	public void click_on_Share_With_Team_button_and_observe_the_primary_contact_then_add_new_team_member_and_try_to_make_that_team_member_as_primary_contact(DataTable dt) throws Throwable {
	    
				List<List<String>> data = dt.raw();
		
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				
				List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
				if(dynamicElement.size() != 0){
					
					System.out.println("\nUser logged in as Employer..");
					
					workbenchpage.shareWithTeamButton.click();
					Thread.sleep(4000);
					sharewithteampage.searchEmployerPrimaryContact();
					Thread.sleep(3000);
					
					sharewithteampage.clickOnAddButton();
					Thread.sleep(3000);
					teampage.TeamMemberName.sendKeys(data.get(0).get(0));
					teampage.TeamMemberEmail.sendKeys(data.get(0).get(1));
					teampage.TeamMemberContactNumber.sendKeys(data.get(0).get(2));
					sharewithteampage.selectAddToTeamMember();
					Thread.sleep(2000);
					sharewithteampage.submitButton.click();
					Thread.sleep(3000);	
				}
				
				else{
					
					System.out.println("\nUser logged in as Agency..");
					
					workbenchpage.shareWithTeamButton.click();
					Thread.sleep(4000);
					sharewithteampage.searchAgencyPrimaryContact();
					Thread.sleep(3000);
					
					sharewithteampage.clickOnAddButton();
					Thread.sleep(3000);
					teampage.TeamMemberName.sendKeys(data.get(0).get(3));
					teampage.TeamMemberEmail.sendKeys(data.get(0).get(4));
					teampage.TeamMemberContactNumber.sendKeys(data.get(0).get(5));
					sharewithteampage.selectAddToTeamMember();
					Thread.sleep(2000);
					sharewithteampage.submitButton.click();
					Thread.sleep(3000);	
				}
				
				driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@Then("^user should not able to make multiple team members as primary contact$")
	public void user_should_not_able_to_make_multiple_team_members_as_primary_contact() throws Throwable {
	    
		sharewithteampage.closeButton.click();
		Thread.sleep(2000);
		
	}

	@Then("^user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact$")
	public void user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact() throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
		 //If list size is non-zero, element is present
			workbenchpage.shareWithTeamButton.click();
			Thread.sleep(3000);
			
			System.out.println("\nSearching for employer's team member..");
			
			sharewithteampage.findShareCheckboxForEmployerTeam();
		}
		
		else{
			
		 //Else if size is 0, then element is not present
			
			workbenchpage.shareWithTeamButton.click();
			Thread.sleep(3000);
			
			System.out.println("\nSearching for agency's team member..");
			
			sharewithteampage.findShareCheckboxForAgencyTeam();
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(5000);
		driver.quit();
	}

}
