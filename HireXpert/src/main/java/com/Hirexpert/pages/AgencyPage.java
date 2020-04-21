package com.Hirexpert.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;

public class AgencyPage extends TestBase{

	public AgencyPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public static String namevalidate;
	
	@FindBy(xpath="(//a[@class='nav-link'])[3]")
	WebElement agencybtn;
	
	@FindBy(xpath="//button[@title='Agencies']")
	WebElement addbtn;
	
	@FindBy(xpath="//input[@formcontrolname='Name']")
	static WebElement name ;
	
	@FindBy(xpath="//input[@formcontrolname='Email']")
	static WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='ContactNumber']")
	static WebElement contact;
	
	@FindBy(xpath="//button[@title='Delete']")
	static WebElement deletebtn;
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	static WebElement confimYes;
	
	@FindBy(xpath="//button[@type='submit']")
	static WebElement submitbtn;

	public void getTitle()
	{
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
		
	}
	public void Clickagencybtn()
	{
		wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(agencybtn));
		agencybtn.click();
	}
	
	public void ClickAddbtn()
	{
		addbtn.click();
	}
	
	public static void enterAllDetails(DataTable credentials)
	{
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		name.sendKeys(data.get("Name"));
		email.sendKeys(data.get("Email"));
		contact.sendKeys(data.get("contact"));
		namevalidate= data.get("Name");
	WebElement testDropDown = driver.findElement(By.xpath("//select[@formcontrolname='CountryId']"));
	Select dropdown = new Select(testDropDown);
	dropdown.selectByVisibleText("India");
	}
	}
	
	public void Submitbtn()
	{
		submitbtn.click();
	}
	
	public void deleteagy() throws InterruptedException
	{
		
		AgencyPage.deletebtn.click();
		confimYes.click();	
	}
	
}
