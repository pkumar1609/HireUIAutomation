package BVT_StepDefination;

import utilPackage.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobCandidateOfferedStepDefination extends baseclass {

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

		dashboardpage.openJobOfferedPage();
		
		WebElement candCardFromIncompleteColumn = driver.findElement(By.xpath(
				"//th[contains(text(),' Incomplete Information')]//following::h6[@title='Candidate Name' and contains(text(),'"
						+ candidateName + "')]"));
		Assert.assertEquals(candCardFromIncompleteColumn.isDisplayed(), true);
	}

	@Then("^Employer is able to edit candidate from Job Offerred menu \"([^\"]*)\"$")
	public void employer_is_able_to_edit_candidate_from_Job_Offerred_menu(String candidateName) throws Throwable {
			
		WebElement candCardEditButtonToEdit = driver.findElement(By.xpath(
				"//div[@class='InvoiceDragCard']//div//div[@class='col-md-10 pr-0']//h6[contains(text(),'"+candidateName+"')]//ancestor::div[@class='col-md-10 pr-0']//following-sibling::div[@class='col-md-2 pl-0']//button"));		
		Assert.assertEquals(candCardEditButtonToEdit.isDisplayed(), true);
		
		candCardEditButtonToEdit.click();
		
		WebElement editDialog = driver.findElement(By.xpath("//h5[contains(text(),'Edit Candidate')]"));		
		String editCandidateDialogTitle = editDialog.getText();		
		Assert.assertEquals(editCandidateDialogTitle.contains("Edit Candidate"), true);
		
		Thread.sleep(3000);
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();		
	}
}
