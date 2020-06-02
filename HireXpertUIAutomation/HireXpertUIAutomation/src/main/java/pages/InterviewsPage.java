package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;
import utilPackage.utilclass;

public class InterviewsPage extends baseclass {
	
	@FindBy(xpath = "//div[@class='col-md-2 InterviewDetailsFilter pr-1']//select[@id='jobDropdown']")
	public WebElement jobDropdown;
	
	@FindBy(xpath = "//my-date-picker[@id='fromDatePicker']//input[@placeholder='Select Date']")
	public WebElement fromdate;
	
	@FindBy(xpath = "//my-date-picker[@id='toDatePicker']//input[@placeholder='Select Date']")
	public WebElement todate;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-interview/div[2]/form/div/div[7]/button")
	public WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"fromDatePicker\"]/div/div/div/button[1]")
	public WebElement clearFromDate;
	
	@FindBy(xpath = "//*[@id=\"toDatePicker\"]/div/div/div/button[1]")
	public WebElement clearToDate;
	
	
	public InterviewsPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void selectAgencyJob() {
		
		Select se = new Select(jobDropdown);
		se.selectByVisibleText("Automation1");
	}
	
	
	public void findInterviewDetails() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		String interviewTitle = "Interview1";
		
		String xpath_start_interviewTitle = "//*[@id=\"style-5\"]/table/tbody/tr[";
		String xpath_end_interviewTitle = "]/td[3]";
		
		int i = 1;
		
		while(isElementPresent(xpath_start_interviewTitle+i+xpath_end_interviewTitle)) {
			
			String s02 = driver.findElement(By.xpath(xpath_start_interviewTitle+i+xpath_end_interviewTitle)).getText();
			
			if(s02.equalsIgnoreCase(interviewTitle)) {
				
				System.out.println("\nInterview details found for: " + s02);
				Thread.sleep(3000);
			}
			
			i++;
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public boolean isElementPresent(String elementXpath) {
		
		int count = driver.findElements(By.xpath(elementXpath)).size();
		
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
			
	}
	

}
