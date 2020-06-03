package pages;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchContextException;
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
	

	}
	
	String addedtask;
	String addedtaskagy;
	public String assignto;
	boolean emp;
	boolean b;
	String title;
	String a;
	ArrayList lst[];
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
	
//	@FindBy(xpath="//button[@title='Edit Task']")
//	public WebElement edittaskbtn;
	
	@FindBy(xpath="//strong[text()='Assign To: ']")
	public WebElement taskcard;
	
	@FindBy(xpath="//strong[text()=addedtask]")
	public WebElement taskname;
	
	@FindBy(xpath="//button[@title='Refresh'][@class='btn Cbtn-primary mr-1 float-right optbtn']")
	private WebElement reloadtaskbtn;
	
	@FindBy(xpath="//h5[text()=' Error']")
	private WebElement error;
	
	@FindBy(xpath="//h6[text()=' You can not change status of this task as you are neither assignee, creator or team owner for this task.']")
	private WebElement errormsg;
	
	
	@FindBy(xpath="//button[@title='Share With Team']")	
	private WebElement shareWithTeam;

	
	
	public void errordisplayed() throws InterruptedException
	{
		try
		{
		error.isDisplayed();
		errormsg.isDisplayed();
		common.clickOnOKBtn();
		}
		catch(NoSuchElementException e)
		{
		System.out.println("issue");
		}
	}
	
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
			addedtask= titlebtn.getAttribute("value");
			System.out.println(addedtask);
			select= new Select(teamid);
			Thread.sleep(1000);
			select.selectByVisibleText(data.get("teamField"));
			select= new Select(Assigntofield);
			select.selectByVisibleText(data.get("AssignTo"));
			assignto= data.get("AssignTo");
			List<WebElement> list =select.getOptions();
			for(WebElement item:list) 
	           { 
	             System.out.println(item.getText());          
	           }
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
	
	
//	public void assertediteddetails(DataTable credentials) throws InterruptedException
//	{
//		
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//		{
//			titlebtn.getText().contentEquals(data.get("Title for emp"));
//			
//		}
//	}
	
	
	public void validateTaskDisplayingProperly() throws InterruptedException
	{
		System.out.println("loggediusername"+loginpage.logedinuser);
		String user=loginpage.logedinuser;
		System.out.println(assignto);
		if(assignto.contentEquals(user))
		{ 
			Thread.sleep(3000);
			mytask.click();
			reloadtask();
			boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
			Assert.assertEquals(b, true);
		}
		else
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
			Assert.assertEquals(b, true);
		}
		StatusOfTask();
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
		if(assignto.contentEquals(loginpage.logedinuser))
		{ 
			Thread.sleep(3000);
			mytask.click();
			reloadtask();
			if(emp==true)
			{
			Thread.sleep(2000);
			String edittaskbtn="//strong[text()='"+addedtask+"']//following::i[@class='fa fa-pencil']";
			driver.findElement(By.xpath(edittaskbtn)).click();
			}
			else
			{
			 String edittaskbtnAgy="//strong[text()='"+addedtaskagy+"']//following::i[@class='fa fa-pencil']";
			 driver.findElement(By.xpath(edittaskbtnAgy)).click();
			}
		}
		else
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			if(emp==true)
			{
			Thread.sleep(2000);
			String edittaskbtn="//strong[text()='"+addedtask+"']//following::i[@class='fa fa-pencil']";
			driver.findElement(By.xpath(edittaskbtn)).click();
			}
			else
			{
			 String edittaskbtnAgy="//strong[text()='"+addedtaskagy+"']//following::i[@class='fa fa-pencil']";
			 driver.findElement(By.xpath(edittaskbtnAgy)).click();
			}
		}
		
	}
	
	public void searchTask(DataTable credentials) throws InterruptedException 
	{
//				this.emp=loginpage.b;
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
			
	public void ClickOnMarkInProgress() throws InterruptedException
	{
		
		if(emp==true)
		{
			String inprogreebtnEmp="//strong[text()='"+addedtask+"']//following::button[text()='Mark In Progress']";
			Thread.sleep(3000);
			driver.findElement(By.xpath(inprogreebtnEmp)).click();

			if(assignto.equals(prop.getProperty("employer")))
			{
				System.out.println("status changed to improgress for employer");
			}
			else if (assignto.equals(prop.getProperty("team")))
			{
				System.out.println("status changed to improgress for employer team");
			}
		
		}
		else if(emp==false)
		{
			String inprogreebtnAgy="//strong[text()='"+addedtaskagy+"']//following::button[text()='Mark In Progress']";
			Thread.sleep(2000);
			driver.findElement(By.xpath(inprogreebtnAgy)).click();
			if(assignto.equals(prop.getProperty("agency")))
			{
				System.out.println("status changed to improgress for agency");
			}
			else if (assignto.equals(prop.getProperty("agyteam")))
			{
				System.out.println("status changed to improgress for agency team");
			}
			
		}
	}
	
	
	public void StatusOfTask() throws InterruptedException 
	{
	   this.emp=loginpage.b;
		if(emp==true)
		{
			try
			{ 
				Thread.sleep(2000);
				String openStatusEmp="//strong[text()='"+addedtask+"']//following::span[text()='Open']";
				driver.findElement(By.xpath(openStatusEmp)).isDisplayed();
				System.out.println("Status of added task for employer is open");
			}
			catch(NoSuchElementException e)
			{
				String inprogressStatusEmp="//strong[text()='"+addedtask+"']//following::span[text()='Inprogress']";
				driver.findElement(By.xpath(inprogressStatusEmp)).isDisplayed();
				System.out.println("Status of added task for employer is inprogress");
			}
			
		}
		else if(emp==false)
		{
			try
			{ 
				String openStatusAgy="//strong[text()='"+addedtaskagy+"']//following::span[text()='Open']";
				driver.findElement(By.xpath(openStatusAgy)).isDisplayed();
				System.out.println("Status of added task for agency is open");
			}
			catch(NoSuchElementException e)
			{
				String inprogressStatusAgy="//strong[text()='"+addedtaskagy+"']//following::span[text()='Inprogress']";
				driver.findElement(By.xpath(inprogressStatusAgy)).isDisplayed();
				System.out.println("Status of added task for agency is inprogress");
			}
		}
		

		
	}
	
	public void MarkCompleted() throws InterruptedException
	{
		if(emp==true)
		{
			String MarkcompletedEmp="//strong[text()='"+addedtask+"']//following::button[text()='Mark Complete']";
			Thread.sleep(3000);
			driver.findElement(By.xpath(MarkcompletedEmp)).click();

			if(assignto.equals(prop.getProperty("employer")))
			{
				System.out.println("status changed to Completed for employer");
			}
			else if (assignto.equals(prop.getProperty("team")))
			{
				System.out.println("status changed to Completed for employer team");
			}
		
		}
		else if(emp==false)
		{
			String MarkcompletedAgy="//strong[text()='"+addedtaskagy+"']//following::button[text()='Mark Complete']";			
			Thread.sleep(3000);
			driver.findElement(By.xpath(MarkcompletedAgy)).click();
			if(assignto.equals(prop.getProperty("agency")))
			{
				System.out.println("status changed to Completed for agency");
			}
			else if (assignto.equals(prop.getProperty("agyteam")))
			{
				System.out.println("status changed to Completed for agency team");
			}
			
		}
	}
	
	
	public void validateTaskAfterMarkCompletedEmp() throws InterruptedException
	{
	
		if(assignto.equals(prop.getProperty("employer")))
		{
			Thread.sleep(2000);
			mytask.click();
			try {
			driver.findElement(By.xpath("//strong[text()='task1']")).isDisplayed();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("task which is mark as progress is not displaying");
			}
			
		}
		else if (assignto.equals(prop.getProperty("team")))
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			try {
				driver.findElement(By.xpath("//strong[text()='task1']")).isDisplayed();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("task which is mark as progress is not displaying");
				}
		}
		
	}
	
//------------------------------------------------------------------------------------------------------------------
	//For Agency


	public void validateTaskAfterMarkCompletedAgy() throws InterruptedException
	{
	
		if(assignto.equals(prop.getProperty("agency")))
		{
			Thread.sleep(2000);
			mytask.click();
			reloadtask();
			try {
			driver.findElement(By.xpath("//strong[text()='"+addedtaskagy+"']")).isDisplayed();
			
			}
			catch(NoSuchElementException e)
			{
				System.out.println("task which is mark completed not displaying at agency side");
			}
			
		}
		else if (assignto.equals(prop.getProperty("agyteam")))
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			try {
				driver.findElement(By.xpath("//strong[text()='"+addedtaskagy+"']")).isDisplayed();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("task which is mark completed not displaying at agency team side");
				}
		}
		
	}



public void validateTaskDisplayingProperlyForAgy() throws InterruptedException
{
	
	if(assignto.contentEquals(loginpage.logedinuser))
	{
		Thread.sleep(2000);
		mytask.click();
		reloadtask();
		boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtaskagy+"']")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	else
	{
		Thread.sleep(3000);
		teamtask.click();
		reloadtask();
		boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtaskagy+"']")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	StatusOfTask();

}


//	public void validateTaskDisplayingProperlyForAgy() throws InterruptedException
//	{
//		
//		if(assignto.contentEquals(loginpage.logedinuser))
//		{
//			Thread.sleep(2000);
//			mytask.click();
//			reloadtask();
//			boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
//			Assert.assertEquals(b, true);
//		}
//		else
//		{
//			Thread.sleep(3000);
//			teamtask.click();
//			reloadtask();
//			boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
//			Assert.assertEquals(b, true);
//		}
//		StatusOfTask();
//
//	}

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
		assignto= data.get("agyAssignTo");
		notefield.sendKeys(data.get("agynote"));
		Thread.sleep(2000);
		employerspage.ClickSubmitBtn();
	}

}



public void assertDeatailsOfTask(DataTable credentials) throws InterruptedException
{
	
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		if(emp==true)
		{
			titlebtn.getText().contentEquals(data.get("Title for emp"));
//			teamid.getAttribute("value").contentEquals(data.get("employer"));
//			Assigntofield.getAttribute("value").contentEquals(data.get("AssignTo"));
			notefield.getText().contentEquals(data.get("note"));
			
		}
		else
		{
			titlebtn.getText().contentEquals(data.get("Title for agy"));
//			teamid.getAttribute("value").contentEquals(data.get("agency"));
//			Assigntofield.getAttribute("value").contentEquals(data.get("agyAssignTo"));
			notefield.getText().contentEquals(data.get("agynote"));
		}
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
	public void shareWithTeam(DataTable credentials) throws InterruptedException
	{
		this.emp=loginpage.b;
		Thread.sleep(2000);
		shareWithTeam.click();
		if(emp==true)
		{
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
			String team=data.get("EmpTeam");
			String xpathforshare= "(//td[text()='"+team+"']//following::span[@class='checkmark CheckBoxM'])[1]";
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpathforshare)).click();
			try
			{
				common.confimYes.isDisplayed();
				common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{}
			}
		}
		else 
		{
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
			String team=data.get("AgyTeam");
			String xpathforshare= "(//td[text()='"+team+"']//following::span[@class='checkmark CheckBoxM'])[1]";
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpathforshare)).click();
			try
			{
				common.confimYes.isDisplayed();
				common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{
				
			}
			}
		}
		common.clickOnCloseBtn();
	}
	

}
