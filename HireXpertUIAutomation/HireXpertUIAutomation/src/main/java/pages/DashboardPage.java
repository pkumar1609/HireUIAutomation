package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class DashboardPage extends baseclass {

	@FindBy(xpath = "//a[text()='Recruitment ']")
	public WebElement recruitment;
	
	@FindBy(xpath = "//a[contains(text(),'Applicant Tracking')]")
	public WebElement applicationTracking;
	
	@FindBy(xpath = "//a[contains(text(),'Employers')]")
	public WebElement employers;
	
	@FindBy(xpath = "//a[contains(text(),'Agencies')]")
	public WebElement agencies;
	
	@FindBy(xpath = "//a[contains(text(),'Team')]")
	public WebElement team;
	
	@FindBy(xpath = "//a[contains(text(),'Interviews')]")
	public WebElement interviews;
	
	@FindBy(xpath= "//a[text()='Dashboard ']")
	public WebElement dashboard ;
	
	@FindBy(xpath= "//a[contains(text(),'Job Applications')]")
	public WebElement JobApplication ;
	
	@FindBy(xpath= "//h6[contains(text(),'Hey there, looks like you haven’t added a job as features work best when used with a job, You can add a job by clicking Add Job button.')]")
	public List<WebElement> jobPopup;
	
	@FindBy(xpath= "//a[contains(text(),'CV Store ')] ")
	public WebElement cvStrore ;
	
	@FindBy(xpath= "//a[text()='Task']")
	public WebElement task ;
	
	@FindBy(xpath= "//a[contains(text(),'Invoice')]")
	public WebElement invoice ;
	
	public DashboardPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public void openWorkbenchPage() throws InterruptedException {
		
		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(4000);
		applicationTracking.click();
		Thread.sleep(1000);
	}
	
	public void openEmployersPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(4000);
		employers.click();
	}
	
	public void openAgenciesPage() throws InterruptedException {
		
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(2000);
		agencies.click(); 
	}
	
	public void openTeamPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(3000);
		team.click();
	}  
	 
	public void openInterviewsPage() throws InterruptedException 
	{
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(3000);
		interviews.click();
	}
	
	public void openDashboardPage() throws InterruptedException
	{
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",dashboard);
		try {
			common.clickOnCloseBtn();
		}
		catch(NoSuchElementException e)
		{}
	} 
	
	public void VerifyUserIsOnCorrectPage() {
	  	   
//	  	   if(agencies.isDisplayed() == true) {
//	  		   
//	  		   System.out.println("User is On Employer Dashboard");
//	  	   }
//	  	   
//	  	   else if(employers.isDisplayed() == true) {
//	  		   
//	  		 System.out.println("User is On Agency Dashboard");
//	  	   }
//	  	   
//	  	   else {
//	  		   
//	  		 System.out.println("User is On Candidate Dashboard");
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		List<WebElement> dynamicElement1 = driver.findElements(By.xpath("//a[contains(text(),'Employers')]"));
		if(dynamicElement.size() != 0){
			
			System.out.println("User is On Employer Dashboard");

		}
		
		else if(dynamicElement1.size() !=0) {
			
			System.out.println("User is On Agency Dashboard");
			
		}
		
		else {
			
			System.out.println("User is On Candidate Dashboard");
			
	  	   }
    }
	
	public void clickonJobApplicationLInk() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(2000);
		JobApplication.click();		
	}

}
