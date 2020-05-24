package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

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
	
	@FindBy(id = "assigntoedit")
	public WebElement changeAssignTo;
	
	@FindBy(xpath="//button[@title='Delete Candidate']")
	public WebElement candidateCardDeleteCandidateIcon;
	
	@FindBy(xpath = "//select[@formcontrolname='name']")
	WebElement selectTeamAssignTo;
	
	@FindBy(xpath = "//button[@class='btn btn-primary Cbtn-primary']")
	WebElement submitButton;
	
	@FindBy(xpath = "//button[@title='Reject Candidate']")
	public WebElement candidateCardRejectCandidate;
	
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
	
	
	Actions action;
	Select se;
	public String newComment;
	public String addedNewComment;
	
	public CandidateCardSectionPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
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
			submitButton.click();
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
		submitButton.click();
		Thread.sleep(3000);
		System.out.println("\nCandidate get rejected and added in Rejected column..");
	}

}
