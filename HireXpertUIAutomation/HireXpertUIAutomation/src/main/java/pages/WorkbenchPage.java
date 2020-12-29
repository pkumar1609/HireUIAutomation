package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilPackage.baseclass;

public class WorkbenchPage extends baseclass {
	
	
	public String organisation;
	
	@FindBy(xpath = "//button[text()=' Job']")
	public WebElement job;
	
	@FindBy(xpath = "//button[text()=' Candidate']")
	public WebElement candidate;
	
	@FindBy(xpath = "//button[text()='Add Job']")
	public WebElement addJob;
	
	@FindBy(id = "jobDropdown")
	public WebElement jobDropDown;
	
	@FindBy(xpath = "//button[contains(text(),' View Job ')]")
	public WebElement viewJobButton;
	
	@FindBy(xpath = "//button[text()=' Share Job']")
	public WebElement shareJob;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Agency')]")
	public WebElement shareWithAgencyButton;
	
	@FindBy(xpath = "//button[text()=' Add Candidate']")
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
	
	@FindBy(xpath = "//button[text()=' Reload Job']")
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
//	public String job;
	
	public void addTaskBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		addTaskButton.click();
	}
	
	public WorkbenchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void AddJob() throws InterruptedException {
		Thread.sleep(2000);
		job.click();
		addJob.click();
	}
	
	public Select se;
	
//	public void selectJob() throws InterruptedException {
//		Thread.sleep(2000);
//		se = new Select(jobDropDown);
//		se.selectByIndex(1);
//		Thread.sleep(2000);
//		if(emp==true)
//		{
//		Thread.sleep(2000);
//		workbenchpage.threeDot.click();
//		editJobButton.click();
//		Thread.sleep(2000);
//		job= addjobpage.title.getAttribute("value");
//		common.clickOnCloseBtn();
//		System.out.println(job);
//		}
//		
//	}
	
	public void selectjobT(String JobTitle, String OrganizationName) throws InterruptedException {
  		
  		Thread.sleep(5000);
		jobDropDown.click();
		driver.findElement(By.xpath("//option[contains(text(),'"+JobTitle+" "+" "+"-"+" "+OrganizationName+" "+"-"+" "+" "+"Active"+"')]")).click();
	}
	
	public void selectJobK() throws InterruptedException {
		Thread.sleep(4000);
		jobDropDown.click();
		WebElement element = driver.findElement(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		explicitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
//		driver.findElement(By.xpath("//option[contains(text(),'Interview Job 3')]")).click();
	}
	
	public void clickonthreedot() throws InterruptedException {	
		Thread.sleep(4000);
		threeDot.click();
	}
	
	public void clickonAddQuestionarybtn() throws InterruptedException {
		Thread.sleep(4000);
		job.click();
		AddQuestionarybtn.click();
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
	
	public void ClickonLogout() throws InterruptedException {
		
		WebElement we = profile;
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		Logout.click();
		Thread.sleep(2000);
		common.log_out.click();

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
		candidate.click();
		addCandidateButton.click();
	}
	
	public void clickOnAgreementbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		workbenchpage.shareJob.click();		
		agreementbtn.click();
	}
	
	public void enterEmailId(String CandidateEmail) throws InterruptedException           //added on add candidate page
	{
		Thread.sleep(2000);
		emailfield.sendKeys(CandidateEmail);
		Thread.sleep(4000);
		findbtn.click();
//		nameOfCan= name.getText();
	}
	
	public void clickReloadCandidateButton() throws InterruptedException {
		Thread.sleep(1000);
		candidate.click();
		ReloadCandidateButton.click();
	}
	
public void ClickonScreeningBtn() {
		
		screeningbtn.click();
	}


	public void clickOnCloseJobButton() throws InterruptedException
	{
		Thread.sleep(2000);
		job.click();
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

public void AssertDetailsOnCandidateDetails(String CandidateName, String JobTile, String CandidateEmail, String ContactNumber,String CandidateDesignation,String CandidateExperience, String emailaddress,String OnNoticePeriod,String CandidateNoticePeriod,String LastWorkingDay,String CandidateCTC,String CandidateExpectedCTC,String CandidateCountry,String CandidateCity,String CandidateCityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws InterruptedException
{
	Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='"+CandidateName+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//h6[text()=' "+JobTile+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Email Id ']//following::td[text()='"+CandidateEmail+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Contact No. ']//following::td[text()='"+ContactNumber+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Designation ']//following::td[text()='"+CandidateDesignation+"']")).isDisplayed(), true);		
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Experience ']//following::td[text()='"+CandidateExperience+" Years']")).isDisplayed(), true);	
	if(OnNoticePeriod.contentEquals(OnNoticePeriod)){
		
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Notice Period']//following::td[text()='"+CandidateNoticePeriod+" Days']")).isDisplayed(), true);
	}
	else{
		
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Last Working Day']//following::td[text()='"+addcandidatepage.datebelowField+" ']")).isDisplayed(), true);
		
	}
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Added By Email']//following::td[text()='"+emailaddress+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To ']//following::td[contains(text(),'"+emailaddress+"')])[1]")).isDisplayed(), true);
//	Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To Number']//following::td[text()='"+updateprofilepopuppage.Contact+"'])[1]")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To Email']//following::td[text()='"+emailaddress+"'])[1]")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Added By ']//following::td[contains(text(),'"+emailaddress+"')])")).isDisplayed(), true);	
//	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Added By Number']//following::td[text()='"+updateprofilepopuppage.Contact+"']")).isDisplayed(), true);	
//	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Interview ']//following::td[text()='"+scheduleinterviewpage.interviewDate+", "+scheduleinterviewpage.hourTime+" : "+scheduleinterviewpage.minuteTime+"']")).isDisplayed(), true);		
//	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Salary Offered ']//following::td[text()='"+Salaryoffered+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='CTC ']//following::td[text()='"+CandidateCTC+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Expected CTC ']//following::td[text()='"+CandidateExpectedCTC+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Country ']//following::td[text()='"+CandidateCountry+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='City ']//following::td[text()='"+CandidateCity+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Location ']//following::td[text()='"+CandidateCityArea+"']")).isDisplayed(), true);
	Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Zipcode ']//following::td[text()='"+ZipCode+"']")).isDisplayed(), true);
}

public void assertskill(String JobSkill1, String JobSkill2, String ExpertiseLevel1, String ExpertiseLevel2, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2)
{
	driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+JobSkill1+"']")).isDisplayed();
	driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+JobSkill2+"']")).isDisplayed();
//	driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+Skill3+"']")).isDisplayed();
	driver.findElement(By.xpath("//td[text()='"+JobSkill1+"']//following::td[text()='"+ExpertiseLevel1+"']")).isDisplayed();
	driver.findElement(By.xpath("//td[text()='"+JobSkill2+"']//following::td[text()='"+ExpertiseLevel2+"']")).isDisplayed();
//	driver.findElement(By.xpath("//td[text()='"+Skill3+"']//following::td[text()='"+level3+"']")).isDisplayed();
	if(certificate1.contentEquals("Yes"))
	{
		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+JobSkill1+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, true);
	}
	else
	{
		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+JobSkill1+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, false);
	}
	if(certificate2.contentEquals("Yes"))
	{
		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+JobSkill2+"']//following::td[text()='"+certificateforskill2+"']")).size()>0, true);
	}
	else
	{
		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+JobSkill2+"']//following::td[text()='"+certificateforskill2+"']")).size()>0, false);
	}
//	if(certificate3.contentEquals("Yes"))
//	{
//		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill3+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, true);
//	}
//	else
//	{
//		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill3+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, false);
//	}

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

public void deleteJob() throws InterruptedException
{
	dashboardpage.openWorkbenchPage();
	Thread.sleep(3000);
	workbenchpage.jobDropDown.click();
	List<WebElement> element = driver.findElements(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]"));
	if(element.size()>0)
	{
		Thread.sleep(1000);
		element.get(0).click();
		Thread.sleep(1000);
		workbenchpage.clickOnCloseJobButton();
	}
}
}







	
