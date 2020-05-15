package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

public class WorkbenchPage extends baseclass {
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/workbench/div/div[1]/div/div[1]/div[3]/div[1]/button[1]")
	public WebElement addjob;
	
	@FindBy(id = "jobDropdown")
	public WebElement jobDropDown;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Agency')]")
	public WebElement shareWithAgencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add Candidate')]")
	public WebElement addCandidateButton; 
	
	@FindBy(xpath = "//button[contains(text(),'Share With Team')]")
	public WebElement shareWithTeamButton;
	
	@FindBy(xpath = "//button[contains(text(),'Edit Job')]")
	public WebElement editJobButton;
	
	@FindBy(xpath = "//button[@title=\"Schedule Interview\"]")
	public WebElement scheduleInterview;
	
	@FindBy(xpath = "//p[contains(text(),'28')]")
	public WebElement candidateCardInterviewDetails;
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/workbench/div/div[2]/div/table/tbody/tr/td[1]/div/div/div/div/div[2]/div[3]/div/div[2]/button")
	public WebElement candidateCardEditInterview;
	
	@FindBy(id="EditCandidate")
	public WebElement candidateCardEditCandidateIcon;
	
	@FindBy(xpath="//button[@title='Delete Candidate']")
	public WebElement candidateCardDeleteCandidateIcon;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesConfirmDeleteCandidate;
	
	@FindBy(xpath="//button[contains(text(),'Add Questionnaire')]")
	public WebElement AddQuestionarybtn;
	
	@FindBy(xpath="//button[@title='Collect Answer']")
	public WebElement candidateCardCollectAnswericon;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-job-question-answer/div[3]/button[2]")
	public WebElement submitButtonCollectAnswer;
	
	@FindBy(xpath="//button[contains(text(),'Screening')]")
	public WebElement screeningbtn;
	
	@FindBy(xpath = "//img[contains(@class,'profile')]")
	public WebElement profile;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	public WebElement ChangePasswordTab;
	
	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	public WebElement updateProfile;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	public WebElement Logout;
	
	@FindBy(xpath = "//button[@title='Agreement']")
	public WebElement agreementbtn;
	
	@FindBy(xpath = "//button[@title='Add Task']")
	public WebElement addTaskButton;
	
	@FindBy(xpath = "//button[contains(text(),'Reload Candidate')]")
	public WebElement reloadcandidatebtn;
	
	public String jobname;
	
	
	public WorkbenchPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void AddJob() {
		
		addjob.click();
	}
	
	public Select se;
	
	public void selectJob() {
		
		se = new Select(jobDropDown);
		se.selectByIndex(1);
	}
	
	public void selectAgencyJob() {
		
		se = new Select(jobDropDown);
		se.selectByIndex(1);
	}
	
	public void selectjobT() {
		se = new Select (jobDropDown);
  		se.selectByVisibleText("Job-1 Test Engineer - Active");
	}
	
	public void selectJobK() throws InterruptedException {
		Thread.sleep(2000);
		select = new Select(jobDropDown);
		select.selectByVisibleText(prop.getProperty("jobname"));	
	}
	
	public void verifyCollectAnswericonT() {
		
		try
		{
			candidateCardCollectAnswericon.isDisplayed();
		  System.out.println("Collect Answer icon is displayed on candidates card for giving answers");
		  
		}
		catch (NoSuchElementException e)
		{
		  System.out.println("Collect Answer icon is not displayed on candidates card as all the questions are deleted from Questionary tab");
		} 
	}

	public void verifyQuestionnarieScreeningTabT() {
		
		if((AddQuestionarybtn)!= null){
			System.out.println("Add Questionnarie button is not present on Agency Login");
		}
		else{
			System.out.println("Add Questionnarie button is present on Agency Login");
		}
		
		if((screeningbtn)!= null){
			System.out.println("Screening button is not present on Agency Login");
		}
		else{
			System.out.println("Screening button is present on Agency Login");
		}
	}
	
	public void openChangePasswordPage() {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		ChangePasswordTab.click();
	}
	
	public void openUpdateProfilePage() {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		updateProfile.click();
	}
	
	public void ClickonLogout() {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		Logout.click();
	}
	
	public void clickOnAddCandidate() throws InterruptedException
	{
		Thread.sleep(2000);
		addCandidateButton.click();
	}
	
	public void clickOnAgreementbtn() throws InterruptedException
	{
		Thread.sleep(1000);
		agreementbtn.click();
	}
	
	

}
