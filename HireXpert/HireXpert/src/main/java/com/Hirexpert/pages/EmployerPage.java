package com.Hirexpert.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;

public class EmployerPage extends TestBase {

	public EmployerPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public static String namevalidate;
	
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	WebElement empbtn;
	
	@FindBy(xpath="//button[@title='Employers']")
	WebElement addbtn;
	
	@FindBy(xpath="//input[@formcontrolname='Name']")
	WebElement namefield;
	//[@class='form-control ng-pristine ng-invalid ng-touched']
	
	@FindBy(xpath="//input[@formcontrolname='Email']")
	WebElement emailfield;
	
	@FindBy(xpath="//input[@formcontrolname='ContactNumber']")
	WebElement contactnumberfield;
	
	@FindBy(xpath="//select[@formcontrolname='CountryId']")
	WebElement countryid;
	
	@FindBy(xpath="//button[@type='submit'][@class='btn btn-primary Cbtn-primary']")
	WebElement submitbtn;
	
	@FindBy(xpath="//button[@class='btn btn-outline-dark'][@type='button']")
	WebElement closebtn;
	
	@FindBy(xpath="//button[@title='Delete']")
	public static WebElement deletebtn;
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	public static WebElement confimYes;
	
	@FindBy(xpath="//td")
	static WebElement tableele;
	
	
	public void ClickEmpBtn() {
		empbtn.click();
	}
	
	public void ClickAddBtn() {
		addbtn.click();
	}
	
	public void selectCountry()
	{
		Select dropdown = new Select(countryid);
		dropdown.selectByVisibleText("India");
	}
	
	public void enterValidCredentials(DataTable credentials) throws InterruptedException {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			Thread.sleep(1000);
			namefield.sendKeys(data.get("Name"));
			namevalidate=data.get("Name");
			ar.add(namevalidate);
			emailfield.sendKeys(data.get("Email"));
			contactnumberfield.sendKeys(data.get("contact"));
			selectCountry();
			ClickSubmitBtn();
			Thread.sleep(1000);
			ClickAddBtn();
		}
		size= ar.size();
		Thread.sleep(1000);
		ClickCloseBtn();
	}

	public void ClickSubmitBtn()
	{
		submitbtn.click();
	}
	
	public void ClickCloseBtn()
	{
		closebtn.click();
	}

	public void deleteemp()
	{
		deletebtn.click();
		confimYes.click();	
	}
	
	
}
