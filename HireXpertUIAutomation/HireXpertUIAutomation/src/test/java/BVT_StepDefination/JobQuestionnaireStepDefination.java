package BVT_StepDefination;

import utilPackage.baseclass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobQuestionnaireStepDefination extends baseclass {

	@When("^Click on Add Questionnaire$")
	public void click_on_Add_Questionnaire() throws InterruptedException {

		Thread.sleep(3000);
		workbenchpage.job.click();
		workbenchpage.AddQuestionarybtn.click();
	}

	@When("^Candidate is moved to New column$")
	public void candidate_is_moved_to_New_column() throws Throwable {

		explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[2]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@When("^Verify Collect Answer icon when no questionary is added for that job$")
	public void verify_Collect_Answer_icon_when_no_questionary_is_added_for_that_job() throws Throwable {

		List<WebElement> collectanswericon = driver.findElements(By.xpath("//button[@title='Collect Answer']"));
		Assert.assertEquals(collectanswericon.size() > 0, false);
	}

	@When("^Click on Questionnaire tab$")
	public void click_on_Questionnaire_tab() throws InterruptedException {

		Thread.sleep(2000);
		workbenchpage.clickonAddQuestionarybtn();
	}

	@Then("^Click on  Collect Answers icon on candidate card$")
	public void Click_on_Collect_Answers_icon_on__candidate_card() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.candidateCardCollectAnswericon.click();
	}

	@When("^Enter first question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_first_question_and_marks(String QUESTION1, String QMARKS1) throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddQUESTION1(QUESTION1);
		addquestionarypage.AddMARKS1(QMARKS1);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for first question$")
	public void enter_the_answer_and_enter_Marks_for_first_question(String ANSWER1, String ANSWER2, String MARKS1,
			String MARKS2) throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
	}

	@When("^Enter second question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_second_question_and_marks(String QUESTION2, String QMARKS2) throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddQUESTION2(QUESTION2);
		addquestionarypage.AddMARKS2(QMARKS2);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for second question$")
	public void enter_the_answer_and_enter_Marks_for_second_question(String ANSWER3, String ANSWER4, String MARKS3,
			String MARKS4) throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddANSWERS2(ANSWER3, ANSWER4);
		addquestionarypage.AddMARKS2(MARKS3, MARKS4);
	}

	@When("^Enter thrid question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_thrid_question_and_marks(String QUESTION3, String QMARKS3) throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddQUESTION3(QUESTION3);
		addquestionarypage.AddMARKS3(QMARKS3);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\"  for thrid question$")
	public void enter_the_answer_and_enter_Marks_for_thrid_question(String ANSWER5, String ANSWER6, String MARKS5,
			String MARKS6) throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddANSWERS3(ANSWER5, ANSWER6);
		addquestionarypage.AddMARKS3(MARKS5, MARKS6);
	}

	@When("^Enter fourth question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_fourth_question_and_marks(String QUESTION4, String QMARKS4) throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.AddQUESTION4(QUESTION4);
		addquestionarypage.AddMARKS4(QMARKS4);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\"  for fourth question$")
	public void enter_the_answer_and_enter_Marks_for_fourth_question(String ANSWER7, String ANSWER8, String MARKS7,
			String MARKS8) throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.AddANSWERS4(ANSWER7, ANSWER8);
		addquestionarypage.AddMARKS4(MARKS7, MARKS8);
	}

	@Then("^Answer the same question$")
	public void answer_the_same_question() throws Throwable {

		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='checkmark'])[1]")))
				.click();
	}

	@Then("^Edit the same question$")
	public void edit_the_same_question() throws Throwable {

		Thread.sleep(2000);
		common.editbtn.get(0).click();
		WebElement inpurMarks = driver
				.findElement(By.xpath("//input[@placeholder='Mark' and @formcontrolname='Marks']"));
		inpurMarks.clear();
		inpurMarks.sendKeys("35");
	}

	@Then("^click on that Questionnaire tab and verify the answers given by employer$")
	public void click_on_that_Questionnaire_tab_and_verify_the_answers_given_by_employer() throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.ClickonQuestionnairetab();
	}

	@Then("^verify if the answer is correct it should display pass icon on candidate card or it should display fail icon if the asnswer is wrong with the candidate card in screened column$")
	public void verify_if_the_answer_is_correct_it_should_display_pass_icon_on_candidate_card_or_it_should_display_fail_icon_if_the_asnswer_is_wrong_with_the_candidate_card_in_screened_column()
			throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.verifypassfailicon();
	}

	@Then("^Verify revised question is displayed$")
	public void verify_revised_question_is_displayed() throws Throwable {

		Thread.sleep(3000);
		Assert.assertEquals(
				driver.findElement(By.xpath("//h6[contains(text(),'Revised Job Questions')]")).isDisplayed(), true);
		common.clickOnCloseBtn();
	}

	@When("^Add question and click on save changes button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_question_and_click_on_save_changes_button(String QUESTION1, String QMARKS1, String ANSWER1,
			String ANSWER2, String MARKS1, String MARKS2) throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.AddQUESTION1(QUESTION1);
		addquestionarypage.AddMARKS1(QMARKS1);
		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
		addquestionarypage.SaveChangesBtn.click();
	}

	@When("^Click on  Collect Answers icon on candidate card\\.$")
	public void click_on_Collect_Answers_icon_on_candidate_card() throws Throwable {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", workbenchpage.candidateCardCollectAnswericon);
	}

	@When("^Fill all the Questions answers \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_the_Questions_answers(String question, String answer) throws Throwable {
		addquestionarypage.answerthequestion(question, answer);
	}

	@When("^Click on screening tab$")
	public void click_on_screening_tab() throws Throwable {

		Thread.sleep(2000);
		workbenchpage.job.click();
		workbenchpage.ClickonScreeningBtn();
	}

	@When("^click on delete icon to delete any one of question$")
	public void click_on_delete_icon_to_delete_any_one_of_question() throws InterruptedException {

		Thread.sleep(3000);
		common.deletebtn.get(1).click();
	}

	@When("^Click on Delete Questionnarie button$")
	public void click_on_Delete_Questionnarie_button() throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.DeleteQuestionnarie.click();
		common.clickOnConfirmYes();
	}

	@When("^Enter a \"([^\"]*)\" and enter \"([^\"]*)\" accordingly to that question$")
	public void enter_a_and_enter_accordingly_to_that_question(String Question, String Marks)
			throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.AddQuestionT(Question);
		addquestionarypage.AddTotalMarksT(Marks);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\" accordingly to the answer$")
	public void enter_the_answer_and_enter_Marks_accordingly_to_the_answer(String answer1, String answer2,
			String marks1, String marks2) throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.AddAnswersT(answer1, answer2);
		addquestionarypage.AddMarksT(marks1, marks2);
	}

	@When("^Enter the cutoff & rejection percentage \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_the_cutoff_rejection_percentage(String cuttoffpercentage, String rejectionpercentage)
			throws InterruptedException {

		Thread.sleep(3000);
		addquestionarypage.EntercuttoffPercentageT(cuttoffpercentage);
		Thread.sleep(3000);
		addquestionarypage.EnterRejectionPercentageT(rejectionpercentage);
	}

	@When("^Click on edit button of question to edit the following question \"([^\"]*)\" and save the changes by clicking on Save Changes button$")
	public void click_on_edit_button_of_question_to_edit_the_following_question_and_save_the_changes_by_clicking_on_Save_Changes_button(
			String question) throws InterruptedException {

		explicitwait.until(ExpectedConditions.elementToBeClickable(addquestionarypage.questionaryEditIcon));
		executor.executeScript("arguments[0].click();", addquestionarypage.questionaryEditIcon);

		addquestionarypage.EditQuestionT(question);
		executor.executeScript("arguments[0].click();", addquestionarypage.SaveChangesBtn);
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", addquestionarypage.SubmitBtn);
	}

	@When("^Verify candidate present in Reject column$")
	public void Verify_candidate_present_in_Reject_column() throws Throwable {

		Thread.sleep(3000);
		WebElement candCard = driver.findElement(By.xpath(
				"//th[contains(text(),' Rejected ')]//following::h6[@title='Candidate Details']/child::span[text()=' hirecanQ']"));
		Assert.assertEquals(candCard.isDisplayed(), true);
	}

	@Then("^On candidate dashboard in Job section click on Screening for that job to which candidate is added$")
	public void on_candidate_dashboard_in_Job_section_click_on_Screening_for_that_job_to_which_candidate_is_added()
			throws Throwable {

		Thread.sleep(3000);
		WebElement screeningLinkToClick = driver.findElement(By.xpath("//p[contains(text(),'" + addjobpage.jobname
				+ "')]//following::a[@title='View screen detail']/child::p[text()='Screening']"));
		Assert.assertEquals(screeningLinkToClick.isDisplayed(), true);
		screeningLinkToClick.click();
	}

	@Then("^Verify candidate status$")
	public void verify_candidate_status() throws Throwable {

		Thread.sleep(2000);
		// click job reload btn
		driver.findElement(By.xpath("//button[@ngbtooltip='Reload jobs']")).click();

		WebElement status = driver.findElement(
				By.xpath("(//p[contains(text(),'" + addjobpage.jobname + "')]//following::p[text()=' Screened '])[1]"));

		explicitwait.until(ExpectedConditions.visibilityOf(status));
		
		Thread.sleep(3000);	

		Assert.assertEquals(status.getText().strip().equals("Screened"), true);
	}

	@Then("^On Employer login verify candidate card is moved to screening column$")
	public void on_Employer_login_verify_candidate_card_is_moved_to_screening_column() throws Throwable {

		loginpage.logoutFromAppK();
		Thread.sleep(3000);
		common.logout.click();
		Action.moveToElement(loginpage.login).perform();
		loginpage.ClickOnEmployerAgencySigninLink();
		Thread.sleep(3000);
		registerpage.employerlogin();

		dashboardpage.openWorkbenchPage();
		workbenchpage.selectWorkBenchJob(addjobpage.jobname);

		WebElement candCard = driver.findElement(By.xpath(
				"//th[contains(text(),' Screened ')]//following::h6[@title='Candidate Details']/child::span[text()=' hirecanQ']"));
		Assert.assertEquals(candCard.isDisplayed(), true);
	}

}
