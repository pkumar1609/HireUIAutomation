package pages;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class scheduleInterview extends baseclass {

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

	@FindBy(xpath = "//input[@placeholder='HH']")
	public WebElement hh;

	@FindBy(xpath = "//input[@placeholder='MM']")
	public WebElement mm;

	@FindBy(xpath = "//input[@formcontrolname='ScheduleTime']")
	public WebElement time;

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

	@FindBy(xpath = "//h6[@class='text-justify mb-0 alert-message']")
	public List<WebElement> alertMessage;

	@FindBy(xpath = "//button[@title='Add Rating']")
	public WebElement addRatingButton;

	@FindBy(xpath = "//textarea[@placeholder='Add comment']")
	public WebElement addcommentTextArea;

	@FindBy(xpath = "//button[@id='saveButtonId']")
	public WebElement saveCommentButton;

	@FindBy(xpath = "//i[@title='Delete Comment']")
	public WebElement deleteInterviewCommentButton;

	@FindBy(xpath = "//button[@ngbtooltip='Delete']")
	public WebElement deleteInterviewerButton;

	@FindBy(xpath = "//input[@id='Email']")
	public WebElement interviewerEmailInput;
		
	@FindBy(xpath = "//button[contains(text(),' Add Interviewer ')]")
	public WebElement addInterviewerButton;

	Select se;
	public boolean information = false;
	String date;
	public static String interviewDate;
	public static Calendar calendar;

	public scheduleInterview() {

		PageFactory.initElements(driver, this);
	}

	public Boolean getAddedInterviewCommentWebElement(String comment) {

		WebElement interviewComment = driver.findElement(By.xpath("//p[contains(text(),'" + comment + "')]"));
		if( interviewComment.isDisplayed())
		{
			return true;			
		}
		return false;
	}
	
	public String addInterviewer()
	{
		String interviewerName = common.getRandomAlphabeticString();
		String interviewerEmail = interviewerName+"@gmail.com";
		
		int sizz1e =this.interviewerName.size() ; //
		
		this.addInterviewerButton.click();
		
		this.interviewerName.get(1).sendKeys(interviewerName);
		this.interviewerEmail.get(1).sendKeys(interviewerEmail);
		
		int sizze2 =this.interviewerName.size() ; //
		
		return interviewerEmail;
	}

	@SuppressWarnings("deprecation")
	public void scheduleInterviewOfCandidate(String Title, String Scheduleon, String Hour1, String Minute1,
			String Durationhour, String DurationMinute, String TimeZone, String interviewerName,
			String interviewerEmail) throws InterruptedException {

		Thread.sleep(4000);
		this.title.sendKeys(Title);
		this.calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, +1);
		calendar.add(Calendar.MINUTE, +10);
		System.out.println("minute extended by" + calendar.getTime().getMinutes());
		interviewDate = calendar.getTime().getDate() + "/" + Integer.valueOf(calendar.getTime().getMonth() + 1) + "/"
				+ Integer.valueOf(calendar.getTime().getYear() + 1900);
		explicitwait.until(ExpectedConditions.visibilityOf(this.ScheduleOnCalendarIcon));
		this.ScheduleOnCalendarIcon.click();
		common.enterdate(interviewDate);
		executor.executeScript("arguments[0].click();", time);
		Thread.sleep(2000);
		this.hh.sendKeys(String.valueOf(calendar.getTime().getHours()));
		System.out.println("hh" + calendar.getTime().getHours());
		Thread.sleep(2000);
		this.mm.sendKeys(String.valueOf(calendar.getTime().getMinutes()));
		System.out.println("mm" + calendar.getTime().getMinutes());
		select = new Select(scheduleinterviewpage.durationHour);
		select.selectByVisibleText(Durationhour);
		select = new Select(scheduleinterviewpage.durationMinute);
		select.selectByVisibleText(DurationMinute);
		Thread.sleep(1000);
		select = new Select(scheduleinterviewpage.timezone);
		select.selectByVisibleText(TimeZone);
		Thread.sleep(1000);
		this.interviewerName.get(0).sendKeys(interviewerName);
		this.interviewerEmail.get(0).sendKeys(interviewerEmail);
		common.ClickSumbit();
		information = alertMessage.size() > 0;
		if (information == true) {
			common.clickOnConfirmYes();
		}
	}
}
