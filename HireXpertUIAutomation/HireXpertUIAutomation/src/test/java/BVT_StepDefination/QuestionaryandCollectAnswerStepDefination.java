package BVT_StepDefination;

import java.io.IOException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.WorkbenchPage;
import utilPackage.baseclass;

public class QuestionaryandCollectAnswerStepDefination extends baseclass {
	
//	@When("^click on Employer-Agency SignIn link$")
//	public void click_on_Employer_Agency_SignIn_link() throws Throwable {
//	    
//		Thread.sleep(4200);
//		registerpage.clickEmployerAgencySignInlink();
//	}


	@When("^Login with Employer credential Who already have a Job added and a candidate added to that job$")
	public void login_with_Employer_credential_Who_already_have_a_Job_added_and_a_candidate_added_to_that_job() throws Throwable {
	    
		Thread.sleep(4200);
		registerpage.employerlogin();
	}

	@When("^Go to Workbench tab and select one job from job drop down$")
	public void go_to_Workbench_tab_and_select_one_job_from_job_drop_down() throws InterruptedException {
		
		Thread.sleep(4200);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectjobT();
	}

	@When("^Click on Questionnaire tab$")
	public void click_on_Questionnaire_tab() throws InterruptedException {
		
		Thread.sleep(3000);
		workbenchpage.clickonthreedot();
		Thread.sleep(4200);
		workbenchpage.clickonAddQuestionarybtn();
	}
	
	@When("^Enter a \"([^\"]*)\" and enter \"([^\"]*)\" accordingly to that question$")
	public void enter_a_and_enter_accordingly_to_that_question(String Question, String Marks) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddQuestionT(Question);
		addquestionarypage.AddTotalMarksT(Marks);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\" accordingly to the answer$")
	public void enter_the_answer_and_enter_Marks_accordingly_to_the_answer(String answer1, String answer2, String marks1, String marks2) throws Throwable {
	    
		Thread.sleep(3000);
		addquestionarypage.AddAnswersT(answer1, answer2);
		addquestionarypage.AddMarksT(marks1, marks2);
	}
	

//	@When("^click on Save Changes button$")
//	public void click_on_Save_Changes_button() throws InterruptedException  {
//		
//		Thread.sleep(3000);
//		addquestionarypage.SaveChangesBtn.click();
//	}

	
	@When("^Enter the cutoff & rejection percentage \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_the_cutoff_rejection_percentage(String cuttoffpercentage, String rejectionpercentage) throws InterruptedException {
	    
		Thread.sleep(3000);
        addquestionarypage.EntercuttoffPercentageT(cuttoffpercentage);
        Thread.sleep(3000);
        addquestionarypage.EnterRejectionPercentageT(rejectionpercentage);
	}
	   
	@When("^Click on edit button of question to edit the following question \"([^\"]*)\" and save the changes by clicking on Save Changes button$")
	public void click_on_edit_button_of_question_to_edit_the_following_question_and_save_the_changes_by_clicking_on_Save_Changes_button(String question) throws InterruptedException  {
	   
        Thread.sleep(3000);
        addquestionarypage.questionaryEditIcon.click();
        addquestionarypage.EditQuestionT(question);
        addquestionarypage.SaveChangesBtn.click();
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
	    
		Thread.sleep(3000);
		addquestionarypage.SubmitBtn.click();
	}
	
	
//	@Then("^Collect Answer icon should reflect on candidates card for giving answers$")
//	public void collect_Answer_icon_should_reflect_on_candidates_card_for_giving_answers()  {
//		
//		workbenchpage.verifyCollectAnswericonT();
//	}
	
	
	@When("^Enter first question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_first_question_and_marks(String QUESTION1, String QMARKS1) throws InterruptedException  {
		
		Thread.sleep(3000);
        addquestionarypage.AddQUESTION1(QUESTION1);
        addquestionarypage.AddMARKS1(QMARKS1);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for first question$")
	public void enter_the_answer_and_enter_Marks_for_first_question(String ANSWER1, String ANSWER2, String MARKS1, String MARKS2) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
	}


	@When("^Enter second question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_second_question_and_marks(String QUESTION2, String QMARKS2) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddQUESTION2(QUESTION2);
		addquestionarypage.AddMARKS2(QMARKS2);
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for second question$")
	public void enter_the_answer_and_enter_Marks_for_second_question(String ANSWER3, String ANSWER4, String MARKS3, String MARKS4) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddANSWERS2(ANSWER3, ANSWER4);
		addquestionarypage.AddMARKS2(MARKS3, MARKS4);
	}

	@When("^Enter thrid question \"([^\"]*)\" and marks \"([^\"]*)\"$")
	public void enter_thrid_question_and_marks(String QUESTION3, String QMARKS3) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddQUESTION3(QUESTION3);
		addquestionarypage.AddMARKS3(QMARKS3);;
	}

	@When("^Enter the answer \"([^\"]*)\" \"([^\"]*)\" and enter Marks \"([^\"]*)\" \"([^\"]*)\"  for thrid question$")
	public void enter_the_answer_and_enter_Marks_for_thrid_question(String ANSWER5, String ANSWER6, String MARKS5, String MARKS6) throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.AddANSWERS3(ANSWER5, ANSWER6);
		addquestionarypage.AddMARKS3(MARKS5, MARKS6);
	}

	
	@When("^click on delete icon to delete any one of question$")
	public void click_on_delete_icon_to_delete_any_one_of_question() throws InterruptedException  {
		
		Thread.sleep(3000);
		addquestionarypage.questionaryDeleteIcon.click();
	}
	
	
	@When("^Click on Delete Questionnarie button$")
	public void click_on_Delete_Questionnarie_button() throws InterruptedException {
	   
		Thread.sleep(3000);
		addquestionarypage.DeleteQuestionnarie.click();
		addquestionarypage.yesConfirmDeleteQuestionnarie.click();
	}

	@When("^click on ReloadCandidate button$")
	public void click_on_ReloadCandidate_button() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ReloadCandidateButton.click();

	}
	
	@When("^Verify Collect Answer icon when no questionary is added for that job$")
	public void verify_Collect_Answer_icon_when_no_questionary_is_added_for_that_job() throws Throwable {
	    
		workbenchpage.verifyCollectAnswericonT();
	}
	

	@Then("^Click on  Collect Answers icon on candidate card$")
	public void Click_on_Collect_Answers_icon_on__candidate_card() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.candidateCardCollectAnswericon.click();
		
	}

	@Then("^answer the question by selecting the provided options$")
	public void answer_the_question_by_selecting_the_provided_options() throws Throwable {

		Thread.sleep(4200);
		addquestionarypage.answerthequestion();
		common.ClickSumbit();
	}

	@Then("^verify if the answer is correct it should display pass icon on candidate card or it should display fail icon if the asnswer is wrong with the candidate card in screened column$")
	public void verify_if_the_answer_is_correct_it_should_display_pass_icon_on_candidate_card_or_it_should_display_fail_icon_if_the_asnswer_is_wrong_with_the_candidate_card_in_screened_column() throws Throwable {

		Thread.sleep(3000);
		addquestionarypage.verifypassfailicon();
	}

//	@Then("^click on logout tab$")
//	public void click_on_logout_tab() throws Throwable {
//	   
//		Thread.sleep(3000);
//		workbenchpage.ClickonLogout();
//	}

//	@Then("^click on Job Seeker\\(Candidate\\) Sign In link$")
//	public void click_on_Job_Seeker_Candidate_Sign_In_link() throws Throwable {
//
//		Thread.sleep(3000);
//		registerpage.clickJobseekerCandidateSignInlinklink();
//	}

	@Then("^login as the same candidate \"([^\"]*)\" \"([^\"]*)\" and click on Sign in$")
	public void login_as_the_same_candidate_and_click_on_Sign_in(String arg1, String arg2) throws Throwable {

		Thread.sleep(3000);
		registerpage.loginwithsamecandidate();
	}

	@Then("^verify on candidate dashboard that job is displayed with Questionnaire tab or not$")
	public void verify_on_candidate_dashboard_that_job_is_displayed_with_Questionnaire_tab_or_not() throws Throwable {
	    
		Thread.sleep(3000);
		candidatedashboardpage.verifyQuestionaryicononcandidatedashboard();
	}

	@Then("^click on that Questionnaire tab and verify the answers given by employer$")
	public void click_on_that_Questionnaire_tab_and_verify_the_answers_given_by_employer() throws Throwable {


		Thread.sleep(3000);
		candidatedashboardpage.ClickonQuestionnairetab();
	}


}
