package RegressionTc;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import pages.EmployersPage;
import utilPackage.baseclass;

public class TC_78_80_95 extends baseclass{

//@And("^Click on Search section and enter already existing employer$")
//public void click_on_Search_section_and_enter_already_existing_employer(DataTable credentials) throws Throwable {
//    employerspage.searchExistingEmp(credentials);
//}
//
//@And("^User should able to search employer$")
//public void user_should_able_to_search_employer() throws Throwable {
//	try
//	  {
//		  driver.findElement(By.xpath("//td[contains(text(),'"+ employerspage.ele +"')]")).isDisplayed();
//		  System.out.println("searched employer is displaying on employer page");
//		  common.clickOnCloseBtn();
//	  }
//	  catch(NoSuchElementException e)
//	  {
//		  System.out.println("issue");
//	  }
//}
//
//@And("^Click on Search section and enter already existing agency team$")
//public void click_on_Search_section_and_enter_already_existing_agency_team(DataTable credentials) throws Throwable {
//   teampage.searchExistingTeam(credentials);
//}
//
//@And("^User should able to search agency team$")
//public void user_should_able_to_search_agency_team() throws Throwable {
//	 try
//	  {
//		  driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed();
//		  System.out.println("searched team is displaying on team page");
//	  }
//	  catch(NoSuchElementException e)
//	  {
//		  System.out.println("issue");
//	  }
//}\
	@And("^agency enters valid credentials$")
	public void agency_enters_valid_credentials() throws Throwable {
	   loginpage.loginInAppWithAgyK();
	}

	@And("^Click on Employer tab$")
	public void click_on_Employer_tab() throws Throwable {
	   dashboardpage.openEmployersPage();
	}

	@And("^Click on add Button and Fill all the mandatory details for employer$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_employer(DataTable credentials) throws Throwable {
		employerspage.enterValidCredentials(credentials);
	}

	@And("^Click on Search section and enter already existing employer$")
	public void click_on_Search_section_and_enter_already_existing_employer(DataTable credentials) throws Throwable {
		employerspage.searchExistingEmp(credentials);
	}

	@And("^User should able to search employer$")
	public void user_should_able_to_search_employer() throws Throwable {
		
		driver.findElement(By.xpath("//td[contains(text(),'"+ employerspage.ele +"')]")).isDisplayed();
		System.out.println("searched team is displaying on team page");
	}

	@And("^Click on add Button and Fill all the mandatory details for agency team$")
	public void click_on_add_Button_and_Fill_all_the_mandatory_details_for_agency_team(DataTable credentials) throws Throwable {
		teampage.AddAllDetailsagyK(credentials);
	}

	@And("^Click on Search section and enter already existing agency team$")
	public void click_on_Search_section_and_enter_already_existing_agency_team(DataTable credentials) throws Throwable {
		teampage.searchExistingTeam(credentials);
	}

	@And("^User should able to search agency team$")
	public void user_should_able_to_search_agency_team() throws Throwable {
		
		driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed();
	    System.out.println("searched team is displaying on team page");
		
	}
}