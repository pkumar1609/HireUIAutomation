package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

public class scheduleInterview extends baseclass {
	
	@FindBy(id = "title")
	public WebElement title;
	
	@FindBy(id = "statusMultiselectDropdown")
	public WebElement interviewerDropDown;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-candidate-interview-info/div[2]/div/div[2]/form/div/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li/div")
	public WebElement SelectInterviewer;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public WebElement calendar;
	
	@FindBy(id = "estimateTimeInHour")
	public WebElement hours;
	
	@FindBy(id = "estimateTimeInMinute")
	public WebElement minutes;
	
	@FindBy(xpath = "//select[@formcontrolname='Duration']")
	public WebElement duration;
	
	@FindBy(xpath = "//select[@formcontrolname='Timezone']")
	public WebElement timezone;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div[1]/div/div/div[1]/div/div/h6")
	public WebElement scheduledInterviewLeftTitle;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div[1]/div/div/div[3]/div/button[1]")
	public WebElement editInterviewIcon;
	
	Select se;
	
	public scheduleInterview() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void SelectinterviewerT(String interviewer) {
		
		interviewerDropDown.click();
		SelectInterviewer.click(); 
		interviewerDropDown.click();
	}
	
	 public void EnterInterviewTitleT(String title1) {
			
		 title.sendKeys(title1);
	}
	 
	 public void ScheduleInterviewOnT(String scheduleon) {
			
		 calendar.sendKeys(scheduleon); 
		 calendar.click();
	 }
	 
	 public void EnterInterviewTimeT(String hour, String minute) {
	    	
		 hours.clear();	
		 hours.sendKeys(hour);	 
		 minutes.clear();	 
		 minutes.sendKeys(minute);	
	 }
	 
	 public void EnterInterviewDurationT(String interviewduration) {
			
    	 se = new Select(duration);
		 se.selectByVisibleText(interviewduration);
	 }
	 
	 public void EnterTimezoneT(String timezone1) {
			
	   	 se = new Select(timezone);
		 se.selectByVisibleText(timezone1);
	}
	 
	 
	
	

}
