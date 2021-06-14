package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilPackage.baseclass;

public class AddQuestionaryPage extends baseclass {

	@FindBy(xpath = "//button[@title='Questionnaire']")
	public WebElement QuestionnarieTab;

	@FindBy(xpath = "//input[@placeholder='Add Question']")
	public WebElement AddQuestiontextbox;

	@FindBy(xpath = "//input[@placeholder='Marks']")
	public WebElement TotalMarksofQuestion;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	public WebElement Answer1;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")
	public WebElement Answer2;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")
	public WebElement Answer3;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]")
	public WebElement Answer4;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]")
	public WebElement Answer5;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")
	public WebElement Marks1;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/input[1]")
	public WebElement Marks2;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[3]/input[1]")
	public WebElement Marks3;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[4]/td[3]/input[1]")
	public WebElement Marks4;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-add-edit-question[1]/div[2]/div[1]/div[4]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[3]/input[1]")
	public WebElement Marks5;

	@FindBy(xpath = "//button[contains(text(),'Save Changes')]")
	public WebElement SaveChangesBtn;

	@FindBy(xpath = "//div[@class='col-md-3 pr-0']//input[@placeholder='Cutt-Off Percentage']")
	public WebElement CuttoffPercentage;

	@FindBy(xpath = "//input[@placeholder='Rejection Percentage']")
	public WebElement RejectionPercentage;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement SubmitBtn;

	@FindBy(xpath = "//i[@ngbtooltip='Edit']")
	public WebElement questionaryEditIcon;

	@FindBy(xpath = "//button[@ngbtooltip='Delete']")
	public WebElement questionaryDeleteIcon;

	@FindBy(xpath = "//button[contains(text(),'Delete Questionnaire')]")
	public WebElement DeleteQuestionnarie;

	@FindBy(id = "confirmModalBtn")
	public WebElement yesConfirmDeleteQuestionnarie;

	public AddQuestionaryPage() {

		PageFactory.initElements(driver, this);
	}

	public void ClickonQuestionnairetab() {

		QuestionnarieTab.click();
	}

	public void AddQuestionT(String Question) {

		AddQuestiontextbox.sendKeys(Question);
	}

	public void AddTotalMarksT(String Marks) {

		TotalMarksofQuestion.sendKeys(Marks);
	}

	public void AddAnswersT(String answer1, String answer2) {

		Answer1.sendKeys(answer1);
		Answer2.sendKeys(answer2);
	}

	public void AddMarksT(String marks1, String marks2) {

		Marks1.sendKeys(marks1);
		Marks2.sendKeys(marks2);
	}

	public void AddQUESTION1(String QUESTION1) {

		AddQuestiontextbox.sendKeys(QUESTION1);
	}

	public void AddMARKS1(String QMARKS1) {

		TotalMarksofQuestion.sendKeys(QMARKS1);
	}

	public void AddANSWERS1(String ANSWER1, String ANSWER2) {

		Answer1.sendKeys(ANSWER1);
		Answer2.sendKeys(ANSWER2);
	}

	public void AddMARKS1(String MARKS1, String MARKS2) {

		Marks1.sendKeys(MARKS1);
		Marks2.sendKeys(MARKS2);
	}

	public void AddQUESTION2(String QUESTION2) {

		AddQuestiontextbox.sendKeys(QUESTION2);
	}

	public void AddMARKS2(String QMARKS2) {

		TotalMarksofQuestion.sendKeys(QMARKS2);
	}

	public void AddANSWERS2(String ANSWER3, String ANSWER4) {

		Answer1.sendKeys(ANSWER3);
		Answer2.sendKeys(ANSWER4);
	}

	public void AddMARKS2(String MARKS3, String MARKS4) {

		Marks1.sendKeys(MARKS3);
		Marks2.sendKeys(MARKS4);
	}

	public void AddQUESTION3(String QUESTION3) {

		AddQuestiontextbox.sendKeys(QUESTION3);
	}

	public void AddMARKS3(String QMARKS3) {

		TotalMarksofQuestion.sendKeys(QMARKS3);
	}

	public void AddANSWERS3(String ANSWER5, String ANSWER6) {

		Answer1.sendKeys(ANSWER5);
		Answer2.sendKeys(ANSWER6);
	}

	public void AddMARKS3(String MARKS5, String MARKS6) {

		Marks1.sendKeys(MARKS5);
		Marks2.sendKeys(MARKS6);
	}

	public void AddQUESTION4(String QUESTION4) {

		AddQuestiontextbox.sendKeys(QUESTION4);
	}

	public void AddMARKS4(String QMARKS4) {

		TotalMarksofQuestion.sendKeys(QMARKS4);
	}

	public void AddANSWERS4(String ANSWER7, String ANSWER8) {

		Answer1.sendKeys(ANSWER7);
		Answer2.sendKeys(ANSWER8);
	}

	public void AddMARKS4(String MARKS7, String MARKS8) {

		Marks1.sendKeys(MARKS7);
		Marks2.sendKeys(MARKS8);
	}

	public void EntercuttoffPercentageT(String cuttoffpercentage) {

		CuttoffPercentage.clear();
		CuttoffPercentage.sendKeys(cuttoffpercentage);
	}

	public void EnterRejectionPercentageT(String rejectionpercentage) {

		RejectionPercentage.clear();
		RejectionPercentage.sendKeys(rejectionpercentage);
	}

	public void EditQuestionT(String question) {

		AddQuestiontextbox.clear();
		AddQuestiontextbox.sendKeys(question);
	}

	public void answerthequestion(String question, String answer) {

		WebElement element = driver.findElement(By.xpath("(//strong[contains(text(),'" + question
				+ "')]//following::span[contains(text(),'" + answer + "')]//following::span)[1]"));
		explicitwait.until(ExpectedConditions.visibilityOf(element));
		executor.executeScript("arguments[0].click();", element);
	}

	public void verifypassfailicon() {

		List<WebElement> PassIcon = driver.findElements(By.xpath("//button[@type='button' and @title='Pass']"));
		List<WebElement> FailIcon = driver.findElements(By.xpath("//button[@type='button' and @title='Fail']"));
		if (PassIcon.size() != 0) {

			System.out.println("Candidate is pass as Pass icon is displayed on candidate card in screened column.");
		}
		else if (FailIcon.size() != 0) {

			System.out.println("Candidate is fail as Fail icon is displayed on candidate card in Rejected column.");
		}
		else {

			System.out.println("Pass Fail icons are not present.");
		}
	}

	public void clickOnSaveChangesButton() throws InterruptedException {
		Thread.sleep(3000);
		SaveChangesBtn.click();
	}

}
