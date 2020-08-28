package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class HomePage extends baseclass {

	@FindBy(linkText = "More Jobs..")
	public WebElement MoreJobsLink;
	
	@FindBy(linkText="Job Seeker(Candidate) Sign In")
	public WebElement JobseekerCandidateSignInlink;
	
	

public HomePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
		
	public void clickonMoreJobsLink() {
		
		MoreJobsLink.click();
	}
	
	public void clickJobseekerCandidateSignInlinklink() throws InterruptedException {
	   Thread.sleep(3000);
	   JobseekerCandidateSignInlink.click();
	}	
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
