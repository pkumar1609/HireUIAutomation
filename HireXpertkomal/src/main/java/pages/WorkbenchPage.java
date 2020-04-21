package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

public class WorkbenchPage extends baseclass {
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/workbench/div/div[1]/div/div[1]/div[3]/div[1]/button[1]")
	public WebElement addjob;
	
	@FindBy(id = "jobDropdown")
	public WebElement jobDropDown;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Agency')]")
	public WebElement shareWithAgencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add Candidate')]")
	public WebElement addCandidateButton;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Team')]")
	public WebElement shareWithTeamButton;
	
	@FindBy(xpath = "//button[contains(text(),'Edit Job')]")
	public WebElement editJobButton;
	
	
	public WorkbenchPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void AddJob() {
		
		addjob.click();
	}
	
	public Select se;
	
	public void selectJob() {
		
		se = new Select(jobDropDown);
		se.selectByIndex(1);
//		String jobname = jobDropDown.getText();
//		System.out.println("Selected job name: " + jobname);
	}
	
//	public String jobname1= jobDropDown.getText();
	
	
	
	
	
	

}
