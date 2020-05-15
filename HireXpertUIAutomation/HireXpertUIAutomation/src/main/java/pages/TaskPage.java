package pages;


import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import utilPackage.baseclass;

public class TaskPage extends baseclass {
	
	WebDriverWait explicitwait = new WebDriverWait(driver,80);

	public TaskPage() throws IOException {
	super();
	PageFactory.initElements(driver, this);
	explicitwait=new WebDriverWait(driver,80);

	}
	
	String addedtask;
	String addedtaskagy;
	public String assignto;
	boolean emp;
	boolean b;
	String title;
	String a;
	
	@FindBy(xpath="//button[@title='Add Task']")
	WebElement addtaskbtn;
	
	@FindBy(xpath="//input[@formcontrolname='Title']")
	WebElement titlebtn;
	
	@FindBy(xpath="//select[@formcontrolname='TeamId']")
	WebElement teamid;
	
	@FindBy(xpath="//select[@formcontrolname='AssignTo']")
	WebElement Assigntofield;
	
	@FindBy(xpath="//input[@formcontrolname='Status']")
	WebElement status;
	
	@FindBy(xpath="//textarea[@formcontrolname='Description']")
	WebElement notefield;
	
	@FindBy(xpath="//label[@for='test']")
	public WebElement mytask;
	
	@FindBy(xpath="//label[@for='test2']")
	public WebElement teamtask;
	
	@FindBy(xpath="//i[@class='fa fa-trash']")
	WebElement deletetaskbtn;
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	WebElement confirmbtn;
	
	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
	public WebElement okbtn;
	
	@FindBy(xpath="//button[@title='Edit Task']")
	public WebElement edittaskbtn;
	
	@FindBy(xpath="//strong[text()='Assign To: ']")
	public WebElement taskcard;
	
	@FindBy(xpath="//strong[text()=addedtask]")
	public WebElement taskname;
	
	@FindBy(xpath="//button[@title='Refresh'][@class='btn Cbtn-primary mr-1 float-right optbtn']")
	public WebElement reloadtaskbtn;
	
	public void reloadtask()
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(reloadtaskbtn));
		executor.executeScript("arguments[0].click();", reloadtaskbtn);
	}
	
	public void clickOnAddTaskBtn() throws InterruptedException
	{

		explicitwait.until(ExpectedConditions.elementToBeClickable(addtaskbtn));
		executor.executeScript("arguments[0].click();", addtaskbtn);
		
	}
	
	public void enterAlldetails(DataTable credentials) throws InterruptedException {
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			clickOnAddTaskBtn();
			Thread.sleep(2000);
			titlebtn.sendKeys(data.get("Title for emp"));
			addedtask= titlebtn.getText();
			select= new Select(teamid);
			Thread.sleep(1000);
			select.selectByVisibleText(data.get("teamField"));
			select= new Select(Assigntofield);
			select.selectByVisibleText(data.get("AssignTo"));
			assignto= Assigntofield.getText();
			notefield.sendKeys(data.get("note"));
			employerspage.ClickSubmitBtn();
			
		}
		
	}
	
	public void edittaskdetailsforemp(DataTable credentials) throws InterruptedException {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{		
			Thread.sleep(2000);
			titlebtn.clear();
			titlebtn.sendKeys(data.get("Title for emp"));
			notefield.clear();
			notefield.sendKeys(data.get("note"));
			employerspage.ClickSubmitBtn();
			clickOnAddTaskBtn();
		}
		employerspage.ClickCloseBtn();
	}
	
	
	public void assertediteddetails(DataTable credentials) throws InterruptedException
	{
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			titlebtn.getText().contentEquals(data.get("Title for emp"));
			
		}
	}
	
	
public void validateTaskDisplayingProperly()
{
	if(assignto.equals(prop.getProperty("employer")))
	{
		mytask.click();
		boolean b= driver.getPageSource().contentEquals(addedtask);
		System.out.println(b);
		Assert.assertEquals(b, true);
	}
	else if (assignto.equals(prop.getProperty("team")))
	{
		teamtask.click();
		boolean b= driver.getPageSource().contentEquals(addedtask);
		Assert.assertEquals(b, true);
	}
}

public void ValidateTaskDisplayingForTeam()
{
	
	
	if(assignto.equals(prop.getProperty("team")))
	{
		mytask.click();
		boolean b= driver.getPageSource().contentEquals(addedtask);
		Assert.assertEquals(b, true);
	}
	else if(assignto.equals(prop.getProperty("employer")))
	{
		teamtask.click();
		boolean b= driver.getPageSource().contentEquals(addedtask);
		Assert.assertEquals(b, true);
	
	}
	}

	public void clickondeletetask() throws InterruptedException
	{
//		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(deletetaskbtn));
		executor.executeScript("arguments[0].click();", deletetaskbtn);
		executor.executeScript("arguments[0].click();", confirmbtn);
		
	}
	
	
	public void ClickOnTeamTask() throws InterruptedException
	{
//		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(teamtask));
		executor.executeScript("arguments[0].click();",teamtask);
	}
	
	public void ClickOnMyTask() throws InterruptedException
	{

		explicitwait.until(ExpectedConditions.elementToBeClickable(mytask));
		executor.executeScript("arguments[0].click();",mytask);
	}
	
	
	public void clickOKBtn()
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(okbtn));
		executor.executeScript("arguments[0].click();",okbtn);
	}
	
	public void ClickOnEditTask() throws InterruptedException
	{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(edittaskbtn));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",edittaskbtn);
		

	}
	
	public void searchTask(DataTable credentials) throws InterruptedException 
	{
				this.emp=loginpage.b;
				System.out.println("emp "+emp);
				taskpage.clickOnAddTaskBtn();
				if(emp==true) 
				{
				taskpage.enterAlldetails(credentials);
				validateTaskDisplayingProperly();
				}
				else
				{
					taskpage.enterAlldetailsForAgy(credentials);
					validateTaskDisplayingProperlyForAgy();
				}
			}
			
//		}
//		
//	}
//		
	
	
//------------------------------------------------------------------------------------------------------------------
	//For Agency






public void validateTaskDisplayingProperlyForAgy() throws InterruptedException
{
	System.out.println(addedtaskagy);
	if(assignto.equals(prop.getProperty("agency")))
	{
		Thread.sleep(2000);
		mytask.click();
		boolean b= driver.getPageSource().contains(addedtaskagy);
		Assert.assertEquals(b, true);
	}
	else
	{
		Thread.sleep(2000);
		teamtask.click();
		boolean b= driver.getPageSource().contains(addedtaskagy);
		Assert.assertEquals(b, true);
	}
}



public void TaskDisplayingForAgyTeam() throws InterruptedException
{
	if(assignto.equals(prop.getProperty("agency")))
	{
		teamtask.click();
		boolean b= driver.getPageSource().contains(addedtaskagy);
		Assert.assertEquals(b, true);
	}
	else 
	{
		Thread.sleep(10000);
		mytask.click();
		boolean b= driver.getPageSource().contains(addedtaskagy);
		Assert.assertEquals(b, true);
	}
	}


public void enterAlldetailsForAgy(DataTable credentials) throws InterruptedException {
	
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		Thread.sleep(1000);
		clickOnAddTaskBtn();
		Thread.sleep(2000);
		titlebtn.sendKeys(data.get("Title for agy"));
		addedtaskagy = titlebtn.getAttribute("value");
		System.out.println(addedtaskagy);
		select = new Select(teamid);
	    explicitwait.until(ExpectedConditions.elementToBeClickable(teamid));
	    select.selectByVisibleText(data.get("agency"));
	    select= new Select(Assigntofield);
	    select.selectByVisibleText(data.get("agyAssignTo"));
		assignto= Assigntofield.getText();
		notefield.sendKeys(data.get("agynote"));
		Thread.sleep(2000);
		employerspage.ClickSubmitBtn();
	}

}

public void assertediteddetailsForAgy(DataTable credentials) throws InterruptedException
{
	
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		titlebtn.getText().contentEquals(data.get("Title for agy"));
//		Assert.assertEquals(titlebtn.getText(), data.get("edited Title"));
//		Assert.assertEquals(teamid.getText(), data.get("agency"));
//		Assert.assertEquals(Assigntofield.getText(),data.get("agyAssignTo"));
//		Assert.assertEquals(notefield.getText(), data.get("agynote"));
		
	}
}
public void editTaskDetailsForAgy(DataTable credentials) throws InterruptedException {
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		Thread.sleep(2000);
		titlebtn.clear();
		titlebtn.sendKeys(data.get("Title for emp"));
		notefield.clear();
		notefield.sendKeys(data.get("agynote"));
		employerspage.ClickSubmitBtn();
		clickOnAddTaskBtn();
	}
	employerspage.ClickCloseBtn();
	System.out.println(addedtaskagy);
}


}
