package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;
import utilPackage.utilclass;

public class CandidateCardSectionPage extends baseclass {
	
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
	
	@FindBy(id="EditCandidate")
	WebElement candidateCardEditCandidateIcon;
	
	@FindBy(xpath="//button[@title='Delete Candidate']")
	public WebElement candidateCardDeleteCandidateIcon;
	
	@FindBy(xpath = "//select[@formcontrolname='name']")
	WebElement selectTeamAssignTo;
	
	@FindBy(xpath = "//button[@title='Reject Candidate']")
	public WebElement candidateCardRejectCandidate;
	
	@FindBy(xpath = "//h6[@title='Candidate Details']")
	WebElement candidateCardCandidateName;
	
	@FindBy(id = "rejectReason")
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
	
	
	//span[@title="Skill information is missing"]
	
	
	Actions action;
	Select se;
	public String newComment;
	public String addedNewComment;
	
	public CandidateCardSectionPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnEditCandidateIcon() {
		
		candidateCardEditCandidateIcon.click();
	}
	
	public void clickOnCandidateNameFromCandidateCard() {
		
		candidateCardCandidateName.click();
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
		
		
		else {
			
			System.out.println("Bell icon is present on candidate card as the expertise level for skills is answered.");
			
	  	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
