package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ScreeningPage extends baseclass {

	@FindBy(xpath = "//td[contains(text(),'Failed')]")
	public WebElement candidatestatus;

	@FindBy(xpath = "//button[@title='Create']")
	private WebElement createNewButton;

	@FindBy(xpath = "//input[@type='text' and @role='combobox']")
	private WebElement jobDropdown;

	@FindBy(xpath = "//h5[contains(text(),'Add')]")
	private WebElement popUpAddDialog;

	@FindBy(xpath = "//input[@id='jobTitle']")
	private WebElement jobTitle;

	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement profileTitle;

	@FindBy(xpath = "//input[@placeholder='Passing Percentage']")
	private WebElement passingPercent;

	@FindBy(xpath = "//select[@formcontrolname='ScreeningType']")
	private WebElement screeningType;

	@FindBy(xpath = "//select[@placeholder='Reject Percentage']")
	private WebElement rejectPercent;
	
	@FindBy(xpath = "//button[@title='edit' and contains(text(),'Edit')]")
	private WebElement editButton;
	
	@FindBy(xpath = "//button[contains(text(),'Publish')]")
	private WebElement publishButton;
		
	@FindBy(xpath = "//button[contains(text(),'Disable')]")
	private WebElement disableButton;

	@FindBy(xpath = "//button[contains(text(),'Add New Question')]")
	private WebElement addNewQuestionButton;

	@FindBy(xpath = "//h5[contains(text(),'Add Question')]")
	private WebElement addNewQuestionPopUp;

	@FindBy(xpath = "//select[@formcontrolname='QuestionType']")
	private WebElement questionType;

	@FindBy(xpath = "(//input[@formcontrolname='Marks'])[1]")
	private WebElement mainMarks;

	@FindBy(xpath = "//input[@placeholder='Question Time In Minutes']")
	private WebElement questionTime;

	@FindBy(xpath = "//select[@formcontrolname='NeedExplanationofAnswer']")
	private WebElement explanationRequired;

	@FindBy(xpath = "//textarea[@id='Question']")
	private WebElement questionTextArea;

	@FindBy(xpath = "//input[@placeholder='Answer']")
	private WebElement answer;

	@FindBy(xpath = "//input[@placeholder='Mark']")
	private WebElement mark;

	@FindBy(xpath = "//button[contains(text(),'Save Changes')]")
	private WebElement saveChangesButton;

	public ScreeningPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getScreeningCreateNewButton() {
		return createNewButton;
	}

	public WebElement getScreeningJobDropdown() {
		return jobDropdown;
	}

	public WebElement getScreeningPopUpAddDialog() {
		return popUpAddDialog;
	}

	public WebElement getScreeningJobTitle() {
		return jobTitle;
	}

	public WebElement getScreeningProfileTitle() {
		return profileTitle;
	}

	public WebElement getScreeningPassingPercent() {
		return passingPercent;
	}

	public WebElement getScreeningType() {
		return screeningType;
	}

	public WebElement getScreeningRejectPercent() {
		return rejectPercent;
	}

	public WebElement getScreeningAddNewQuestionButton() {
		return addNewQuestionButton;
	}

	public boolean getProfileGridrow(String profTitle) {
		WebElement profileTestGridRow = driver.findElement(By.xpath("//p[contains(text(),'" + profTitle + "')]"));
		if (profileTestGridRow.isDisplayed())
			return true;
		return false;
	}

	public WebElement getScreeningAddNewQuestionPopUp() {
		return addNewQuestionPopUp;
	}

	public boolean checkAddNewQuestionPopUpDisplayed() {
		if (addNewQuestionPopUp.isDisplayed())
			return true;
		return false;
	}

	public WebElement getQuestionType() {
		return questionType;
	}

	public WebElement getScreeningMainMarks() {
		return mainMarks;
	}

	public WebElement getScreeningQuestionTime() {
		return questionTime;
	}

	public WebElement getScreeningExplanationRequired() {
		return explanationRequired;
	}

	public WebElement getScreeningQuestionTextArea() {
		return questionTextArea;
	}

	public WebElement getScreeningGridAnswer() {
		return answer;
	}

	public WebElement getScreeningGridMark() {
		return mark;
	}

	public WebElement getScreeningSaveChangesButton() {
		return saveChangesButton;
	}

	public WebElement getScreeningPublishButton() {
		return publishButton;
	}	

	public WebElement getScreeningEditButton() {
		return editButton;
	}	
	
	public WebElement getScreeningDisableButton() {
		return disableButton;
	}
	
	public boolean getAddEditGridQuestionRrow(String gridQuestion) {
		WebElement addEditGridQuestionRrow = driver.findElement(By.xpath("//textarea[contains(text(),'"+gridQuestion+"')]"));
		if (addEditGridQuestionRrow.isDisplayed())
			return true;
		return false;
	}
	
}
