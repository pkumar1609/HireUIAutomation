package com.Hirexpert.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hirexpert.utils.TestBase;



public class LoginPage extends TestBase{
	

	public LoginPage() throws IOException 
	{
	  super();
      PageFactory.initElements(driver, this);
      Action = new Actions(driver);
      
      
      //initialise element with driver of current class
	}
	@FindBy(xpath ="//input[@formcontrolname='username']")
	private WebElement un; 
	
	@FindBy(xpath ="//input[@formcontrolname='password']")
	private WebElement pwd;
	
	@FindBy(xpath= "//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")
	private WebElement login;
	
	@FindBy(xpath= "//img[@class='profile']")
	private WebElement profilebtn;
	
	@FindBy(xpath= "(//a[@class='dropdown-item CustomPointer'])[3]")
	private WebElement logoutbtn;
	
	@FindBy(xpath= "//a[@title='Employer']")
	private WebElement logedinusername;
	
	//dashboard
	@FindBy(xpath= "//a[@href='#/jobdashboard']")
	public WebElement dashboardbtn;
	
	
	
	
	
	
	//Actions
	public void loginInAppWithEmp()
	{
		un.sendKeys(prop.getProperty("loginid"));
		pwd.sendKeys(prop.getProperty("pwd"));
		login.click();
	}
	public void loginInAppWithAgy()
	{
		un.sendKeys(prop.getProperty("agyid"));
		pwd.sendKeys(prop.getProperty("pwd"));
		login.click();
	}
	public void loginInAppWithTeam() throws InterruptedException
	{
		un.sendKeys(prop.getProperty("teamid"));
		pwd.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(1000);
		login.click();
	}
	
	public void logoutFromApp()
	{
		Action.moveToElement(profilebtn).click().perform();
		logoutbtn.click();
	}
	
	
	
}
