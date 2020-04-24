package com.Hirexpert.pages;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;

public class TaskPage extends TestBase {

	public TaskPage() throws IOException {
	super();
	PageFactory.initElements(driver, this);
	}
	
	String addedtask;
	String assignto;
	
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
	WebElement mytask;
	
	@FindBy(xpath="//label[@for='test2']")
	WebElement teamtask;
	
	
	public void clickOnAddTaskBtn()
	{
		addtaskbtn.click();
	}
	
	public void selectTeamId() throws InterruptedException
	{
		Select dropdown = new Select(teamid);
		Thread.sleep(2000);
//	String value= prop.getProperty("employer");
		dropdown.selectByVisibleText(prop.getProperty("employer"));
	}
	
	public void selectAssignTo()
	{
		Select dropdown = new Select(Assigntofield);
		dropdown.selectByVisibleText(prop.getProperty("AssignTo"));
	}
	
	public void enterAlldetails(DataTable credentials) throws InterruptedException {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			titlebtn.sendKeys(data.get("Title"));
			addedtask= titlebtn.getText();
			selectTeamId();
			selectAssignTo();
			assignto= Assigntofield.getText();
			notefield.sendKeys(prop.getProperty("note"));
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
	
	
}
