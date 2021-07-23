package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class CandidateCardSectionPage extends baseclass {
	
	public String editCandidateIcon;
	public String nameEyeIcon;
	
	@FindBy(xpath = "//p[@class='addbytitle']")
	public WebElement addedBy;
	
	@FindBy(xpath = "//div[@class='col-md-12 pl-0 pr-0']//div[@class='col-md-10 pr-0']")
	public WebElement assignTo;
	
	@FindBy(css = "div.item-box.cdk-drag")
	public WebElement candidateCard;
	
	//div[@class='item-box cdk-drag']
	
	@FindBy(xpath = "//body//td[1]")
	public WebElement firstColumn;
	
	@FindBy(xpath = "//body//td[2]")
	public WebElement secondColumn;
	
	@FindBy(xpath = "//body//td[3]")
	public WebElement thirdColumn;
	
	@FindBy(xpath = "//body//td[8]")
	public WebElement rejected8thColumn;
	
	@FindBy(id = "assigntoedit")
	public WebElement changeAssignTo;
		
	@FindBy(xpath = "//p[@title='Interview']")
	public WebElement candidateCardInterviewDetails;
	
	@FindBy(xpath = "//button[@title='Edit Interview']")
	public WebElement candidateCardEditInterview;
	
	@FindBy(xpath="//button[@title='Delete Candidate']")
	public WebElement candidateCardDeleteCandidateIcon;
	
	@FindBy(xpath = "//select[@formcontrolname='name']")
	WebElement selectTeamAssignTo;
	
	@FindBy(xpath = "//button[@title='Reject Candidate']")
	public WebElement candidateCardRejectCandidate;
	
	@FindBy(xpath = "//h6[@title='Candidate Details']")
	WebElement candidateCardCandidateName;
	
	@FindBy(xpath = "//select[@id='rejectReason']")
	WebElement rejectReason;
	
	@FindBy(xpath = "//button[@title='Comments']")
	public WebElement comments;
	
	@FindBy(xpath = "//textarea[@placeholder='Add comment']")
	public WebElement addCommentSection;
	
	@FindBy(xpath = "//div[@class='text-danger']")
	public WebElement errorMessageComments;
	
	@FindBy(xpath = "//p[@class='mb-1 text-break']")
	public WebElement addedComment;
	
	@FindBy(xpath = "//i[@title='Delete Comment']")
	public WebElement deleteCommentIcon;
	
	@FindBy(xpath = "//span[@title='Skill information is missing']")
	public WebElement Skillinformationmissingicon;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-131']")
	public WebElement rejectcolumn;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-129']")
	public WebElement joinedcolumn;
	
	@FindBy(xpath = "//td[@class='TableCard' and @id='jobStatusColumn'][4]")
	public WebElement InterviewPendingthreecolumn;
	
	@FindBy(xpath = "//td[@class='TableCard' and @id='jobStatusColumn']")
	public List<WebElement> allColumn;
	
	@FindBy(xpath = "//button[@id='EditCandidate']")
	public WebElement editCandidate;
		
	@FindBy(xpath = "//button[@title='Schedule Interview']")
	public WebElement scheduleInterview;
	
	@FindBy(xpath = "(//i[@class='fa fa-file-text-o'])[3]")
	public WebElement auditLog;
	
	@FindBy(xpath = "//button[@title='Pass']")
	public WebElement passIcon;
	
	@FindBy(xpath = "//button[@title='Fail']")
	public WebElement failIcon;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Comment']")
	public WebElement rejectCommenttextArea;
	
	Actions action;
	Select se;
	public String newComment;
	public String addedNewComment;
	
	public CandidateCardSectionPage() {
		
		PageFactory.initElements(driver, this);
	} 
	
	public void clickOnEyeIcon(String Name) throws InterruptedException {
		nameEyeIcon="//span[text()=' "+Name+"']";
		Thread.sleep(3000);
		driver.findElement(By.xpath(nameEyeIcon)).click();
	}
	

	public void clickOnEditCandidateIcon(String Name) throws InterruptedException {
		editCandidateIcon="//span[text()=' "+Name+"']//following::button[@id='EditCandidate']";
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(editCandidateIcon)));
	}
	
	public void clickOnDeleteCandidateIcon(String Name) throws InterruptedException {
	    String deleteCandidateIcon = "//span[text()=' "+Name+"']//following::button[@title='Delete Candidate']";
		Thread.sleep(2000);
	    driver.findElement(By.xpath(deleteCandidateIcon)).click();
	}
	
	public void clickOnRejectCandidateIcon(String Name) throws InterruptedException {
		Thread.sleep(3000);
	    String rejectCandidateIcon = "//span[contains(text(),'"+Name+"')]//following::button[@title='Reject Candidate']";
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(rejectCandidateIcon)));

	}
	
	public void clickOncommentsIcon(String Name) throws InterruptedException {
	    String commentsIcon = "//span[text()=' "+Name+"']//following::button[@title='Comments']";
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(commentsIcon)).click();
	}
		
	public void clickOnCandidateNameFromCandidateCard() {		
		candidateCardCandidateName.click();
	}
	
	public void clickOnrejecticonOfCandidateCard() throws InterruptedException {
		Thread.sleep(3000);
		candidateCardRejectCandidate.click();
	}
	public void dragAndDropCardToSecondColumn() throws InterruptedException {
		
		WebElement drag = candidateCard;
		WebElement drop = secondColumn;
		
		action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		Thread.sleep(3000);
	}
	
	public void dragAndDropCardToThirdColumn() throws InterruptedException {
		
		WebElement drag = candidateCard;
//		WebElement drop=driver.findElement(By.xpath("//td[@class='TableCard' and @id='jobStatusColumn'][4]"));
		WebElement drop = InterviewPendingthreecolumn;
		
		action = new Actions(driver);
		executor.executeScript("scrollTo(3000,0);");  

		action.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		Thread.sleep(3000);
	}
	
   public void dragAndDropCardToFirstColumn() throws InterruptedException {
		
		WebElement drag = candidateCard;
		WebElement drop = firstColumn;
		
		action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		Thread.sleep(3000);
	}

	
	public void verifyChangeAssignToField() throws InterruptedException {
		
		boolean value = changeAssignTo.isEnabled();
		
		if(value==true) {
			
			System.out.println("\nChange Assign To field is enabled when Assign To name displyed agency name..");
			
			changeAssignTo.click();
			Thread.sleep(3000);
			
			se = new Select(selectTeamAssignTo);
			se.selectByIndex(0);
			common.submitbtn.click();
			Thread.sleep(3000);
			System.out.println("\nUser able to edit Assign To name..");
		}		
		else {			
			System.out.println("\nChange Assign To field is disabled in New column when Assign To name displayed employer name..");
		}
	}
	
	public void selectRejectReason() throws InterruptedException {
		Thread.sleep(2000);
		se = new Select(rejectReason);
		se.selectByIndex(3);
		common.ClickSumbit();
	}
	
	public void giveRejectionComment() throws InterruptedException {

		if(rejectCommenttextArea.isDisplayed())
		{
			rejectCommenttextArea.clear();
			rejectCommenttextArea.sendKeys("This candidate is now rejected.");
		}
	}
	
	public void observeAllPresentSkills() throws InterruptedException {
		
		String sk1 = addjobpage.skill1;
		System.out.println("\nEntered skill1: " + sk1);

		Thread.sleep(1000);
		String sk2 = addjobpage.skill2;
		System.out.println("Entered skill2: " +sk2);
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		String xpath_start_sk1 = "//*[@id=\"style-5\"]/div/div[7]/table/tbody/tr[";
		String xpath_end_sk1 = "]/td[1]";
		
		int i = 1;
		
		while(isElementPresent(xpath_start_sk1+i+xpath_end_sk1)) {
			
			String s02 = driver.findElement(By.xpath(xpath_start_sk1+i+xpath_end_sk1)).getText();
			
			if(s02.equalsIgnoreCase(sk1) || s02.equalsIgnoreCase(sk2)) {
				
				System.out.println("\nSkill found..");
			}			
			else {
				
				System.out.println("\nSkill not found..");
			}			
			i++;
		}				
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public boolean isElementPresent(String elementXpath) {
		
		int count = driver.findElements(By.xpath(elementXpath)).size();
		
		if(count==0)
			return false;
		else
			return true;
	}
	
		
	public void verifyBellIconOnCandidateCard () {
		
		List<WebElement> bellicon = driver.findElements(By.xpath("//span[@title='Skill information is missing']"));
		Assert.assertEquals(bellicon.size()>0, true);
	}

	public void AssertDetailsOnCandidateDetails(String Username, String CandidateEmail,String profiletitle, String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws InterruptedException
	{
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='"+Name+"']")).isDisplayed(), true);
//		Assert.assertEquals(driver.findElement(By.xpath("//h6[text()=' "+addjobpage.jobname+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Email Id ']//following::td[text()='"+Username+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Contact No. ']//following::td[text()='"+ContactNumber+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Designation ']//following::td[text()='"+Designation+"']")).isDisplayed(), true);		
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Experience ']//following::td[text()='"+experience+" Years']")).isDisplayed(), true);	
		if(OnNoticePeriod.contentEquals("Yes")){
//			Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Last Working Day']//following::td[text()='"+LastWorkingDay+" ']")).isDisplayed(), true);
		}
		else{
			Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Notice Period']//following::td[text()='"+NoticePeriod+" Days']")).isDisplayed(), true);
		}
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Added By Email']//following::td[text()='"+Username+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To ']//following::td[contains(text(),'"+Username+"')])[1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To Number']//following::td[text()='"+updateprofilepopuppage.Contact+"'])[1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To Email']//following::td[text()='"+Username+"'])[1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Added By ']//following::td[contains(text(),'"+Username+"')])")).isDisplayed(), true);	
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Added By Number']//following::td[text()='"+updateprofilepopuppage.Contact+"']")).isDisplayed(), true);	
//		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Interview ']//following::td[text()='"+scheduleinterviewpage.interviewDate+", "+scheduleinterviewpage.hourTime+" : "+scheduleinterviewpage.minuteTime+"']")).isDisplayed(), true);				
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Salary Offered ']//following::td[text()='"+Salaryoffered+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='CTC ']//following::td[text()='"+CTC+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Expected CTC ']//following::td[text()='"+expectedCTC+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Country ']//following::td[text()='"+Country+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='City ']//following::td[text()='"+City+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Location ']//following::td[text()='"+CityArea+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Zipcode ']//following::td[text()='"+ZipCode+"']")).isDisplayed(), true);
	}
	
	public void assertskill(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2)
	{
		driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+Skill1+"']")).isDisplayed();
		driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+Skill2+"']")).isDisplayed();
		driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+Skill3+"']")).isDisplayed();
		driver.findElement(By.xpath("//td[text()='"+Skill1+"']//following::td[text()='"+level1+"']")).isDisplayed();
		driver.findElement(By.xpath("//td[text()='"+Skill2+"']//following::td[text()='"+level2+"']")).isDisplayed();
		driver.findElement(By.xpath("//td[text()='"+Skill3+"']//following::td[text()='"+level3+"']")).isDisplayed();
		if(certificate1.contentEquals("Yes"))
		{
			Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill1+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, true);
		}
		else
		{
			Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill1+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, false);
		}
		if(certificate2.contentEquals("Yes"))
		{
			Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill2+"']//following::td[text()='"+certificateforskill2+"']")).size()>0, true);
		}
		else
		{
			Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill2+"']//following::td[text()='"+certificateforskill2+"']")).size()>0, false);
		}
		if(certificate3.contentEquals("Yes"))
		{
			Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill3+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, true);
		}
		else
		{
			Assert.assertEquals(driver.findElements(By.xpath("//td[text()='"+Skill3+"']//following::td[text()='"+certificateforskill1+"']")).size()>0, false);
		}
	
	}
}
