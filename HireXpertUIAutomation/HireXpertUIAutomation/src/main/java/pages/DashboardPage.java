package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilPackage.baseclass;

public class DashboardPage extends baseclass {

	
	@FindBy(xpath = "//a[@href='#/workbench']")
	public WebElement workbench;
	
	@FindBy(xpath = "//a[contains(text(),'Employers')]")
	public WebElement employers;
	
	@FindBy(xpath = "//a[contains(text(),'Agencies')]")
	public WebElement agencies;
	
	@FindBy(xpath = "//a[contains(text(),'Team')]")
	public WebElement team;
	
	@FindBy(xpath = "//a[contains(text(),'Interviews')]")
	public WebElement interviews;
	
	@FindBy(xpath= "//a[@href='#/jobdashboard']")
	public WebElement dashboard ;
	
	
	
	public DashboardPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	public void openWorkbenchPage() throws InterruptedException {
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",workbench);
	}
	
	public void openEmployersPage() throws InterruptedException {
		Thread.sleep(3000);
		employers.click();
	}
	
	public void openAgenciesPage() throws InterruptedException {
		
//		wait.until(ExpectedConditions.elementToBeClickable(agencies));
		Thread.sleep(3000);
		agencies.click();
	}
	
	public void openTeamPage() throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(team));
		Thread.sleep(4000);
		team.click();
	}
	
	public void openInterviewsPage() {
		
		interviews.click();
	}
	
	public void openDashboardPage()
	{
		wait.until(ExpectedConditions.elementToBeClickable(dashboard));
		executor.executeScript("arguments[0].click();",dashboard);
	} 

}
