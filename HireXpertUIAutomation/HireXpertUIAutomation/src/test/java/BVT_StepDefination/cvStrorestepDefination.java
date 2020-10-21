package BVT_StepDefination;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class cvStrorestepDefination extends baseclass {
	
	
	public String firstjob ;
	
	@When("^Go to CV store tab$")
	public void go_to_CV_store_tab() throws Throwable {
		Thread.sleep(2000);
	    dashboardpage.cvStrore.click();
	}

	@When("^select the basic filter from filter drop down$")
	public void select_the_basic_filter_from_filter_drop_down() throws Throwable {
	    select=new Select(cvstorepage.filterType);
	    select.selectByVisibleText(" Basic Filters ");
	}
	
	@When("^Add job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_jobskill_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3);		
		common.ClickSumbit();
	} 
	
	@When("^enter all value in basic filter fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_value_in_basic_filter_fields(String jobs, String designation, String mandatorySkills, String preferredSkills, String optionalSkills, String minexp, String maxexp, String salary, String noticeperiod, String city) throws Throwable {
	    cvstorepage.FillBasicFilterValues(jobs, designation, mandatorySkills, preferredSkills, optionalSkills, minexp, maxexp, salary, noticeperiod, city);
	}


	@Then("^verify the result of basic filter$")
	public void verify_the_result_of_basic_filter() throws Throwable {
	    
	}

	@Then("^Now select the advance filter from filter drop down$")
	public void now_select_the_advance_filter_from_filter_drop_down() throws Throwable {
	    
	}

	@Then("^enter all value in advance filter fields$")
	public void enter_all_value_in_advance_filter_fields() throws Throwable {
	    
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		 common.clickOnSearchBtn();
	}

	@Then("^verify the result of advance filter$")
	public void verify_the_result_of_advance_filter() throws Throwable {
	   
	}


}
