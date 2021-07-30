package BVT_StepDefination;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class candidatePoolSteps extends baseclass {
	
	@Given("^An employer/agency user logged in to HireXpert \"([^\"]*)\",\"([^\"]*)\"$")
	public void an_employer_agency_user_logged_in_to_HireXpert(String Username, String Password) throws Throwable {
	    baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		loginpage.ClickOnEmployerAgencySigninLink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
	}
	@When("^Employer visits Recruitment menu, selects Candidate Pool and clicks on ‘Add Candidate’ button\\.$")
	public void employer_visits_Recruitment_menu_selects_Candidate_Pool_and_clicks_on_Add_Candidate_button() throws Throwable {

		dashboardpage.openWorkbenchPage();
		candidatePoolPage.clickOnCandidatePool();
		candidatePoolPage.clickOnAddCandidate();
	}
	
	@Then("^AddCandidate pop-up is displayed\\. Employer fills all mandatory information and clicks ‘Submit’$")
	public void addcandidate_pop_up_is_displayed_Employer_fills_all_mandatory_information_and_clicks_Submit() throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(candidatePoolPage.winAddCandidate));
		Assert.assertEquals(candidatePoolPage.winAddCandidate.isDisplayed(), true);
		candidatePoolPage.addCandidate();
		candidatePoolPage.assertValues();
	}


}
