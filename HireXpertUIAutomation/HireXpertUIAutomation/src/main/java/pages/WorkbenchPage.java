package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
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
	
	@FindBy(xpath = "//button[@title='Share With Team']")
	public WebElement shareWithTeamButton;
	
	@FindBy(xpath = "//button[contains(text(),'Edit Job')]")
	public WebElement editJobButton;
	
	@FindBy(xpath = "//button[@title=\"Schedule Interview\"]")
	public WebElement scheduleInterview;
	
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
	
	@FindBy(xpath = "//a[@class='dropdown-item']")
	public WebElement userName;
	
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
	
	@FindBy(xpath = "//button[@title='Add Candidate']")
	public WebElement addCandidatebtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	public WebElement emailfield;
	
	@FindBy(xpath = "//button[text()='Find']")
	public WebElement findbtn;
	
	@FindBy(xpath = "//input[@formcontrolname='Name']")
	public WebElement name;
	
	@FindBy(xpath = "//button[@title='Reload Candidate']")
	public WebElement ReloadCandidateButton;
	
	@FindBy(xpath = "//select[@formcontrolname='AssignedToName']")
	public WebElement filtersAssignToList;
	
	@FindBy(xpath = "//button[@title='Close Job']")
	public WebElement closejobbtn;
	
	@FindBy(id = "rejectReason")
	public WebElement rejectcandidatereason;
	
	
	
	public String jobname1;
	public String jobname2;
	String nameOfCan;
	public String username;
	public boolean emp;
	public String job;
	
	public void addTaskBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		addTaskButton.click();
	}
	
	public WorkbenchPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void AddJob() throws InterruptedException {
		Thread.sleep(3000);
		addjob.click();
	}
	
	public Select se;
	
	public void selectJob() throws InterruptedException {
		Thread.sleep(2000);
		se = new Select(jobDropDown);
		se.selectByIndex(1);
		Thread.sleep(2000);
		if(emp==true)
		{
		editJobButton.click();
		Thread.sleep(2000);
		job= addjobpage.title.getAttribute("value");
		common.clickOnCloseBtn();
		System.out.println(job);
		}
		
	}
	
	public void selectjobT() {
		se = new Select (jobDropDown);
  		se.selectByVisibleText("Job-1 Test Engineer - Active");
	}
	
	public void selectJobK() throws InterruptedException {
	
		Thread.sleep(2000);
		select = new Select(jobDropDown);
		this.emp=loginpage.b;
		if(emp==true)
		{
		select.selectByVisibleText(addjobpage.jobname+" - Active" );
		}
		else
		{
		select.selectByVisibleText(addjobpage.jobname+" - Active" );
		}
	}
	
	public void verifyCollectAnswericonT() {
		
//		if((candidateCardCollectAnswericon).isDisplayed()){
//			System.out.println("Collect Answer icon is displayed on candidates card for giving answers.");
//		}
//		else{
//			System.out.println("Collect Answer icon is not displayed on candidates card for giving answers as there is no questionary added.");
		
		List<WebElement> collectanswericon = driver.findElements(By.xpath("//button[@title='Collect Answer']"));
		if(collectanswericon.size() != 0){
			
			System.out.println("\nCollect Answer icon is displayed on candidates card for giving answers.");
		}
		
		else  {
			
			System.out.println("\nCollect Answer icon is not displayed on candidates card for giving answers as there is no questionary added.");
			
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
	
	public void openUpdateProfilePage() throws InterruptedException {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		Thread.sleep(2000);
		updateProfile.click();
	}
	
	public void ClickonLogout() {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		Logout.click();
	}
	
	public void userNameProfile() {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		username = userName.getText();
		System.out.println("\nLogged in user: " + username);
	}
	
	public void clickOnAddCandidate() throws InterruptedException
	{
		Thread.sleep(4000);
		addCandidateButton.click();
	}
	
	public void clickOnAgreementbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		agreementbtn.click();
	}
	
	public void enterEmailId(String CandidateEmail) throws InterruptedException           //added on add candidate page
	{
		emailfield.sendKeys(CandidateEmail);
		Thread.sleep(4000);
		findbtn.click();
//		nameOfCan= name.getText();
	}
	
	public void clickReloadCandidateButton() {
		
		ReloadCandidateButton.click();
	}
	
public void ClickonScreeningBtn() {
		
		screeningbtn.click();
	}


	public void clickOnCloseJobButton() throws InterruptedException {
//	
//	     closejobbtn.click();
//	     common.clickOnConfirmYes();
		}
	 
public void verifyCandidateAddedDisplayedOnWorkbenchOrNot () {
	
	
	{         
	  try   
	  {    
	    if(driver.findElement(By.xpath("//h6[@title='Candidate Details']")).isDisplayed())
	     
	    {      
	       System.out.println("Candidate added to job is displayed on workbench");
	    }    
	  }      
	  catch(NoSuchElementException e)     
	  {       
		  System.out.println("Candidate added to job is not displayed on workbench");
	  }       
	}
}

	

public void verifyDeletedCandidateNotDisplayedOnWorkbench () {
	
	
	{         
	  try   
	  {    
	    if(driver.findElement(By.xpath("//h6[@title='Candidate Details']")).isDisplayed())
	     
	    {      
	       System.out.println("Deleted Candidate is displayed on workbench");
	    }    
	  }      
	  catch(NoSuchElementException e)     
	  {       
		  System.out.println("Candidate is deleted and not displayed on workbench");
	  }       
	} 
}

public void dragCandidateCardtoRejectColumn () {
	
	Actions action = new Actions(driver);

 action.clickAndHold(driver.findElement(By.cssSelector("div.item-box.cdk-drag"))).moveToElement(driver.findElement(By.cssSelector("body.nimbus-is-editor:nth-child(2) div.container-fluid.pl-10.pr-10.pt-2:nth-child(2) div.row div.col-md-12 div.card div.card-body.mb-0.p-0.CardBodyHeight table.table.table-bordered.mb-1 tbody:nth-child(2) tr:nth-child(1) td.TableCard:nth-child(2) > div.drag-container"))).release().build().perform();
	
}

public void dragCandidateCardfromRejectColumntoJoinedColumn () {
	
	Actions action = new Actions(driver);

	action.clickAndHold(driver.findElement(By.cssSelector("div.item-box.cdk-drag"))).moveToElement(driver.findElement(By.xpath("//td[@id='jobStatusColumn' and @class='TableCard'] [10]"))).release().build().perform();
	
}

public void selectCandidateRejectionReason () {
	
	Select select = new Select (rejectcandidatereason);
	select.selectByVisibleText("Communication Is Not Good");
}

}
	
