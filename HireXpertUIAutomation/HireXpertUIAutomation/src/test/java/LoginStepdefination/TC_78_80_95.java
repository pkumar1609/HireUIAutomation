package LoginStepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import utilPackage.baseclass;

public class TC_78_80_95 extends baseclass{

@And("^Click on Search section and enter already existing employer$")
public void click_on_Search_section_and_enter_already_existing_employer(DataTable credentials) throws Throwable {
    employerspage.searchExistingEmp(credentials);
}

@And("^User should able to search employer$")
public void user_should_able_to_search_employer() throws Throwable {
	try
	  {
		  driver.findElement(By.xpath("//td[contains(text(),'"+ employerspage.ele +"')]")).isDisplayed();
		  System.out.println("searched employer is displaying on employer page");
		  common.clickOnCloseBtn();
	  }
	  catch(NoSuchElementException e)
	  {
		  System.out.println("issue");
	  }
}

@And("^Click on Search section and enter already existing agency team$")
public void click_on_Search_section_and_enter_already_existing_agency_team(DataTable credentials) throws Throwable {
   teampage.searchExistingTeam(credentials);
}

@And("^User should able to search agency team$")
public void user_should_able_to_search_agency_team() throws Throwable {
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
