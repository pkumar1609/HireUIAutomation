package BVT_StepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
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

	@When("^enter all value in basic filter fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_value_in_basic_filter_fields(String jobs, String designation, String mandatorySkills, String preferredSkills, String optionalSkills, String minexp, String maxexp, String salary, String noticeperiod, String city) throws Throwable {
	    cvstorepage.FillBasicFilterValues(jobs, designation, mandatorySkills, preferredSkills, optionalSkills, minexp, maxexp, salary, noticeperiod, city);
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		 common.clickOnSearchBtn();
	}

	@When("^Add job with All details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_job_with_All_details_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
		addjobpage.extraInfoOfJob(credentials);
		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3);		
		common.ClickSumbit();
	}

	@Then("^verify the result of basic filter \"([^\"]*)\"$")
	public void verify_the_result_of_basic_filter(String Name) throws Throwable {
		common.clickOnOKBtn();
		Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'"+Name+"')]")).isDisplayed(), true);
	}
	
	@Then("^Now select the advance filter from filter drop down$")
	public void now_select_the_advance_filter_from_filter_drop_down() throws Throwable {
		select=new Select(cvstorepage.filterType);
	    select.selectByVisibleText(" Advance Filters ");
	}
	
	@Then("^enter all value in advance filter fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_value_in_advance_filter_fields(String jobs, String designation, String mandatorySkills, String preferredSkills, String optionalSkills, String minexp, String maxexp, String salary, String noticeperiod, String City, String updatedOn, String industry, String overBudget, String OnNoticePeriod, String CityArea, String Gender, String minage, String maxage, String jobtype, String shift) throws Throwable {
		cvstorepage.advancedFilter(jobs, designation, mandatorySkills, preferredSkills, optionalSkills, minexp, maxexp, salary, noticeperiod, City, updatedOn, industry, overBudget, OnNoticePeriod, CityArea, Gender, minage, maxage, jobtype, shift);		
	}

	@Then("^verify the result of advance filter \"([^\"]*)\"$")
	public void verify_the_result_of_advance_filter(String Name) throws Throwable {
		common.clickOnOKBtn();
		Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'"+Name+"')]")).isDisplayed(), true);
	}

	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,profiletitle,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}
	
	@Then("^Click on view detail button$")
	public void click_on_view_detail_button() throws Throwable {
		cvstorepage.viewDetails.click();
	}
	
	@Then("^Assert all the details of candidate on cv store page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void assert_all_the_details_of_candidate_on_cv_store_page_and(String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String jobtype,String shift,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		cvstorepage.assertCandidateDetails(CandidateEmail, profiletitle, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, jobtype, shift, permanentAddress, relocate, Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3, certificateforskill1, certificateforskill2);
	}
}