package pages;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class scheduleInterview extends baseclass {
	
	String hourTime;
	String minuteTime;
	
	@FindBy(id = "title")
	public WebElement title;
	
	@FindBy(xpath = "//input[@formcontrolname='Name' and @placeholder='Enter Name']")
	public List<WebElement> interviewerName;
	
	@FindBy(xpath = "//input[@formcontrolname='Email' and @placeholder='Enter Email']")
	public List<WebElement> interviewerEmail;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public WebElement scheduleOnfield;
	
	@FindBy(xpath = "(//button[@aria-label='Open Calendar'])[2]")
	public WebElement calendarIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Today')]")
	public WebElement todayBtn;
	
	@FindBy(id = "estimateTimeInHour")
	public WebElement hours;
	
	@FindBy(id = "estimateTimeInMinute")
	public WebElement minutes;
	
	@FindBy(xpath = "//select[@formcontrolname='HourDuration']")
	public WebElement durationHour;
	
	@FindBy(xpath = "//select[@formcontrolname='MinuteDuration']")
	public WebElement durationMinute;
	
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
	
	@FindBy(xpath = "//button[@aria-label='Clear Date']")
	public WebElement clearDate;
	
	Select se;
	public boolean information=false;
	String date;
	public static String interviewDate;
	public static Calendar calendar;

	
	
	public scheduleInterview() {
		
		PageFactory.initElements(driver, this);
	}
	
//	 
//	 public void ScheduleInterviewOnT() throws InterruptedException {
//		 Thread.sleep(3000);	
//		 calendar.click();
//		 Thread.sleep(3000);
//		 todayBtn.click();
//		
//	 }
//	 
//	 public void EnterInterviewTimeT(String hour, String minute) {
//	    	
//		 hours.clear();	
//		 hours.sendKeys(hour);	 
//		 minutes.clear();	 
//		 minutes.sendKeys(minute);	
//	 }
//	 
//	 public void EnterInterviewDurationT(String durationMinute) {
//			
//    	 se = new Select(this.durationMinute);
//		 se.selectByVisibleText(durationMinute);
//	 }
//	 
//	 public void EnterTimezoneT(String timezone1) {
//			
//	   	 se = new Select(timezone);
//		 se.selectByVisibleText(timezone1);
//	}
	 
	 public void scheduleInterviewOfCandidate(String Title, String Scheduleon, String Hour1, String Minute1, String Durationhour, String DurationMinute , String TimeZone, String interviewerName, String interviewerEmail) throws InterruptedException
	 {
		  
			Thread.sleep(4000);
			this.title.sendKeys(Title);
			this.ScheduleOnCalendarIcon.click();
			
			this.calendar = Calendar.getInstance();

			calendar.add(Calendar.DAY_OF_MONTH, +1);
//			calendar.add(Calendar.MINUTE, +22);

			interviewDate = calendar.getTime().getDate()+"/"+Integer.valueOf(calendar.getTime().getMonth()+1)+"/"+Integer.valueOf(calendar.getTime().getYear()+1900);
			
			common.enterdate(interviewDate);
				    
			Thread.sleep(2000);
//			this.hours.sendKeys(String.valueOf(calendar.getTime().getHours()));		
//			Thread.sleep(2000);
//			this.minutes.sendKeys(String.valueOf(calendar.getTime().getMinutes()));	
			this.hours.sendKeys("14");
			this.minutes.sendKeys("9");
			select= new Select(scheduleinterviewpage.durationHour);
			select.selectByVisibleText(Durationhour);	
			select= new Select(scheduleinterviewpage.durationMinute);
			select.selectByVisibleText(DurationMinute);
			Thread.sleep(1000);
			select = new Select(scheduleinterviewpage.timezone);
			select.selectByVisibleText(TimeZone);
			Thread.sleep(1000);
			this.interviewerName.get(0).sendKeys(interviewerName);
			this.interviewerEmail.get(0).sendKeys(interviewerEmail);			
			common.ClickSumbit();	
			information = driver.findElements(By.xpath("//span[text()='Information']//following::h6[contains(text(),'"+interviewerName+" has another interview at this time. Please check interviewer calendar to get available slot.')]")).size()>0;
			if(information==true)
			{
				common.clickOnOKBtn();
				this.minutes.clear();			
				calendar.add(Calendar.MINUTE, +25);
				this.hours.sendKeys(String.valueOf(calendar.getTime().getHours()));		
				this.minutes.sendKeys(String.valueOf(calendar.getTime().getMinutes()));		
				common.ClickSumbit();
			}	
			Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='"+Title+"']")).isDisplayed(), true);
	 }
}
