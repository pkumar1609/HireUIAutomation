package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class HomePage extends baseclass {

	@FindBy(linkText = "More Jobs..")
	public WebElement MoreJobsLink;
	
	@FindBy(xpath="//a[text()=' Job Seeker(Candidate) Sign In']")
	public WebElement JobseekerCandidateSignInlink;
	
	

public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
		
	public void clickonMoreJobsLink() {
		
		MoreJobsLink.click();
	}
	
	public void clickJobseekerCandidateSignInlinklink() throws InterruptedException {
		Thread.sleep(2000);
		Action.moveToElement(loginpage.login).click().perform();
		Thread.sleep(1000);
	   JobseekerCandidateSignInlink.click();
	}	
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
