package BVT_StepDefination;

import utilPackage.baseclass;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobCandidateOfferedStepDefination extends baseclass {

	job objjob = new job();

	@When("^Newly registered user logged in to Application \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void newly_registered_user_logged_in_to_Application(String name, String username, String contact,
			String userType, String timezone, String country, String password, String address, String organization,
			String website, String city) throws Throwable {

		registerpage.clickRegister();

		currentTime = LocalDateTime.now();
		String empUserName = dtFormate.format(currentTime) + username;

		registerpage.registeremployerdetails(name, empUserName, contact);
		registerpage.registerUserdetails(userType, timezone, country);
		common.ClickSumbit();
		registerpage.ClickYesbtn();
		common.clickOnOKBtn();

		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginInNew(empUserName, password);

		updateprofilepopuppage.UpdateProfile(address, organization, website, city);
		common.ClickSumbit();
	}

	@And("^Newly registered user creates new job$")
	public void newly_registered_user_creates_new_job(DataTable credentials) throws Throwable {

		dashboardpage.openWorkbenchPage();
		workbenchpage.AddJob();
		addjobpage.addjob(credentials);
		common.ClickSumbit();
		workbenchpage.selectWorkBenchJobNew(addjobpage.jobname);
		if (common.okbtnPopup.size() > 0) {
			common.okbtn.click();
		}
	}

	@When("^Candidate card is dragged to Offering Job column$")
	public void candidate_card_is_dragged_to_Offering_Job_column() throws Throwable {

		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[5]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@When("^Candidate card is dragged to Job Offered column$")
	public void candidate_card_is_dragged_to_Job_Offered_column() throws Throwable {

		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[6]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();

		Thread.sleep(5000);
	}

	@Then("^Verify on Job Offerred menu Candidate should display in the Incomplete information column \"([^\"]*)\"$")
	public void verify_on_Job_Offerred_menu_Candidate_should_display_in_the_Incomplete_information_column(
			String candidateName) throws Throwable {

		WebElement jobOfferedLink = driver.findElement(By.xpath("(//a[contains(text(),'Job Offered')])[2]"));
		if (jobOfferedLink.isDisplayed()) {
			jobOfferedLink.click();
		}
		WebElement candCardFromIncompleteColumn = driver.findElement(By.xpath(
				"//th[contains(text(),' Incomplete Information')]//following::h6[@title='Candidate Name' and contains(text(),'"
						+ candidateName + "')]"));
		Assert.assertEquals(candCardFromIncompleteColumn.isDisplayed(), true);
	}

	@Then("^Verify on Job Offerred menu Candidate should display in the Green column \"([^\"]*)\"$")
	public void verify_on_Job_Offerred_menu_Candidate_should_display_in_the_Green_column(String candidateName)
			throws Throwable {

		dashboardpage.openJobOfferedPage();

		// common.ClickReloadAllBtn();

		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//			By.xpath("//th[contains(text(),' Green (All good)')]//following::h6[@title='Candidate Name' and contains(text(),'"+ candidateName +"')]")));
		WebElement candCardFromGreenColumnn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//th[contains(text(),' Green (All good)')]//following::h6[@title='Candidate Name' and contains(text(),'"
						+ candidateName + "')]")));

		Assert.assertEquals(candCardFromGreenColumnn.isDisplayed(), true);

//		WebElement candCardFromGreenColumn = driver.findElement(By.xpath(
//  				"//th[contains(text(),' Green (All good)')]//following::h6[@title='Candidate Name' and contains(text(),'"
//  						+ candidateName + "')]"));

		// Assert.assertEquals(candCardFromGreenColumn.isDisplayed(), true);

		executor.executeScript("arguments[0].scrollIntoView(true);", candCardFromGreenColumnn);
	}

	@Then("^Verify on Job Offerred menu Candidate should display in the Red column \"([^\"]*)\"$")
	public void verify_on_Job_Offerred_menu_Candidate_should_display_in_the_Red_column(String candidateName)
			throws Throwable {

		dashboardpage.openJobOfferedPage();
		common.ClickReloadAllBtn();

		WebElement candCardFromRedColumn = driver.findElement(By.xpath(
				"//th[contains(text(),' Red (Action Required)')]//following::h6[@title='Candidate Name' and contains(text(),'"
						+ candidateName + "')]"));
		try {
			if (candCardFromRedColumn.isDisplayed()) {
				Assert.assertEquals(candCardFromRedColumn.isDisplayed(), true);
			}
		} catch (StaleElementReferenceException e) {
			if (candCardFromRedColumn.isDisplayed()) {
				Assert.assertEquals(candCardFromRedColumn.isDisplayed(), true);
			}
		}
	}

	@Then("^Employer is able to edit candidate from Job Offerred menu \"([^\"]*)\"$")
	public void employer_is_able_to_edit_candidate_from_Job_Offerred_menu(String candidateName) throws Throwable {

		WebElement candCardEditButtonToEdit = driver.findElement(
				By.xpath("(//div[@class='InvoiceDragCard']//div//div[@class='col-md-10 pr-0']//h6[contains(text(),'"
						+ candidateName
						+ "')]//ancestor::div[@class='col-md-10 pr-0']//following-sibling::div[@class='col-md-2 pl-0']//button)[1]"));

		if (candCardEditButtonToEdit.isDisplayed()) {
			Thread.sleep(3000);
			candCardEditButtonToEdit.click();
		}
		WebElement editDialog = driver.findElement(By.xpath("//h5[contains(text(),'Edit Candidate')]"));
		String editCandidateDialogTitle = editDialog.getText();
		Assert.assertEquals(editCandidateDialogTitle.contains("Edit Candidate"), true);
		Thread.sleep(3000);
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
	}

	@Given("^On Job Offerred tab click on Edit icon of candidate added \"([^\"]*)\"$")
	public void on_Job_Offerred_tab_click_on_Edit_icon_of_candidate_added(String candidateName) throws Throwable {

		dashboardpage.openJobOfferedPage();
		WebElement candCardEditButtonToEdit = driver.findElement(
				By.xpath("(//div[@class='InvoiceDragCard']//div//div[@class='col-md-10 pr-0']//h6[contains(text(),'"
						+ candidateName
						+ "')]//ancestor::div[@class='col-md-10 pr-0']//following-sibling::div[@class='col-md-2 pl-0']//button)[1]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(candCardEditButtonToEdit));

		executor.executeScript("arguments[0].click();", candCardEditButtonToEdit);

		// try {
		// if (candCardEditButtonToEdit.isDisplayed())
		// {
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.elementToBeClickable(candCardEditButtonToEdit));
		// candCardEditButtonToEdit.click();
		// }
		// }
		// catch(ElementClickInterceptedException)
		// {
		// candCardEditButtonToEdit.click();
		// }
	}

	@Given("^Add Salary Offered value and save changes \"([^\"]*)\"$")
	public void add_Salary_Offered_value_and_save_changes(String salaryOffered) throws Throwable {

		WebElement salOffered = driver.findElement(By.xpath("//input[@id='salaryOffered']"));
		if (salOffered.isDisplayed()) {
			salOffered.sendKeys(salaryOffered);
		}
		common.clickOnEditCandidateDialogSaveBtn();
	}

	@Then("^Verify Count of Active job on same candidate card$")
	public void verify_Count_of_Active_job_on_same_candidate_card() throws Throwable {

		// to find xpath for active job number count value
	}

	@Then("^Move the card to Schedule Interview column$")
	public void move_the_card_to_Schedule_Interview_column() throws Throwable {

		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[3]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();

		Thread.sleep(5000);
	}

	@Then("^Verify Count of Active Interview on same candidate card \"([^\"]*)\"$")
	public void verify_Count_of_Active_Interview_on_same_candidate_card(String candidateName) throws Throwable {

		String jobName = objjob.selectedJobName;

		WebElement eleCard = driver.findElement(By.xpath(
				"(//th[contains(text(),' Green (All good)')]//following::h6[@title='Candidate Name' and contains(text(),'"
						+ candidateName + "')]//following::p[contains(text(),'" + jobName
						+ "')]//following::p[contains(text(),'1')])[3]"));
		if (eleCard.isDisplayed()) {
			String cardInterviewCountValue = eleCard.getText();
			Assert.assertEquals(cardInterviewCountValue, "1");
		}
	}

	@Then("^Verify Count of Offer Taken on candidate card \"([^\"]*)\"$")
	public void verify_Count_of_Offer_Taken_on_candidate_card(String candidateName) throws Throwable {

		String jobName = job.selectedJobName;
		System.out.println("******Job Name => " + jobName);

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//th[contains(text(),' Green (All good)')]//following::p[contains(text(),'" + jobName + "')]")));

		WebElement candCard = driver.findElement(By
				.xpath("//th[contains(text(),' Green (All good)')]//following::p[contains(text(),'" + jobName + "')]"));

		executor.executeScript("arguments[0].scrollIntoView(true);", candCard);

		WebElement eleCard = driver.findElement(By.xpath(
				"(//th[contains(text(),' Green (All good)')]//following::h6[@title='Candidate Name' and contains(text(),'"
						+ candidateName + "')]//following::p[contains(text(),'" + jobName
						+ "')]//following::p[contains(text(),'1')])[3]"));

		if (eleCard.isDisplayed()) {
			System.out.println("****eleCard.getText() => " + eleCard.getText());
			String cardOfferTakenCountValue = eleCard.getText();
			System.out.println("****cardOfferTakenCountValue => " + cardOfferTakenCountValue);
			int cardValue = Integer.parseInt(cardOfferTakenCountValue);
			System.out.println("****cardValue => " + cardValue);
			Assert.assertEquals(cardValue > 0, true);
		}
	}

	@Then("^Verify Count of Offer Taken After Your Offer on candidate card$")
	public void verify_Count_of_Offer_Taken_After_Your_Offer_on_candidate_card() throws Throwable {

	}

	@Then("^Verify Count of Offered Salary count is increased on candidate card$")
	public void verify_Count_of_Offered_Salary_count_is_increased_on_candidate_card() throws Throwable {

		// need candidate name
	}

}
