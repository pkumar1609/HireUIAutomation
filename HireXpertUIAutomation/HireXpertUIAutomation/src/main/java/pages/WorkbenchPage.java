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
	
	
	public String organisation;
	
	@FindBy(xpath = "//button[contains(text(),'Add Job')]")
	public WebElement addjob;
	
	@FindBy(id = "jobDropdown")
	public WebElement jobDropDown;
	
	@FindBy(xpath = "//button[contains(text(),' View Job ')]")
	public WebElement viewJobButton;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Agency')]")
	public WebElement shareWithAgencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add Candidate')]")
	public WebElement addCandidateButton; 
	
	@FindBy(xpath = "//button[@title='Share With Team']")
	public WebElement shareWithTeamButton;
	
	@FindBy(xpath = "//button[contains(text(),'Edit Job')]")
	public WebElement editJobButton;
	
	@FindBy(xpath = "//button[@title='Schedule Interview']")
	public WebElement scheduleInterview;
	
	@FindBy(xpath="//button[contains(text(),'Add Questionary')]")   
	public WebElement AddQuestionarybtn;
	
	@FindBy(xpath="//button[@title='Collect Answer']")
	public WebElement candidateCardCollectAnswericon;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-job-question-answer/div[3]/button[2]")
	public WebElement submitButtonCollectAnswer;
	
	@FindBy(xpath="//button[contains(text(),'Screening')]")
	public WebElement screeningbtn;
	
	@FindBy(xpath = "//div[contains(@class,'tx-profile')]")
	public WebElement profile;
	
	@FindBy(xpath = "//a[@class='dropdown-item']")
	public WebElement userName;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	public WebElement ChangePasswordTab;
	
	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	public WebElement updateProfile;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	public WebElement Logout;
	
	@FindBy(xpath = "//button[text()=' Agreement']")
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
	
	@FindBy(xpath = "//button[@title='Reload Job']")
	public WebElement ReloadJobButton;
	
	
	@FindBy(xpath = "//select[@formcontrolname='AssignedToName']")
	public WebElement filtersAssignToList;
	
	@FindBy(xpath = "//button[contains(text(),'Close Job')]")     
	public WebElement closejobbtn;
	
	@FindBy(id = "rejectReason")
	public WebElement rejectcandidatereason;
	
	@FindBy(xpath="//i[@id='dropdownBasic1']") 
	public WebElement threeDot;
	
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
		Thread.sleep(4000);
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
		Thread.sleep(2000);
		workbenchpage.threeDot.click();
		editJobButton.click();
		Thread.sleep(2000);
		job= addjobpage.title.getAttribute("value");
		common.clickOnCloseBtn();
		System.out.println(job);
		}
		
	}
	
	public void selectjobT(String JobTitle, String OrganizationName) throws InterruptedException {
  		
  		Thread.sleep(5000);
		jobDropDown.click();
		driver.findElement(By.xpath("//option[contains(text(),'"+JobTitle+" "+" "+"-"+" "+OrganizationName+" "+"-"+" "+" "+"Active"+"')]")).click();
	}
	
	public void selectJobK() throws InterruptedException {
	
		
//		select = new Select(jobDropDown);
//		select.selectByIndex(1);
//		select.selectByVisibleText();
		Thread.sleep(2000);
		jobDropDown.click();
		driver.findElement(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]")).click();
// 		updateprofilepopuppage.getDetails();
//		this.emp=loginpage.b;
//		if(emp==true)
//		{
//		organisation=updateprofilepopuppage.Organization;
//		select.selectByVisibleText(" "+addjobpage.jobname+"  - "+organisation+" -  Active ");
//		select.selectByValue(addjobpage.jobname);
//		} 
//		else
//		{
//		select.selectByValue(addjobpage.jobname);
//		select.selectByVisibleText(" "+addjobpage.jobname+"  - "+organisation+" -  Active " );
//		}
	}
	
	public void clickonthreedot() throws InterruptedException {
		
		Thread.sleep(4000);
		threeDot.click();
	}
	
	public void clickonAddQuestionarybtn() {
		
		AddQuestionarybtn.click();
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
		Thread.sleep(3000);
		addCandidateButton.click();
	}
	
	public void clickOnAgreementbtn() throws InterruptedException
	{
		workbenchpage.clickonthreedot();
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
//			     closejobbtn.click();
//			     common.clickOnConfirmYes();
				clickonthreedot();
				Thread.sleep(2000);
				closejobbtn.click();
				common.clickOnConfirmYes();
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



public void selectCandidateRejectionReason () {
	
	Select select = new Select (rejectcandidatereason);
	select.selectByVisibleText("Communication Is Not Good");
}


public void deleteEmployerfromEmployerTabasAgency() throws InterruptedException {

List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
if(dynamicElement.size() != 0){

	System.out.println("\nEmployer tab not present for Employer user..");
}

else{

	dashboardpage.openEmployersPage();
	Thread.sleep(3000);
	employerspage.searchEmployer();	
	Thread.sleep(2000);
	employerspage.deleteSearchedEmployer();
	Thread.sleep(2000);
	common.clickOnConfirmYes();
	Thread.sleep(2000);
	common.clickOnCloseBtn();
}
}
}







	
