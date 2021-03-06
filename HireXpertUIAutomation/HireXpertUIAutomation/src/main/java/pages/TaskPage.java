package pages;


import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.testng.Assert;
import org.openqa.selenium.By;
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
 
	public String addedtask;
	public String assignto;
	boolean emp;
	boolean b;
	String title;
	String a;
//	ArrayList lst[];
	String Sharedteam;
	public List<WebElement> list;
	public int sizeOfShareWithTeam=0;
	WebElement element;
	
	@FindBy(xpath="//button[contains(text(),'Add Task')]")
	WebElement addtaskbtn;
	
	@FindBy(xpath="//input[@formcontrolname='Title']")
	WebElement titlebtn;
	
	@FindBy(xpath="//select[@formcontrolname='TeamId']")
	WebElement teamid;
	
	@FindBy(xpath="//select[@formcontrolname='AssignTo']")
	WebElement Assigntofield;
	
	@FindBy(xpath="//p[@title='Status']")
	WebElement status;
	
	@FindBy(xpath="//textarea[@formcontrolname='Description']")
	WebElement notefield;
	
	@FindBy(xpath="//label[@for='test']")
	public WebElement mytask;
	
	@FindBy(xpath="//label[@for='test2']")
	public WebElement teamtask;
	
	@FindBy(xpath="//a[text()='Delete Task']")
	WebElement deletetaskbtn;
	
//	@FindBy(xpath="//button[@id='confirmModalBtn']")
//	WebElement confirmbtn;
//	
//	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
//	public WebElement okbtn;
	
//	@FindBy(xpath="//button[@title='Edit Task']")
//	public WebElement edittaskbtn;
	
	@FindBy(xpath="//strong[text()='Assign To: ']")
	public WebElement taskcard;
	
	@FindBy(xpath="//strong[text()=addedtask]")
	public WebElement taskname;
	
	@FindBy(xpath="(//i[@class='fa fa-refresh'])[3]")
	private WebElement reloadtaskbtn; 
	
	@FindBy(xpath="//h5[text()=' Error']")
	private WebElement error;
	
	@FindBy(xpath="//h6[text()=' You can not change status of this task as you are neither assignee, creator or team owner for this task.']")
	private WebElement errormsg;
	
	
	@FindBy(xpath="//button[@title='Share With Team']")	
	private WebElement shareWithTeam;
	
	
	
//	public void errordisplayed() throws InterruptedException
//	{
//		try
//		{
//		error.isDisplayed();
//		errormsg.isDisplayed();
//		common.clickOnOKBtn();
//		}
//		catch(NoSuchElementException e)
//		{
//		System.out.println("issue");
//		}
//	}
	
	public void reloadtask() throws InterruptedException
	{
		Thread.sleep(3000);
		reloadtaskbtn.click();
	}
	
	public void clickOnAddTaskBtn() throws InterruptedException
	{	
		Thread.sleep(3000);
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
			list =select.getOptions();
//			for(WebElement item:list) 
//	        { 
//	          System.out.println(item.getText());          
//	        }
			notefield.sendKeys(data.get("note"));
			common.ClickSumbit();
		}
	}
	
	public void edittaskdetails(String task,String note) throws InterruptedException {
	
			Thread.sleep(2000);	
			titlebtn.clear();
			Thread.sleep(2000);
			titlebtn.sendKeys(task);
			addedtask=titlebtn.getAttribute("value");
			System.out.println(addedtask);
			notefield.clear();
			notefield.sendKeys(note);
			common.ClickSumbit();
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
		if(assignto.contentEquals(loginpage.logedinuser))
		{ 
			Thread.sleep(4000); 
			mytask.click();
			reloadtask();
			boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")) != null;
			Assert.assertEquals(b, true);
		}
		else
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")) != null;
			Assert.assertEquals(b, true);
		}
	}
	
	
	public void clickondeletetask() throws InterruptedException
	{
		Thread.sleep(3000);
//		explicitwait.until(ExpectedConditions.elementToBeClickable(deletetaskbtn));
		executor.executeScript("arguments[0].click();", deletetaskbtn);
		common.clickOnConfirmYes();
		}
	
	
	public void ClickOnTeamTask() throws InterruptedException
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(teamtask));
		executor.executeScript("arguments[0].click();",teamtask);
	}
	
	public void ClickOnMyTask() throws InterruptedException
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(mytask));
		executor.executeScript("arguments[0].click();",mytask);
	}
	
//	public void clickOKBtn()
//	{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(okbtn));
//		executor.executeScript("arguments[0].click();",okbtn);
//	}
	
	public void ClickOnEditTask() throws InterruptedException
	{
		if(assignto.contentEquals(loginpage.logedinuser))
		{ 
			Thread.sleep(4000);
			mytask.click();
			reloadtask();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//strong[text()='"+addedtask+"']//following::a[@title='Edit Task']")).click();
		}
		else
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//strong[text()='"+addedtask+"']//following::a[@title='Edit Task']")).click();
		}
	}
	
	
//	public void edittask(DataTable credentials) throws InterruptedException
//	{
//	if(assignto.contentEquals(loginpage.logedinuser))
//	{
////		taskpage.ClickOnMyTask();
////		taskpage.ClickOnEditTask();
//		taskpage.edittaskdetails(task, note);
//	}
//	else
//	{
////		taskpage.ClickOnTeamTask();
////		taskpage.ClickOnEditTask();
//		taskpage.edittaskdetails(task, note);
//	}	
//
//	}


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
					validateTaskDisplayingProperly();
				}
			}
			
	public void ClickOnMarkInProgress() throws InterruptedException
	{
		String inprogreebtn="//strong[text()='"+addedtask+"']//following::a[@title='Start']";
		Thread.sleep(3000);
		driver.findElement(By.xpath(inprogreebtn)).click();
	}
	
	
	public void StatusOfTask(String status) throws InterruptedException 
	{
		String inprogressStatusEmp="//strong[text()='"+addedtask+"']//following::p[text()='"+status+"']";
		if(assignto.contentEquals(loginpage.logedinuser))
		{ 
			Thread.sleep(4000);
			mytask.click();
			reloadtask();
			driver.findElement(By.xpath(inprogressStatusEmp)).isDisplayed();
		}
		else
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
			driver.findElement(By.xpath(inprogressStatusEmp)).isDisplayed();
		}

	}
//	--------------------
	public void MarkCompleted() throws InterruptedException
	{
		String MarkcompletedEmp="//strong[text()='"+addedtask+"']//following::a[@title='Complete']";
		Thread.sleep(3000);
		driver.findElement(By.xpath(MarkcompletedEmp)).click();
	}
	
	
	public void validateTaskAfterMarkCompletedEmp() throws InterruptedException
	{
		if(assignto.contentEquals(loginpage.logedinuser))
		{
			Thread.sleep(2000);
			mytask.click();
		}
		else 
		{
			Thread.sleep(3000);
			teamtask.click();
			reloadtask();
		}
//		element=driver.findElement(By.xpath("//strong[text()='"+taskpage.addedtask+"']"));
//	    Assert.assertFalse(element.isDisplayed());
	    Assert.assertEquals(driver.findElements(By.xpath("//strong[text()='"+taskpage.addedtask+"']")).size(), 0, "element found");
	} 

	
	
//------------------------------------------------------------------------------------------------------------------
	//For Agency


//	public void validateTaskAfterMarkCompletedAgy() throws InterruptedException
//	{
//	
//		if(assignto.equals(prop.getProperty("agency")))
//		{
//			Thread.sleep(2000);
//			mytask.click();
//			reloadtask();
//			try {
//			driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
//			
//			}
//			catch(NoSuchElementException e)
//			{
//				System.out.println("task which is mark completed not displaying at agency side");
//			}
//			
//		}
//		else if (assignto.equals(prop.getProperty("agyteam")))
//		{
//			Thread.sleep(3000);
//			teamtask.click();
//			reloadtask();
//			try {
//				driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
//				}
//				catch(NoSuchElementException e)
//				{
//					System.out.println("task which is mark completed not displaying at agency team side");
//				}
//		}
//		
//	}
//
//
//
//public void validateTaskDisplayingProperlyForAgy() throws InterruptedException
//{
//	
//	if(assignto.contentEquals(loginpage.logedinuser))
//	{
//		Thread.sleep(4000);
//		mytask.click();
//		reloadtask();
//		boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
//		Assert.assertEquals(b, true);
//	}
//	else
//	{
//		Thread.sleep(4000);
//		teamtask.click();
//		reloadtask();
//		boolean b= driver.findElement(By.xpath("//strong[text()='"+addedtask+"']")).isDisplayed();
//		Assert.assertEquals(b, true);
//	}
//
//}


	public void enterAlldetailsForAgy(DataTable credentials) throws InterruptedException {
	
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		Thread.sleep(1000);
		clickOnAddTaskBtn();
		Thread.sleep(2000);
		titlebtn.sendKeys(data.get("Title for agy"));
		addedtask = titlebtn.getAttribute("value");
		System.out.println(addedtask);
		select = new Select(teamid);
	    explicitwait.until(ExpectedConditions.elementToBeClickable(teamid));
	    select.selectByVisibleText(data.get("agency"));
	    select= new Select(Assigntofield);
	    select.selectByVisibleText(data.get("agyAssignTo"));
		list =select.getOptions();
		assignto= data.get("agyAssignTo");
		notefield.sendKeys(data.get("agynote"));
		Thread.sleep(2000);
		common.ClickSumbit();
	}

}

	public void assertDeatailsOfTask(String task, String team, String Assignto, String note) throws InterruptedException
	{
				addedtask.contentEquals(task);
	//			String task= data.get("Title for emp");
				select=new Select(teamid);
				WebElement teamidValue = select.getFirstSelectedOption();
				teamidValue.equals(team);
				select=new Select(Assigntofield);
				teamidValue = select.getFirstSelectedOption();
				teamidValue.equals(Assignto);
				notefield.getText().contentEquals(Assignto);	
	}

	public void asserteditedDeatail(String task,String note) throws InterruptedException
	{
				addedtask.contentEquals(task);
				notefield.getText().contentEquals(note);	
	}


	public void shareWithTeam(DataTable credentials) throws InterruptedException
	{
		Thread.sleep(3000);
		workbenchpage.shareJob.click();
		shareWithTeam.click();
		this.emp=loginpage.b; 
		if(emp==true)
		{
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
			sizeOfShareWithTeam++;
			Sharedteam=data.get("EmpTeam");
			String xpathforshare= "(//td[text()='"+data.get("EmpTeam")+"']//following::span[@class='checkmark CheckBoxM'])[1]";
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpathforshare)).click();
			}	
		}
		else 
		{
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
			sizeOfShareWithTeam++;
			String team=data.get("Agyteam");
			String xpathforshare= "(//td[text()='"+team+"']//following::span[@class='checkmark CheckBoxM'])[1]";
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpathforshare)).click();
			}			
		}
			try
			{
				common.confimYes.isDisplayed();
				common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{}
//	common.clickOnCloseBtn();
	}
}
