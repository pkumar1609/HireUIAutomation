package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class scheduleInterview extends baseclass {
	
	String interviewDate;
	String hourTime;
	String minuteTime;
	
	@FindBy(id = "title")
	public WebElement title;
	
	@FindBy(id = "statusMultiselectDropdown")
	public WebElement interviewerDropDown;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-candidate-interview-info/div[2]/div/div[2]/form/div/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li/div")
	public WebElement SelectInterviewer;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public WebElement scheduleOnfield;
	
	@FindBy(xpath = "(//button[@aria-label='Open Calendar'])[2]")
	public WebElement calendar;
	
	@FindBy(xpath = "//span[contains(text(),'Today')]")
	public WebElement todayBtn;
	
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
	
	@FindBy(xpath = "(//button[@title='Edit Interview'])[2]")
	public WebElement editInterviewIcon;
	
	@FindBy(xpath = "//input[@formcontrolname='Location']")
	public WebElement Location;
	
	@FindBy(xpath = "(//input[@placeholder='Select Date']//following::button)[1]")
	public WebElement ScheduleOnCalendarIcon;
	
	@FindBy(xpath = "//button[@aria-label='Next Month']")
	public WebElement nextMonth;
	
	@FindBy(xpath = "//button[@aria-label='Previous Month']")
	public WebElement previousMonth;
	
	Select se;
	

	
	
	public scheduleInterview() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void SelectinterviewerT(String interviewer) {
		
		interviewerDropDown.click();
		SelectInterviewer.click(); 
		interviewerDropDown.click();
	}
	
	 public void EnterInterviewTitleT(String title1) {
			
		 title.sendKeys(title1);
	}
	 
	 public void ScheduleInterviewOnT() throws InterruptedException {
		 Thread.sleep(3000);	
		 calendar.click();
		 Thread.sleep(3000);
		 todayBtn.click();
		
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
	 
	 public void scheduleInterviewOfCandidate(DataTable credentials) throws InterruptedException
	 {
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
				title.sendKeys(data.get("Title"));
				Thread.sleep(3000);
				interviewerDropDown.click();
				driver.findElement(By.xpath("//div[contains(text(),'Select All')]")).click();
				interviewerDropDown.click();
				Thread.sleep(2000);
				ScheduleOnCalendarIcon.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='"+data.get("ScheduleOn")+"']")).click();				
				hours.sendKeys(data.get("Hour"));
				hourTime=data.get("Hour");
				minutes.sendKeys(data.get("Minute"));
				minuteTime=data.get("Minute");
				select= new Select(duration);
				select.selectByVisibleText(data.get("Duration"));
				select = new Select(timezone);
				select.selectByVisibleText(data.get("TimeZone"));	
				Location.sendKeys(data.get("Location"));	
				common.submitbtn.isEnabled();
				common.ClickSumbit();
//				Thread.sleep(2000);
//				interviewDate=driver.findElement(By.xpath("(//p[@class='mb-1'])[3]")).getText();
			}
	 }
}
