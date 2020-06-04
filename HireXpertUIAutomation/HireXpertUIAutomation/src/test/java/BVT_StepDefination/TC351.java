package BVT_StepDefination;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC351 extends baseclass {
	public TC351() throws IOException 
	{
		super();
	}
	
	@Before(order=1)
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}
//	
	boolean emp;
	
	@And("^Select a added job$")
	public void select_a_added_job() throws Throwable {
	    workbenchpage.selectJobK();
	}

	@And("^Click on share job with market place$")
	public void click_on_share_job_with_market_place() throws InterruptedException   {
		System.out.println(driver);
		Thread.sleep(2000);
		marketplacepage.ClickOnShareWithMarketPlace();
	}

	@And("^change information and click on submit$")
	public void change_information_and_click_on_submit(DataTable credentials) throws InterruptedException   {
	    
		marketplacepage.EnterdeatilsOfMarketplace(credentials);
	}

	@And("^Click on Employer marketplace tab$")
	public void Click_on_Employer_marketplace_tab() throws Throwable {
		marketplacepage.ClickOnMarketPlaceTab();
	}

	@Then("^Job should be list out in market place page on employer side\\.$")
	public void job_should_be_list_out_in_market_place_page_on_employer_side() throws Throwable {
		String s= prop.getProperty("isshared");
		if(driver.getPageSource().contains(s))
	    {
	    	System.out.println("selected job is displaying on employer side");
	    }
	    else
	    {
	    	System.out.println("selected job is not displaying on employer side");
	    }
	}

	

	@And("^Go to agency marketplace tab$")
	public void go_to_marketplace_tab() throws Throwable {
		marketplacepage.ClickOnAgyMarketPlaceTab();
	}

	@Then("^All shared job by any employer should be show for all register agencies$")
	public void all_shared_job_by_any_employer_should_be_show_for_all_register_agencies() throws Throwable {
		marketplacepage.marketPlaceJobAtAgy();
	}


}
