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

	@FindBy(xpath = "//button[contains(text(),'Add New Question')]")
	private WebElement addNewQuestionButton;

	@FindBy(xpath = "//h5[contains(text(),'Add Question')]")
	private WebElement addNewQuestionPopUp;

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

}
