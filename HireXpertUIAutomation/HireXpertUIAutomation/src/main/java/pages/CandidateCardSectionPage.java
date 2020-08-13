package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	@FindBy(xpath = "//div[@class='item-box cdk-drag']")
	public WebElement candidateCard;
	
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
		
	Actions action;
	Select se;
	public String newComment;
	public String addedNewComment;
	
	public CandidateCardSectionPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	} 
	
	public void clickOnEyeIcon(String Name) throws InterruptedException {
		nameEyeIcon="//span[text()=' "+Name+"']";
		Thread.sleep(3000);
		driver.findElement(By.xpath(nameEyeIcon)).click();
	}

	public void clickOnEditCandidateIcon(String Name) throws InterruptedException {
		Thread.sleep(3000);
		editCandidateIcon="//span[text()=' "+Name+"']//following::button[@id='EditCandidate']";
		driver.findElement(By.xpath(editCandidateIcon)).click();
	}
	
	public void clickOnDeleteCandidateIcon(String Name) throws InterruptedException {
		Thread.sleep(3000);
	    String deleteCandidateIcon = "//span[text()=' "+Name+"']//following::button[@title='Delete Candidate']";
		driver.findElement(By.xpath(deleteCandidateIcon)).click();
	}
	
	public void clickOnRejectCandidateIcon(String Name) throws InterruptedException {
		Thread.sleep(3000);
	    String rejectCandidateIcon = "//span[text()=' "+Name+"']//following::button[@title='Reject Candidate']";
		driver.findElement(By.xpath(rejectCandidateIcon)).click();
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
		WebElement drop = thirdColumn;
		
		action = new Actions(driver);
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
		common.submitbtn.click();
		Thread.sleep(3000);
		System.out.println("\nCandidate get rejected and added in Rejected column..");
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
	
//	public void verifyRejectedColumnData() {
//		
//		List<WebElement> allHeadersOfTable = driver.findElements(By.xpath("//*[@id=\"style-5\"]/div/table/thead/tr/th/text()")); //retrieving all table headers
//		
//		System.out.println("\nTotal headers found: " + allHeadersOfTable.size());
//		System.out.println("All headers of table are :");
//		for(WebElement header:allHeadersOfTable) {
//			
//			System.out.print(header.getText());
//		}
//		
//		for(WebElement header:allHeadersOfTable) {
//			
//			String HeaderName = header.getText();
//			
//			if(HeaderName.equals("Rejected ")) {
//				
//				System.out.println("\nRejected column found..");
//			}
//			else {
//				
//				System.out.println("\nRejected column not found..");
//			}
//		}
//	}
	


	
	
	public void verifyBellIconOnCandidateCard () {
		
		List<WebElement> bellicon = driver.findElements(By.xpath("//span[@title='Skill information is missing']"));
         if(bellicon.size() != 0){
			
			System.out.println("Bell icon is present on candidate card as the expertise level for skills is not answered.");
		}
			
		else
		{
			System.out.println("Bell icon is not present on candidate card as the expertise level for skills is answered.");
	    }
	}
 
	
	public void AssertDetailsOnCandidateDetails(String Username, String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws InterruptedException
	{
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='"+Name+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//h6[text()=' "+addjobpage.jobname+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Email Id ']//following::td[text()='"+Username+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Contact No. ']//following::td[text()='"+ContactNumber+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Designation ']//following::td[text()='"+Designation+"']")).isDisplayed(), true);		
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Experience ']//following::td[text()='"+experience+" Years']")).isDisplayed(), true);	
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Notice Period']//following::td[text()='"+NoticePeriod+" Days']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Added By Email']//following::td[text()='"+Username+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To ']//following::td[contains(text(),'"+Username+"')])[1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To Number']//following::td[text()='"+updateprofilepopuppage.Contact+"'])[1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Assign To Email']//following::td[text()='"+Username+"'])[1]")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Added By ']//following::td[contains(text(),'"+Username+"')])")).isDisplayed(), true);	
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Added By Number']//following::td[text()='"+updateprofilepopuppage.Contact+"']")).isDisplayed(), true);	
		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Interview ']//following::td[text()='"+scheduleinterviewpage.interviewDate+", "+scheduleinterviewpage.hourTime+" : "+scheduleinterviewpage.minuteTime+"']")).isDisplayed(), true);		
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
