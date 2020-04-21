package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class DashboardPage extends baseclass {
	
	@FindBy(xpath = "//a[contains(text(),'Workbench')]")
	public WebElement workbench;
	
	@FindBy(xpath = "//a[contains(text(),'Employers')]")
	public WebElement employers;
	
	@FindBy(xpath = "//a[contains(text(),'Agencies')]")
	public WebElement agencies;
	
	@FindBy(xpath = "//a[contains(text(),'Team')]")
	public WebElement team;
	
	
	public DashboardPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void openWorkbenchPage() {
		
		workbench.click();
	}
	
	public void openEmployersPage() {
		
		employers.click();
	}
	
	public void openAgenciesPage() {
		
		agencies.click();
	}
	
	public void openTeamPage() {
		
		team.click();
	}

}
