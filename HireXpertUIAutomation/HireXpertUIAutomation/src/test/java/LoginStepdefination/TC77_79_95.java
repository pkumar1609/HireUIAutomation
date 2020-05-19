package LoginStepdefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import utilPackage.baseclass;

public class TC77_79_95 extends baseclass{
	
	
	public TC77_79_95() throws IOException 
	{
		super();
	}
	
	@And("^Click on Search section and enter already existing agency$")
	public void click_on_Search_section_and_enter_already_existing_agency(DataTable credentials) throws Throwable {
	  agenciespage.enterAgyNameInSearchSection(credentials);
	 
	}

	
	@And("^User should able to search agency$")
	public void user_should_able_to_search_agency() throws Throwable {
		
	  try
	  {
		  driver.findElement(By.xpath("//td[contains(text(),'"+ agenciespage.ele +"')]")).isDisplayed();
		  System.out.println("searched element is displaying on agencies page");
		  common.clickOnCloseBtn();
	  }
	  catch(NoSuchElementException e)
	  {
		  System.out.println("issue");
	  }
	}

	@And("^Click on Search section and enter already existing employer team$")
	public void click_on_Search_section_and_enter_already_existing_employer_team(DataTable credentials) throws Throwable {
		teampage.searchExistingTeam(credentials);
	}

	@And("^User should able to search employer team$")
	public void user_should_able_to_search_employer_team() throws Throwable {
	
		 try
		  {
			  driver.findElement(By.xpath("//td[contains(text(),'"+ teampage.ele +"')]")).isDisplayed();
			  System.out.println("searched team is displaying on team page");
		  }
		  catch(NoSuchElementException e)
		  {
			  System.out.println("issue");
		  }
	}

	

}
